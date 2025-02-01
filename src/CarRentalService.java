import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalService {
    private List<Car> cars;

    public CarRentalService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public  void  options(){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("======== Welcome to our Car Rental System=====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Available Car");
            System.out.println("4. Exit");

            System.out.println(" Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

        }
    }
}
