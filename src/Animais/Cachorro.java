package Animais;

public class Cachorro extends Animal {

  //atributos
  static int numeroDeCachorros;
  private int tamanhoDoRabo;


  //construtores
  public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
    super(nome, cor, peso);
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDeEspirito = estadoDeEspirito;
    numeroDeCachorros++;
  }

  //metodos
  public static int getNumeroDeCachorros() {
    return numeroDeCachorros;
  }

  public static void setNumeroDeCachorros(int numeroDeCachorros) {
    Cachorro.numeroDeCachorros = numeroDeCachorros;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getTamanhoDoRabo() {
    return tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public String pegar(){
    return "Bolinha";
  }
  public String interagir(String acao){
    switch (acao){
      case "carinho": this.estadoDeEspirito = "feliz"; break;
      case "vai dormir": this.estadoDeEspirito = "bravo"; break;
      case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
      default:this.estadoDeEspirito = "neutro";
    }
    return this.estadoDeEspirito;
  }

  @Override
  public String toString() {
    return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
  }

  @Override
  public void soar() {
    System.out.println("AU AU AU AU AU AU AU AU AU AU");
  }
}
