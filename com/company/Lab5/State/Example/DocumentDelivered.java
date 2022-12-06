package com.company.Lab5.State.Example;

public class DocumentDelivered implements IDocumentState{
    @Override
    public String getStatusName() {
        return StatusName.DELIVERED.getStatusName();
    }

    @Override
    public void nextDocumentStatus(DocumentContext documentContext) {
        System.out.println("Nothing happen");
    }

    @Override
    public void previousDocumentStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentSend());
    }
}
