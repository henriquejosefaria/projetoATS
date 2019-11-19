package main.java.model;

import java.time.LocalDateTime;
import java.security.SecureRandom;

class Weather {
	private static String winter = "Winter";
	private static String spring = "Spring";
	private static String summer = "Summer";
	private static String fall = "Fall";
    private static final String[] seasons = {
            winter, winter,
            spring, spring, spring,
            summer, summer, summer,
            fall, fall, fall,
            winter
    };

    private String getSeason() {
        return seasons[LocalDateTime.now().getMonthValue()];
    }

    public double getSeasonDelay() {
        SecureRandom a = new SecureRandom();
        switch (getSeason()){
            case "Summer":
                return a.nextDouble() % 0.1;

            case "Spring":
                return a.nextDouble() % 0.3;

            case "Fall":
                return a.nextDouble() % 0.35;

            default:
                return a.nextDouble() % 0.6;
        }
    }
}
