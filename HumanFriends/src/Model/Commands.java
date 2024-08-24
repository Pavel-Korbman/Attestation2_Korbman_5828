package Model;
import Data.Animals;
import java.util.ArrayList;
import java.util.Objects;

import static Model.Get.dataGet;
import static Model.Save.dataSave;
public class Commands {
    public static void addCommands (int id, String newCommand) {
        String fileName;
        if (id < 1000) {
            fileName = "Pets.txt";
        } else {
            fileName = "PackAnimals.txt";
        }
        ArrayList<Animals> list = dataGet(fileName);
        for (Animals animal : list) {
            if (animal.getId() == id) {
                if (Objects.equals(animal.getCommands(), "ничего не знает :(")) {
                    animal.setCommands(newCommand);
                } else { animal.setCommands(animal.getCommands() + ", " + newCommand);}
                dataSave(fileName, list);
                System.out.println("Команды добавлены !");
            }
        }

    }
}
