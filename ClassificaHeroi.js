const readline = require('readline')

const entrada = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

entrada.question("Digite o nome do Heroi: ", (nome) => {
  entrada.question("Digite a experiencia que seu heroi possui: ", (exp) => {
    const experiencia = parseInt(exp)
    let nivelHeroi
    if (experiencia < 1000) {
      nivelHeroi = 'Ferro'
    } else if (experiencia > 1000 && experiencia <= 2000) {
      nivelHeroi = 'Bronze'
    } else if (experiencia > 2000 && experiencia <= 5000) {
      nivelHeroi = 'Prata'
    } else if (experiencia > 6000 && experiencia <= 7000) {
      nivelHeroi = 'Ouro'
    } else if (experiencia > 7000 && experiencia <= 8000) {
      nivelHeroi = 'Platina'
    } else if (experiencia > 8000 && experiencia <= 9000) {
      nivelHeroi = 'Ascendente'
    } else if (experiencia > 9000 && experiencia <= 10000) {
      nivelHeroi = 'Imortal'
    } else {
      nivelHeroi = 'Radiante'
    }

    console.log(`O Herói de nome ${nome} está no nível de ${nivelHeroi}`)

    entrada.close()
  })
})

