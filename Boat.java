public class Boat extends Vehicle {


    public Boat(String brand){
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis le " + getBrand() + " j'ai fait glou glou";
    }
    
}
