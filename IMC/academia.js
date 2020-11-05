const nome = prompt('Digite o seu nome: ');
const idade = prompt('Digite a sua idade: ');
const altura = prompt('Digite a sua altura: ');
const peso = prompt('Digite o seu peso: ');

const imc = (peso / (altura * altura)).toFixed(2);

if (imc < 18.5) {
  alert('Seu IMC é: ' + imc);
  alert('Atenção! Você está na linha da Magreza.');
} else if (imc >= 18.5 && imc < 25) {
  alert('Seu IMC é: ' + imc);
} else if (imc > 25 && imc < 30) {
  alert('Seu IMC é: ' + imc);
  alert('Atenção! Você está com sobrepeso. Obesidade grau I');
} else if (imc >= 30 && imc < 40) {
  alert('Seu IMC é: ' + imc);
  alert('Atenção! Você está com Obesidade grau II.');
} else if (imc >= 40) {
  alert('Seu IMC é: ' + imc);
  alert('Atenção! Você está com Obesidade grau III.');
}
