package org.springframework.samples.mvc.simple;

import com.github.inspektr.audit.annotation.Audit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class SimpleController {

    @Inject
    private SimpleService simpleService;

	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return this.simpleService.getSomeStringValue();
	}

}
