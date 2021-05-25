package de.hglabor.localization;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class LocalizationFile {

    private YamlConfiguration configuration;
    private File file;

    public LocalizationFile(File file) {
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.file = file;
        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }

    public YamlConfiguration getConfiguration() {
        return this.configuration;
    }

    public File getFile() {
        return this.file;
    }

}
