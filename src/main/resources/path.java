Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2023-10-21T16:02:41.610-03:00 ERROR 2144 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'javax.persistence.jdbc.url', 'hibernate.connection.url', or 'hibernate.dialect')
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1166) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:940) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:616) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at com.projetos.comercinho.ComercinhoApplication.main(ComercinhoApplication.java:10) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.1.5.jar:3.1.5]
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'javax.persistence.jdbc.url', 'hibernate.connection.url', or 'hibernate.dialect')
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:277) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:231) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:199) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:169) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1383) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1454) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.0.13.jar:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.13.jar:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.13.jar:6.0.13]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.13.jar:6.0.13]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1817) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.13.jar:6.0.13]
	... 21 common frames omitted
Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'javax.persistence.jdbc.url', 'hibernate.connection.url', or 'hibernate.dialect')
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:190) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:86) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:229) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:381) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:193) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:69) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264) ~[hibernate-core-6.2.13.Final.jar:6.2.13.Final]
	... 36 common frames omitted