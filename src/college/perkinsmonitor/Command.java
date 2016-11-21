package college.perkinsmonitor;

/**
 *
 */
public class Command extends Writable {
    private String service;
    private Configuration config;
    private Target target;

    private Command(String service, Target target, Configuration configuration) {
        this.service = service;
        this.target = target;
        this.config = configuration;
    }

    public static Command fromRemote(String service,  String url, String cfgPath){
        Configuration config = new Configuration(cfgPath);
        return new Command(
                service,
                new Remote(service, url, config),
                config
        );
    }

    public static Command fromLocal(String service, String sourceFile, String cfgPath) {
        Configuration config = new Configuration(cfgPath);
        return new Command(
                service,
                new Local(service, sourceFile, config),
                config
        );
    }

    public void write()
    {
        WritableType type = WritableType.Append; // = config.getSetting(service, writeType) converted to enum
        target.write(type);
    }
}
