import Lisa1685.Dyr;
import Lisa1685.Hund;
import Lisa1685.Kat;

public class Test {
    public static void main(String[] args) {
        Dyr dyr = new Dyr();
        Hund hund = new Hund();
        Kat kat = new Kat();

        System.out.println();

        dyr.sove();
        dyr.spise();

        hund.sove();
        hund.spise();

        kat.sove();
        kat.spise();
        System.out.println();

        // Hund og Kat extender fra Dyr så hund.sove vil udskrive
        //"hunden sover, fordi der i dyr klassen er oprettet en metode
        //der udskriver tekst i forbindelse med brugen af spise sammen med et bestemt dyr.

    //opretter nye objekter.

    }
}
