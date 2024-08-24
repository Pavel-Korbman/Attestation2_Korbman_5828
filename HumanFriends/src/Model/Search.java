package Model;

import Data.Animals;

import java.util.ArrayList;

import static Model.Get.dataGet;
import static java.lang.StringTemplate.STR;

public class Search {
    public static boolean searchId(int id_animal) {
        String fileName;
        if (id_animal < 1000) {
            fileName = "Pets.txt";
        } else {
            fileName = "PackAnimals.txt";
        }
        ArrayList<Animals> list = dataGet(fileName);
        boolean res = false;
        for (Animals animal : list) {
            if (animal.getId() == id_animal) {
                System.out.println(STR."\{animal.getId()} \{animal.getName()} \{animal.getType()} \{animal.getBirthDate()} Команды: \{animal.getCommands()}");
                res = true;
            }
        }
        if (!res) {
            System.out.println(STR."Животного с id=\{id_animal} не найдено");
        }
        return res;
    }
}
