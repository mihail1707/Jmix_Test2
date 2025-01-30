package com.company.jmix_test2.view.operation;

import com.company.jmix_test2.entity.Operation;
import com.company.jmix_test2.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "operations", layout = MainView.class)
@ViewController(id = "Operation.list")
@ViewDescriptor(path = "operation-list-view.xml")
@LookupComponent("operationsDataGrid")
@DialogMode(width = "64em")
public class OperationListView extends StandardListView<Operation> {
}