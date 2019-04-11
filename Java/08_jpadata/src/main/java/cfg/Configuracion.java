package cfg;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//https://www.baeldung.com/the-persistence-layer-with-spring-and-jpa
@Configuration
@EnableJpaRepositories(basePackages= {"modelo.persistencia"})
@ComponentScan(basePackages = { "modelo" })
@EnableTransactionManagement
public class Configuracion {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://172.10.5.5:3306/jpa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean 
		entityManagerFactory(DataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = 
			new LocalContainerEntityManagerFactoryBean();
		//metemos el datasource
		entityManagerFactoryBean.setDataSource(dataSource);
		//deicmos al entitymanager que vamos a usar hibernate
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//decimos donde tenemos que buscar las entidades
		entityManagerFactoryBean.setPackagesToScan("modelo.entidades");
		
		//configuramos jpa con unas entidades que dependen del fabricante
		//en este caso hibernate
		Properties jpaProperties = new Properties();
		//dialecto: distitnas versiones de los fabricantes del sql estandar
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		//genera automaticamente todo el esquema relacional de nuestra bbdd
		
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");//create-drop update
		jpaProperties.put("hibernate.show_sql", "true");
		jpaProperties.put("hibernate.format_sql", "false");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);

		return entityManagerFactoryBean;
	}
	
	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
}

