/*
 Määritä luokka Noppa, jolla on instanssimuuttuja, joka pitää kirjaa siitä, montako 
 kertaa kyseistä noppaa on heitetty. Luokan julkinen metodi heita() kasvattaa 
 instanssimuuttujan arvoa yhdella sekä kutsuu saman luokan metodia annaSilmät(), 
 joka arpoo ja palauttaa nopanheiton tuloksen (silmien lukumäärä yhdestä kuuteen). 
 Metodi heitä() palauttaa metodilta annaSilmät() saamansa nopanheiton tuloksen 
 sellaisenaan. Kirjoita myös testiluokka, jossa luot nopan ja heittelet sitä.
 * Lisää luokkaan Noppa luokkamuuttuja (staattinen muuttuja), joka pitää kirjaa siitä, 
 montako kappaletta silmälukuja yksi on kaiken kaikkiaan heitetty - nopasta tai sen 
 rehellisyydestä riippumatta. Lisaa heita()-metodiin lauseet, jotka päivittävät 
 muuttujaa tarvittaessa
 */
package fi.jamk.oo1k2014;

/**
 *
 * @author G7934
 */
public class Noppa {

    protected static int heittokerrat;
    protected int silmät;
    protected static int ykköset;

    public int heitä() {
        this.heittokerrat += 1;
        silmät = annaSilmät();
        if (silmät == 1) {
            ykköset += 1;
        }
        return silmät;
    }

    public int annaSilmät() {
        int i = (int) Math.ceil(Math.random() * 6);
        return i;
    }

    public static int getYkköset() {
        return ykköset;
    }

    public static int getHeittokerrat() {
        return heittokerrat;
    }
}

