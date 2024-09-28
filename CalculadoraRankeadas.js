const readline = require('readline')

const scanner = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

function calculaRank(vitorias, derrotas) {
  let saldo = vitorias - derrotas
  let rank
  if(saldo < 10) {
    rank = 'Ferro'
  } else if (saldo > 10 && saldo <= 20) {
    rank = 'Bronze'
  } else if (saldo > 20 && saldo <= 50) {
    rank = 'Prata'
  } else if (saldo > 50 && saldo <= 80) {
    rank = 'Ouro'
  } else if (saldo > 80 && saldo <= 90) {
    rank = 'Diamante'
  } else if (saldo > 90 && saldo <= 100) {
    rank = 'Lendário'
  } else {
    rank = 'Imortal'
  }

  return {saldo, rank}

  }

scanner.question("Informe a quantidade de vítorias: ", (victories) => {
  scanner.question("Informe a quantidade de derrotas: ", (defeats) => {
    const wins = parseInt(victories)
    const defeat = parseInt(defeats)

    const resultado = calculaRank(wins, defeat)
    console.log(`O Herói tem saldo de ${resultado.saldo} vítorias e está no nível de ${resultado.rank}`)
    scanner.close()
  })
  
})
