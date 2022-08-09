public class People {
    String name;
    String surname;
    String patronim;
    int birthday;

    public People(String name, String surname, String patronim, int birthday) {
        this.name = name;
        this.surname = surname;
        this.patronim = patronim;
        this.birthday = birthday;
    }
    
    @Override
    public String toString() {
        return "\t" + name + " " + surname + " " + patronim + " " + birthday;
    }
}