/*
* File: Console.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: szit
* Date: 2026-11-18
* Github: https://github.com/gunkhu
* Licenc: MIT
*/
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static String input(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}
