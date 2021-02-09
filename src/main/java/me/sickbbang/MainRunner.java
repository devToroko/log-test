package me.sickbbang;

import me.sickbbang.bravo_log.BravoLogTest;
import me.sickbbang.logging_test.LogTest;

public class MainRunner {
    public static void main(String[] args) {
        LogTest logTest = new LogTest();
        BravoLogTest bravoLogTest = new BravoLogTest();

        System.out.println("logTest.....");
        logTest.run();

        System.out.println("bravoLogTest.....");
        bravoLogTest.run();
    }
}
