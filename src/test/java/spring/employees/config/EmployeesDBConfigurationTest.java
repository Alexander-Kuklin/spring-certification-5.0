package spring.employees.config;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Verifies that {@link javax.sql.DataSource} bean is configured correctly and indeed allows to access db data.
 */
public class EmployeesDBConfigurationTest {

    private AnnotationConfigApplicationContext context;

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(EmployeesDBConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    public void shouldConstructDatasource() {
        DataSource dataSource = context.getBean(DataSource.class);
        Assert.assertNotNull(dataSource);
    }

    @Test
    public void shouldConstructJdbcTemplate() {
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        Assert.assertNotNull(jdbcTemplate);
    }

    @Test
    public void shouldSucceedToConnectToDatabase() {
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        jdbcTemplate.execute("SELECT version()");
    }
}