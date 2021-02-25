public class Person {

    /**
     *
     */
    private String name;
    private int age;


    public Person()
    {
        this.name = "mr worldwide";
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public int setAge(int age) {
        this.age = age;
        return this.age;
    }

    public void getQuote()
    {
        System.out.println(getName());
    }
}
