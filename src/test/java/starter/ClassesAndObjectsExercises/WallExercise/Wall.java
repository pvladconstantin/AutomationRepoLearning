package starter.ClassesAndObjectsExercises.WallExercise;

public class Wall {
    private double width=5; //set a value
    private double height=4; //set a value

    //Create the constructor without argument
    public Wall() {
    }

    //Create the parameterized constructor with width and height
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    //Create the Getter for width
    public double getWidth() {
        return width;
    }

    //Create the Getter for height
    public double getHeight() {
        return height;
    }

    //Create the Setter for width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //Create the Setter for height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Calculate the area of the wall by the formula L * l
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall execute = new Wall();
        System.out.println(execute.getArea());
    }
}
