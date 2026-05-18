package memento;

public class PedidoEstadoNovo implements PedidoEstado {
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();

    private PedidoEstadoNovo() {}

    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Novo";
    }
}