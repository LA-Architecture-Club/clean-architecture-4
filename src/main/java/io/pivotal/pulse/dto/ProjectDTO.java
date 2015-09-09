package io.pivotal.pulse.dto;

public class ProjectDTO {
    private String name;
    private String projectCode;

    public ProjectDTO() {
    }

    public ProjectDTO(String name, String projectCode) {
        this.name = name;
        this.projectCode = projectCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
