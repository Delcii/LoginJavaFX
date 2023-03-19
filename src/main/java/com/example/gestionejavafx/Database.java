package com.example.gestionejavafx;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Utente> accessi = new ArrayList<>();

    public static void salva(){
        try {
        ObjectOutputStream salva = new ObjectOutputStream(new FileOutputStream("Login"));
        salva.writeObject(accessi);
        salva.flush();
        salva.close();
    }   catch (Exception IOException) {
            System.out.println("errore IO");
        }
    }
    public static void carica(){
        if(new File("Login").isFile()) {
            try {
                ObjectInputStream carica = new ObjectInputStream(new FileInputStream("Login"));
                accessi = (ArrayList<Utente>) carica.readObject();
            }   catch (Exception IOException) {
                System.out.println("errore IO");
            }
        }
    }
}
