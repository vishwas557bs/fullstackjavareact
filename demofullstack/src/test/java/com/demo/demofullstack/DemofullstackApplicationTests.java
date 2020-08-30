package com.demo.demofullstack;

import com.demo.demofullstack.dto.Project;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
class DemofullstackApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void whenBlankName_thenOneConstraintViolation() {
		Project project = new Project();
		project.setProjectName("");
	}

}
