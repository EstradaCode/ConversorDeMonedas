package Classes;

import java.util.LinkedList;
import java.util.List;

public class CodesData  implements Comparable<Code> { // works as T DATA for list of list && AVL binary tree
    private char letter;
    private List<Code> CodesList;

    public CodesData() {
        CodesList = new LinkedList<>();
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public List<Code> getCodesList() {
        return CodesList;
    }


    @Override
    public String toString() {
        return "CodesData{" +
                "letter='" + letter + '\'' +
                ", CodesList=" + CodesList +
                "} \n";
    }

    @Override
    public int compareTo(Code c) { // ordena la lista Grande alfabeticamente.
        return this.letter - c.getID().charAt(0);
    }
}
