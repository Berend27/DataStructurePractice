package datastructures;
import java.util.*;

public class LinkedNumbers
{
    // starts with two ArrayLists of consecutive odd or even numbers, 
    // then adds them to a LinkedList so that they are in numerical order
    public LinkedNumbers()
    {
        ArrayList<Integer> odds = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        ArrayList<Integer> evens = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addAll(odds);
        
        for(int i = 1; i <= evens.size()*2; i += 2)
        {
            numbers.add(i, evens.get((i-1)/2));
        }
        
        System.out.println(numbers);
    }
    
    public static void main(String[] args)
    {
        LinkedNumbers demo = new LinkedNumbers();
    }   
}