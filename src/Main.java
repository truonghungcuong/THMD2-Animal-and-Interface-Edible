public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
        for (Animal animal1 : animal) {
            System.out.println(animal1.makeSound());

            if (animal1 instanceof Chicken) {
                Edible edibler = (Chicken) animal1;
                System.out.println(edibler.howToEat());
            }
        }
    }
}