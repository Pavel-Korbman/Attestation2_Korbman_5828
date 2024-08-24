package Data;

public abstract class Pets extends Animals {
    public abstract int getId();

    public abstract String getName();

    public abstract String getType();

    public abstract String getBirthDate();

    public abstract String getCommands();

    @Override
    public abstract int compareTo(Animals o);
}
