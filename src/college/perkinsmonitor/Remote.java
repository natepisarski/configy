package college.perkinsmonitor;

/**
 * Remote is a Target where the origin file is not located on the user's computer. Rather, it's located on a website
 * or other remote resource. The file is downloaded to a local file of the same name as the remote, and the
 * resulting filepath is the Target's actionPath
 * @author Nathaniel Pisarski
 */
public class Remote extends Target {
    private String foreignAddress;

    public Remote(String service, String address, Configuration cfg)
    {
        foreignAddress = address;
        setActionPath(service, cfg);
        // Download file, catching exceptions, and set the source path equal to the path of the file
    }
}
