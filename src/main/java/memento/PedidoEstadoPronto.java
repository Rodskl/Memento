package memento;

public class PedidoEstadoPronto implements PedidoEstado {
    private static PedidoEstadoPronto instance = new PedidoEstadoPronto();

    private PedidoEstadoPronto() {}

    public static PedidoEstadoPronto getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pronto";
    }
}