function soma(a, b){
    return a + b;
}

let resultado_soma = soma (5, 3)
console.log(resultado_soma)

function subtracao(a, b){
    return a - b;
}

let resultado_subtracao = subtracao (5, 3)
console.log(resultado_subtracao)


function multiplicacao(a, b){
    return a * b;
}

let resultado_multiplicacao = multiplicacao (5, 3)
console.log(resultado_multiplicacao)

function divisao(a, b){
   if(a / b ){
    return a / b;
   }else if(a == 0 || b == 0){
    return "Não pode";
   }
}

let resultado_divisao = divisao(4, 2)
console.log(resultado_divisao)

function fatorial(a){
   
    if(a == 0 || a == 1){
        return 1;
    } for(var i = a - 1; i >= 1; i--){
        a *= i;
    }
    return a
}

let resultado_fatorial = fatorial(5)
console.log(resultado_fatorial)

function numero_impar_par(a){
    if(a % 2 == 0){
        return "Par";
    }else{
        return "Impar";
    }
}

let impar_ou_par = numero_impar_par(8)
console.log(impar_ou_par)

function contarVogais(str){
    var vogalCounter = 0;
    var vogais = 'aeiouAEIOU';

    for(var i = 0; i < str.length; i++){
        if(vogais.indexOf(str[i]) !== -1){
            vogalCounter++;
        }
    }
    return vogalCounter;
}

let contadorDeVogais = contarVogais('javascript')
console.log(contadorDeVogais)

function intevaloNumero(a, b){
    somar = 1;
    while(a < b){
      a ++
      somar = somar + a;
    }
    return somar;
  }

  let intervalo = intevaloNumero(1, 5)
  console.log(intervalo)