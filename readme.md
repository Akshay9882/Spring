Using @Beans Scenario  
@Beans used along with @Configuration in the branch  

Let's consider I want specific implementation depending on some dynamic state. @Bean is perfect for that case.   
Example:  

    @Bean
    @Scope("prototype")
    public SomeService someService() {
        switch (state) {
        case 1:
            return new Impl1();
        case 2:
            return new Impl2();
        case 3:
            return new Impl3();
        default:
            return new Impl();
        }
    }
