package com.wyz.component.util;

import java.io.File;

import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author wangyz
 * @since 2012-3-29 下午10:47:36
 * @version 1.0
 */

public class ConfigUtils {

	public static PropertiesConfiguration propConfig = null;

	public static void loadConfig(String path) {
		File file = new File(path);
		if (file.exists() && file.isFile()) {
			
		}
	}

	public static PropertiesConfiguration getConfig() {
		if (null == propConfig) {

		}

		return propConfig;
	}

}
