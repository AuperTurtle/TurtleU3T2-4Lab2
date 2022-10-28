public class Cat
{
    private String name;
    private int age;
    public int randomResponse = 0;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
       randomResponse = (int) ((Math.random() * 3) + 1);
       if (randomResponse == 1) {
           return "meow!";
       }
       if (randomResponse == 2) {
           return "boo!";
       }
       if (randomResponse == 3) {
           return ":(";
       }
       return "";
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}