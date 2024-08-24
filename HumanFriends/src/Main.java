
import java.io.IOException;
import java.util.zip.DataFormatException;

import static Controller.Validation.validationFiles;
import static View.Menu.menu;

public class Main {
    public static void main(String[] args) throws DataFormatException, IOException {
        validationFiles();
        for (; ; ) menu();

    }
}