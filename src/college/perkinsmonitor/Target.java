package college.perkinsmonitor;

/**
 * Target represents a file, remote or local, which can be used written to.
 * The append, create, and overwrite methods are the only ones which need to be overriden normal
 * @author Nathaniel Pisarski
 */
public abstract class Target
{
    protected String actionPath;
    protected String sourceFile;

    public void setActionPath(String service, Configuration config) {
        actionPath = config.getSetting(
                service,
                "filename"
        );
    }

    protected void append() {
        // Code for simply appending the actionFile with sourceFile
    }

    protected void create() {
        // Code for creating the configuration file if there isn't one
    }

    protected void overwrite() {
        // Code for overwriting the file with sourceFile
    }

    public void write(WritableType type) {
        switch(type) {
            case Append:
                append();
            case Create:
                create();
            case Overwrite:
                overwrite();
        }
    }

    public void rename(String newName) {
        // Renames the file
    }
}
