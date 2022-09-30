public class RectangleRunner {
    public static void main(String[] args){
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        System.out.println("Plot 1 length: " + plot1.getLength());
        System.out.println("Plot 1 width: " + plot1.getWidth());
        System.out.println("Plot 1 Area: " + plot1.calculateArea());
        System.out.println();
        System.out.println("Plot 2 length: " + plot2.getLength());
        System.out.println("Plot 2 width: " + plot2.getWidth());
        System.out.println("Plot 2 Area: " + plot2.calculateArea());
        System.out.println();
        System.out.println("Plot 3 length: " + plot3.getLength());
        System.out.println("Plot 3 width: " + plot3.getWidth());
        System.out.println("Plot 3 Area: " + plot3.calculateArea());
        System.out.println();

        plot1.setWidth(75);
        plot2.setLength(75); //plot 2 is a square
        plot2.setWidth(75);
        plot3.setWidth(75);

        int plot1Area = plot1.calculateArea();
        int plot2Area = plot2.calculateArea();
        int plot3Area = plot3.calculateArea();
        int seedRequired = plot1Area +plot2Area + plot3Area;
        System.out.println("These three plots requires " + seedRequired + " square feet of seed");


    }

}
