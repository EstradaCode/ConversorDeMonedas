import Classes.Code;
import Classes.CodesData;
import Utilities.ExchangeCodes;
import Utilities.ExchangeRequest;
import Utilities.List2D;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        List <Code> codigos = ExchangeCodes.RequestCodes();
        System.out.println(codigos);
        List<CodesData> llista= new LinkedList<>();
        List2D.Sort(llista,codigos); // genera la lista de listas con la lista de codigos!
        System.out.println("lista de codigos \n" + llista);
        System.out.println("elije un codigo para mostrar sus tasas de cambio");
        String base_Code = in.next();
        System.out.println(ExchangeRequest.getAllCurrencies(base_Code));
    }
}
