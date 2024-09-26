package GeradorDeEtiqueta;

import java.text.NumberFormat;
import java.util.Locale;

public class GeradorEtiqueta {

    public static String gerarEtiqueta(Produto produto) {
        String descricao = produto.getDescricao();
        if (descricao.length() > 22) {
            descricao = descricao.substring(0, 22);
        }

        NumberFormat formatacaoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valor_da_lata = formatacaoMoeda.format(produto.getPrecoLata());
        String valor_do_caixa = formatacaoMoeda.format(produto.getPrecoCaixa());

        return String.format(
                "^XA\n" +
                "^CF0,60\n" +
                "^FO50,50^FD%s^FS\n" +
                "^CFA,50\n" +
                "^FO50,200^FDLata        %s^FS\n" +
                "^FO50,280^FDCaixa       %s^FS\n" +
                "^BY5,2,270\n" +
                "^FO100,450^BC^FD%s^FS\n" +
                "^XZ",
                descricao, valor_da_lata, valor_do_caixa, produto.getCodigoBarras()
        );
    }
}