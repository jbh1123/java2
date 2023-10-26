public class Cat extends Animal
{
    public Cat(byte age) {
        super(age);
    }

    @Override
    public String toString() {
        return "I'm a cat, and my age is " + getAge();
    }
}
