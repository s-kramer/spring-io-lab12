package io.spring.lab.warehouse;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class WarehouseApplicationTest extends SpringTestBase {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		assertThat(applicationContext).isNotNull();
	}
}
