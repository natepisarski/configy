package college.perkinsmonitor;

import java.util.HashMap;

/**
 *Configuration is built from a TOML file. This contains information about how different files should be written to.
 * @author Nathaniel Pisarski
 */
public class Configuration {
    private HashMap<String, String> configuration;

    public Configuration(String filename) {
        /* Parse the TOML file, where

         [zsh]
         file = "$HOME"/.zshrc
         action = overwrite

         Is interpreted as
         "zsh.file" = "$HOME/.zshrc"
         "zsh.action" = "overwrite"
         */
    }

    public String getSetting(String service, String aspect) {
        return configuration.get(
                String.format("%s.%s", service, aspect)
        );
    }

}
