package boletin15;

public class SeleccionFutbol {

    private int id;
    private String nome;
    private String apelidos;
    private int idade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apelidos, int idade) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade + '}';
    }
    public void concentrarse(){
        System.out.println("La selección se concentra");
   }
    public void viaxar (){
        System.out.println("La selección viaxa");
        
    }

}
