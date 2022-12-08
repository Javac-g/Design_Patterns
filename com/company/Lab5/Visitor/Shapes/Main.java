package com.company.Lab5.Visitor.Shapes;

public class Main {
    public static void export(Shape... shapes){
        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();
        System.out.println(xmlExportVisitor.export(shapes));
    }
    public static void main(String...args){
        Dot dot = new Dot(1,10,55);
        Rhombus rhombus = new Rhombus(2,23,15,10,22);
        Triangle triangle = new Triangle(3,10,17,20);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(rhombus);
        compoundShape.add(triangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);
        export(c,compoundShape);

    }
}
