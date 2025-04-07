package impleLocal;

public interface ColaPrioridadTDA {
    void inicializarCola();
    void acolarPrioridad(int x, int priodidad);
    void desacolar();
    int primero();
    int prioridad();
    boolean colaVacia();
}
