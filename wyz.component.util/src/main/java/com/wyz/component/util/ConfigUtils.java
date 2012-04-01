package com.wyz.component.util;

import java.io.File;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.XMLPropertiesConfiguration;
import org.apache.commons.configuration.event.ConfigurationEvent;
import org.apache.commons.configuration.event.ConfigurationListener;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author wangyz
 * @since 2012-3-29 下午10:47:36
 * @version 1.0
 */

public class ConfigUtils {

	public static PropertiesConfiguration config = new PropertiesConfiguration();
	static {
		config.addConfigurationListener(new ConfigurationListener() {
			public void configurationChanged(ConfigurationEvent event) {
				try {
					config.refresh();
				} catch (ConfigurationException e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void loadConfig(String path) throws ConfigurationException {
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			if (file.getPath().endsWith(".xml")) {
				config.append(new XMLPropertiesConfiguration(file));
			} else {
				config.append(new PropertiesConfiguration(file));
			}
		}
	}

	public static void loadLog4j(String path) {
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			PropertyConfigurator.configureAndWatch(path, 60 * 60 * 1000);
		}
	}

	public static PropertiesConfiguration getConfig() {
		return config;
	}

}
