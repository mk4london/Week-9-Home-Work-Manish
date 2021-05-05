package programmeweek9;

/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<Integer , String> people = new HashMap<>();
        people.put(1,"Ricky");
        people.put(3,"Mike");
        people.put(4,"Pal");
        people.put(7,"Charlie");

        for (int i : people.keySet())
        {
            System.out.println(i);
        }
    }
}

