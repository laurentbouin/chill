package io.github.laurentbouin.chill;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Chill {

	public static void main(String[] args) {
		SpringApplication.run(Chill.class, args);
	}
}
