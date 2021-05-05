package programmeweek9;

/* 5. Write a Java program to iterate through all elements in an array list using
Iterator.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ItretorArrayList
{
    public static void main(String[] args)
    {
        ArrayList employeeName = new ArrayList();
        employeeName.add("Gorge");
        employeeName.add("Ricky");
        employeeName.add("Pal");
        employeeName.add("Patrick");
        employeeName.add("John");
        employeeName.add("Mike");

        //iterating list using Iterator
        Iterator itr = employeeName.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

