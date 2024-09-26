package GeradorDeEtiqueta;

public class Produto {
    private String descricao;
    private double preco_da_lata;
    private double preco_do_caixa;
    private String codigo_de_barras;

    public Produto(String descricao, double preco_da_lata, double preco_do_caixa, String codigo_de_barras) {
        this.descricao = descricao;
        this.preco_da_lata = preco_da_lata;
        this.preco_do_caixa = preco_do_caixa;
        this.codigo_de_barras = codigo_de_barras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoLata() {
        return preco_da_lata;
    }

    public void setPrecoLata(double preco_da_lata) {
        this.preco_da_lata = preco_da_lata;
    }

    public double getPrecoCaixa() {
        return preco_do_caixa;
    }

    public void setPrecoCaixa(double preco_do_caixa) {
        this.preco_do_caixa = preco_do_caixa;
    }

    public String getCodigoBarras() {
        return codigo_de_barras;
    }

    public void setCodigoBarras(String codigo_de_barras) {
        this.codigo_de_barras = codigo_de_barras;
    }
}
