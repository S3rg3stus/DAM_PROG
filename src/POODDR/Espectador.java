package POODDR;

/**
 *
 * @author sergioyana
 */
public class Espectador {
    private String name;
    private int age;
    private double money;

    public Espectador(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Espectador() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    
}
