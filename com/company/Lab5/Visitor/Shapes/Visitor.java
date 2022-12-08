package com.company.Lab5.Visitor.Shapes;

public interface Visitor {
    String visitDot(Dot dot);
    String visitCircle(Rhombus rhombus);
    String visitRectangle(Triangle triangle);
    String visitCompoundGraphic(CompoundShape cs);
}
