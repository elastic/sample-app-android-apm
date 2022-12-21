package co.elastic.apm.android.sample.backend;

import co.elastic.apm.attach.ElasticApmAttacher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(BackendApplication.class, args);
	}

}
