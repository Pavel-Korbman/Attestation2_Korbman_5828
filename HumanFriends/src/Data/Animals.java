package Data;

import static Model.ToDate.convert;

public abstract class Animals implements Comparable<Animals> {
    private String birthDate;

    public abstract int getId();

    public abstract String getName();

    public abstract String getType();

    public abstract String getBirthDate();

    public abstract String getCommands();

    public abstract void setCommands(String commands);


    public int compareTo(Animals o) {
        return convert(birthDate).compareTo(convert(o.getBirthDate()));
    }

}

