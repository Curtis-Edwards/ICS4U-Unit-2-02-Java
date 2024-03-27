/*
* The CurtisStack Class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-03-27
*/

import java.util.ArrayList;
import java.util.List;

/**
* The CurtisStack() class.
*
* @param <T> as the type parameter
*/
public class CurtisStack<T> {
    /**
    * Declares a private instance variable
    */
    private List<T> stackAsList;

    /**
    * The constructor().
    */
    public CurtisStack() {
        stackAsList = new ArrayList<>();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(T input) {
        stackAsList.add(input);
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        final StringBuilder values = new StringBuilder();
        for (int counter = 0; counter < stackAsList.size(); counter++) {
            values.append(stackAsList.get(counter)).append(", ");
        }
        if (values.length() > 0) {
            values.delete(values.length() - 2, values.length());
        }
        return values.toString();
    }

  /**
     * This method pops a string from the stack.
     *
     * @return the popped string
     */
    public T popItem() {
        T poppedItem;
        if (!stackAsList.isEmpty()) {
            poppedItem = stackAsList.remove(stackAsList.size() - 1);
        } else {
            poppedItem = null; // or throw an exception or return a special value indicating empty stack
        }
        return poppedItem;
    }
}
