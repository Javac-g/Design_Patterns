package com.company.Lab5.Visitor.Shapes;

public class XMLExportVisitor implements Visitor {

    public String export(Shape...args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version= 1.0 encoding = utf-8?>");
        for (Shape shape:args){
            stringBuilder.append(shape.accept(this));
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        return "\t<dot>" + "\n"+
                "\t<id>" + dot.getId() + "</id>\n"+
                "\t<Coordinate x>" + dot.getX() + "</Coordinate x>\n"+
                "\t<Coordinate y>" + dot.getY() + "</Coordinate y>\n"+
                "</dot>";
    }

    @Override
    public String visitCircle(Rhombus rhombus) {
        return " \t<rhombus>" + "\n"+
                "\t<id>" + rhombus.getId() + "</id>\n"+
                "\t<side A>" + rhombus.getX() + "</side A>\n"+
                "\t<side B>" + rhombus.getY() + "</side B>\n"+
                "\t<side C>" + rhombus.getSideC() + "</side C>\n"+
                "\t<side E>" + rhombus.getSideE() + "</side E>\n"+
                "</rhombus>";
    }

    @Override
    public String visitRectangle(Triangle triangle) {
        return "\t<triangle>" + "\n"+
                "\t<id>" + triangle.getId() + "</id>\n"+
                "\t<side A>" + triangle.getSideA() + "</side A>\n"+
                "\t<side B>" + triangle.getSideB() + "</side B>\n"+
                "\t<side C>" + triangle.getSideC() + "</side C>\n"+
                "</triangle>";
    }
    private String _visitCompoundGraphic(CompoundShape cs) {
         StringBuilder sb = new StringBuilder();
         for (Shape shape: cs.children){
             String obj = shape.accept(this);
             obj = "  " + obj.replace("\n","\n     ")+ "\n";
             sb.append(obj);
         }
         return sb.toString();
    }
    @Override
    public String visitCompoundGraphic(CompoundShape cs) {
        return "\n\t<Compound graphic>" + "\n" +
                "\t<id>" + cs.getId() +"</id>\n"+
               _visitCompoundGraphic(cs) +
                "</Compound graphic>" + "\n";
    }

}
