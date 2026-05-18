package memento;

public class PedidoEstadoPreparando implements PedidoEstado {
    private static PedidoEstadoPreparando instance = new PedidoEstadoPreparando();

    private PedidoEstadoPreparando() {}

    public static PedidoEstadoPreparando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Preparando";
    }
}