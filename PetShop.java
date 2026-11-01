
package petshop;


public class PetShop {

   
    public static void main(String[] args) {
   

        Pet<Number> p1 = new Pet<>("Luna", "Persian Cat", 500, 2, "Black");
        Pet<Number> p2 = new Pet<>("lolo", "Siamese Cat", 350, 1, "White");
        Pet<Number> p3 = new Pet<>("Bella", "British Cat", 450, 3, "Gray");

        Owner o1 = new Owner("Lojein", "Tripoli");
        Owner o2 = new Owner("Taha", "Misrata");

        System.out.println("===== Pet Information =====");
        p1.display();
        p2.display();
        p3.display();

        System.out.println("\n===== Owner Information =====");
        o1.display();
        o2.display();

        System.out.println("\n===== Pet Prices =====");
        Show.showPrice(p1);
        Show.showPrice(p2);
        Show.showPrice(p3);
    }
}

class Pet<T> {

    String name;
    String type;
    T price;
    int age;
    String color;

    public Pet(String name, String type, T price, int age, String color) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Name: " + name +
                ", Type: " + type +
                ", Price: " + price +
                ", Age: " + age +
                ", Color: " + color);
    }
}

class Owner {

    String name;
    String address;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void display() {
        System.out.println("Owner: " + name +
                ", Address: " + address);
    }
}

class Show {

    static void showPrice(Pet<? super Number> pet) {
        System.out.println("Pet Name: " + pet.getName());
        System.out.println("Pet Price: " + pet.getPrice());
    }
}
    
    

