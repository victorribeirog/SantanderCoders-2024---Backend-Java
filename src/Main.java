import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Loja.PetShop;

public class Main {
    static public void main(String[] args){

        Gato gato1 = new Gato("Felix","Branco",3.5);
        Cachorro cachorro1 = new Cachorro("Rex","Preto",25,4.5,2,"nada");
        Animal gato2 = new Gato("Felix","Branco",3.5);
        Animal passaro1 = new Passaro("Felix","Branco",3.5);


//        Cachorro cachorro1 = new Cachorro("Kesha","Preto",25,4.5,2,"nada")
//        Passaro pasaro1 = new Passaro("zé","Amarelo",0.5);
//
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

//        PetShop petShop = new PetShop();
//        petShop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petShop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petShop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}