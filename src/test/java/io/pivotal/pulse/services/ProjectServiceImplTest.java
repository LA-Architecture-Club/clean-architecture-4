package io.pivotal.pulse.services;

import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.persistance.ProjectRepository;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;

public class ProjectServiceImplTest {

    private ProjectRepository projectRepository = mock(ProjectRepository.class);
    private ProjectServiceImpl subject;

    @Before
    public void setUp(){
      subject = new ProjectServiceImpl(projectRepository);
    }


    @Test
    public void createProject_whenGivenValidProjectObject_createsProject() {
        Project project = new Project();
        subject.createProject(project);
        verify(projectRepository).save(project);
    }

}