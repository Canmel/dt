package com.gwkj.dt;

import com.gwkj.dt.service.db1.UserDb1Service;
import com.gwkj.dt.service.db2.UserDb2Service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = "com.gwkj.dt.mapper.db1")
public class DtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        System.out.println("启动完成");
	}
}

