/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
* Refaktorálta: Csorba Péter
*/
public class App {
    public static void main(String[] args) {
        printHeader();
        Password.startApplication();
    }

    public static void printAbout() {
        System.out.println("Nagy János");
    }

    private static void printHeader() {
        printAbout();
        System.out.println("Jelszavak");
        System.out.println("Verzió: 0.0.1");
    }
}
