package main.java;

import main.java.controller.Controller;
import main.java.model.Parser;
import main.java.model.UMCarroJa;

import java.io.IOException;

import java.util.logging.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        UMCarroJa model = new UMCarroJa();
        
        try {
            model = UMCarroJa.read(".tmp");
            LOGGER.info("adasdsada1");
        }
        catch (IOException | ClassNotFoundException e) {
        	LOGGER.info("adasdsada2");
            new Parser("db/logsPOO_carregamentoInicial.bak", model);
        }
        try { Thread.sleep(10000);} catch (Exception e) {LOGGER.info("ignored Data!!");}
        new Controller(model).run();
        try {
            model.save(".tmp");
        }
        catch (IOException ignored) {LOGGER.info("ignored Data!!");}
    }
}