public class Car {
    private String carId;
    private  String brand;
    private  String model;
    private  double pricePerDay;
    private  int noOfAvailableCars;


    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getNoOfAvailableCars() {
        return noOfAvailableCars;
    }


    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setNoOfAvailableCars(int noOfAvailableCars) {
        this.noOfAvailableCars = noOfAvailableCars;
    }

    public  double calculatePrice(int days){
        return  pricePerDay * days;

    }

    public Car(){












    }



}
