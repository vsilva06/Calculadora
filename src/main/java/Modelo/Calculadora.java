package Modelo;

public class Calculadora {
    double ans;

    public Calculadora(){
        this.ans = 0;
    }

    public double sumar(double num1, double num2){
        this.ans = num1 +num2;
        return ans;
    }

    public double restar(double num1, double num2){
        this.ans = num1 - num2;
        return ans;
    }

    public double multiplicar(double num1, double num2){
        this.ans = num1 * num2;
        return ans;
    }

    public double dividir(double num1, double num2){
        this.ans = num1 / num2;
        return ans;
    }

    public double getAns() {
        return ans;
    }
}
