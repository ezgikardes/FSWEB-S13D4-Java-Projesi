public class Point {
    private int x;
    private int y;

    //functional constructor:
    public Point(int x, int y) {
        this.x = x;
        this.y =y;
    }

    //setter methods:
    public int setX(int x){
        return this.x = x;
    }

    public int setY(int y){
        return this.y = y;
    }

    //getter methods:
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

//overloading of distance method:

    //distance from origin, point (0,0)
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    //distance from Point p object):
    public double distance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }

    //distance from point (a,b)
    public double distance(int a, int b){
        return Math.sqrt((this.x - a) * (this.x-a) + (this.y - b) * (this.y - b));
    }
}