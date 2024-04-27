import Classes.Code;
import Classes.CodesData;
import Utilities.ExchangeCodes;
import Utilities.List2D;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List <Code> codigos = ExchangeCodes.RequestCodes();
        System.out.println(codigos);
        List<CodesData> llista= new LinkedList<>();
        List2D.Sort(llista,codigos);
        System.out.println("lista de codigos \n" + llista);
        int sizetot=0;
        for( CodesData c : llista){
            sizetot += c.getCodesList().size();
        }
        System.out.println(codigos.size() == sizetot); // lista de listas completada, sin error ni perdida de elementos
    }
}
