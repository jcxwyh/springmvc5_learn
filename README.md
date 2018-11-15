# Spring MVC
- `DispatcherServlet`
#### 步骤
> - `DispatcherServlet`:
> - `HandlerMapping`:
> - `HandlerAdapter`:
> - `ModelAndView`:
> - `ViewResolver`:
> - `View`:
#### Resolver
> - `ViewResolver`
> - `MultipartResolver`
> - `LocaleResolver`
> - `ThemeResolver`
> - `HandlerExceptionResolver`

####　动态加载Servlet
`since servlet 3.0`
> - 按照规范需要实现`ServletContainerInitializer`接口(Spring自己实现了一个 Spring按照规范需要实现`ServletContainerInitializer`)
> - 

#### 基于注解的web启动
> - `AbstractAnnotationConfigDispatcherServletInitializer`
> - `SpringServletContainerInitializer`:
> - `WebApplicationInitializer`:
> - `@EnableWebMvc`
> - 

####　传递参数
> - `POJO`:
> - `@RequestParam`
> - `@PathVariable`
> - `@RequestBody`:接受json参数
> - `@RequestAttribute`
> - `@SessionAttribute`
> - `@SessionAttributes`
> - `@CookieValue`
> - `@RequestHeader`

#### 重定向
> - "redirect:..."
> - 
- 传递参数
> `RedirectAttributes`

#### 拦截器
> - 实现`HandlerInterceptor`
```xml
<mvc:interceptors>
    <mvc:interceptor>
        <mvc:mapping path=""/>
        <bean class="InterceptorBean"/>
    </mvc:interceptor>
</mvc:interceptors>
```
- 执行顺序

#### 验证表单
- validation-api.jar
- hibernate-validator.jar
> - classmate.jar
> - jboss-logging.jar
- - -
> JSR303注解验证
- @Null
- @NotNull
- @AssertTrue
- @AssertFalse
- @Min
- @Max
- @DecimalMin
- @DecimalMax
- @Size
- @Digits
- @Past
- @Future
- @Pattern
> @Valid
> - Validator接口

#### 文件上传
- CommonsMultipartResolver:需要依赖于apache的commons-fileupload,各个版本适用
- StandardServletMultipartResolver:servlet3.1之后适用
> - Part
> - MultipartFile

#### 消息转换
- `HttpMessageConverter`
- `FormattingConversionServiceFactoryBean`
- `DefaultFormattingConversionService`
- `ConversionService`
- `ConverterRegistry`
- `FormatterRegistry`

> `HttpMessageConverter`和json消息转换器
- `MappingJackson2HttpMessageConverter`
> 一对一转换`Converter`
> 集合转换器`GenericConverter`

#### 国际化
> `DispatcherServlet`会解析一个`LocaleResolver`,通过他决定用户区域
- `LocaleChangeInterceptor`
- `MessageSource`

> 配置MessageSource
> - `StaticMessageResource`:用的不多
> - `DelegatingMessageSource`:用的不多
> - `ResourceBundleMessageSource`
> - `ReloadableResourceBundleMessageSource`
> 配置LocaleResolver
> - `CookieLocaleResolver`
> - `SessionLocaleResolver`
> 配置`LocaleChangeInterceptor`
