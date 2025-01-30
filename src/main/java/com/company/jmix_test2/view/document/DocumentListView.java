package com.company.jmix_test2.view.document;

import com.company.jmix_test2.entity.Document;
import com.company.jmix_test2.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "documents", layout = MainView.class)
@ViewController(id = "Document.list")
@ViewDescriptor(path = "document-list-view.xml")
@LookupComponent("documentsDataGrid")
@DialogMode(width = "64em")
public class DocumentListView extends StandardListView<Document> {
}