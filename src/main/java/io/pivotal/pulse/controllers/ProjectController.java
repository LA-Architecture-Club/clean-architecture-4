package io.pivotal.pulse.controllers;

import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.dto.ProjectDTO;
import io.pivotal.pulse.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value="/projects/new", method=RequestMethod.POST)
    public void create(@RequestBody ProjectDTO projectDTO) {
        Project project = new Project();
        project.setName(projectDTO.getName());
        project.setProjectCode(projectDTO.getProjectCode());
        projectService.createProject(project);
    }
}
