package ro.sit.homework.homework05;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

import ro.sit.course.course03_04.Person;
import ro.sit.homework.homework05.Elev;

public class Catalog {

    public static void main(String[] args)
    {
        Catalog catalog = new Catalog();

        catalog.AddingStudents();

        Elev[] elevi = {new Elev("Andrei", (byte) 5),
                new Elev("Ion", (byte) 9),
                new Elev("Sebastian", (byte) 7),
                new Elev("Mihai", (byte) 4),
                new Elev("Maria", (byte) 6),};

        for(Elev ev : elevi) {
            if(ev.getName() == "Ion")
            {
                System.out.println();
                System.out.println("Searching for student Ion: ");
                System.out.println("name: " + ev.getName() + " media: " + ev.getMedie());
            }
        }

        catalog.RemoveElevi();

        catalog.DeleteDuplicates();

        catalog.OrderByName();

        catalog.OrderByAverageScore();

    }

    public void DeleteDuplicates() {
        HashSet<String> setList = new HashSet<>();
        setList.add("Andrei");
        setList.add("Ion");
        setList.add("Sebastian");
        setList.add("Andrei");
        setList.add("Mihai");
        setList.add("Maria");

        System.out.println();
        System.out.println("Removing Duplicates");
        for (String el : setList) {
            System.out.println(el);
        }
    }
    public void AddingStudents()
    {
        List elevi = new ArrayList();
        elevi.add(new Elev("Andrei", (byte) 5));
        elevi.add(new Elev("Ion", (byte) 9));
        elevi.add(new Elev("Sebastian", (byte) 7));
        elevi.add(new Elev("Mihai", (byte) 4));
        elevi.add(new Elev("Maria", (byte) 6));

        System.out.println("Display all students: ");
        DisplayElevi(elevi);


    }

    public void RemoveElevi()
    {
        HashMap<String, Byte> hm = new HashMap<String, Byte>();
        hm.put("Andrei", (byte)5);
        hm.put("Ion", (byte)9);
        hm.put("Sebastian", (byte)7);
        hm.put("Mihai", (byte)4);
        hm.put("Maria", (byte)6);

        System.out.println();
        System.out.println(hm);
        System.out.println();
        System.out.println("Removing Sebastian..." );
        hm.remove("Sebastian");
        System.out.println();
        System.out.println(hm);
    }

    public void OrderByName()
    {
        List<String> setList = new ArrayList<String>();
        setList.add("Sebastian");
        setList.add("Andrei");
        setList.add("Ion");
        setList.add("Mihai");
        setList.add("Maria");

        Collections.sort(setList);
        System.out.println();
        System.out.println("Sorting students: ");
        System.out.println(setList);
    }

    public void OrderByAverageScore()
    {
        HashMap<String, Byte> hm = new HashMap<String, Byte>();
        hm.put("Andrei", (byte)5);
        hm.put("Ion", (byte)9);
        hm.put("Sebastian", (byte)7);
        hm.put("Mihai", (byte)4);
        hm.put("Maria", (byte)6);

        List<Map.Entry<String, Byte>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Byte>>() {
            public int compare(Map.Entry<String, Byte> e1, Map.Entry<String, Byte> e2) {
                return e1.getValue()-e2.getValue();
            }
        });

        System.out.println();
        System.out.println("Sorting students by average score: ");
        for (Map.Entry<String, Byte> e: list)
        {
            System.out.println("Name: " + e.getKey() + " average score: " + e.getValue());
        }
    }


    public void DisplayElevi(List list) {
        for (Object obj : list) {

            System.out.println(obj);
        }
    }

}
