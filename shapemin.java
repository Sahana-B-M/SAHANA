package shape;

public class shapemin {
    public static void main(String[] args) {
        circle c=new circle();
        square s=new square();
        traingle t=new traingle();
        s.getData((float)6.8);
        System.out.println("area of square is:"+s.area());
        t.getData((double)30.56,(double)26.59);
        System.out.println("the area of triangle is:"+t.area());
         c.getData((double)5.5);
         System.out.println("the area of circle is:"+c.area());
    }
}
