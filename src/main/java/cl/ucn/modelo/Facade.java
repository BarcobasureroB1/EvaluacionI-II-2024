package cl.ucn.modelo;

public class Facade {
    
    private Gestion gestion;

    public Facade(Gestion gestion){
        this.gestion = gestion;
    };

    public void crearEInscribir()
    {
        gestion.ingresarEvento();
        gestion.asociarEventoAsistente();
        gestion.resumen();
    }

    public void quitarDeEvento()
    {
        gestion.eliminarEventoDeAsistente();
        gestion.resumen();
    }

    public void crearEvento()
    {
        gestion.ingresarEvento();
        gestion.resumen();
    }

    public void inscribirAEvento()
    {
        gestion.asociarEventoAsistente();
        gestion.resumen();
    }

    public void actualizarUnEvento()
    {
        gestion.actualizarEvento();
        gestion.resumen();
    }
}
