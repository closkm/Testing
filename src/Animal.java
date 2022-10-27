public class Animal {
    //fields / attributes/ properties
    private int numberOfLegs;
    private int bodyWeight;

    // methods

    // access modifier -> return type -> method name -> paramters (if any)
    // getters && setters
    //OVERLOADING  -- OVERRIDING
    public Animal(){
        numberOfLegs = 500;
        bodyWeight = 500;
    }
    public Animal(int legs, int weight){
        numberOfLegs = legs;
        bodyWeight = weight;
    }
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public void setNumberOfLegs(int number){
        if(number >= 4){
            numberOfLegs = 4;
        } else {
            numberOfLegs = number;
        }
    }

    public void eat(){


    }
}
