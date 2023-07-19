package ro.sit.homework.homework05;

import java.util.*;

public class PetHotel {

    public static void main(String[] args)
    {
        ArrayList<Dogs> list = new ArrayList<>();
        list.add(new Dogs("Charlie", "mare", "Akita Inu", (byte)2));
        list.add(new Dogs("Buddy", "medie", "Beagle", (byte)4));
        list.add(new Dogs("Oscar", "mare", "German Shepherd", (byte)1));
        list.add(new Dogs("Lucky", "mica", "Terrier", (byte)10));
        list.add(new Dogs("Odie", "mica", "Mops", (byte)6));
        list.add(new Dogs("Dingo", "medie", "Shiba Inu", (byte)1));
        list.add(new Dogs("Nero", "mare", "Terranova", (byte)8));
        list.add(new Dogs("Dingo", "medie", "Shiba Inu", (byte)1));
        list.add(new Dogs("Lucky", "mica", "Terrier", (byte)10));
        list.add(new Dogs("Buddy", "medie", "Beagle", (byte)4));
        list.add(new Dogs("Charlie", "mare", "Akita Inu", (byte)2));

        Set<Dogs> s = new HashSet<Dogs>();
        s.addAll(list);
        list = new ArrayList<Dogs>();
        list.addAll(s);

        for(Object obj : list)
        {
           System.out.println(obj);
        }

    }


}
