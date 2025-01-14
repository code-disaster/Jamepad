package com.studiohartman.jamepad;

/**
 * Class defining the configuration of a {@link ControllerManager}.
 *
 * @author Benjamin Schulte
 */
public class Configuration {
    /**
     * The max number of controllers the ControllerManager should deal with
     */
    public int maxNumControllers = 4;

    /**
     * Use RawInput implementation instead of XInput on Windows, if applicable. Enable this if you
     * need to use more than four XInput controllers at once. Comes with drawbacks.
     */
    public boolean useRawInput = false;
}
