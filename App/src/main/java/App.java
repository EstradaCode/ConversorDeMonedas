import Classes.Code;
import Utilities.ExchangeCodes;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Code> codigos = ExchangeCodes.RequestCodes();
        System.out.println(codigos);

    }
}
