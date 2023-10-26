public class Person extends Animal
{
    private String firstName;
    private String lastName;
    private int id = 0;
    private static int personCount = 0;

    public Person() {
        super();
        this.firstName = null;
        this.lastName = null;
        personCount++;
    }

    public Person(String firstName, String lastName, byte age, int id) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        personCount++;
    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String speak() {
        if ( firstName==null && lastName==null ) {
            return "I don't have a name.";
        }

        StringBuilder sB = new StringBuilder();
        if ( firstName!=null && lastName!=null ) {
            sB.append("My name is " + firstName + " " + lastName);
        }
        if ( getAge() != 0 ) {
            sB.append(" and I am " + getAge() + " years old.");
        }
        else {
            sB.append(".");
        }
        return sB.toString();
    }

    @Override
    public String toString() {
        if ( firstName==null && lastName==null ) {
            return "N/A";
        }
        else if ( id != 0 ) {
            return firstName + " " + lastName + " " + id%10000;
        }
        else {
            return firstName + " " + lastName;
        }
    }

    public static int getPersonCount() {
        return personCount;
    }
}
