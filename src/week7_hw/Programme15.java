package week7_hw;
/*
15. Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double
 */

public class Programme15 {

    public class Wall {
        public double width;
        private double height;

        public void main(String[] args) {
            Wall wall = new Wall(5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }

        public Wall(double width, double height) {
            if (width > 0 && height < 0) {
                this.width = width;
                this.height = 0;
            } else if (width < 0 && height > 0) {
                this.width = 0.0;
                this.height = height;
            } else if (width < 0 && height < 0) {
                this.width = 0.0;
                this.height = 0.0;
            } else {
                this.width = width;
                this.height = height;
            }
        }
//Method named getWidth without any parameters, it needs to return the value of width field.

        public double getWidth() {
            return width;
        }

        //Method named getHeight without any parameters, it needs to return the value of height field.
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {// set the hright with one parameter.
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getHeight(double height) {
            return height;
        }

        public double getArea() {
            return this.width * this.height;
        }

    }
}