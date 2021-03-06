/*
 * package com.anshu.RestServices.Exception;
 * 
 * import java.util.Date;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.bind.annotation.RestControllerAdvice; import
 * org.springframework.web.client.HttpClientErrorException.MethodNotAllowed;
 * import org.springframework.web.context.request.WebRequest; import
 * org.springframework.web.server.MethodNotAllowedException; import
 * org.springframework.web.servlet.mvc.method.annotation.
 * ResponseEntityExceptionHandler;
 * 
 * import com.anshu.RestServices.UserNotFoundException;
 * 
 * 
 * @RestController
 * 
 * @RestControllerAdvice public class CustomizedResponseEntityExceptionHandler
 * extends ResponseEntityExceptionHandler {
 * 
 * @ExceptionHandler(Exception.class) public final ResponseEntity<Object>
 * handleAllExceptions(Exception ex, WebRequest request) throws Exception {
 * 
 * ExceptionResponse exceptionResponse=new ExceptionResponse(new Date() ,
 * ex.getMessage() , request.getDescription(false));
 * 
 * return new
 * ResponseEntity(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
 * 
 * 
 * 
 * }
 * 
 * @ExceptionHandler(UserNotFoundException.class) public final
 * ResponseEntity<Object> handleAllUserNotFoundExceptions(UserNotFoundException
 * ex, WebRequest request) throws Exception {
 * 
 * ExceptionResponse exceptionResponse=new ExceptionResponse(new Date() ,
 * ex.getMessage() , request.getDescription(false));
 * 
 * return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
 * 
 * 
 * }
 * 
 * @ExceptionHandler(MethodNotAllowedException.class) public final
 * ResponseEntity<Object>
 * handleMethodNotAllowedExceptions(MethodNotAllowedException ex, WebRequest
 * request) throws Exception {
 * 
 * ExceptionResponse exceptionResponse=new ExceptionResponse(new Date() ,
 * ex.getMessage() , request.getDescription(false));
 * 
 * return new ResponseEntity(exceptionResponse,HttpStatus.METHOD_NOT_ALLOWED);
 * 
 * 
 * }
 * 
 * 
 * }
 */