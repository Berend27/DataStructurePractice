package datastructures;
/**
 * Write a description of class AndroidStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Stack;
import java.util.Iterator;

public class AndroidStack
{
    // instance variables - replace the example below with your own
    private Stack<String> languages;

    /**
     * Constructor for objects of class AndroidStack
     */
    public AndroidStack()
    {
        // initialise instance variables
        languages  = new Stack<>();
        addLanguages();
    }

    public void addLanguages() 
    {
      if (languages.search("Kotlin") == -1)
        languages.push("Kotlin");
      if (languages.search("Javascript") == -1)
        languages.push("Javascript");
      if (languages.search("Java") == -1)
        languages.push("Java");
    }
    
    public String getLastItem()
    {
       if (languages.size() > 0)
       {
           return languages.peek();
       }
       else
       {
           return "The Stack is empty";
       }
    }
    
    public int searchStack(String item)
    {
        return languages.search(item);
    }
    
    public Stack<String> getStack() 
    {
        return languages;
    }
    
    public static void main(String[] arguments) 
    {
        AndroidStack androidStack = new AndroidStack();
        System.out.println("The last language added to the stack is " + androidStack.getLastItem());
        System.out.println("The number of pops to get to Javascript is " + androidStack.searchStack("Javascript"));
        System.out.println("There are " + androidStack.languages.size() + " languages on the stack");
        System.out.println("Now popping the three programming language names off of the stack");
        int size = androidStack.getStack().size(); //androidStack.getStack().size();
        for(int i = 0; i < size; i++)
        {
            System.out.println(androidStack.languages.pop());
        }
        System.out.println("The number of items on the stack is now " + Integer.toString(androidStack.languages.size()));
        System.out.println("So lets add the three languages back");
        androidStack.addLanguages();
        Iterator<String> stackIterator = androidStack.languages.iterator();
        while (stackIterator.hasNext()) {
            String language = stackIterator.next();
            System.out.println(language);
        }
        System.out.println("The top item on the stack is " + androidStack.getLastItem());
      
    }
}