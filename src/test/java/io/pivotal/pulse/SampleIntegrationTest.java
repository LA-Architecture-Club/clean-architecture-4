//package io.pivotal.pulse;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.nullValue;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
///**
// * An example of how one can test Spring Web MVC application from the controller, all the way down.
// *
// * See also:
// * http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/htmlsingle/#spring-mvc-test-server
// *
// * Test matchers provided by "Hamcrest" (by way of Spring Boot):
// * https://code.google.com/p/hamcrest/wiki/Tutorial
// * http://hamcrest.org/JavaHamcrest/javadoc/
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = CleanPulseApplication.class)
//@WebAppConfiguration
//public class SampleIntegrationTest {
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    public void test_that_a_page_contains_content() throws Exception {
//        MvcResult mvcResult = mockMvc.perform(get("/the-url"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Thing Two"))) // ... using response matchers from Spring
//                .andReturn();
//
//        // ... or dig into the result.
//        assertThat(mvcResult.getResolvedException(), is(nullValue()));
//    }
//}
