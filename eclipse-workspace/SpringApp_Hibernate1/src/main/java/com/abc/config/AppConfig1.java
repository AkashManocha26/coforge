package com.abc.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.AvailableSettings;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.orm.hibernate5.HibernateTransactionManager;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.abc.dao.ProductDao;

import com.abc.dao.ProductDaoImpl;

import com.abc.dao.ProductDaoImpl1;

import com.abc.model.Product;

import com.zaxxer.hikari.HikariDataSource;

import lombok.Data;

@Configuration

@EnableTransactionManagement

public class AppConfig1 {

    @Bean

    public DataSource getDataSource() {

        HikariDataSource dataSource = new HikariDataSource();

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db2");

        dataSource.setUsername("root");

        dataSource.setPassword("mysql");

        dataSource.setMinimumIdle(10);

        dataSource.setMaximumPoolSize(100);

        return dataSource;

    }

    @Bean

    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory factory) {

        return new HibernateTransactionManager(factory);

    }

    @Bean

    public ProductDao getProductDaoImpl(SessionFactory factory) {

        ProductDao daoImpl = new ProductDaoImpl1(factory);

        return daoImpl;

    }

    @Bean

    public LocalSessionFactoryBean getFactoryBean() {

        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();

        bean.setHibernateProperties(getProperty());

        bean.setAnnotatedClasses(Product.class);

        bean.setDataSource(getDataSource());

        return bean;

    }

    @Bean

    public Properties getProperty() {

        Properties properties = new Properties();

        properties.setProperty(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

        properties.setProperty(AvailableSettings.SHOW_SQL, "true");

        // properties.setProperty(AvailableSettings.HBM2DDL_AUTO, "create");

        return properties;

    }

}









































































