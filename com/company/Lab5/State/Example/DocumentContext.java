package com.company.Lab5.State.Example;

public class DocumentContext {
    private IDocumentState iDocumentState;

    public IDocumentState getiDocumentState() {
        return iDocumentState;
    }

    public void setiDocumentState(IDocumentState iDocumentState) {
        this.iDocumentState = iDocumentState;
    }
    public void nextDocumentStatus(){
        iDocumentState.nextDocumentStatus(this);
    }
    public void previousDocumentStatus(){
        iDocumentState.previousDocumentStatus(this);
    }
    public String getStatusName(){
        return iDocumentState.getStatusName();
    }
}
