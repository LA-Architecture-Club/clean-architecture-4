package io.pivotal.whiteboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * A Spring MVC Controller
 *
 * see also:
 * http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/htmlsingle/#mvc-controller
 */
@Controller
public class SampleController {
    private SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("/the-url")
    public String someIntentionRevealingMethodName(Model theViewsModel) {
        List<String> things = new ArrayList<>();

        things.add("Thing One");
        things.add("Thing Two");
        things.add("Thing Red");
        things.add("Thing Blue");

        theViewsModel.addAttribute("allTheThings", things);
        sampleService.causeSomeSideEffect();
        return "path/relative-from-resources/to-the-template/hello-world";
    }
}
