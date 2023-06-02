
public class Calculadora{
  public double adicao(double a, double b){
    final double result = a + b;
    return result;
  }
  public double subtracao(double a, double b){
    final double result = a - b;
    return result;
  }

  public double multiplicacao(double a, double b){
    final double result = a * b;
    return result;
  }

  public double divisao(double a, double b){
    final double result = a / b;
    return result;
  }

  public double potenciacao(double a, double b){
    final double result = Math.pow(a,b);
    return result;
  }

  public double radiciacao(double a){
    final double result = Math.sqrt(a);
    return result;
  }
}