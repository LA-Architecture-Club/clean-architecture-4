package io.pivotal.pulse.domain;

import javax.persistence.Entity;

@Entity(name="projects")
public class Project {
    private String name;
    private String projectCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
}
