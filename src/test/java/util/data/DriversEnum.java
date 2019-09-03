package util.data;

public enum DriversEnum {

    CHROME("webdriver.chrome.driver","C:\\Users\\matias.gonzalez\\Documents\\AprendiendoSelenium\\src\\sources\\drivers\\chromedriver.exe");

    private String nombre;
    private String ruta;

    DriversEnum(String nombre, String ruta){
        setNombre(nombre);
        setRuta(ruta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
