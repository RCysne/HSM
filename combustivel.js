let alcool = 3.16;
let gasolina = 4.19;

let abastecer = prompt(
  'Digite qual o combustível desejado. (Ácool = 1 - Gasolina = 2): '
);

if (abastecer == 1) {
  let litros = prompt('Digite a quantidade de litros: ');
  alert('O combustível escolhido foi o Álcool');
  alert('Você abastecerá ' + litros + ' litros');
  alert(
    'O valor a ser pago em Álcool será de: R$' + (litros * alcool).toFixed(2)
  );
} else if (abastecer == 2) {
  let litros = prompt('Digite a quantidade de litros: ');
  alert('O combustível escolhido foi a Gasolina');
  alert('Você abastecerá ' + litros + ' litros');
  alert(
    'O valor a ser pago em Gasolina será de: R$' +
      (litros * gasolina).toFixed(2)
  );
} else if (abastecer != 1 && abastecer != 2) {
  alert('Digite o número correto!');
}
