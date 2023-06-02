import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Teste{
  
  private Calculadora calculadora;

  @Before
    public void init(){
      calculadora  = new Calculadora();
    }
  @Test
    public void testeAdicao() {
      assertEquals(4.5, calculadora.adicao(2.2, 2.3), .1);
    }
  @Test
    public void testeSubtracao() {
      assertEquals(0.2, calculadora.subtracao(2.2, 2.0), .1);
    }
  @Test
    public void testeMultiplicacao() {
      assertEquals(10.0, calculadora.multiplicacao(2.0, 5.0), .1);
    }
  @Test
    public void testeDivisao() {
      assertEquals(2.0, calculadora.divisao(10.0, 5.0), .1);
    }
  @Test
    public void testePotenciacao() {
      assertEquals(4.0, calculadora.potenciacao(2.0, 2.0), .1);
    }
  @Test
    public void testRadiciacao() {
      assertEquals(3.0, calculadora.radiciacao(9.0), .1);
    }
  @Test
    public void testSomaSub() {
      assertEquals(10.0, calculadora.adicao(3,5) + calculadora.subtracao(4,2), .1);
    }
  @Test
    public void testMultDiv() {
      assertEquals(calculadora.multiplicacao(3,5) + 1, calculadora.multiplicacao(3,5) + calculadora.divisao(4,4), .1);
    }
  @Test
    public void testMultZero() {
      assertEquals(0.0, calculadora.multiplicacao(4,0), .1);
    }
  @Test
    public void testSomaSubMult() {
      assertEquals(10.0, calculadora.adicao(3,5) + calculadora.subtracao(4,2) * calculadora.multiplicacao(1,1), .1);
    }
  @Test
    public void testDivisaoZero() {
      assertNotEquals(1, calculadora.divisao(10,0), .1);
    }
}