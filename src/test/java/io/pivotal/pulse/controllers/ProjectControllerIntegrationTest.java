package io.pivotal.pulse.controllers;

import com.google.gson.Gson;
import io.pivotal.pulse.CleanPulseApplication;
import io.pivotal.pulse.domain.Project;
import io.pivotal.pulse.dto.ProjectDTO;
import io.pivotal.pulse.services.ProjectService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.inject.Inject;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CleanPulseApplication.class)
@WebAppConfiguration
public class ProjectControllerIntegrationTest {

    @Inject private ProjectService projectService;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ProjectController(projectService)).build();
    }

    @Test
    public void create_whenCallsWithNewProjectObject_thenSavesProject() throws Exception {
        Random random = new Random();
        ProjectDTO projectDTO = new ProjectDTO("new project"+random.nextLong(), "AA"+random.nextInt());
        Gson gson = new Gson();

        mockMvc.perform(post("/projects/new")
            .contentType(MediaType.APPLICATION_JSON)
            .content(gson.toJson(projectDTO).toString()))
            .andExpect(status().isOk());
    }
}
