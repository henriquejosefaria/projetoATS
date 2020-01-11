package main.java.model;

import main.java.exceptions.CarExistsException;
import main.java.exceptions.InvalidCarException;
import main.java.exceptions.InvalidUserException;
import main.java.exceptions.UnknownCarTypeException;
import main.java.exceptions.UserExistsException;
import main.java.utils.Point;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import main.java.exceptions.*;

public class Parser {
    private List<String> file;
    private String error = "error";
    private static final Logger LOGGER = Logger.getLogger(Parser.class.getName());
    

    public Parser() {
        this.file = new ArrayList<>();
    }

    public Parser(String db, UMCarroJa model) {
        try {
            this.file = Files
                    .readAllLines(Paths.get(db), StandardCharsets.UTF_8)
                    .stream()
                    .map(String::trim)
                    .filter(s -> !s.startsWith("--"))
                    .filter(s -> s.contains(":") && s.contains(","))
                    .map(e -> this.parseLine(e, model))
                    .collect(Collectors.toList());
        } catch (IOException e) {
        	String msg = "IOException";
            LOGGER.info(msg);
        }
    }

    private String parseLine(String l, UMCarroJa model){
        System.out.println("l: "+l.trim());
        String[] pLine = l.split(":");
        System.out.println(l);
        String categoria = pLine[0];
        String[] content = pLine[1].split(",");


        try {
            switch (categoria) {
                case "NovoProp":
                    if (content.length != 4)
                        break;
                    model.addUser(new Owner(
                            content[2],
                            content[0],
                            content[3],
                            Integer.parseInt(content[1]),
                            content[2]
                    ));
                    break;
                case "NovoCliente":
                    if (content.length != 6)
                        break;
                    model.addUser(new Client(
                            new Point(Double.parseDouble(content[4]), Double.parseDouble(content[5])),
                            content[2],
                            content[2],
                            content[0],
                            content[3],
                            Integer.parseInt(content[1])
                    ));
                    break;
                case "NovoCarro":
                    if (content.length != 10) {
                        break;
                    }
                    CarModel cm = new CarModel( CarModel.CarType.fromString(content[0]),Double.parseDouble(content[4]),content[1]);
                    model.addCar(
                            content[2],
                            new StringBuilder()
                                    .append(content[3])
                                    .append("@gmail.com")
                                    .toString(),
                            cm,
                            Double.parseDouble(content[5]),
                            Double.parseDouble(content[6]),
                            Integer.parseInt(content[7]),
                            new Point(Double.parseDouble(content[8])
                                    , Double.parseDouble(content[9]))
                    );
                    break;
                case "Aluguer":
                    if (content.length != 5)
                        break;
                    extra(content,model);
                    break;
                default: // "Classificar"
                    if (content.length != 2)
                        break;
                    model.rate(content[0], Integer.parseInt(content[1]));
                    break;
            }
        }
        catch (InvalidUserException | UserExistsException | CarExistsException | UnknownCarTypeException | InvalidCarException ignored) {LOGGER.info(error);}
        return l;
    }
    
    public void extra (String[] content, UMCarroJa model) {
        System.out.println(content[0]);
        System.out.println(content[1]);
        System.out.println(content[2]);
        System.out.println(content[3]);
        System.out.println(content[4]);
    	try {
            for (String s :content) {
                System.out.println(s);
            }
            model.rental(new StringBuilder()
                            .append(content[0])
                            .append("@gmail.com")
                            .toString(),
                    new Point(Double.parseDouble(content[1])
                            , Double.parseDouble(content[2])),
                    content[4], CarModel
                            .CarType
                            .fromString(content[3]));
        } catch (NoCarAvaliableException
        		| NumberFormatException
        		| UnknownCompareTypeException
        		| InvalidUserException
        		| UnknownCarTypeException ignored) {
			    LOGGER.info(error);
		}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Parser parser = (Parser) o;
        return this.file.equals(parser.file);
    }
    @Override
    public int hashCode() {
    	  return super.hashCode();
    }
}
