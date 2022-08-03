interface Rectangle
{
    float area_rect(float x,float y);
}
interface Triangle
{
    float area_tri(float x,float y);
}
class area implements Rectangle,Triangle 
{
    public float area_rect(float x,float y)
    {
        return(x*y);
    }
    public float area_tri(float x,float y)
    {
        return(x*y/2);
    }
}


public class inh{
    public static void main(String[] args) {
        area a = new area();
        System.out.println("area of triangle"+a.area_tri(22,11));
        System.out.println("area of reactangle"+a.area_rect(22,10));
    }
}






























