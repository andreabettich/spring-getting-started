package ch.interdiscount.knowhow.springgettingstarted.web.errorhandler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class EasyApiError {

    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

    private EasyApiError(){
        this.timestamp = LocalDateTime.now();
    }

    public EasyApiError(final String message){
        this();
        this.message = message;
    }

}
