package br.com.unicap.poo;

public class Dividir {
    private int num1;
    private int num2;

    public Dividir (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int divisao () throws ExceptionZero, Exception {
            if (num2==0) {
                throw new ExceptionZero("nao pode dividir por zero");
            }
            if (num1==4){
                throw new Exception("o primeiro nao pode ser 4");
            }
            int resultado = num1/num2;
            return resultado;
    }
}
