package OOP;

public class Person {
    private String name;
    private float age;
    Account account;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
