package com.company.jmix_test2.view.document;

import com.company.jmix_test2.entity.Branch;
import com.company.jmix_test2.entity.Department;
import com.company.jmix_test2.entity.Document;

import com.company.jmix_test2.view.main.MainView;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;

import java.util.List;
import java.util.UUID;

@Route(value = "documents/:id", layout = MainView.class)
@ViewController(id = "Document.detail")
@ViewDescriptor(path = "document-detail-view.xml")
@EditedEntityContainer("documentDc")
public class DocumentDetailView extends StandardDetailView<Document> {
    public UUID departmentId;
    public UUID getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    @ViewComponent
    private EntityPicker<Branch> branchField;
    @ViewComponent
    private DataContext dataContext;

    @Subscribe("departmentField")
    public void onDepartmentFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityPicker<Department>, Department> event) {
        Department selectedDepartment = event.getValue();
        Branch selectedBranch = branchField.getValue();
        branchField.getElement().getComponent();

        if (selectedDepartment != null) {
            // Получаем ключ (ID) и значение (имя)
            UUID departmentId = selectedDepartment.getId(); // Получаем ключ
            String departmentName = selectedDepartment.getName(); // Получаем значение

            // Вывод или дальнейшая обработка
            this.setDepartmentId(departmentId);
            System.out.println("department ID: " + departmentId);
//            System.out.println("selectedBranch ID: " + branchField.getChildren().toList().containsAll();
            System.out.println("department name: " + departmentName);
//            branchField.clear();

        } else {
            System.out.println("Отдел не выбран.");
        }
    }
//    @Subscribe("branchField.entityLookup")
//    public void onBranchFieldEntityLookup(ActionPerformedEvent event) {
//
//        System.out.println("event name: " + event);
//        if (departmentId != null) {
//            // Здесь добавьте вашу логику фильтрации ветвей по departmentId
//            // Например, получите ветви, относящиеся к выбранному отделу
//
//        }
//    }

}