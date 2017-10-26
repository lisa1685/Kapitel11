package Lisa1685;
public class Hund extends Dyr {
// metoder fra Super arves.
// deklarationer af Sub.
    public Hund(){
    super();
        System.out.println("En ny hund er oprettet!");
    }
    //henter fra superklassen, er super fordi den arverfra Dyr, så den bruger
    //Dyr's metoder - overskriver Dyr's metoder.
    @Override
    public void sove() {
        super.sove();
        System.out.println("Hunden sover");
    }

    @Override
    public void spise() {
        super.spise();
        System.out.println("Hunden spiser");
    }





}









