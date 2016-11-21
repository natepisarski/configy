package college.perkinsmonitor;

/**
 * Writable objects can be written to a Target. These also contain a bit of information about
 * what should be written.
 * @author Nathaniel Pisarski
 */
public abstract class Writable implements WritableAction {
    protected WritableType writeType;
    protected Target target;

    public void write()
    {
        this.write(writeType, target);
    }


    public void write(WritableType wt, Target target) {
        target.write(wt);
    }
}
