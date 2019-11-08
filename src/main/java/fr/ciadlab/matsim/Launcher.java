package fr.ciadlab.matsim;

import org.matsim.run.gui.Gui;

/**
 * Project launcher
 * @author Alexandre Lombard
 */
public class Launcher {

    public static void main(String[] args) {
        Gui.show("MATSim evaluation for C-ITS simulation", RunMatsim.class);
    }

}
