/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diabetes.project;

import static org.apache.tools.ant.dispatch.DispatchUtils.execute;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class DiabetesLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      KieServices ks = KieServices.Factory.get();
      KieContainer kc = ks.getKieClasspathContainer();
      execute(ks, kc); // This calls your custom execute method
  }

    public static void execute(KieServices ks, KieContainer kc) {
        // From the container, a session is created based on
        // its definition and configuration in the META-INF/kmodule.xml file
        KieSession ksession = kc.newKieSession("diabetesSession");

        // Once the session is created, the application can interact with it

        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );
        // The application can insert facts into the session
        Patient andrea = new Patient();
        andrea.setTypeOfDiabetes(1);
        andrea.setBmi(28);
        andrea.setAge(23);
        andrea.setName("Andrea");
        
        Patient loredana = new Patient();
        loredana.setAge(11);
        loredana.setTypeOfDiabetes(1);
        loredana.setBmi(10);
        loredana.setName("lore");
        
        
        ksession.insert(andrea);
        ksession.insert(loredana);

        // and fire the rules
        ksession.fireAllRules();
        
        System.out.println(andrea);
        System.out.println(loredana);


        // and then dispose the session
        ksession.dispose();
    }
    
}
