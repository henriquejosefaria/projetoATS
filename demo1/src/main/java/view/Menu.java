package main.java.view;

import main.java.utils.Point;
import main.java.utils.StringBetter;
import main.java.view.viewmodel.AutonomyCar;
import main.java.view.viewmodel.CheapestNearCar;
import main.java.view.viewmodel.NewLogin;
import main.java.view.viewmodel.RateOwnerCar;
import main.java.view.viewmodel.RegisterCar;
import main.java.view.viewmodel.RegisterUser;
import main.java.view.viewmodel.RentCarSimple;
import main.java.view.viewmodel.SpecificCar;
import main.java.view.viewmodel.TimeInterval;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

import main.java.exceptions.InvalidNewRegisterException;
import main.java.exceptions.InvalidNewRentalException;
import main.java.exceptions.InvalidRatingException;
import main.java.exceptions.InvalidTimeIntervalException;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu{
    private MenuInd myMenu;
    private final Deque<MenuInd> prev;
    private final ArrayList<MenuInd> options;
    private boolean run;
    private String offset = "\033\143";
    private static final Logger LOGGER = Logger.getLogger(Menu.class.getName());
    private static final String STR = "Tipo do Carro: [electric, gas, hybrid or any]";
    Handler handlerObj = new ConsoleHandler();
    Scanner scanner = new Scanner(System.in);
    public enum MenuInd {
        INITIAL,
        LOGIN,
        REGISTER,
        REGISTERCLIENT,
        REGISTEROWNER,
        CLIENT,
        OWNER,
        HISTORYCLIENT,
        CLOSEST,
        CHEAPEST,
        CHEAPESTNEAR,
        SPECIFIC,
        AUTONOMY,
        TOP10CLIENTS,
        HISTORYOWNER,
        REVIEWRENTAL,
        CAROVERVIEW,
        ADDCAR,
        RENTALS,
        PENDING,
        NUSES,
        DISTANCE
    }

    public Menu() {
        this.myMenu = MenuInd.INITIAL;
        this.prev = new ArrayDeque<>();
        this.options = new ArrayList<>();
        this.run = true;
        this.pickChildMenus();
    }

    public MenuInd getMenu() {
        return this.myMenu;
    }

    public void showString(String rental) {
        String str  = this.createHeader();
        LOGGER.info(offset);
        LOGGER.info(str);
        LOGGER.info(rental);
        scanner.nextLine();
    }

    public int showRentalRate(String rental) {
        String error = "";
        while(true) {
            this.displayMenuHeader(error);
            LOGGER.info(rental);
            LOGGER.info("Client rating:");
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
            	error = "Invalid rating";
            }
        }
    }

    public String carOverviewShow (String error, List<List<String>> valTab){
        this.displayMenuHeader(error);
        ArrayList<String> colLabl = new ArrayList<>();
        colLabl.add("Matricula");
        colLabl.add("Autonomia");
        colLabl.add("Preço/km");
        colLabl.add("Disponibilidade");
        colLabl.add("Ratings");

        this.tableDefault(valTab, colLabl);

        LOGGER.info("\tR[pos] -> Refill car\n\tC[pos] [price] -> Change Price\n\tD[pos] -> Toggle Availability\n\tT[pos] -> total faturado");
        String sc = scanner.nextLine().toLowerCase();
        return sc;
    }

    public void rentalHistoryShow (TimeInterval ti, List<List<String>> valTab){
        this.displayMenuHeader("");
        ArrayList<String> colLabl = new ArrayList<>();
        colLabl.add("Data");
        colLabl.add("Carro");
        colLabl.add("Utilizador");
        colLabl.add("Inicio da Viagem");
        colLabl.add("Fim da Viagem");
        colLabl.add("Preço Final");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String response = ti.getInicio().format(formatter) + " -> " + ti.getFim().format(formatter);
        LOGGER.info(response);

        tableDefault(valTab, colLabl);
        scanner.nextLine();
    }

    public AutonomyCar autonomyCarRent(String error) throws InvalidNewRentalException {
        this.displayMenuHeader(error);
        LOGGER.info(STR);
        String carType = scanner.nextLine();
        try {
        	LOGGER.info("Alcance:");
            int range = scanner.nextInt();
            return new AutonomyCar(this.getDest(), range, carType);
        } catch (InputMismatchException e) {
            throw new InvalidNewRentalException();
        }
    }

    public CheapestNearCar walkingDistanceRent(String error) throws InvalidNewRentalException {
        this.displayMenuHeader(error);
        LOGGER.info(STR);
        String carType = scanner.nextLine();
        try {
        	LOGGER.info("Distância a andar a pé:");
            int walk = scanner.nextInt();
            return new CheapestNearCar(this.getDest(), walk, carType);
        } catch (InputMismatchException e) {
            throw new InvalidNewRentalException();
        }
    }

    public String reviewRentShow(String error, int ownerRating, List<List<String>> lR){
        this.displayMenuHeader(error);
        ArrayList<String> colLabl = new ArrayList<>();
        colLabl.add("Client");
        colLabl.add("Carro");
        colLabl.add("Inicio");
        colLabl.add("Fim");
        colLabl.add("Tempo a pé");
        colLabl.add("Tempo Estimado");
        colLabl.add("Custo Estimado");
        colLabl.add("Client Rating");
        String response = "Rating pessoal: " + ownerRating;
        LOGGER.info(response);

        this.tableDefault(lR, colLabl);

        LOGGER.info("\tA[pos] -> aprove rental\n\tR[pos] -> refuse rental");
        String sc = scanner.nextLine().toLowerCase();
        return sc;
    }

    public void top10ClientsShow (List<List<String>> valTab, String colum){
        ArrayList<String> colLabl = new ArrayList<>();
        colLabl.add("User");
        colLabl.add(colum);
        this.displayMenuHeader("");
        this.tableDefault(valTab, colLabl);
        scanner.nextLine();
        
    }

    public SpecificCar specificCarRent(String error) throws InvalidNewRentalException {
        this.displayMenuHeader(error);
        LOGGER.info("Matricula:");
        String carType = scanner.nextLine();
        try {
            return new SpecificCar(this.getDest(), carType);
        } catch (InputMismatchException e) {
            error="Wrong value!!";
            throw new InvalidNewRentalException();
        }
    }

    public RentCarSimple simpleCarRent(String error) throws InvalidNewRentalException {
        this.displayMenuHeader(error);
        LOGGER.info(STR);
        String carType = scanner.nextLine();
        try {
            return new RentCarSimple(this.getDest(), carType);
        } catch (InputMismatchException e) {
            throw new InvalidNewRentalException();
        }
    }

    public NewLogin newLogin(String error) {
        this.displayMenuHeader(error);
        System.out.println("User:");
        String user = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        return new NewLogin(user, password);
    }

    public RegisterCar newRegisterCar(String error) throws InvalidNewRegisterException {
        this.displayMenuHeader(error);
        LOGGER.info("Matricula:");
        String matricula = scanner.nextLine();
        LOGGER.info("Marca:");
        String marca = scanner.nextLine();
        LOGGER.info("Tipo do Carro: [electric, gas or hybrid]");
        String carType = scanner.nextLine();
        try {
        	LOGGER.info("Velocidade Média:");
            double avgSpeed = scanner.nextDouble();
            LOGGER.info("Preço base:");
            double basePrice = scanner.nextDouble();
            LOGGER.info("Consumo médio:");
            double gasMileage = scanner.nextDouble();
            LOGGER.info("Alcance:");
            int range = scanner.nextInt();

            RegisterCar c = new RegisterCar(
                    matricula,
                    carType,
                    basePrice,
                    gasMileage,
                    range,
                    this.getDest(),
                    marca);
            c.setAvgSpeed(avgSpeed);
            return c;
        } catch (InputMismatchException e) {
            throw new InvalidNewRegisterException();
        }
    }

    public RegisterUser newRegisterUser(String error) throws InvalidNewRegisterException {
        displayMenuHeader(error);
        LOGGER.info("Nome de Utilizador:");
        String user = scanner.nextLine();
        LOGGER.info("Email:");
        String email = scanner.nextLine();
        LOGGER.info("Password:");
        String pass = scanner.nextLine();
        LOGGER.info("Morada:");
        String adress = scanner.nextLine();
        int nif;
        try {
        	LOGGER.info("Nif:");
            nif = scanner.nextInt();
            
            if (this.myMenu.equals(MenuInd.REGISTERCLIENT)) {
                return newRegisterUserAux(user, email, pass, adress, nif);
            }
            else {
                return new RegisterUser(user, email, pass, adress, nif);
            }
        }
        catch (InputMismatchException e) {
            throw new InvalidNewRegisterException();
        }
    }
    public  RegisterUser newRegisterUserAux(String user,String email, String pass,String adress, int nif) throws InvalidNewRegisterException {
    	try {
            return new RegisterUser(user, email, pass, adress, nif, this.getLoc());
        }
        catch (InputMismatchException e) {
            throw new InvalidNewRegisterException();
        }
    }

    public Menu parser() {
    	String str = this.toString();
    	LOGGER.info(str);
		String str2 = scanner.nextLine();
        if (str2.matches("^[+-]?\\d{1,8}$")) {
            int i = Integer.parseInt(str2);
            if (this.options.size() > i - 1 && i > 0) {
                this.prev.push(this.myMenu);
                this.myMenu = this.options.get(i - 1);
                this.pickChildMenus();
            }
        }
        switch (str) {
            case "b":
            case "..":
                this.back();
                break;
            case "e":
                this.run = false;
                break;
            default: // case "e"
                break;
        }
        return this;
    }

    public Menu selectOption(MenuInd i) {
        this.prev.push(this.myMenu);
        this.myMenu = i;
        this.pickChildMenus();
        return this;
    }

    public TimeInterval getTimeInterval(String error) throws InvalidTimeIntervalException{
        this.displayMenuHeader(error);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            LOGGER.info("Inicio de Intervalo (yyyy-MM-dd HH:mm):");
            LocalDateTime inicio = LocalDateTime.parse(scanner.nextLine(), formatter);

            LOGGER.info("Fim de Intervalo (yyyy-MM-dd HH:mm):");
            LocalDateTime fim = LocalDateTime.parse(scanner.nextLine(), formatter);

            return new TimeInterval(inicio, fim);
        }
        catch (DateTimeParseException e){
            throw new InvalidTimeIntervalException();
        }
    }

    public RateOwnerCar pendingRateShow(String error, String pending, int total) throws InvalidRatingException {
        displayMenuHeader(error);
        String str = total + ".";
        LOGGER.info(str);
        LOGGER.info(pending);
        try {
        	LOGGER.info("Rating de Owner");
            int owner = scanner.nextInt();
            if (owner < 0 || owner > 100)
                throw new InvalidRatingException();
            LOGGER.info("Rating de Carro");
            int carro = scanner.nextInt();
            if (carro < 0 || carro > 100)
                throw new InvalidRatingException();
            return new RateOwnerCar(owner, carro);
        }
        catch (InputMismatchException e){
            throw new InvalidRatingException();
        }

    }

    public boolean getRun() { return this.run; }

    public Menu back() {
        if (this.prev.isEmpty()) {
            this.run = false;
        } else {
        	this.myMenu = this.prev.pop();
            this.pickChildMenus();
        }
        if (this.myMenu.equals(MenuInd.LOGIN) || this.myMenu.equals(MenuInd.REGISTER))
            this.back();
        return this;
    }

    private void displayMenuHeader(String error) {
        System.out.println(offset);
    	String one = this.createHeader();
    	String two = new StringBetter(error).under().toString();
        System.out.println(one);
        System.out.println(two);
    }

    private Point getDest(){
        LOGGER.info("UMCarroJa wants to know your destination!");
        LOGGER.info("x:");
        double x = scanner.nextDouble();
        LOGGER.info("y:");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    private Point getLoc(){
        LOGGER.info("UMCarroJa wants to know your location!");
        LOGGER.info("x:");
        double x = scanner.nextDouble();
        LOGGER.info("y:");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    private String createHeader() {
        StringBetter strHeader = new StringBetter("\t--");
        for (MenuInd val : this.prev)
            strHeader.append(val.name()).append("/");

        return strHeader.append(this.myMenu.name()).append("--\n").red().toString();
    }

    private void tableDefault(List<List<String>> valTab, List<String> colLabl){
        ArrayList<String> linLabl = new ArrayList<>();
        for(int i = 0; i < valTab.size(); i++ )
            linLabl.add(String.format("%dº", i + 1));

        Table<String> tab = new Table<>(valTab,linLabl,colLabl);
        String str = tab.toString();
        LOGGER.info(str);
    }

    private String menuOptionText(int i) {
        switch (this.options.get(i)) {
            case INITIAL:
                return "Menu Initial";
            case REGISTER:
                return  "Registar novo utilizador";
            case REGISTERCLIENT:
                return "Registar novo Client";
            case REGISTEROWNER:
                return  "Registar novo Proprietário";
            case LOGIN:
                return  "Login";
            case HISTORYCLIENT:
            case HISTORYOWNER:
                return "Histórico de alugueres";
            case CLOSEST:
                return  "Carro mais próximo das suas coordenadas";
            case CHEAPEST:
                return"Carro mais barato";
            case CHEAPESTNEAR:
                return "Carro mais barato dentro de uma distância";
            case SPECIFIC:
                return "Carro específico";
            case AUTONOMY:
                return  "Carro com uma autonomia desejada.";
            case ADDCAR:
                return  "Adicionar novo carro";
            case CAROVERVIEW:
                return "Várias operações sobre carros";
            case REVIEWRENTAL:
                return  "Aceitar/rejeitar o aluguer de um determinado cliente;";
            case TOP10CLIENTS:
                return "UMCarroJá Challenge";
            case DISTANCE:
                return "Organizado por distância";
            case NUSES:
                return "Organizado por número de Utilizações";
            case RENTALS:
                return "Alugar um carro";
            case PENDING:
                return "Avaliações pendentes";

                default:
                    return "";
        }
    }

    private void pickChildMenus() {
        this.options.clear();
        switch (this.myMenu) {
            case INITIAL:
                this.options.add(MenuInd.LOGIN);
                this.options.add(MenuInd.REGISTER);
                break;
            case REGISTER:
                LOGGER.info("Entrei");
                this.options.add(MenuInd.REGISTERCLIENT);
                this.options.add(MenuInd.REGISTEROWNER);
                break;
            case CLIENT:
                this.options.add(MenuInd.HISTORYCLIENT);
                this.options.add(MenuInd.PENDING);
                this.options.add(MenuInd.RENTALS);
                this.options.add(MenuInd.TOP10CLIENTS);
                break;
            case TOP10CLIENTS:
                this.options.add(MenuInd.NUSES);
                this.options.add(MenuInd.DISTANCE);
                break;
            case RENTALS:
                this.options.add(MenuInd.CLOSEST);
                this.options.add(MenuInd.CHEAPEST);
                this.options.add(MenuInd.CHEAPESTNEAR);
                this.options.add(MenuInd.SPECIFIC);
                this.options.add(MenuInd.AUTONOMY);
                break;
            case OWNER:
                this.options.add(MenuInd.HISTORYOWNER);
                this.options.add(MenuInd.CAROVERVIEW);
                this.options.add(MenuInd.REVIEWRENTAL);
                this.options.add(MenuInd.ADDCAR);
                break;
            default:
            	break;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(offset);
        str.append(this.createHeader()).append("\n\n");

        for (int i = 0; i < this.options.size(); i++)
            str.append(i + 1).append("- ").append(this.menuOptionText(i)).append("\n");
        return str.toString();
    }
}
