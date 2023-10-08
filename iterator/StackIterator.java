package iterator;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StackIterator implements Iterator {
    private List<String> stackItems = null;
    private int position = 0;

    public StackIterator(Stack<String> stack) {
        this.stackItems = new ArrayList<>(stack);
        Collections.reverse(stackItems);
    }

    public String next()
    {
       return stackItems.get(position++);
    }

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
