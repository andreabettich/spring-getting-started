package ch.interdiscount.knowhow.springgettingstarted.web.errorhandler;

public class EasyPeasyException extends Exception {
    public EasyPeasyException(final String message){
        super(message);
    }
}
