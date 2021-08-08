public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 63.5;
        double growth = 1.65;
        double bmi = service.calculate (weight, growth);
        System.out.printf("Индекс Массы Тела: %.0f", bmi);
    }
}
