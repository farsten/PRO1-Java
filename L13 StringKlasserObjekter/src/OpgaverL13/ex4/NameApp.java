package OpgaverL13.ex4;

public class NameApp {
    void main() {

        Name p1 = new Name("Piotr", "Suski");
        Name p2 = new Name("Margrethe", "Mosbæk", "Dybdal");

        IO.println(p1.getFullName());
        IO.println(p2.getFullName());
        IO.println(p1.userName());
        IO.println(p2.userName());
        IO.println(p1.getInitials());
        IO.println(p2.getInitials());
        IO.println(p1.getCryptoInitials(3));
        IO.println(p2.getCryptoInitials(3));

    }
}
