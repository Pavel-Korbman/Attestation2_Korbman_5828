package View;

import java.util.Objects;
import java.util.Scanner;

import static Controller.Validation.*;
import static Model.Add.addNew;
import static Model.Commands.addCommands;
import static Model.Factory.addNewFactory;
import static Model.Search.searchId;

public class Input {

    public static void inputCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id:");
        String value = scanner.nextLine();
        if (validationNumber(value) && searchId(Integer.parseInt(value))) {
            System.out.println("""
                                    
                    Введите команды, которые которые хотите добавить. Например: служить, голос :
                    (если не хотите добавлять - просто нажмите Enter)
                    """);
            String val1 = scanner.nextLine();
            if (!Objects.equals(val1, "") && validationString(val1)) addCommands(Integer.parseInt(value), val1);
        }

    }

    public static void inputAddNew() {
        String name = null;
        String type = null;
        String birthDate = null;
        String commands = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вид животного (введите номер):");
        System.out.println("""
                1 - собака
                2 - кошка
                3 - хомяк
                4 - лошадь
                5 - верблюд
                6 - осёл
                """);
        int point = 0;
        String val = scanner.nextLine();
        if (validationNumber(val)) {
            point = Integer.parseInt(val);
        } else {
            inputAddNew();
        }
        if (point < 1 || point > 6) {
            System.out.println("Такого номера  нет в списке");
            return;
        } else {
            type = addNewFactory(point);
        }

        while (name == null) {
            System.out.println("Введите Имя животного:");
            String val1 = scanner.nextLine();
            if (validationEmpty(val1) && validationString(val1)) name = val1;
        }

        while (birthDate == null) {
            System.out.println("Введите дату рождения животного в формате ГГГГ-MM-ДД :");
            String val2 = scanner.nextLine();
            if (validationEmpty(val2) && validationDate(val2)) birthDate = val2;
        }

        System.out.println("Введите команды, которые знает животное. Например: дай лапу, сидеть :");
        System.out.println("* не обязятельное для заполнение поле");
        String val3 = scanner.nextLine();
        if (validationString(val3)) commands = val3;
        if (commands.isEmpty()) commands = "ничего не знает :(";
        addNew(name, type, birthDate, commands);
    }

}
