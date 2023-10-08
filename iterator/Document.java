package iterator;
/**
 * Document
 * @author Gavin Orme
 */
import java.util.Iterator;
import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack = new Stack<String>();
    private Stack<String> redoStack = new Stack<String>();

    /**
     * allows useer to put in a document
     * @param title creates a string for document 
     */
    public Document(String title)
    {
        this.title = title;
    }

    /**
     * adds changes to the document and puts them on the undo command list
     * @param change creates a string for what the user changes
     * @return pushes the change the users makes the undo stack 
     */
    public String makeChange(String change) //goes to undoStack
    {
        if(change == null)
        {
            return null;
        }
        else 
            return undoStack.push(change);
    }

    /**
     * allows user to undo a chnage and puts it into the redo stack
     * @return returns the string that is taken out of the top of the undo stack and adds it to the redo stack
     */
    public String undoChange()
    {
        String poppedString = undoStack.pop();
        redoStack.push(poppedString);
        return poppedString;
    }

    /**
     * allows the user to undo if there are changes in the document
     * @return returns when the undo stack is not empty which is all the time
     */
    public boolean canUndo()
    {
        return !undoStack.empty();
    }

    /**
     * allows user to redo the change that they undid so a change in the redo stack can go back into the undo stack
     * @return returns the string that is taken out of the top of the undo stack and adds it to the redo stack
     */
    public String redoChange()
    {
        String poppedString = redoStack.pop();
        undoStack.push(poppedString);
        return poppedString;
    }

    /**
     * allows user to redo changes that they undid
     * @return returns when the redo stack is not empty which is all the time
     */
    public boolean canRedo()
    {
        return !redoStack.empty();
    }

    /**
     * creates a new undo stack
     * @return returns the new undo stack
     */
    public StackIterator getUndoIterator()
    {
        return new StackIterator(undoStack);
    }
    /**
     * creates a new redo stack
     * @return returns the new redo stack
     */
    public StackIterator getRedoIterator()
    {
        return new StackIterator(redoStack);
    }
}