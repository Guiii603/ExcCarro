class Carro {
    String cor;
    String marca;
    String modelo;
    String dono;
    int ano;
    double  velocidadeAtual;
    double velocidadeMaxima;
    int verificacao = 0;

    public Carro(String marca, String modelo, int ano, String cor, String dono, double velocidadeMaxima){
        this.ano = ano;
        this.cor = cor;
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;

    }
    public Carro(){
        this.ano = 0000;
        this.cor = "";
        this.dono = "";
        this.marca = "";
        this.modelo = "";
        this.velocidadeMaxima = 999;

    }

    void liga(){ //Liga o carro
        verificacao = 1;
        System.out.println("O "+ modelo +" esta ligado");
    }
    void desliga(){
        verificacao = 0;
        System.out.println("O "+ modelo +" esta desligado");
    }
    void acelerar(double quantidade){ //Acelera o carro
        if(verificacao == 1) {
            if (velocidadeAtual > velocidadeMaxima){
                this.velocidadeAtual = velocidadeMaxima;
                System.out.println("Velocidade maxima atingida: "+ velocidadeMaxima + "Km/h!");
            }
            if (quantidade > 0) {
                if(quantidade + velocidadeAtual > velocidadeMaxima){
                    this.velocidadeAtual = velocidadeMaxima;
                    System.out.println("Velocidade maxima atingida: "+ velocidadeMaxima + "Km/h!");
                }else {
                    velocidadeAtual += quantidade;
                    System.out.println("O carro esta a " + velocidadeAtual + "Km/h");
                }
            } else if (velocidadeAtual == 0 && quantidade == 0) {
                System.out.println("O " + modelo + " ja esta parado");
            } else {
                System.out.println("Funcao destinada a acelerar o carro, " +
                        "caso queira diminuir a velocidade, use a funcao 'desacelerar'");
            }
        }else{
            System.out.println("O "+modelo+" esta desligado, nao e possivel acelerar");
        }

    }

    public void desacelera(double quantidade){ // Desacelera o carro
        if (verificacao == 1){
            if(quantidade < 0 ){
                System.out.println("os valores colocados devem ser positivos");
            }else if(quantidade == 0){
                System.out.println("O "+ modelo +" permanece na mesma velocida");
            }else{
                if(velocidadeAtual + quantidade < 0){
                    this.velocidadeAtual = 0;
                    System.out.println("O "+ modelo +" esta parado");
                }else {
                    this.velocidadeAtual -= quantidade;
                    System.out.println("O carro esta a " + velocidadeAtual + "Km/h");
                }
            }
        }else{
            System.out.println("O "+modelo+" esta desligado, nao e possivel desacelerar");
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDono() {
        return dono;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
