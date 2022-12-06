package com.company.Lab5.State.Example;

public class Main {
    public static void main(String...args){
        DocumentContext documentContext = new DocumentContext();
        documentContext.setiDocumentState(new DocumentNew());
        System.out.println(documentContext.getStatusName());
        documentContext.nextDocumentStatus();
        System.out.println(documentContext.getStatusName());
        documentContext.nextDocumentStatus();
        System.out.println(documentContext.getStatusName());
        documentContext.previousDocumentStatus();
        System.out.println(documentContext.getStatusName());
        documentContext.nextDocumentStatus();
        System.out.println(documentContext.getStatusName());
    }
}
