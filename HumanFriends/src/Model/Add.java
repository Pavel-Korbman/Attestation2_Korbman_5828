package Model;

import Data.*;

import java.util.ArrayList;

import static Model.Get.dataGet;
import static Model.Save.dataSave;

public class Add {
    public static void addNew(String name, String type, String birthDate, String commands) {
        if (type.equals("собака") || type.equals("кошка") || type.equals("хомяк")) {
            int idPet = 1;
            ArrayList<Animals> petList = dataGet("Pets.txt");
            if (!petList.isEmpty()) {
                idPet = petList.getLast().getId() + 1;
            }
            switch (type) {
                case "собака" -> petList.add(new Dog(idPet, name, birthDate, commands));
                case "кошка" -> petList.add(new Cat(idPet, name, birthDate, commands));
                case "хомяк" -> petList.add(new Hamster(idPet, name, birthDate, commands));
            }
            dataSave("Pets.txt", petList);
        } else {
            int idPack = 1000;
            ArrayList<Animals> packList = dataGet("PackAnimals.txt");
            if (!packList.isEmpty()) {
                idPack = packList.getLast().getId() + 1;
            }
            switch (type) {
                case "лошадь" -> packList.add(new Horse(idPack, name, birthDate, commands));
                case "верблюд" -> packList.add(new Camel(idPack, name, birthDate, commands));
                case "осёл" -> packList.add(new Donkey(idPack, name, birthDate, commands));
            }
            dataSave("PackAnimals.txt", packList);
        }

    }

}
