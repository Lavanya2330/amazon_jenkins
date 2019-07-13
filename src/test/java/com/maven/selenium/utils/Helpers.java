package com.maven.selenium.utils;

import java.util.Random;

public class Helpers {
int generatedNumber;
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int generateRandomNumber(int size) {
        Random random = new Random();
        if (size >= 0) {
            generatedNumber = random.nextInt(size - 1);
        }
              return generatedNumber;
        }

    }


