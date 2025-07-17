package th.co.internal.web.common.mainlib.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BaseException extends RuntimeException {

    private HttpStatus httpStatus;
    private String errorCode;
    private String errorTitle;
    private String errorDesc;
    private String errorMessage;
    private String suffixMsg;
    private Object additionalInfo;

    public BaseException(HttpStatus httpStatus, String errorCode, String errorDesc, String errorMessage) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.errorMessage = errorMessage;
    }

    public BaseException(HttpStatus httpStatus, String errorCode, String errorDesc, String errorMessage, String errorTitle) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.errorMessage = errorMessage;
        this.errorTitle = errorTitle;
    }

    public BaseException(HttpStatus httpStatus, String errorCode) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
    }

    public BaseException(HttpStatus httpStatus, String errorCode, String suffixMsg) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.suffixMsg = suffixMsg;
    }

    public BaseException(HttpStatus httpStatus, String errorCode, Object additionalInfo) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.additionalInfo = additionalInfo;
    }

    public String toString() {
        HttpStatus var10000 = this.getHttpStatus();
        return "BaseException(httpStatus=" + var10000 + ", errorCode=" + this.getErrorCode() + ", errorTitle=" + this.getErrorTitle() + ", errorDesc=" + this.getErrorDesc() + ", errorMessage=" + this.getErrorMessage() + ", suffixMsg=" + this.getSuffixMsg() + ", additionalInfo=" + this.getAdditionalInfo() + ")";
    }

}
