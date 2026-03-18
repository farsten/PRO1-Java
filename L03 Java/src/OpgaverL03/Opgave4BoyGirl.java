package OpgaverL03;

//Indlæs barnets køn (”girl” eller ”boy”) og alder (positivt heltal), og udskriv barnets
//team (String) ifølge tabellen herunder. Det er et krav, at programmet anvender en
//variabel isGirl (boolean) og en variabel isUnder8 (boolean) i if-else sætningerne.
public class Opgave4BoyGirl {
    void main() {
        String genderPrompt = IO.readln("Er du en \"dreng\" eller en \"pige\"? ");
        boolean IsGirl = genderPrompt.equalsIgnoreCase("pige");

        String agePrompt = IO.readln("Alder: ");
        int age = Integer.parseInt(agePrompt);

        String team;

        if (IsGirl) {
            if (age >= 8) team = "Spring Girls";
            else team = "Tumbling Girls";
        } else if (age >= 8) team = "Cool Boys";
        else team = "Young Boys";

        IO.println("Dit hold er: " + team);
        IO.println("Held og lykke!");


    }

}
