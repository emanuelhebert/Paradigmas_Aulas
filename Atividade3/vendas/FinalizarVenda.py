from pprint import pprint


def finalizar_venda(carrinho):
    if carrinho:
        total_acrescimo = sum(item["acrescimo"] for item in carrinho)
        total_desconto = sum(item["desconto"] for item in carrinho)
        total_geral = sum(item["total"] for item in carrinho)

        print("\nResumo da Venda:")
        pprint(carrinho, sort_dicts=False)
        print(f"\nTotal de Acréscimos: R${total_acrescimo:.2f}")
        print(f"Total de Descontos: R${total_desconto:.2f}")
        print(f"Valor Final a Pagar: R${total_geral:.2f}")
        carrinho.clear()

