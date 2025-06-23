public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");
        
        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));

        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));

        Comentario com1 = new Comentario("Anahi Quezada", "La gestión de configuración con Git Flow ayuda a organizar bien las versiones y permite un desarrollo paralelo más ordenado.");
        Comentario com2 = new Comentario("Juan Jose Araujo", "Es importante tener una gestion de configuracion dentro de los proyectos de software debido a que gracias a ello se puede garantizar el control y calidad del producto a lo largo del ciclo de vida, en donde se podran controlar cambios, mantener integridad del producto, facilitar el trabajo en equipo, entre otras.");
        Comentario com3 = new Comentario("José Naranjo", "La gestión de la configuración es crucial para controlar versiones, coordinar equipos y mantener la trazabilidad de cambios en el código. Sin ella, los proyectos sufren conflictos, pérdida de código y problemas de integración. Facilita la automatización y mejora la calidad del software, convirtiendo el desarrollo en un proceso ordenado y confiable.");
        Comentario com4 = new Comentario("Jefferson Ruiz", "Controlar las ramas permite tener un mejor seguimiento del trabajo y ayuda a separar las versiones estables.");

        System.out.println(com1.generarComentario());
        System.out.println(com2.generarComentario());
        System.out.println(com3.generarComentario());
        System.out.println(com4.generarComentario());
    }
}

