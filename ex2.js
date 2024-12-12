function Carro(cor, qtdPortas, embreagem, marca, modelo, velocidadeAcelerar, velocidadeFrear)  {
    this.cor = cor,
    this.qtdPortas = qtdPortas,
    this.embreagem = embreagem,
    this.marca = marca,
    this.modelo = modelo,
    this.acelerar = () => console.log(`Acelerando o carro até: ${velocidadeAcelerar}KM/H`),
    this.frear = () => console.log(`Freando o carro até: ${velocidadeFrear}KM/H`)
}

let ferrari = new Carro("Amarelo", 2, "Manual","Ferrari", "Dino", "80", "0");

ferrari.cor = "Amarelo";

console.log(ferrari);
console.log(typeof(ferrari));
console.log(`A cor do carro é ${ferrari.cor}`);
ferrari.acelerar();
ferrari.frear();
