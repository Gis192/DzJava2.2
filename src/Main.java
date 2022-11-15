public class Main {
    public static void main(String[] args) {
        // Ввод начальных данных, начальная сумма и сумма пополнения
        int quantityMoney = 100;
        int reFillMoney = 1100;
        // Условия для получения бонусов
        boolean bonus = reFillMoney >= 100;
        // Расчёт бонусов
        int percent;
        if (bonus) {
            percent = reFillMoney / 100;
        } else {
            percent = 0;
        }
        //Расчёт финальной суммы
        int finishMoney = quantityMoney + reFillMoney + percent;

        System.out.println(" На Вашем счёте " + finishMoney + " Рублей");
    }
}