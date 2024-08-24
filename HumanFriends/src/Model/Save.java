package Model;

import Data.Animals;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Save {
    public static void dataSave(String fileName, ArrayList<Animals> animalsList) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            for (Animals animals : animalsList) {
                fileWriter.write(animals.toString());
                fileWriter.append('\n');
            }
            fileWriter.flush();
            System.out.println("Данные сохранены УСПЕШНО !");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}