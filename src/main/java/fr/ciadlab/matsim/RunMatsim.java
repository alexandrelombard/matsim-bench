package fr.ciadlab.matsim;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.gbl.Gbl;
import org.matsim.core.scenario.ScenarioUtils;

/**
 * Loads a MATSim configuration
 * The MATSim configuration comes from https://github.com/matsim-org/matsim-example-project
 * @author Alexandre Lombard
 */
public class RunMatsim {
    public static void main(String[] args) {
        if ( args.length==0 ) {
            args = new String [] { "scenarios/equil/config.xml" } ;
            // to make sure that something is run by default; better start from MATSimGUI.
        } else {
            Gbl.assertIf( args[0] != null && !args[0].equals( "" ) );
        }

        Config config = ConfigUtils.loadConfig( args ) ;

        // possibly modify config here

        // ---

        Scenario scenario = ScenarioUtils.loadScenario(config) ;

        // possibly modify scenario here

        // ---

        Controler controler = new Controler( scenario ) ;

        // possibly modify controler here

//		controler.addOverridingModule( new OTFVisLiveModule() ) ;

        // ---

        controler.run();
    }
}
