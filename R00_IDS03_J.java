import java.util.logging.Logger;

public class R00_IDS03_J {

    Logger sanLogger = new SanitizedTextLogger(logger);
    if (login Successful) {
        sanlogger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
        sanlogger.severe("User login failed for: " + sanitizeUser(username));
        }
        
        public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9]+", username)) ? username: "unauthorized user";
        }
}
        