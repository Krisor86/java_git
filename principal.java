public class principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //declaracion de un nuevo objeto = instanciar objeto
        Movil movil1 = new Movil();
        movil1.marca = "Iphone";
        movil1.modelo = "12ProMax";
        movil1.color = "Negro";
        movil1.pantalla = 6.1f;
        movil1.memoria_ram = 4;
        movil1.capacidad = 256;
        movil1.sistemaOperacional = "iOS";


        Movil movil2 = new Movil();
        movil2.marca = "Samsung";
        movil2.modelo = "Galaxy";
        movil2.color = "negro";
        movil2.pantalla = 5.5f;
        movil2.memoria_ram = 8;
        movil2.capacidad = 128;
        movil2.sistemaOperacional = "Android";

        Movil movil3; //Estoy declarando un objeto llamado movil
        movil3 = new Movil();
        movil3.marca = "Xiaomi";
        movil3.modelo = "Redmi";
        movil3.color = "Plata";
        movil3.pantalla = 5.5f;
        movil3.memoria_ram = 8;
        movil3.capacidad = 256;
        movil3.sistemaOperacional = "Android";



        System.out.format("Movil Marca %S, modelo %S, color %S, pantalla %.1f, %dGb memória ram, %dGb capacidad de armacenamiento y el sistema operativo %s\n", movil1.marca, movil1.modelo, movil1.color, movil1.pantalla, movil1.memoria_ram, movil1.capacidad, movil1.sistemaOperacional );

        System.out.format("Movil Marca %S, modelo %S, color %S, pantalla %.1f, %dGb memória ram, %dGb capacidad de armacenamiento y el sistema operativo %s\n", movil2.marca, movil2.modelo, movil2.color, movil2.pantalla, movil2.memoria_ram, movil2.capacidad, movil2.sistemaOperacional );

        System.out.format("Movil Marca %S, modelo %S, color %S, pantalla %.1f, %dGb memória ram, %dGb capacidad de armacenamiento y el sistema operativo %s\n", movil3.marca, movil3.modelo, movil3.color, movil3.pantalla, movil3.memoria_ram, movil3.capacidad, movil3.sistemaOperacional );

    }

}

