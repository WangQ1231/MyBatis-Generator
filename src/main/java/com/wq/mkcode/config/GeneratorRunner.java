package com.wq.mkcode.config;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * MyBatisGenerator代码生成器Java调用程序
 *
 */
public class GeneratorRunner {
	public void generatorRunner() {
		try {
			List<String> warnings = new ArrayList<String>();
			Configuration config;
			//使用xml配置文件的方式
			/*File configFile = new File(GeneratorRunner.class.getClassLoader().getResource("generatorConfig.xml").getPath());
			ConfigurationParser cp = new ConfigurationParser(warnings);
			config = cp.parseConfiguration(configFile);*/
			//使用纯Java代码配置的方式
			config = GeneratorConfig.getGeneratorConfig();
			DefaultShellCallback callback = new DefaultShellCallback(true);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}