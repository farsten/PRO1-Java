package OpgaverL03;

//Lav et program, der indlæser 3 heltal fra tastaturet og udskriver aftagende, hvis de
//tre tal er i aftagende orden, voksende, hvis de tre tal er i voksende orden, eller
//hverken-eller, hvis de ikke er voksende eller aftagende.
//        F.eks. 2 3 4 er voksende
//4 3 2 er aftagende
//3 4 2 er hverken-eller
public class Opgave2VoksFald {
    void main() {
        String nummerEtPrompt = IO.readln("Skriv et nummer: ");
        int nummerEt = Integer.parseInt(nummerEtPrompt);
        String nummerToPrompt = IO.readln("Skriv et til nummer: ");
        int nummerTo = Integer.parseInt(nummerToPrompt);
        String nummerTrePrompt = IO.readln("Skriv et sidste nummer: ");
        int nummerTre = Integer.parseInt(nummerTrePrompt);

        if (nummerEt < nummerTo && nummerTo < nummerTre)
            IO.println("Tallene er givet i voksende orden: " + nummerEt + ", " + nummerTo + " og " + nummerTre);
        else if (nummerTre < nummerTo && nummerTo < nummerEt)
            IO.println("Tallene er givet i aftagende orden: " + nummerEt + ", " + nummerTo + " og " + nummerTre);
        else
            IO.println("Tallene er hverken i aftagende eller voksende orden: " + nummerEt + ", " + nummerTo + " og " + nummerTre);

    }
}
