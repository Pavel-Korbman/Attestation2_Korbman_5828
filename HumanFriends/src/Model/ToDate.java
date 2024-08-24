package Model;

import Data.Animals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static Model.Get.dataGet;
import static View.Print.printList;
import static java.util.Collections.sort;

public class ToDate {
    public static LocalDate convert(String string) {
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(string, dateformatter);
    }

    public static void sortAll() {
        ArrayList<Animals> list = dataGet("Pets.txt");
        list.addAll(dataGet("PackAnimals.txt"));
        sort(list);
        printList(list);
    }
}