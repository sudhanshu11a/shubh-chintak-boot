/**
 * 
 */
package org.shubhchintak.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author sudhanshusharma
 *
 */
@SpringBootApplication
@ComponentScan("org.shubhchintak")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
