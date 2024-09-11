carrinho = []

def adicionar_item(codigo, nome, descricao, valor):
    item = {
        'codigo': codigo,
        'nome': nome,
        'descricao': descricao,
        'valor': valor,
        'acrescimo': 0,
        'desconto': 0,
        'total': valor
    }
    carrinho.append(item)
    print('Item adicionado com sucesso!')
    estado_atual()

def estado_atual():
    print('\nEstado atual do carrinho: \n')
    for item in carrinho:
        print(f'Código: {item['codigo']}')
        print(f'Nome: {item['nome']}')
        print(f'Descrição: {item['descricao']}')
        print(f'Valor: R${item['valor']:.2f}')
        print(f'Acréscimo: R${item['acrescimo']:.2f}')
        print(f'Desconto: R${item['desconto']:.2f}')
        print(f'Total: R${item['total']:.2f}')
        print('-' * 40)

def buscar_item(codigo):
    for item in carrinho:
        if item['codigo'] == codigo:
            return item
    return None
