package Classes_and_Constructor;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String colour;
    private String engine;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        String validmodel=model.toLowerCase();
        if(validmodel.equals("Carrera")|| validmodel.equals("Commodore")) {
            this.model = model;
        }
        else{
            this.model="Unknown";
        }
    }
}

