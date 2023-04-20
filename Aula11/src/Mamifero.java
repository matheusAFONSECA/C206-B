// -> classe abstrata de mamífero
public abstract class Mamifero {
    // atributos
    protected String nome;      // nome do mamifero
    protected double vida;      // vida do mamífero

    // construtor
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // metodo abstrato -> vau estar presente em toda classe herdeira
    public abstract void emitirSom();       // diz que o mamifero esta emitindo um som

    // metodos
    public void mostraInfo(){               // mostra as informações do mamífero
        System.out.println("\tNOME: " + getNome());
        System.out.println("\tVIDA: " + getVida());
    }

    // getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
