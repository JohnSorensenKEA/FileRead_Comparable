package com.company;

public class Person implements Comparable<Person>
{
    private String name;
    private int height;
    private int age;

    public Person(String name, int height, int age)
    {

        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Person person)
    {
        // -1: if "this" is bigger
        // 0: if equal
        // 1: if "person" is bigger, "this" is smaller

        if(age > person.getAge())
        {
            return -1;
        }
        else if(age < person.getAge())
        {
            return 1;
        }
        else if(height > person.getHeight())
        {
            return -1;
        }
        else if(height < person.getHeight())
        {
            return 1;
        }
        return 0;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    @Override
    public String toString()
    {
        return "["+age+","+height+","+name+"]";
    }
}
