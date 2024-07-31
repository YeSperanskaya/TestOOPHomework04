import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Person> arrayList;
    private String name;

    public CashRegister(ArrayList queue, String name) {
        this.arrayList = queue;
        this.name = name;
    }


    public ArrayList getArrayList() {
        return arrayList;
    }

    public void setAddArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
    public void setAddArrayList(Person person) {
        this.arrayList.add(person);
    }
    public void setDeleteArrayList(Person person) {
        if (this.arrayList.contains(person)) {
            arrayList.remove(person);
        }
    }
    public void setDeleteArrayList() {
        if (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        if (arrayList.isEmpty()) {
            System.out.println("Свободная касса!");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " список людей: " + arrayList;
    }
}
