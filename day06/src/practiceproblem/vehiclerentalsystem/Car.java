package practiceproblem.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private double rentalCost;
    public Car(String vehicleNumber, String type, double rentalRate){
        super(vehicleNumber, type, rentalRate);
    }
    @Override
    void calculateRentalCost(int days){
        rentalCost = getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return 0;
    }
    @Override
    public String getInsuranceDetails(){
        return "";
    }
    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("Total rental cost: " + rentalCost);
    }
}
