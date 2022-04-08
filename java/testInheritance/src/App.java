abstract class Animal {
    public abstract void speak();
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("meow meow");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("gau gau");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal[] = new Animal[] { new Cat(), new Dog() };
        animal[0].speak();
        animal[1].speak();
    }
}
