package ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {

        ArrayList<String> castBrooklyn99 = new ArrayList<>(List.of("Andy Samberg", "Andre Braugher", "Melissa Fumero", "Stephanie Beatriz", "Chelsea Peretti", "Terry Crews", "Joe Lo Truglio"));

        Series Brooklyn99 = new Series("Brooklyn Nine-Nine", castBrooklyn99);

        ArrayList<String> guestActorsBrooklyn99 = new ArrayList<>(List.of("Neil DeGrasse Tyson, Joe Biden, Merlin"));
        guestActorsBrooklyn99.add("Kid Cudi");
        guestActorsBrooklyn99.add("Bruce Willis");


        Episode pilot = new Episode(1, guestActorsBrooklyn99, 23);
        Episode theTagger = new Episode(2, guestActorsBrooklyn99, 21);
        Episode theSlump = new Episode(3, guestActorsBrooklyn99, 21);
        Episode meTime= new Episode(4, guestActorsBrooklyn99, 21);
        Episode theVulture = new Episode(5, guestActorsBrooklyn99, 21);
        Episode halloween = new Episode(6, guestActorsBrooklyn99, 21);
        Episode fortyEightHours = new Episode(7, guestActorsBrooklyn99, 21);
        Episode oldSchool = new Episode(8, guestActorsBrooklyn99, 21);
        Episode salsPizza = new Episode(9, guestActorsBrooklyn99, 21);
        Episode thanksgiving = new Episode(10, guestActorsBrooklyn99, 21);
        Episode christmas = new Episode(11, guestActorsBrooklyn99, 21);
        Episode pontiacBandit = new Episode(12, guestActorsBrooklyn99, 21);
        Episode theBet = new Episode(13, guestActorsBrooklyn99, 21);
        Episode theEbonyFalcon = new Episode(14, guestActorsBrooklyn99, 21);
        Episode operationBrokenFeather = new Episode(15, guestActorsBrooklyn99, 21);
        Episode theParty = new Episode(16, guestActorsBrooklyn99, 21);
        Episode fullBoyle = new Episode(17, guestActorsBrooklyn99, 21);
        Episode theApartment = new Episode(18, guestActorsBrooklyn99, 21);
        Episode tacticalVillage = new Episode(19, guestActorsBrooklyn99, 21);
        Episode fancyBrudgom = new Episode(20, guestActorsBrooklyn99, 21);
        Episode unsolvable = new Episode(21, guestActorsBrooklyn99, 21);
        Episode chargesAndSpecs = new Episode(22, guestActorsBrooklyn99, 21);

        Brooklyn99.addEpisode(pilot);
        Brooklyn99.addEpisode(theTagger);
        Brooklyn99.addEpisode(theSlump);
        Brooklyn99.addEpisode(meTime);
        Brooklyn99.addEpisode(theVulture);
        Brooklyn99.addEpisode(halloween);
        Brooklyn99.addEpisode(fortyEightHours);
        Brooklyn99.addEpisode(oldSchool);
        Brooklyn99.addEpisode(salsPizza);
        Brooklyn99.addEpisode(thanksgiving);
        Brooklyn99.addEpisode(christmas);
        Brooklyn99.addEpisode(pontiacBandit);
        Brooklyn99.addEpisode(theBet);
        Brooklyn99.addEpisode(theEbonyFalcon);
        Brooklyn99.addEpisode(operationBrokenFeather);
        Brooklyn99.addEpisode(theParty);
        Brooklyn99.addEpisode(fullBoyle);
        Brooklyn99.addEpisode(theApartment);
        Brooklyn99.addEpisode(tacticalVillage);
        Brooklyn99.addEpisode(fancyBrudgom);
        Brooklyn99.addEpisode(unsolvable);
        Brooklyn99.addEpisode(chargesAndSpecs);
      IO.println("Samlet længde på sæson 1 af " + Brooklyn99.getTitle() + ": " + Brooklyn99.totalLength() + " minutter");
      IO.println("Gæstskuespillere: " + Brooklyn99.getGuestActors());
    }



}
