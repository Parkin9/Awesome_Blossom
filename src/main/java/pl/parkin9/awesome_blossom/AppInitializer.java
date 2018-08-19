package pl.parkin9.awesome_blossom;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext ctx) throws ServletException {

        AnnotationConfigWebApplicationContext webctx = new AnnotationConfigWebApplicationContext();
        webctx.register(AppConfig.class);
        webctx.setServletContext(ctx);
        ServletRegistration.Dynamic servlet = ctx.addServlet("dispacher", new DispatcherServlet(webctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
