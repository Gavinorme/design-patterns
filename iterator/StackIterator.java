package iterator;
/**
 * Iterator
 * @author Gavin Orme
 */
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterator {
    private List<String> stackItems = null;
    private int position = 0;

    /**
     * These strings are the changes to the document
     * @param items an list of strings make up the stack
     */
    public StackIterator(Stack<String> items) {
        this.stackItems = new ArrayList<>(items);
    }

    /** 
     * adds to the position so it will go string by string
     * @return returns the position of the stackItems array list and adds 1 for each item
    */
    public String next()
    {
       return stackItems.get(position++);
    }

    /**
     * makes sure the index is in bounds
     * @return returns true if the stackItems size is greater than the position
     */
    public boolean hasNext()
    {
        if(position >= stackItems.size())
        {
            return false;
        }
        else
            return true;
    }
}