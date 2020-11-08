# B-spring-ioc-container-homework
Problem 1

主观题：
@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

答案：@Bean注解的主体是方法，而@Component注解的主体是类。
     当使用第三方的类时，需要用@Bean注解。
     @Component注解会在Spring的Application类运行时被Ioc容器扫描，并进行实例化。
     @Bean是在配置中显式声明单个Bean，举例说明：
     
     
     1. @Component：
     @Component //定义bean 交由Spring Ioc控制
     public Class JavaBean {
     }
     
     @Autowired
     JavaBean javaBean； //to get bean
     
     总结：简化了实例化和使用该类的所有配置，交给Spring的Ioc进行管理，无须手动new
     
     2. @Bean:
     @Configuration
     public Class MyConfiguration {
        @Bean
        public OtherBean getOtherBean() {
            return new OtherBean();
        }
     }
     
     //to get bean
     OtherBean otherBean = applicationContext.getBean("getOtherBean");
     
     总结：将getOtherBean方法作为一个外包的Bean类来使用，在该"Bean"中手动new了。
     
