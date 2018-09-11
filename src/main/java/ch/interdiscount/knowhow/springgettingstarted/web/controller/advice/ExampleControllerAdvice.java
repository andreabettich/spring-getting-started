package ch.interdiscount.knowhow.springgettingstarted.web.controller.advice;

import ch.interdiscount.knowhow.springgettingstarted.web.errorhandler.EasyApiError;
import ch.interdiscount.knowhow.springgettingstarted.web.errorhandler.EasyPeasyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * More Infos here
 * https://docs.spring.io/spring-framework/docs/5.1.0.BUILD-SNAPSHOT/javadoc-api/org/springframework/web/bind/annotation/ControllerAdvice.html
 * https://www.toptal.com/java/spring-boot-rest-api-error-handling
 */
@RestControllerAdvice(annotations = RestController.class)
public class ExampleControllerAdvice {

    @ExceptionHandler({EasyPeasyException.class})
    public EasyApiError errorHandler(final Exception e) {
        final EasyApiError easyApiError = new EasyApiError(e.getMessage());
        return easyApiError;
    }
}