public class Comentario {
    private String autor;
    private String texto;

    public Comentario(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public String generarComentario() {
        return autor + ": " + texto;
    }
}
