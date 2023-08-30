public class ShapeFactory {
    public Shape createShape(String shape){
        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
