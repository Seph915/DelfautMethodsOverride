import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        return (SmartphonePrice) super.clone();
    }

    @Override
    public String toString() {
        return String.format("priceType= %s, priceInEuros= %.2f", priceType, priceInEuros);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartphonePrice that)) return false;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
