public class pr22 {
    int x=100;
    class Inner {
        int y=200;
        void imethod()
    {
        System.out.println(x);
        System.out.println(+y);
    }
}
void display()
{
        Inner ob1=new Inner();
        System.out.println(x);
        System.out.println(ob1.y);
}

public class pr2 {
    public static void main(String[] args) {
        pr22 obname=new pr22();
        obname.display();
        pr22.Inner obj2=obname.new Inner();
        obj2.imethod();
    }
}

    }
    

