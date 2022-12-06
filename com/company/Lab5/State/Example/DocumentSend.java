package com.company.Lab5.State.Example;

public class DocumentSend implements IDocumentState{
    @Override
    public String getStatusName() {
        return StatusName.SEND.getStatusName();
    }

    @Override
    public void nextDocumentStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentDelivered());
    }

    @Override
    public void previousDocumentStatus(DocumentContext documentContext) {
        documentContext.setiDocumentState(new DocumentNew());
    }
}
