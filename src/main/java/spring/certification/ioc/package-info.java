/**
 * Spring v5.0 Professional Certification.
 * <p>
 * Table of contents:<br>
 * 1. What is dependency injection and what are the advantages? {@link spring.certification.ioc.Q001 link}<br>
 * 2.1. What is a pattern? {@link spring.certification.ioc.Q002 link}<br>
 * 2.2. What is an anti-pattern? {@link spring.certification.ioc.Q002 link}<br>
 * 2.3. Is dependency injection a pattern? {@link spring.certification.ioc.Q002 link}<br>
 * 3.1. What is an interface and what are the advantages of making use of them in Java?
 * {@link spring.certification.ioc.Q003 link}<br>
 * 3.2. Why are they recommended for Spring beans? {@link spring.certification.ioc.Q003 link}<br>
 * 4. What is meant by 'application-context'? {@link spring.certification.ioc.Q004 link}<br>
 * 5. What is the concept of a 'container' and what is its lifecycle? {@link spring.certification.ioc.Q005 link}<br>
 * 6. How are you going to create a new instance of an ApplicationContext? {@link spring.certification.ioc.Q006 link}<br>
 * 7. Can you describe the lifecycle of a Spring Bean in an ApplicationContext?<br>
 * 8. How are you going to create an ApplicationContext in an integration test?<br>
 * 9.1. What is the preferred way to close an application context?<br>
 * 9.2. Does Spring Boot close application context for you?<br>
 * 10. Describe dependency injection using Java configuration. {@link spring.certification.ioc.Q010 link}<br>
 * 11. Describe dependency injection using annotations (@Component, @Autowired).<br>
 * 12.1. Describe component-scanning.<br>
 * 12.2. Describe stereotypes.<br>
 * 12.3. Describe meta-annotations.<br>
 * 13. Describe scopes for Spring beans. What is the default scope? {@link spring.certification.ioc.Q013 link}<br>
 * 14. Are beans lazily of eagerly instantiated by default? How do you alter this behaviour?
 * {@link spring.certification.ioc.Q014 link}<br>
 * 15. What is a property source? How would you use @PropertySource annotation?<br>
 * 16.1. What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?
 * {@link spring.certification.ioc.Q016 link}<br>
 * 16.2. Why would you define a static @Bean method? {@link spring.certification.ioc.Q016 link}<br>
 * 16.3. What is a PropertySourcePlaceholderConfigurer used for? {@link spring.certification.ioc.Q016 link}<br>
 * 17. What is a BeanPostProcessor and how is it different to a BeanFactoryPostProcessor? What both of them do? When
 * are they called? {@link spring.certification.ioc.Q017 link}<br>
 * 18. What is an initialization method and how is it declared on a Spring bean?<br>
 * 19.1. What is a destroy method, how is it declared and when is it called?<br>
 * 19.2. Consider how you enable JSR-250 annotations like @PostConstruct and @PreDestroy? When/how will they get
 * called?<br>
 * 19.3. How else can you define an initialization or destruction method for a Spring bean?<br>
 * 20. What does component-scanning do?<br>
 * 21. What is the behavior of the annotation @Autowired with regards to field injection, constructor injection and
 * method injection?<br>
 * 22. What do you have to do, if you would like to inject something into a private field? Ho does  this impact
 * testing?<br>
 * 23. How does the @Qualifier annotation complement the use of @Autowired?<br>
 * 24.1. What is a proxy object and what are the two different types of proxies Spring can create?<br>
 * 24.2. What are the limitations of these proxies (per type)?<br>
 * 24.3. What is the power of a proxy object and where are the disadvantages?<br>
 * 25. What are the advantages of Java Config? What are the limitations? {@link spring.certification.ioc.Q025 link}<br>
 * 26. What does the @Bean annotation do? {@link spring.certification.ioc.Q026 link}<br>
 * 27. What is the default bean id if you only use @Bean? How can you override this?
 * {@link spring.certification.ioc.Q027 link}<br>
 * 28.1. Why are you not allowed to annotate a final class with @Configuration?
 * {@link spring.certification.ioc.Q028 link}<br>
 * 28.2. How do @Configuration annotated classes support singleton beans? {@link spring.certification.ioc.Q028 link}<br>
 * 28.3. Why can’t @Bean methods be final either? {@link spring.certification.ioc.Q028 link}<br>
 * 29.1. How do you configure profiles? {@link spring.certification.ioc.Q029 link}<br>
 * 29.2. What are possible use cases where they might be useful? {@link spring.certification.ioc.Q029 link}<br>
 * 30. Can you use @Bean together with @Profile? {@link spring.certification.ioc.Q030 link}<br>
 * 31. Can you use @Component together with @Profile? {@link spring.certification.ioc.Q031 link}<br>
 * 32. How many profiles can you have? {@link spring.certification.ioc.Q032 link}<br>
 * 33. How do you inject scalar/literal values into Spring beans?<br>
 * 34. What is @Value used for?<br>
 * 35. What is Spring Expression Language (SpEL for short)?<br>
 * 36. What is the Environment abstraction in Spring? {@link spring.certification.ioc.Q036 link}<br>
 * 37. Where can properties in the environment come from?<br>
 * 38. What can you reference using SpEL?<br>
 * 39. What is the difference between $ and # in @Value expressions?
 *
 * @author Valentine Shemyako
 * @since November 17, 2018
 */
package spring.certification.ioc;