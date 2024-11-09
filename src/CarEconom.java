public class CarEconom extends Car {

    public CarEconom(String brand, String model, double price, int year, String adLink) {
        super(brand, model, price, year, adLink, false, false, false, false, false, false, true); // Conditioner установлен в true
    }


    @Override
    public void car_info(){
        super.car_info();
    }


}
