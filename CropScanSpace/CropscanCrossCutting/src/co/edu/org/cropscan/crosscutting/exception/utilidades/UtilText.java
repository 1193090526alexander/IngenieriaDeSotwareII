package co.edu.org.cropscan.crosscutting.exception.utilidades;

import java.util.Objects;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilObject.getDefaultIfNull;

public class UtilText {

    public static final String EMPTY = "";

    private UtilText() {
        super();
    }

    public static final String getDefaultString(String value, String defaultValue) {
        return getDefaultIfNull(value, defaultValue);
    }

    public static final String getDefaultString(String value) {
        return getDefaultString(value, EMPTY);
    }

    public static final String applyTrim(String value) {
        return getDefaultString(value).trim();
    }

    public static final boolean isEmpty(String value) {
        return Objects.equals(value, EMPTY);
    }
    public static boolean isNull(String value) {
        return UtilObject.isNull(value);
    }
}
