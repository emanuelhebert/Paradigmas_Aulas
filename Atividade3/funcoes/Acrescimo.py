from carrinho.Carrinho import buscar_item, estado_atual

def aplicar_acrescimo(codigo, acrescimo):
    item = buscar_item(codigo)
    if item:
        item['acrescimo'] += acrescimo
        item['total'] += acrescimo
        print(f'Acréscimo de R${acrescimo:.2f} aplicado com sucesso ao item "{item["nome"]}"!')
        estado_atual()


def aplicar_acrescimo_total(carrinho, acrescimo_total):
    if carrinho:
        acrescimo_por_item = acrescimo_total / len(carrinho)
        for item in carrinho:
            item['acrescimo'] += acrescimo_por_item
            item['total'] += acrescimo_por_item
        print(f'Acréscimo total de R${acrescimo_total:.2f} distribuído igualmente entre os itens.')
        estado_atual()
