package Flower;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        ArrayList<Virag> virag = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("virag.txt"))) {
            String s = sc.nextLine();
            while (sc.hasNextLine()) {
                String sor = sc.nextLine();
                String[] se = sor.split(">");
                virag.add(new Virag(se[0], Integer.parseInt(se[1]), LocalDate.parse(se[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), se[3], Integer.parseInt(se[4])));
            }
            System.out.println(virag);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

