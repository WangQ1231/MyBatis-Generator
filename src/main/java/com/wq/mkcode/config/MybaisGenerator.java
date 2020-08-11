package com.wq.mkcode.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybaisGenerator {

	/**
	 * 配置代码生成器
	 */
	public void mybaisGenerator() {
		try {
			List<String> warnings = new ArrayList<String>();
			// 如果已经存在生成过的文件是否进行覆盖
			String path1 = new File("").getAbsolutePath() + File.pathSeparator + "generator-configuration.xml";
			System.out.println(path1);
			boolean overwrite = true;
			File configFile = new File(path1);
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
			generator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
