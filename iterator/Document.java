package iterator;

import java.util.Iterator;
import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack = new Stack<String>();
    private Stack<String> redoStack = new Stack<String>();

    public Document(String title)
    {
        this.title = title;
    }

    public String makeChange(String change) //goes to undoStack
    {
        if(change == null)
        {
            return null;
        }
        else 
            return undoStack.push(change);
    }

    public String undoChange()
    {
        String poppedString = undoStack.pop();
        redoStack.push(poppedString);
        return poppedString;
    }

    public boolean canUndo()
    {
        return !undoStack.empty();
    }

    public String redoChange()
    {
        String poppedString = redoStack.pop();
        undoStack.push(poppedString);
        return poppedString;
    }

    public boolean canRedo()
    {
        return !redoStack.empty();
    }

    public StackIterator getUndoIterator()
    {
        return new StackIterator(undoStack);
    }
    public StackIterator getRedoIterator()
    {
        return new StackIterator(redoStack);
    }
   

}//maybe move


//added changes go to the chnage list
//undo goes to redo in chnage list
//redo gives the undo back to the change list
//Document
//make chnage- undo
//undochnage --> isEmpty
//might not need position
//getiterators prints out the list
//import java.util.stack for document
//
