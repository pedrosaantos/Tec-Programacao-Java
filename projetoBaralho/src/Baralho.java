import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> baralho = new ArrayList<>();

    //método construtor
    public Baralho(){

        for(Naipe naipe : Naipe.values()){

            for(Valor valor : Valor.values()){

                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);

                baralho.add(carta);

            }

        }

    }

    @Override
    public String toString() {

        String cartas = "";
        for(Carta carta : baralho){

            cartas += carta.toString() + "\n";

        }
        return cartas;
    }

    public void embaralhar(){

        Collections.shuffle(baralho);

    }

}
