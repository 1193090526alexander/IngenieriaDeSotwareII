package co.edu.org.cropscan.crosscutting.exception;

import co.edu.org.cropscan.crosscutting.exception.nom.ExceptionLocation;

public class ApiCropscanException extends CropscanCropscanException{
    private ApiCropscanException(Exception rootException, String technicalMessage, String userMessage) {
        super(rootException, technicalMessage, userMessage, ExceptionLocation.API);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage) {
        return new ApiCropscanException(new Exception(), technicalMessage, userMessage);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage,
                                                         final Exception rootException) {
        return new ApiCropscanException(rootException, technicalMessage, userMessage);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage) {
        return new ApiCropscanException(new Exception(), technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage, final Exception rootException) {
        return new ApiCropscanException(rootException, technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createUserException(final String userMessage, final Exception rootException) {
        return new ApiCropscanException(rootException, userMessage, userMessage);
    }
}
