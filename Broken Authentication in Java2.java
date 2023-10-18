//cwe287
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .antMatchers(HttpMethod.GET, "/", "/index.html", "/css/**", "/js/**").permitAll()
            .antMatchers(HttpMethod.GET, "/admin/other-action").authenticated();

        // ...
    }