class Hero {

  #ataque

  constructor(nome, idade, tipo) {
    this.nome = nome
    this.idade = idade
    this.tipo = tipo
  }

  atacar() {
    if(this.tipo == 'mago') {
      this.#ataque = 'magia'
    } else if (this.tipo == 'guerreiro') {
      this.#ataque = 'espada'
    } else if (this.tipo == 'monge') {
      this.#ataque = 'artes marciais'
    } else if (this.tipo == 'ninja') {
      this.#ataque = 'shuriken'
    } else {
      console.log(`O tipo '${this.tipo}' não está disponível, tente as seguintes classes\n- mago\n- guerreiro\n- monge\n- ninja`)
      return null
    }
    console.log(`O ${this.tipo} atacou usando ${this.#ataque}`)
  }
}

const ninja = new Hero('Fabiano', 26, 'ninja');
const guerreiro = new Hero('Fernando', 30, 'guerreiro')
const mago = new Hero('João', 20, 'mago')
const monge = new Hero('José', 18, 'monge')
const random = new Hero('Tales', 21, 'elfo')


ninja.atacar()
guerreiro.atacar()
mago.atacar()
monge.atacar()
random.atacar()