import java.util.ArrayList;

public class Market implements MarketBehaviour, QueueBehaviour{
    private ArrayList<CashRegister> cashRegistersList;


    public Market() {
        this.cashRegistersList = new ArrayList<>();
    }

    @Override
    public void addPerson(CashRegister cashRegister, Person person) {
        if(cashRegistersList.contains(cashRegister)) {
            for (CashRegister cash : cashRegistersList) {
                if (cash.equals(cashRegister)) {
                    cash.setAddArrayList(person);
                }
            }
        }
        if (!cashRegistersList.contains(cashRegister)) {
            System.out.println("Уважаемый клиент " + person.getName() + " пройдите на другую кассу!");
        }
    }

    @Override
    public void deletePerson(CashRegister cashRegister, Person person) {
        if(cashRegistersList.contains(cashRegister)) {
            for (CashRegister cash : cashRegistersList) {
                if (cash.equals(cashRegister)) {
                    cash.setDeleteArrayList(person);
                }
            }
        }
        if (!cashRegistersList.contains(cashRegister)) {
            System.out.println("Уважаемый клиент " + person.getName() + " пройдите на другую кассу!");
        }
    }

    public void deletePerson(CashRegister cashRegister) {
        if(cashRegistersList.contains(cashRegister)) {
            for (CashRegister cash : cashRegistersList) {
                if (cash.equals(cashRegister)) {
                    cash.setDeleteArrayList();
                }
            }
        }
    }


    @Override
    public void createQueue(CashRegister cashRegister) {
        if (!cashRegistersList.contains(cashRegister)) {
            cashRegistersList.add(cashRegister);
            System.out.println("Открыта касса " + cashRegister + "!");
        }
    }

    @Override
    public void closeQueue(CashRegister cashRegister) {
        if (cashRegistersList.contains(cashRegister)) {
            cashRegistersList.remove(cashRegister);
            System.out.println("Касса " + cashRegister + " закрыта!");
        }
    }





    public ArrayList<CashRegister> getCashRegistersList() {
        return cashRegistersList;
    }

    public void setCashRegistersList(ArrayList<CashRegister> cashRegistersList) {
        this.cashRegistersList = cashRegistersList;
    }

    @Override
    public String toString() {
        return "Market{" +
                "cashRegistersList=" + cashRegistersList +
                '}';
    }
}
