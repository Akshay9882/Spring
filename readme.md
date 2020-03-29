1.When profiles are not specified in the application.properties the annotation  
     `@Profile("default")` will get called  
     
2.Also a default profile can be named in this way  
     `@Profile({"default","English"})`  
In application.properties when `spring.profiles.active=english` is mentioned the `English` profile will get called.
    
    
