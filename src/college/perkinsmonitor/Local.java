package college.perkinsmonitor;

import java.io.File;

/**
 * Local is a Target already located on the user's computer. It is simply written to as if it were a standard file.
 * @author Nathaniel Pisarski
 */
public class Local extends Target {

    public Local(String service, String source, Configuration config) {
        setActionPath(service, config);
        this.sourceFile = source;
    }
}
