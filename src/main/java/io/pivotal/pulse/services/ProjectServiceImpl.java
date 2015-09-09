package io.pivotal.pulse.services;

import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.persistance.ProjectRepository;

public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {

        this.projectRepository = projectRepository;
    }

    @Override
    public void createProject(Project project) {
        projectRepository.save(project);
    }
}
