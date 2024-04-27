package Utilities;

import Classes.Code;
import Classes.CodesData;

import java.util.List;
import java.util.ListIterator;

public class List2D {
    public static void Sort(List<CodesData> ll, List<Code> l){
       ListIterator<Code> it = l.listIterator();
       CodesData aux; Code auxc;
       while(it.hasNext()){
            aux = new CodesData();
            auxc = it.next();
            aux.setLetter(auxc.getID().charAt(0));
            while(it.hasNext() && aux.compareTo(auxc) == 0){
                aux.getCodesList().add(auxc); // reescribir encapsulamiento del getter
                auxc = it.next();
            }
            ll.add(aux);
            if(it.hasNext()) {
                auxc = it.previous();
            }else{
                aux.getCodesList().add(l.getLast()); // llegué al ultimo nodo
            }
        }

    }
}
