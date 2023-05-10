package com.trafficviolationgenerator.services;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ViolationDataGeneratorService {

    private static final List<String> classes = Arrays.asList("Moto", "Motoneta", "Carro", "Caminhao", "Onibus");

    private static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static String licensePlate(){
        return String.join("", RandomStringUtils.randomAlphabetic(3),
                            RandomStringUtils.randomNumeric(4)).toUpperCase();
    }

    public static int velocity(){
        Random random = new Random();
        return random.nextInt((100 - 80) + 1) + 80;
    }

    public static String moment(){
        String moment = LocalDateTime.now().format(DTF);
        return moment;
    }

    public static String vehicleClass(){
        Random random = new Random();
        int index = random.nextInt(classes.size());
        return classes.get(index).toUpperCase();
   }

}
