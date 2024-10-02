/**
 * This class defines how power pills behave in
 * a game. The purpose of a power pill is to simply
 * provide a character with power.
 */
public class PowerPill {
    // Default power value for pills
    public static final int DEFAULT_POWER = 10;

    // Instance variables
    private int power;
    private String name;

    // Constructor for a pill with a default power
    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER;
    }

    // Constructor for a pill with a specified power
    public PowerPill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // Get the power of the pill
    public int getPower() {
        return power;
    }

    // Get the name of the pill
    public String getName() {
        return name;
    }

    // Set a new power level for the pill
    public void setPower(int power) {
        this.power = power;
    }

    // Set a new name for the pill
    public void setName(String name) {
        this.name = name;
    }

    // Return a string representation of the pill
    @Override
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
}

