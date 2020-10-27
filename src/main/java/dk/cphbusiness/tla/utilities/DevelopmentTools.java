package dk.cphbusiness.tla.utilities;

public class DevelopmentTools {

    public static UnsupportedOperationException TODO(String message) {
        var traces = new Throwable().getStackTrace();
        return new UnsupportedOperationException(message+"\n"+traces[1]);
        }

    public static UnsupportedOperationException TODO() { return TODO("Implement"); }

    }
