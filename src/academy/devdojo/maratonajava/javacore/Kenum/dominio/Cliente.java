package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente TipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        TipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", TipoCliente=" + TipoCliente.getNomeRelatorio() +
                " TipoClienteInt=" + TipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
