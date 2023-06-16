package co.edu.org.cropscan.crosscutting.exception;

import co.edu.org.cropscan.crosscutting.exception.nom.ExceptionLocation;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilText.EMPTY;

public class RepositoryCropscanException extends CropscanCropscanException{
    private RepositoryCropscanException(Exception rootException, String technicalMessage, String userMessage) {
        super(rootException, technicalMessage, userMessage, ExceptionLocation.REPOSITORY);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage) {
        return new RepositoryCropscanException(new Exception(), technicalMessage, userMessage);
    }

    public static final CropscanCropscanException create(final String userMessage, final String technicalMessage,
                                                       final Exception rootException) {
        return new RepositoryCropscanException(rootException, technicalMessage, userMessage);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage) {
        return new RepositoryCropscanException(new Exception(), technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createTechnicalException(final String technicalMessage, final Exception rootException) {
        return new RepositoryCropscanException(rootException, technicalMessage,EMPTY);
    }

    public static final CropscanCropscanException createUserException(final String userMessage, final Exception rootException) {
        return new RepositoryCropscanException(rootException, userMessage, userMessage);
    }
}