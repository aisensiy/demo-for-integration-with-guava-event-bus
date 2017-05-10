package com.example;

import com.example.domain.event.GlobalEventBus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoForSpringBootWithEventBusApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(GlobalEventBus.get(), notNullValue());
	}

}
