/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
* Refaktorálta: Csorba Péter
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Store {
    public static boolean saveContent(PasswordDto pass){
        try {
            trySaveContent(pass);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    private static void trySaveContent(PasswordDto pass)throws IOException{
        FileWriter filewriter = new FileWriter("pass.txt",Charset.forName("utf-8"),true);
        String line = pass.username + ";" + pass.password + ";" + pass.place + "\n";
        filewriter.write(line);
        filewriter.close();
    }
}
