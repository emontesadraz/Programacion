package boletin15;

public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int idade) {
        super(id, nome, apelidos, idade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    public void dirixirPartidos(){
        System.out.println("Dirixe partido o entrenador");
    }
    public void dirixirEntrenamento(){
        System.out.println("Dirixe entrenamiento o entrenador");
    }

}
