public class Person {

    /**
     *
     */
    private String name;
    private String age;


    public Person()
    {
        this.name = "mr worldwide";
    }

    public String getName()
    {
        return this.name;
    }

    public String getAge()
    {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getQuote()
    {
        System.out.println(getName());
    }
}
