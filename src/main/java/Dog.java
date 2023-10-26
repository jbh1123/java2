public class Dog extends Animal
{
    public Dog(byte age) {
        super(age);
    }

    @Override
    public String toString() {
        return "I'm a dog, and my age is " + getAge();
    }
}
