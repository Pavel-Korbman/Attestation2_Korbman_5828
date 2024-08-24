package View;

import java.io.IOException;
import java.util.Scanner;

import static Controller.Validation.*;
import static Model.Factory.menuFactory;

public class Menu {
    public static void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""

                Выберите действие (введите номер):""");
        System.out.println("""
                1 - вывести количество животных в реестре
                2 - вывести списки домашних и вьючных животных
                3 - вывести список животных, отсортированный по дате рождения
                4 - команды животного (с возможностью добавления)
                5 - добавить новое животное
                6 - выход
                """);
        String val = scanner.nextLine();
        int point = 0;
        if (validationNumber(val)) point = Integer.parseInt(val);
        if (point < 1 || point > 6) {
            System.out.println("Такого пункта нет в меню");
        } else {
            menuFactory(point);
        }
    }

}
