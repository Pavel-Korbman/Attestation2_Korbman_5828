package Model;

import Data.*;

import java.io.IOException;
import java.util.ArrayList;

import static Model.Get.countGet;
import static Model.ToDate.sortAll;
import static View.Input.inputAddNew;
import static View.Input.inputCommands;
import static View.Print.printAnyLists;
import static java.lang.StringTemplate.STR;

public class Factory {
    public static Animals typeFactory(ArrayList<String> list) {
        switch (list.get(2)) {
            case "собака" -> {
                return new Dog(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
            case "кошка" -> {
                return new Cat(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
            case "хомяк" -> {
                return new Hamster(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
            case "лошадь" -> {
                return new Horse(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
            case "верблюд" -> {
                return new Camel(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
            case "осёл" -> {
                return new Donkey(Integer.parseInt(list.getFirst()), list.get(1), list.get(3), list.getLast());
            }
        }
        return null;
    }

    public static void menuFactory(int point) throws IOException {
        switch (point) {
            case 1 -> System.out.println(STR."Всего животных: \{countGet()}");
            case 2 -> printAnyLists();
            case 3 -> sortAll();
            case 4 -> inputCommands();
            case 5 -> inputAddNew();
            case 6 -> System.exit(0);
        }
    }

    public static String addNewFactory(int point) {
        switch (point) {
            case 1 -> {
                return "собака";
            }
            case 2 -> {
                return "кошка";
            }
            case 3 -> {
                return "хомяк";
            }
            case 4 -> {
                return "лошадь";
            }
            case 5 -> {
                return "верблюд";
            }
            case 6 -> {
                return "осёл";
            }
        }
        return null;
    }

}

