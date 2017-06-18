package jony.fizzbuzz.OOPtest;

public class Earth {
    public static void main(String[] args)
    {
        Human human;

        human = new Human("humanika",6);

        System.out.println(human.getAge());
        human.speak();
    }
}
