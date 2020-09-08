package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Person one = new Person("Bent",180,41);
        Person two = new Person("Gert",170,23);
        Person three = new Person("Bo",175,23);
        Person four = new Person("Torben", 190,18);
        Person five = new Person("Morten",170,32);

        ArrayList<Person> list = new ArrayList<>(
            Arrays.asList(one, two,three,four,five));

        Collections.sort(list);

        System.out.println(list.toString());

        Collections.reverse(list);

        System.out.println(list.toString());


        //FileHandler fh = new FileHandler();
    //System.out.println(fh.numberOfLines("Resources\\info.txt"));
    }
}
