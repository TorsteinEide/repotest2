public class Person {
    private String name;
    private String age;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
