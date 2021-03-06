/*******************************************************************************
 * <pre>
 *
 * File          : com.tm.timesheet.web.rest.errors.TimesheetNotExistExceptionTranslator.java
 * Author        : Antony Ashok A
 * Date Created  : Mar 11, 2017
 * 
 * Warning: Unauthorized reproduction or distribution of this program,
 * or any portion of it, may result in severe civil and criminal penalties,
 * and will be prosecuted to the maximum extent possible under the law.
 * 
 * </pre>
 *******************************************************************************/
package com.tm.timesheet.web.rest.errors;

import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tm.commonapi.web.rest.errors.ErrorVM;
import com.tm.timesheet.exception.TimesheetNotExistException;

@ControllerAdvice
public class TimesheetNotExistExceptionTranslator {
  
  private MessageSourceAccessor accessor;

  private static final String WORKED_HOURS_EXCEED = "timesheet.not.exist";

  public TimesheetNotExistExceptionTranslator(MessageSource messageSource) {
      accessor = new MessageSourceAccessor(messageSource);
  }
  
  @ExceptionHandler(TimesheetNotExistException.class)
  public ResponseEntity<ErrorVM> processException(TimesheetNotExistException ex) {
    Object[] params = new Object[]{ex.getMessage()};
		BodyBuilder builder = ResponseEntity.status(HttpStatus.BAD_REQUEST);
		ErrorVM errorVM = new ErrorVM(WORKED_HOURS_EXCEED,
				accessor.getMessage(WORKED_HOURS_EXCEED, params));
		return builder.body(errorVM);
  }

}
