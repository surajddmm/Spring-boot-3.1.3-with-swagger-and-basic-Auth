# Spring-boot-3.1.3-with-OPEN API 3-and-basic-Auth
This Is an spring boot 3.1.3 project and integrate swagger open api 3.1.0 with InMemory Basic Auth

1 . Add Spring doc web mvc dependancy https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui

2 . Enable Swagger UI and path . 
Add below properties into application.properties

        springdoc.swagger-ui.enabled=true
        springdoc.api-docs.enabled=true
        springdoc.api-docs.path=/docs
        springdoc.swagger-ui.path=/docs/openapi.html

3. Permit access to specific swagger URL in security filter chain

        @Bean
        SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                .authorizeHttpRequests((authorize) -> {
                    authorize.requestMatchers("/docs/**").permitAll();
                    authorize.anyRequest().authenticated();
                }).httpBasic(Customizer.withDefaults());
          return http.build();
       }

4 . Swagger UI 

![swagger](https://github.com/surajddmm/Spring-boot-3.1.3-with-swagger-and-basic-Auth/assets/143600381/67960f44-554c-45ba-97a0-5ecb7e535960)


5 . testing with postman



![basicAuth-401](https://github.com/surajddmm/Spring-boot-3.1.3-with-swagger-and-basic-Auth/assets/143600381/3350e7bf-03a7-4108-92f7-692b61c1d083)

![basicAuth](https://github.com/surajddmm/Spring-boot-3.1.3-with-swagger-and-basic-Auth/assets/143600381/0044eb87-4806-444d-ac96-8030bcf28563)






