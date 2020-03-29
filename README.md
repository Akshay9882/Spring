Using @Autowired for Dependency Injections.

Your Spring application will contain several classes. Few of them are regular Java classes and few would be Spring managed components. Spring managed components are those classes that will be instantiated, and managed by Spring.

You annotate such classes, based on what they do as @Component/@Controller/ @Service/@Repository. Another special Spring managed component is Spring Bean. We create and return a Spring Bean from a method marked as @Bean. These @Bean methods that creates Spring Beans are part of a special configuration class, marked as @Configuration.

Whenever your application code requires a Spring managed component, it won’t create it using new operator. Instead it will ask for the dependency from Spring.

To ask for the dependency, you use the @Autowired annotation wherever you declare the dependency in your application code. The @Autowired annotation basically says “Hey Spring!! Please inject the dependency here at this point” . At runtime, Spring will inject the dependency as specified.

At runtime, the following things happen.

Spring creates an ApplicationContext (Think of it as a bucket to hold all Spring Managed objects) and starts scanning your project for Spring Managed Components.

Creates objects of the Spring Managed Components and adds it to the ApplicationContext.

Injects the appropriate Spring Managed Component into your application code wherever you indicated via @Autowiring.



Your application code, can now call methods of the Spring Managed Component and use it
