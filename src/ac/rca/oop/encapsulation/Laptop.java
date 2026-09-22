package ac.rca.oop.encapsulation;

public class Laptop {
    private String serialNumber;
    private String manufacturer;
    private String model;
    private int manufacturedyear;

    public Laptop() {
    }

    public Laptop(String serialNumber, int manufacturedyear, String manufacturer, String model) {
        this.serialNumber = serialNumber;
        this.manufacturedyear = manufacturedyear;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturedyear() {
        return manufacturedyear;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturedyear(int manufacturedyear) {
        this.manufacturedyear = manufacturedyear;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "serialNumber='" + serialNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", manufacturedyear=" + manufacturedyear +
                '}';
    }
}
