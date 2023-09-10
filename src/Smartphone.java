import java.util.Objects;

public class Smartphone implements Cloneable {

    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice producerP, SmartphonePrice retailP){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = producerP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString(){
        return String.format("\nbrandName= %s\nmodelName= %s\nbatterymAh= %d mAh\nproducerPrice: %s\nretailPrice: %s%n",
                this.brandName, this.modelName, this.batterymAh, this.producerPrice, this.retailPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName)
                && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice)
                && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producerPrice = this.producerPrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();

        return clonedSmartphone;
    }
}
