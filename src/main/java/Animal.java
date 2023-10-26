public class Animal
{
    private byte age = 0;

    public Animal() { this.age = 0; }

    public Animal(byte age) { this.age = age; }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) { this.age = age; }
}