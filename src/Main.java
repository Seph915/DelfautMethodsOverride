public class Main {
    public static void main(String[] args) {

        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 1000.00);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 1200.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 600.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 700.00);

        Smartphone smartphone1 = new Smartphone("Samsung","S6",5000, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Huawei","P10",5000, producerPrice2, retailPrice2);

        System.out.printf("Smartphone1 details: %s%n", smartphone1);
        System.out.printf("Smartphone2 details: %s%n",smartphone2);

        System.out.printf("Smartphone1 is equal to Smartphone2? %b%n%n", smartphone1.equals(smartphone2));

        try {
            Smartphone clonedSmartphone = smartphone2.clone();
            System.out.printf("Cloned Smartphone details: %s%n", clonedSmartphone);
            System.out.printf("Smartphone2 is equal to clonedSmartphone? %b%n", smartphone2.equals(clonedSmartphone));
        }
        catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }
    }
}