package View;

import Data.Animals;

import java.io.IOException;
import java.util.ArrayList;

import static Model.Get.dataGet;
import static java.lang.StringTemplate.STR;

public class Print {
    public static void printList(ArrayList<Animals> animalsList) {
        for (Animals pet : animalsList) {
            System.out.println(STR."\{pet.getId()} \{pet.getName()} \{pet.getType()} \{pet.getBirthDate()} \{pet.getCommands()}");
        }
    }

    public static void printAnyLists() throws IOException {
        System.out.println("Домашние животные:");
        printList(dataGet("Pets.txt"));
        System.out.println();
        System.out.println("Вьючные животные:");
        printList(dataGet("PackAnimals.txt"));
    }

}
