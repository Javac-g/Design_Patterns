package com.company.Lab5.State.Example;

public class DocumentNew implements IDocumentState{
    @Override
    public String getStatusName() {
        return StatusName.NEW.getStatusName();
    }

    @Override
    public void nextDocumentStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentSend());
    }

    @Override
    public void previousDocumentStatus(DocumentContext documentContext) {
        System.out.println("Nothing happens");

    }
}
