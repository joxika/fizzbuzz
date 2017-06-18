package jony.fizzbuzz.OOPtest;

public class Human
{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void speak()
    {
        System.out.println("Hello, my name is "+name);
        System.out.println("I am "+age+" Years old");
    }

}
