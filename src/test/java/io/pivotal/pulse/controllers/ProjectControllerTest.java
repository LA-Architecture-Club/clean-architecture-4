package io.pivotal.pulse.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import io.pivotal.pulse.controllers.ProjectController;
import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.dto.ProjectDTO;
import io.pivotal.pulse.services.ProjectService;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.*;
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
        ProjectDTO projectDTO = new ProjectDTO("new project", "AAAA");
        Gson gson = new Gson();

        mockMvc.perform(post("/projects/new")
        .contentType(MediaType.APPLICATION_JSON)
        .content(gson.toJson(projectDTO).toString()));

        ArgumentCaptor<Project> projectArgumentCaptor = ArgumentCaptor.forClass(Project.class);
        verify(mockProjectService).createProject(projectArgumentCaptor.capture());
        assertThat(projectArgumentCaptor.getValue(), is(notNull()));
    }

}
