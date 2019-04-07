package org.gzbpvi.xiaochengxv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("org.gzbpvi.xiaochengxv.dao")
public class XiaochengxvApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaochengxvApplication.class, args);
	}

}

