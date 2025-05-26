public class Computer {

    // Atributos privados
    private String marca;
    private String modelo;
    private boolean encendida;


    public Computer (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }


    // Método para encender
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendiendo...");
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }


    // Método para apagar
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagando...");
        }
    }


    // Los Getters a usar
    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }


    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    // Método main para probar
    public static void main (String[] args) {
        Computer pc = new Computer("Lenovo", "IdeaPad 3");

        pc.encender();
        pc.encender();
        pc.apagar();  
    }
}
