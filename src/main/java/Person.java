public class Person {

    /**
     *
     */
    private String name;


    public Person()
    {
        this.name = "mr worldwide";
    }

    public String getName()
    {
        return this.name;
    }

    public void getQuote()
    {
        System.out.println(getName());
    }
}
