package Composition;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int cardSlots;
    private int ramSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int cardSlots, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String ProgramName){
        System.out.println("Program "+ ProgramName + " is now loading...");

    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
