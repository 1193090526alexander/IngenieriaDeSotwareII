package co.edu.org.cropscan.crosscutting.exception;

import co.edu.org.cropscan.crosscutting.exception.nom.ExceptionLocation;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilText.EMPTY;

public class ServiceCropscanException extends CropscanCropscanException{
    private ServiceCropscanException(Exception rootException, String technicalMessage, String userMessage) {
        super(rootException, technicalMessage, userMessage, ExceptionLocation.SERVICE);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage) {
        return new ServiceCropscanException(new Exception(), technicalMessage, userMessage);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage,
                                                       final Exception rootException) {
        return new ServiceCropscanException(rootException, technicalMessage, userMessage);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage) {
        return new ServiceCropscanException(new Exception(), technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage, final Exception rootException) {
        return new ServiceCropscanException(rootException, technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createUserException(final String userMessage) {
        return new ServiceCropscanException(null, userMessage,userMessage);
    }
}
