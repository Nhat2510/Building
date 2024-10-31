package com.tuannhat.Identify_service.controllerAdvice;

import com.tuannhat.Identify_service.model.ErrorResponseDTO;
import com.tuannhat.Identify_service.customException.FieldRequiredException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;



@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handleArithmeticExpception(
            ArithmeticException ex, WebRequest request) {

        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setError(ex.getMessage());
        List<String> detail = new ArrayList<>();
        detail.add("Không thể chia cho 0");
        errorResponseDTO.setDetails(detail);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(FieldRequiredException.class)
    public ResponseEntity<Object> handleFieldRequiredException(
            FieldRequiredException ex, WebRequest request) {

        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setError(ex.getMessage());
        List<String> detail = new ArrayList<>();
        detail.add("Check name and Age is null");
        errorResponseDTO.setDetails(detail);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_GATEWAY);
    }
}
