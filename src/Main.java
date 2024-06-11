import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    static public void main(String[] args){

        Cachorro cachorro1 = new Cachorro("Kesha","Preto",25,4.5,2,"nada");
        Gato gato1 = new Gato("Felix","Branco",3.5);
        Passaro pasaro1 = new Passaro("zé","Amarelo",0.5);

        cachorro1.soar();
        gato1.soar();
        pasaro1.soar();

    }
}