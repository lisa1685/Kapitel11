package Lisa1685;

public class Kat extends Dyr {
    public Kat(){
        super();
        System.out.println("En ny kat er oprettet!");
    }

    @Override
    public void sove() {
        super.sove();
        System.out.println("katten sover");
    }

    @Override
    public void spise() {
        super.spise();
        System.out.println("katten spiser");
    }
}
