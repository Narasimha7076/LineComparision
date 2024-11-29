public class Line {
    double x1,y1,x2,y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void calculateLength(){
        double distance = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        System.out.println("Distance: "+distance);
    }
}
