import ru.netology.services.calculationMonthsRest;

public class Main {
    public static void main(String[] args) {
        int income = 100_000; //  доход
        int expenses = 60_000; // постоянный расход
        int threshold = 150_000; // минимум для отдыха
        calculationMonthsRest service = new calculationMonthsRest();
        int monthsRest = service.calculate(income, expenses, threshold);
        System.out.println("Месяцев отдыха в году: " + monthsRest);
    }
}
