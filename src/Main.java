public class Main {
    public static void main(String[] args) {
        WorkOfMarket workOfMarket = new WorkOfMarket();
        System.out.println("Магазин открыт!");
        workOfMarket.start();
        System.out.println("Клиенты встали в очередь!");
        workOfMarket.startOfPeople();
        System.out.println("Клиентов начали обслуживать!");
        workOfMarket.update();
        workOfMarket.update();
        workOfMarket.update();
        workOfMarket.update();
        workOfMarket.update(2, new Person("Газировкин", 34));

    }
}