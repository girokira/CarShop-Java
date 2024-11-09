import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new CarEconom("Lada", "Vesta", 1239900, 2019, "https://auto.ru/cars/used/sale/vaz/vesta/1125081777-893043ce/"));
        cars.add(new CarEconom("Mitsubishi", "Outlander", 565000, 2006, "https://auto.ru/cars/used/sale/mitsubishi/outlander/1123458608-72883bd8/"));
        cars.add(new CarEconom("Audi", "A6", 349000, 1998, "https://auto.ru/cars/used/sale/audi/a6/1125559692-f56c464b/"));

        cars.add(new CarComfort("Audi", "Q5", 1889000, 2014, "https://auto.ru/cars/used/sale/audi/q5/1125347296-c99a6080/"));
        cars.add(new CarComfort("Land Rover", "Discovery Sport", 2185000, 2018, "https://auto.ru/cars/used/sale/land_rover/discovery_sport/1125496706-7a624a12/"));
        cars.add(new CarComfort("Volkswagen", "Passat B8", 2877000, 2020, "https://auto.ru/cars/used/sale/volkswagen/passat/1125534615-9d1ce825/"));

        cars.add(new CarBusiness("Mercedes-Benz", "Maybach GLS 600", 37000000, 2024, "https://auto.ru/cars/used/sale/mercedes/maybach_gls/1125876915-b1235e59/"));
        cars.add(new CarBusiness("BMW", "M8 Competition", 15900000, 2020, "https://auto.ru/cars/used/sale/bmw/m8/1125601845-3002ebcf/"));
        cars.add(new CarBusiness("Hongqi", "H9", 5495000, 2023, "https://auto.ru/cars/used/sale/hongqi/h9/1125863802-b5c41404/"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в автосалон 'Баребухи'!");

        while(true) {
            System.out.println("Меню:");
            System.out.println("1. Вывести автомобили");
            System.out.println("2. Выход");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Выберите класс автомобиля:");
                System.out.println("1. Эконом");
                System.out.println("2. Комфорт");
                System.out.println("3. Бизнес");

                int classchoice = scanner.nextInt();

                List<Car> EconomCars = new ArrayList<>();
                List<Car> ComfortCars = new ArrayList<>();
                List<Car> BusinessCars = new ArrayList<>();
                List<Car> selectedClassCars = null;

                switch (classchoice) {
                    case 1:
                        System.out.println("Автомобили эконом класса:");
                        int cnt = 1;
                        for (Car car : cars) {
                            if (car instanceof CarEconom) {
                                System.out.println(cnt + ".");
                                car.car_info();
                                EconomCars.add(car);
                                cnt++;
                            }
                        }
                        selectedClassCars = EconomCars;
                        break;
                    case 2:
                        System.out.println("Автомобили комфорт класса");
                        int cnt2 = 1;
                        for (Car car : cars) {
                            if (car instanceof CarComfort) {
                                System.out.println(cnt2 + ".");
                                car.car_info();
                                ComfortCars.add(car);
                                cnt2++;
                            }
                        }
                        selectedClassCars = ComfortCars;
                        break;
                    case 3:
                        System.out.println("Автомобили бизнес класса");
                        int cnt3 = 1;
                        for (Car car : cars) {
                            if (car instanceof CarBusiness) {
                                System.out.println(cnt3 + ".");
                                car.car_info();
                                BusinessCars.add(car);
                                cnt3++;
                            }
                        }
                        selectedClassCars = BusinessCars;
                        break;
                    default:
                        System.out.println("Неверный выбор");
                        continue;
                }

                System.out.println("Выберите автомобиль для просмотра комплектации (введите номер)");

                int carChoice = scanner.nextInt() - 1;

                if (carChoice >= 0 && carChoice < selectedClassCars.size()) {
                    Car selectedCar = selectedClassCars.get(carChoice);
                    selectedCar.car_info();
                    selectedCar.features_info();
                    System.out.println();
                } else {
                    System.out.println("Неверный выбор");
                    continue;
                }

            } else {
                System.out.println("До свидания");
                break;
            }
        }
    }
}