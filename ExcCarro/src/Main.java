public class Main {

    public Main() {
    }

    public static void main(String[] args) {


    Carro vectra = new Carro();
    vectra.marca = "Chevrolet";
    vectra.modelo = "vectra";
    vectra.ano = 2004;
    vectra.dono = "Guilherme";
    vectra.cor = "prata";

    vectra.liga();
    vectra.acelerar(0);
    vectra.acelerar(20);
    vectra.acelerar(30);
    vectra.desliga();
    vectra.acelerar(20);
    vectra.liga();
    vectra.acelerar(100);

    Carro gol = new Carro();
    gol.setMarca("Volkswagen");
    gol.setModelo("Gol");
    gol.setAno(2003);
    gol.setCor("Branco");
    gol.setDono("Daniel");
    gol.setVelocidadeMaxima(180);

    gol.liga();
    gol.acelerar(170);
    gol.acelerar(11); // Erro na confirmaçao da velocidade maxima
    gol.acelerar(1);
    gol.acelerar(-10);

    }

}