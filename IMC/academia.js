const btn = document.querySelector('#btn').addEventListener('click', calc);

// Adicionar valor do input ao objeto
function calc() {
  let name = document.querySelector('#name').value;
  let age = Number(document.querySelector('#age').value);
  let height = Number(document.querySelector('#height').value);
  let pound = Number(document.querySelector('#pound').value);

  let aluno = {
    nome: name,
    idade: age,
    altura: height,
    peso: pound,
  };

  return aluno;
}
