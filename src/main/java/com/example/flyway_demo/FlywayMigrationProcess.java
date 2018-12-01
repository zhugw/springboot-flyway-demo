package com.example.flyway_demo;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * 注意： Spring boot 默认集成了flyway 故不需要显式执行
 * 参考文档：https://flywaydb.org/documentation/plugins/springboot
 * @author zhuguowei
 * @date 2018-12-01
 */
//@Component
public class FlywayMigrationProcess {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;
    @PostConstruct
    public void migration() {
        // Create the Flyway instance and point it to the database
        Flyway flyway = Flyway.configure().dataSource(url, user, password).load();
        // Start the migration
        flyway.migrate();
    }


}
