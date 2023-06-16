package co.edu.org.cropscan.crosscutting.exception.utilidades; 

import java.sql.Time;
import java.time.LocalTime;

import static co.edu.org.cropscan.crosscutting.exception.utilidades.UtilObject.getDefaultIfNull;

public class UtilDate {

    public static final Time TIME = Time.valueOf(LocalTime.now());

    private UtilDate() {
        super();
    }

    public static final Time getDefaultTime(Time value, Time defaultValue) {
        return getDefaultIfNull(value, defaultValue);
    }

    public static final Time getDefaultTimeIfNull(Time value) {
        return getDefaultTime(value, TIME);
    }
}
