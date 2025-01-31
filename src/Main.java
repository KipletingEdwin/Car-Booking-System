//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car toyotaCar = new Car();
        toyotaCar.setCarId("Car-1");
        toyotaCar.setBrand("Toyota");
        toyotaCar.setModel("Camry");
        toyotaCar.setPricePerDay(3000);


        System.out.println(toyotaCar.getModel());

    }
}