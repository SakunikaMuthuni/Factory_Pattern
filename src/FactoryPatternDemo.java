public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shape1=new ShapeFactory();

        Shape circle=shape1.createShape("CIRCLE");
        Shape rectangle=shape1.createShape("RECTANGLE");
        Shape square=shape1.createShape("SQUARE");

        circle.Draw();
        rectangle.Draw();
        square.Draw();

    }

}
