package college.perkinsmonitor;

/**
  * WritableAction is the base interface for an action that can be written to a file
 * @author Nathaniel Pisarski
 */
public interface WritableAction {
    void write(WritableType wType, Target target);
}
