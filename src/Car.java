import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String brand;
    private final String model;
    private final double price;
    private final int year;
    private final String adLink;

    boolean AudioSystem;
    boolean CruiseControl;
    boolean ParkAssistant;
    boolean WirelessCharging;
    boolean SeatMassage;
    boolean MiniBar;
    boolean Conditioner;

    // Конструктор с параметром adLink
    public Car(String brand, String model, double price, int year, String adLink, boolean AudioSystem, boolean CruiseControl, boolean ParkAssistant, boolean WirelessCharging, boolean SeatMassage, boolean MiniBar, boolean Conditioner) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.adLink = adLink; // Инициализируем ссылку на объявление

        this.AudioSystem = AudioSystem;
        this.CruiseControl = CruiseControl;
        this.ParkAssistant = ParkAssistant;
        this.WirelessCharging = WirelessCharging;
        this.SeatMassage = SeatMassage;
        this.MiniBar = MiniBar;
        this.Conditioner = Conditioner;
    }

    public void car_info() {
        System.out.println("Марка: " + brand + ", модель: " + model + ", год: " + year + ", стоимость: " + price + " ₽");
        System.out.println("Ссылка на объявление: " + adLink); // Вывод ссылки на объявление
        System.out.println();
    }

    public void features_info() {
        List<String> availableFeatures = new ArrayList<>();

        if (AudioSystem) availableFeatures.add("Аудиосистема");
        if (CruiseControl) availableFeatures.add("Круиз контроль");
        if (ParkAssistant) availableFeatures.add("Парковочный ассистент");
        if (WirelessCharging) availableFeatures.add("Беспроводная зарядка");
        if (SeatMassage) availableFeatures.add("Сиденье с массажем");
        if (MiniBar) availableFeatures.add("Мини бар");
        if (Conditioner) availableFeatures.add("Кондиционер");

        System.out.println("Доступные функции:");
        for (String feature : availableFeatures) {
            System.out.println("- " + feature);
        }
    }
}
