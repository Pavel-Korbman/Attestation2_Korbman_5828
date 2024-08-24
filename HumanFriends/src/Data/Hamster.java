package Data;

import static Model.ToDate.convert;
import static java.lang.StringTemplate.STR;

public class Hamster extends Pets {
    private int id;
    private String name;
    private String type;
    private String birthDate;
    private String commands;

    public Hamster(int id, String name, String birthDate, String commands) {
        this.id = id;
        this.name = name;
        this.type = "хомяк";
        this.birthDate = birthDate;
        this.commands = commands;
    }

    @Override
    public String toString() {

        return STR."\{id}_\{name}_\{type}_\{birthDate}_\{commands}";
    }

    @Override
    public int getId() {

        return id;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public String getType() {
        return type;

    }

    @Override
    public String getBirthDate() {
        return birthDate;

    }

    @Override
    public String getCommands() {
        return commands;

    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public int compareTo(Animals o) {
        return convert(birthDate).compareTo(convert(o.getBirthDate()));

    }

}
