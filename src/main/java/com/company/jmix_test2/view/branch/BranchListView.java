package com.company.jmix_test2.view.branch;

import com.company.jmix_test2.entity.Branch;
import com.company.jmix_test2.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "branches", layout = MainView.class)
@ViewController(id = "Branch.list")
@ViewDescriptor(path = "branch-list-view.xml")
@LookupComponent("branchesDataGrid")
@DialogMode(width = "64em")
public class BranchListView extends StandardListView<Branch> {
}