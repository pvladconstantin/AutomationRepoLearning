package starter.CodeWarsShip;

public class Ship {

    //Testing values:
    //Not worth: draft 15.0 / crew 10 -> 15.0 - (10 * 1.5) = 15.0 - 15.0 = 0.0. Adjusted draft is not greater than 20.0, therefore the ship is not worth looting.
    //Worth: draft 50.0 / crew 5 -> 50.0 - (5 * 1.5) = 50.0 - 7.5 = 42.5. Since the adjusted draft is greater than 20.0, the ship is worth looting.
    private double draft;
    private int crew;

    // Constructors
    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    // Ship worth looting
    public boolean isWorthIt() {
        double newDraft = draft - (crew * 1.5);
        return newDraft > 20.0;
    }

    public static void main(String[] args) {
        // Create a ship object and pass draft and crew count
        Ship titanic = new Ship(50.0, 5); // HERE MODIFY DRAFT AND CREW

        // Building the if statement for worth looting or not
        if (titanic.isWorthIt()) {
            System.out.println("Ship worth looting! Hunt them!");
        } else {
            System.out.println("Move to another ship! This one is not worthy!");
        }
    }
}
