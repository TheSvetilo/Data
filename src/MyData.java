public class MyData {

    private final int id;
    private final String description;

    public MyData(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}

class AccountData {

    private final String name;
    private final String surname;

    AccountData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}