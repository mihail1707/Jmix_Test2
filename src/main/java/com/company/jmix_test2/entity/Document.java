package com.company.jmix_test2.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "DOCUMENT", indexes = {
        @Index(name = "IDX_DOCUMENT_BRANCH", columnList = "BRANCH_ID"),
        @Index(name = "IDX_DOCUMENT_DEPARTMENT", columnList = "DEPARTMENT_ID")
})
@Entity
public class Document {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @Column(name = "FIO", nullable = false)
    @NotNull
    private String fio;
    @JoinColumn(name = "BRANCH_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Branch branch;
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Department department;
    @Composition
    @OneToMany(mappedBy = "document")
    private List<Operation> operation;
    @Column(name = "TARGET", nullable = false)
    @NotNull
    private String target;
    @Column(name = "TRANSMITTED_RESULT", nullable = false)
    @NotNull
    private String transmitted_result;
    @Column(name = "COMMENT_", nullable = false)
    @NotNull
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTransmitted_result() {
        return transmitted_result;
    }

    public void setTransmitted_result(String transmitted_result) {
        this.transmitted_result = transmitted_result;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}