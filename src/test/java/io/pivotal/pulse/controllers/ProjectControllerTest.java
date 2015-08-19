package io.pivotal.pulse.controllers;

import io.pivotal.pulse.controllers.ProjectController;
import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.services.ProjectService;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class ProjectControllerTest {

    private MockMvc mockMvc;
    private ProjectService mockProjectService;

    @Test
    public void create_project() throws Exception {
        mockProjectService = mock(ProjectService.class);
        mockMvc = MockMvcBuilders.standaloneSetup(new ProjectController(mockProjectService)).build();
        mockMvc.perform(post("/projects/new"));
        verify(mockProjectService).createProject(any(Project.class));
    }

}
