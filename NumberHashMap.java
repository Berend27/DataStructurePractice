package datastructures;

import java.util.HashMap;
import java.util.Map;

public class NumberHashMap
{
    // Demos the HashMap data structure
    
    public NumberHashMap()
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(9, "Nine");
        map.put(27,"Twenty Seven");
        printMap(map);
    }
    
    public void printMap(HashMap<Integer, String> theMap)
    {
        for(Map.Entry<Integer, String> entry : theMap.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
    
    public static void main(String[] args)
    {
        NumberHashMap map = new NumberHashMap();
    }
}