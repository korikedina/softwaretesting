package uni.sw.unit.testing;

public class Triangle {
    private int a, b, c;

    public Triangle (int a, int b, int c){
        if ( ((a + b) > c ) && ((b + c) > a ) && ((c+a)>b)){
            this.a = a;
            this.b = b;
            this.c = c;    
        }
        else{
            throw new ArithmeticException(
                String.format("The triangle cannot be constructed from the the numbers %d, %d, %d.", a, b, c));
        }
    }

    public boolean isIsosceles(){
        return ((a == b) || (b == c) || (c==a)) ? true : false;
    }

    public boolean isEquilateral(){
        return (a==b&&b==c)? true:false;
    }

    public boolean isRightAngeled(){
        if(a*a+b*b==c*c){
            return true;
        }
        else if(a*a+c*c==b*b){
            return true;
        }
        else if(b*b+c*c==a*a){
            return true;
        }
        else return false;
    }

    public int getPerimeter(){
        return a + b + c;
    }

    public double getArea(){
        double s=(a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
