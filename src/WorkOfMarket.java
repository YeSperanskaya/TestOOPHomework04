import java.util.ArrayList;

public class WorkOfMarket {
    private Market market;

    public WorkOfMarket() {
        this.market = new Market();
    }

    public void start() {
        market.createQueue(new CashRegister(new ArrayList<>(), "Касса 1"));
        market.createQueue(new CashRegister(new ArrayList<>(), "Касса 2"));
        market.createQueue(new CashRegister(new ArrayList<>(), "Касса 3"));
        System.out.println(market);

    }
    public void startOfPeople () {
        market.addPerson(market.getCashRegistersList().get(0), new Person("Иванов", 45));
        market.addPerson(market.getCashRegistersList().get(1), new Person("Петров", 4));
        market.addPerson(market.getCashRegistersList().get(2), new Person("Смирнов", 8));
        market.addPerson(market.getCashRegistersList().get(0), new Person("Курочкин", 12));
        market.addPerson(market.getCashRegistersList().get(2), new Person("Ильиных", 5));
        market.addPerson(market.getCashRegistersList().get(1), new Person("Сумченко", 18));
        market.addPerson(market.getCashRegistersList().get(2), new Person("Пельменько", 3));
        market.addPerson(market.getCashRegistersList().get(0), new Person("Иваненко", 4));
        System.out.println(market);
    }
    public void update() {
        market.deletePerson(market.getCashRegistersList().get(0));
        market.deletePerson(market.getCashRegistersList().get(1));
        market.deletePerson(market.getCashRegistersList().get(2));
        System.out.println(market);
    }
    public void update(int number, Person person) {
        market.addPerson(market.getCashRegistersList().get(number), person);
        System.out.println(market);
    }


}
