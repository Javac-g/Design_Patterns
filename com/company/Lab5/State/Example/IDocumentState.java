package com.company.Lab5.State.Example;

public interface IDocumentState {
    String getStatusName();
    void nextDocumentStatus(DocumentContext documentContext);
    void previousDocumentStatus(DocumentContext documentContext);
}
