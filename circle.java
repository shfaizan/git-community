package Class5;

class ACircle {
    double radius = 1.0;

    ACircle(){}

    ACircle(double newRadius){
        radius = newRadius;
    }
    double getArea()
    {
        return radius*radius*3.14159;
    }
}
class Circle{
    public static void main(String[] args) {
        ACircle a = new ACircle();
        System.out.println(a.getArea());
    }
}


