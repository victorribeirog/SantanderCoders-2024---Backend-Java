import Animais.Cachorro;

public class Main {
    static public void main(String[] args){

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Kesha";
        cachorro1.cor = "Preto";
        cachorro1.altura = 25;
        cachorro1.peso = 4.5;
        cachorro1.tamanhoDoRabo = 2;

        System.out.println(cachorro1);
    }
}