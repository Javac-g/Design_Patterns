package com.company.Lab5.Visitor.Example;

public class XMLExportVisitor implements Visitor{

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
                "\t<x>" + dot.getX() + "</x>\n"+
                "\t<y>" + dot.getY() + "</y>\n"+
                "</dot>";
    }

    @Override
    public String visitCircle(Circle circle) {
        return " \t<circle>" + "\n"+
                "\t<id>" + circle.getId() + "</id>\n"+
                "\t<x>" + circle.getX() + "</x>\n"+
                "\t<y>" + circle.getY() + "</y>\n"+
                "\t<radius>" + circle.getRadius() + "</radius>\n"+
                "</circle>";
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        return "\t<rectangle>" + "\n"+
                "\t<id>" + rectangle.getId() + "</id>\n"+
                "\t<x>" + rectangle.getX() + "</x>\n"+
                "\t<y>" + rectangle.getY() + "</y>\n"+
                "\t<width>" + rectangle.getWidth() + "</width>\n"+
                "\t<height>" + rectangle.getHeight() + "</height>\n"+
                "</rectangle>";
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
