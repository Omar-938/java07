public class Hangar {
    
 public static void main(String[] args) {
    
    Car clio = new Car("Clio");
    clio.setKilometers(192012);

    Boat titanic = new Boat("Titanic");
    titanic.setKilometers(18);


    System.out.println(clio.doStuff());
    System.out.println(titanic.doStuff());
    

}

}
