package pro.onlyou.springmvc.annotation;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 取消web.xml
 * 使用注解初始化我们的web应用
 * - AbstractAnnotationConfigDispatcherServletInitializer
 */

public class AnnotatedWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * spring ioc配置
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        /*可以返回Spring的Java配置文件数组*/
        return new Class[0];
    }

    /**
     * DispatcherServlet的配置
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    /**
     * 拦截内容
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
