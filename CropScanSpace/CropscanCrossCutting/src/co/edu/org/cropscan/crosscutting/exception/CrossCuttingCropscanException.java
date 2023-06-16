package co.edu.org.cropscan.crosscutting.exception;

import co.edu.org.cropscan.crosscutting.exception.nom.ExceptionLocation;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilText.EMPTY;

public class CrossCuttingCropscanException extends CropscanCropscanException{
    private CrossCuttingCropscanException(Exception rootException, String technicalMessage, String userMessage) {
        super(rootException, technicalMessage, userMessage, ExceptionLocation.CROSS_CUTTING);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage) {
        return new CrossCuttingCropscanException(new Exception(), technicalMessage, userMessage);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage,
                                                         final Exception rootException) {
        return new CrossCuttingCropscanException(rootException, technicalMessage, userMessage);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage) {
        return new CrossCuttingCropscanException(new Exception(), technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage, final Exception rootException) {
        return new CrossCuttingCropscanException(rootException, technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createUserException(final String userMessage, final Exception rootException) {
        return new CrossCuttingCropscanException(rootException, userMessage, userMessage);
    }
}