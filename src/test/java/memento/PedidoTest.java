package memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        
        pedido.restauraEstado(0);
        
        assertEquals(PedidoEstadoNovo.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        
        pedido.restauraEstado(2);
        
        assertEquals(PedidoEstadoNovo.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}