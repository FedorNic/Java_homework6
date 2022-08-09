public class Links {
    People Person_1;
    People Person_2;
    People Person_3;
    String Link;

    public Links(People Person_1, People Person_2, String Link) {
        this.Person_1 = Person_1;
        this.Person_2 = Person_2;
        this.Link = Link;
    }

    @Override
    public String toString() {
        return "\n" + Person_1.name + " " + Person_1.surname + " " + Person_1.patronim + " " + Person_1.birthday + " "
                + "\n"
                + Person_2.name + " " + Person_2.surname + " " + Person_2.patronim + " " + Person_2.birthday + " " +
                "\n" + Link + "\n" + "_____________________________________________________________";
    }

    public boolean containsAll(String string) {
        return true;
    }

    public boolean contains(String string) {
        return true;
    }
    

}
