public class Car {
    //attributes / field / properties
    private int numberOfTires;
    private String brand;

    public Car(int tires, String name) {
        numberOfTires = tires;
        brand = name;
    }

    // methods -> functions
    // access modifier -> return data type -> name of the method -> parenthesis with params
    public int getNumberOfTires(){
        return numberOfTires;
    }
    public String getBrand(){
        return brand;
    }



    public void setBrand(String newBrand){
        if (newBrand == "BMW"){
            brand = "Toyota";
        } else {
            brand = newBrand;
        }
    }
}

