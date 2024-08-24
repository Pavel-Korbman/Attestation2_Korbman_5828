package Model;

import Data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Model.Factory.typeFactory;

public class Get {
    public static ArrayList<Animals> dataGet(String fileName) {
        ArrayList<Animals> animalsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String string;
            while ((string = reader.readLine()) != null) {
                ArrayList<String> str = new ArrayList<>(List.of(string.split("_")));
                animalsList.add(typeFactory(str));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return animalsList;
    }

    public static int countGet() {
        return dataGet("Pets.txt").size() + dataGet("PackAnimals.txt").size();
    }
}
