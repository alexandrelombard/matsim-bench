package fr.ciadlab.matsim;

import org.matsim.contrib.otfvis.OTFVis;
import org.matsim.contrib.otfvis.OTFVisGUI;
import org.matsim.run.gui.Gui;

/**
 * Project launcher
 * @author Alexandre Lombard
 */
public class Launcher {

    public static void main(String[] args) {
        // Showing main GUI
        Gui.show("MATSim evaluation for C-ITS simulation", RunMatsim.class);

        // Showing OTFVIS GUI
        OTFVisGUI.runDialog();
    }

}
