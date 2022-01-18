package com.example.web.config;


/** Похоже можно обойтись и без этого класса
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
//
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.filter.HiddenHttpMethodFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import javax.servlet.DispatcherType;
//import javax.servlet.FilterRegistration;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import java.util.EnumSet;
//
//public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        //return new Class[] { HibernateConfig.class };
//        return null;
//    }
//
//
//    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{
//                WebConfig.class
//        };
//    }
//
//    /* Данный метод указывает url, на котором будет базироваться приложение */
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    @Override
//    public void onStartup(ServletContext aServletContext) throws ServletException {
//        super.onStartup(aServletContext);
//        registerHiddenFieldFilter(aServletContext);
//    }
//
//    private void registerHiddenFieldFilter(ServletContext aContext) {
//        aContext.addFilter("hiddenHttpMethodFilter",
//                new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*");
//    }
//
//    private void registerCharacterEncodingFilter(ServletContext aContext) {
//        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
//
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//
//        FilterRegistration.Dynamic characterEncoding = aContext.addFilter("characterEncoding", characterEncodingFilter);
//        characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
//    }
//
//}