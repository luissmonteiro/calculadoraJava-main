import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main() {
    Result result = JUnitCore.runClasses(Teste.class);
    int count;
    String msg;
    long time = result.getRunTime();

    System.out.println("\n\nRESULTADO DA EXECUÇÃO DOS TESTES");
    System.out.println("Tempo: " + time + " ms");

    if (result.wasSuccessful()) {
       count = result.getRunCount();
       if (count == 1)
          msg = count + " teste executado com sucesso";
       else
          msg = count + " testes executados com sucesso";      
       
    }    
    else {
       count = result.getFailureCount();
       if (count == 1)
          msg = count + " teste falhou";
       else
          msg = count + " testes falharam";      
    }

    System.out.println(msg);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    
  }
}