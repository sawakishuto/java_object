public class Circle {
    private int x, y, r;
    
    public Circle(int cx, int cy, int cr) {
        this.x = cx;
        this.y = cy;
        this.r = cr;
    }
    
    public int  getWidth(){
        return 2*r;
    }
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public String toString() {
        return ("Circle (" + x + ", " + y + "), r=" + r);
    }
}
//     public static void main(String[] args) {
//         Circle c = new Circle(10, 20, 30);
//         System.out.println(c);
//         c.move(10, -20);
//         System.out.println(c);
//     }
// }