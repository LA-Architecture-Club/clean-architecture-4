package io.pivotal.pulse.services;

import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.persistance.ProjectRepository;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    @Inject
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void createProject(Project project) {
        projectRepository.save(project);
    }
}
