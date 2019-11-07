package controller;

import model.*;
import view.Menu;
import view.viewmodel.*;
import exceptions.*;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {
    private final UMCarroJa model;
    private User user;
    private final Menu menu;
    private String errorParam = "Parametros Inválidos";
    private String errorCars = "No cars availables";
    
    
    public Controller(UMCarroJa model) {
        this.menu = new Menu();
        this.model = model;
    }

    public void run(){
        String error = "";
        while(this.menu.getRun()) {
            switch (menu.getMenu()) {
                case LOGIN:
                	error = caseLogin();
                    break;
                case REGISTERCLIENT:
                    error = caseRegisterClient();
                    break;
                case REGISTEROWNER:
                    error = caseRegisterOwner();
                    break;
                case CLOSEST:
                    error = caseClosest();
                    break;
                case CHEAPEST:
                    error = caseCheapest();
                    break;
                case REVIEWRENTAL:
                    error = caseReviewRental();
                    break;

                case CHEAPESTNEAR:
                    error = caseCheapestNear();
                    break;

                case AUTONOMY:
                	error = caseAutonomy();
                    break;

                case SPECIFIC:
                    error = caseSpecific();
                    break;

                case ADDCAR:
                    error = caseAddCar();
                    break;

                case NUSES:
                    error = caseNUses();
                    break;

                case DISTANCE:
                    error = caseDistance();
                    break;

                case CAROVERVIEW:
                    error = caseCarOverview();
                    break;

                case PENDING:
                    error = casePending();
                    break;

                case HISTORYOWNER:
                    error = caseHistoryOwner();
                    break;

                case HISTORYCLIENT:
                    error = caseHistoryClient();
                    break;

                default:
                    this.menu.parser();
                    break;
            }
        }
    }

	public String caseLogin() {
    	String error = "";
    	try {
    		NewLogin r = menu.newLogin(error);
    		user = model.logIn(r.getUser(), r.getPassword());
    		menu.selectOption((user instanceof Client)? Menu.MenuInd.CLIENT : Menu.MenuInd.OWNER);
    		error = "";
    	}
    	catch (InvalidUserException e){ error = "Invalid Username"; }
    	catch (WrongPasswordExecption e){ error = "Invalid Password"; }
    	return error;
    }
	
	public String caseRegisterClient() {
		String error = "";
		try {
            RegisterUser registerUserCli = menu.newRegisterUser(error);
            Client client = new Client(
                    registerUserCli.getPos(),
                    registerUserCli.getEmail(),
                    registerUserCli.getPasswd(),
                    registerUserCli.getName(),
                    registerUserCli.getAddress(),
                    registerUserCli.getNif()
            );
            this.model.addUser(client);
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = errorParam; }
        catch (UserExistsException e){ error = "Utilizador já existe"; }
		return error;
	}

	public String caseRegisterOwner() {
		String error = "";
		try {
            RegisterUser registerUserProp = menu.newRegisterUser(error);
            Owner owner = new Owner(
                    registerUserProp.getEmail(),
                    registerUserProp.getName(),
                    registerUserProp.getAddress(),
                    registerUserProp.getNif(),
                    registerUserProp.getPasswd()
            );
            this.model.addUser(owner);
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = errorParam; }
        catch (UserExistsException e){ error = "Utilizador já existe"; }
		return error;
	}
	
	public String caseClosest() {
		String error = "";
		try{
            RentCarSimple rent = menu.simpleCarRent(error);
            Rental rental = model.rental(
                    (Client)user,
                    rent.getPoint(),
                    "MaisPerto",
                    rent.getCarType());
            menu.showString(rental.toString());
            menu.back();
            error = "";
        }
        catch (UnknownCompareTypeException ignored) {error = "";}
        catch (NoCarAvaliableException e) { error = errorCars; }
        catch (InvalidNewRentalException e){error = "Novo Rental inválido"; }
		return error;
	}

	public String caseCheapest() {
		String error = "";
		try{
            RentCarSimple rent = menu.simpleCarRent(error);
            Rental rental = model.rental(
                    (Client)user,
                    rent.getPoint(),
                    "MaisBarato",
                    rent.getCarType());
            menu.showString(rental.toString());
            menu.back();
        }
        catch (UnknownCompareTypeException ignored) {error = "";}
        catch (NoCarAvaliableException e) { error = errorCars; }
        catch (InvalidNewRentalException e){error = "Novo Rental inválido"; }
		return error;
	}
	
	public String caseReviewRental() {
		String error = "";
		Owner owner = (Owner)this.user;
        ArrayList<Rental> lR = (ArrayList<Rental>) owner.getPending();
        if (lR.isEmpty()){
            this.menu.back();
            
        } else {
        	String v = menu.reviewRentShow(
        			error,
        			owner.getRates(),
        			lR.stream()
        					.map(Rental::toParsableUserString)
        					.map(x -> Arrays.asList(x.split("\n")))
        					.collect(Collectors.toList()));
        	
        	try {
        		switch (v.charAt(0)) {
        			case 'a':
        				this.model.rent(lR.get(Integer.parseInt(v.substring(1)) - 1));
        				this.model.rate(
        						owner,
        						lR.get(Integer.parseInt(v.substring(1)) - 1),
        						this.menu.showRentalRate(
        								lR.get(Integer.parseInt(v.substring(1)) - 1).toFinalString()));
        				break;
        			case 'r':
        				this.model.refuse(owner, lR.get(Integer.parseInt(v.substring(1)) - 1));
        				break;
        			default: // 'b'
        				this.menu.back();
        				break;
        		}
        		error = "";
        	}
        	catch(NumberFormatException | IndexOutOfBoundsException e){error = "Input Inválido";}
        }
		return error;
	}
	
	public String caseCheapestNear() {
		String error = "";
		try{
            CheapestNearCar walkCar = menu.walkingDistanceRent(error);

            Rental rental = model.rental(
                    (Client)user,
                    walkCar.getPoint(),
                    walkCar.getWalkDistance(),
                    walkCar.getType()
            );

            this.menu.showString(rental.toString());
            this.menu.back();
        }
        catch (InvalidNewRentalException e){error = "New rental inválido";}
        catch (NoCarAvaliableException e)  {error = errorCars; }
		return error;
	}
	
	public String caseAutonomy() {
		String error = "";
		try{
            AutonomyCar autoCar = menu.autonomyCarRent(error);

            Rental rental = model.rental(
                    autoCar.getPoint(),
                    autoCar.getAutonomy(),
                    autoCar.getType(),
                    (Client)user);

            menu.showString(rental.toString());
            this.menu.back();
        }
        catch (InvalidNewRentalException e){error = "New rental inválido";}
        catch (NoCarAvaliableException e) { error = errorCars; }
		return error;
	}
	
	public String caseSpecific() {
		String error = "";
		try {
            SpecificCar sc = this.menu.specificCarRent(error);
            Rental rental = this.model.rental(sc.getPoint(), sc.getNumberPlate(), (Client)user);
            this.menu.showString(rental.toString());
            this.menu.back();
            error = "";
        }
        catch (NoCarAvaliableException e) { error = "Carro não está disponível"; }
        catch (InvalidCarException e) { error = "Carro não existe"; }
        catch (InvalidNewRentalException e) { error = "Invalid Parameters"; }
		return error;
	}
	
	public String caseAddCar() {
		String error = "";
		try {
            RegisterCar registerCar = menu.newRegisterCar(error);
            Owner ownerCar = (Owner)this.user;
            model.addCar(
                    ownerCar,
                    registerCar.getNumberPlate(),
                    registerCar.getType(),
                    registerCar.getAvgSpeed(),
                    registerCar.getBasePrice(),
                    registerCar.getGasMileage(),
                    registerCar.getRange(),
                    registerCar.getPos(),
                    registerCar.getBrand()
            );
            menu.back();
            error = "";
        }
        catch (InvalidNewRegisterException e){ error = errorParam; }
        catch (CarExistsException e){ error = "Carro já existe"; }
        catch (InvalidUserException ignored) {error = "";}
		return error;
	}
	
	public String caseNUses() {
		String error = "";
		menu.top10ClientsShow(
                this.model.getBestClientsTimes()
                        .stream()
                        .map(x ->
                                Arrays.asList(
                                        x.getKey(),
                                        x.getValue().toString()))
                        .limit(10)
                        .collect(Collectors.toList()),
                "Número de Utilizações");
        this.menu.back();
		return error;
	}
	
	public String caseDistance() {
		String error = "";
		menu.top10ClientsShow(
                this.model.getBestClientsTravel()
                        .stream()
                        .map(x ->
                             Arrays.asList(
                                     x.getKey(),
                                     String.format("%.2f", x.getValue())))
                        .limit(10)
                        .collect(Collectors.toList()),
                "Distância");
        this.menu.back();
		return error;
	}
	
	public String caseCarOverview() {
		String error = "";
		Owner ownerCar = (Owner)this.user;
        String action = this.menu.carOverviewShow(error,
                ownerCar.getCars().stream()
                .map(x -> Arrays.asList(x.toString().split("\n")))
                .collect(Collectors.toList()));
        try {
            switch (action.charAt(0)) {
                case ' ':
                    break;
                case 'r':
                    model.refil(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case'c':
                    String [] s = action.substring(1).split(" ");
                    if (s.length != 2)
                        throw new InvalidNumberOfArgumentsException();
                    model.setBasePrice(ownerCar, Integer.parseInt(s[0]) - 1, Double.parseDouble(s[1]));
                    break;
                case 'd':
                    model.swapState(ownerCar, Integer.parseInt(action.substring(1)) - 1);
                    break;
                case 't':
                    TimeInterval ti = this.menu.getTimeInterval(error);
                    this.menu.showString("Total faturado: " +
                            model.getTotalBilledCar(
                            ownerCar.getCars().get(Integer.parseInt(action.substring(1)) - 1),
                            ti.getInicio(),
                            ti.getFim()));
                    break;
                case 'b':
                    this.menu.back();
                    break;

                default:
                    throw new InvalidNumberOfArgumentsException();
            }
            error = "";
        }
        catch (IndexOutOfBoundsException e){ error = "Valor de carro inválido"; }
        catch (NumberFormatException e){ error = "Posição inválida"; }
        catch (InvalidNumberOfArgumentsException e) {error = "Invalid parameters";}
        catch (InvalidTimeIntervalException e ){error = "Formato Inválido de Data";}
		return error;
	}
	
	public String casePending() {
		String error = "";
		try {
            Client cli = (Client) user;
            List<Rental> pR = cli.getPendingRates();

            if (pR.isEmpty()) {
                this.menu.back();
            } else {

            	RateOwnerCar r = this.menu.pendingRateShow(error, pR.get(0).toString(), pR.size());
          
            	model.rate(cli, pR.get(0), r.getOwnerRate(), r.getCarRate());

            	error = "";
           }
        }
        catch (InvalidRatingException e){error = "Parametros Invalidos";}
		return error;
	}
	
	public String caseHistoryOwner() {
		String error = "";
		try{
            TimeInterval ti = this.menu.getTimeInterval(error);

            this.menu.rentalHistoryShow(ti,
                    this.model.getRentalListOwner((Owner) this.user, ti.getInicio(), ti.getFim())
                            .stream()
                            .map(Rental::toParsableOwnerRentalString)
                            .map(x -> Arrays.asList(x.split("\n")))
                            .collect(Collectors.toList()));

            this.menu.back();
            error = "";
        }
        catch (InvalidTimeIntervalException e){error = "Intervalo Inválido";}
		return error;
	}

	public String caseHistoryClient() {
		String error = "";
		try{
            TimeInterval ti = this.menu.getTimeInterval(error);

            this.menu.rentalHistoryShow(ti,
                    this.model.getRentalListClient((Client) this.user, ti.getInicio(), ti.getFim())
                            .stream()
                            .map(Rental::toParsableUserRentalString)
                            .map(x -> Arrays.asList(x.split("\n")))
                            .collect(Collectors.toList()));

            this.menu.back();
            error = "";
        }
        catch (InvalidTimeIntervalException e){error = "Intervalo Inválido";}
		return error;
	}

}
	