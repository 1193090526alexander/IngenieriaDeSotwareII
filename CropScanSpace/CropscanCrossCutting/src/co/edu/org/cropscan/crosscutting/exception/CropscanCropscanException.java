package co.edu.org.cropscan.crosscutting.exception;

import co.edu.org.cropscan.crosscutting.exception.nom.ExceptionLocation;

import java.io.Serial;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilObject.getDefaultIfNull;
import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilText.applyTrim;
import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilText.isEmpty;

public class CropscanCropscanException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -1248346293196099172L;
    private String userMessage;
    private ExceptionLocation layer;

    protected CropscanCropscanException(final Exception rootException, final String technicalMessage, final String userMessage, final ExceptionLocation layer) {
        super(applyTrim(technicalMessage),getDefaultIfNull(rootException, new Exception()));
        setUserMessage(userMessage);
        setLayer(layer);
    }

    public final String getUserMessage() {
        return userMessage;
    }

    private final void setUserMessage(final String userMessage) {
        this.userMessage = applyTrim(userMessage);
    }

    public final ExceptionLocation getLayer() {
        return layer;
    }

    private final void setLayer(final ExceptionLocation layer) {
        this.layer = getDefaultIfNull(layer, ExceptionLocation.SERVICE);
    }

    public final boolean isTechnicalException() {
        return isEmpty(getUserMessage());
    }
}
