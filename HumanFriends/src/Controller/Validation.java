package Controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.StringTemplate.STR;

public class Validation {
    public static boolean validationString(String string) {
        if (string.contains("_")) {
            System.out.println("В тексте нельзя использовать подчёркивание '_'");
            return false;
        } else {
            return true;
        }
    }

    public static boolean validationNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            System.err.println(STR."Номер должен быть целым положительным числом \{e.getMessage()}");
            return false;
        }
    }

    public static boolean validationEmpty(String string) {
        if (string.isEmpty()) {
            System.out.println("Необходимо ввести данные ");
            return false;
        } else {
            return true;
        }
    }

    public static boolean validationDate(String string) {
        try {
            DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(string, dateformatter);
            return true;
        } catch (Exception e) {
            System.err.println(STR."Error: \{e.getMessage()}");
            return false;
        }

    }

    public static boolean presenceFile(String fileName) {
        try (FileReader e = new FileReader(fileName)) {
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static void validationFiles() {
        if (!presenceFile("Pets.txt"))
            try (FileWriter fw = new FileWriter("Pets.txt", false)) {
                System.out.println("Файл Pets.txt создан !");
                fw.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        if (!presenceFile("PackAnimals.txt"))
            try (FileWriter fw = new FileWriter("PackAnimals.txt", false)) {
                System.out.println("Файл PackAnimals.txt создан !");
                fw.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

    }

}

