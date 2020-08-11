package com.wq.mkcode.config;

import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.GeneratedKey;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.ModelType;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.config.TableConfiguration;

/**
 * 基于Java代码的MBG配置
 * Maven打包方式为POM的项目或模块(<packaging>pom</packaging>)，resources目录的内容不会输出到类路径下，所以可以选择直接使用Java代码配置！
 *
 * @author 
 * @since 
 */
public class GeneratorConfig {
	public static Configuration getGeneratorConfig() {
		Context context = new Context(ModelType.CONDITIONAL);
		context.setId("simple");
		context.setTargetRuntime("MyBatis3Simple");

		/*添加属性*/
		context.addProperty("javaFileEncoding", "UTF-8");

		/*插件配置，这个是我自己的插件，没有自定义插件的同学可以不配这一节，删除即可*/
		PluginConfiguration pluginConfig = new PluginConfiguration();
		pluginConfig.setConfigurationType("com.xgclassroom.generator.GeneratorPlugin");
		context.addPluginConfiguration(pluginConfig);

		/*注释生成器配置*/
		CommentGeneratorConfiguration commentGeneratorConfig = new CommentGeneratorConfiguration();
		commentGeneratorConfig.addProperty("suppressAllComments", "true");
		context.setCommentGeneratorConfiguration(commentGeneratorConfig);

		/*JDBC连接信息配置*/
		JDBCConnectionConfiguration jdbcConnectionConfig = new JDBCConnectionConfiguration();
		jdbcConnectionConfig.setDriverClass("com.mysql.cj.jdbc.Driver");
		//注意代码配置中JDBC连接字符串中的参数分隔符不需要再像xml配置文件中那样使用转义符
		jdbcConnectionConfig.setConnectionURL("jdbc:mysql://localhost:3306/permission_center?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false");
		jdbcConnectionConfig.setUserId("xurm");
		jdbcConnectionConfig.setPassword("1qaz@WSX");
		jdbcConnectionConfig.addProperty("nullCatalogMeansCurrent", "true");//MySQL无法识别table标签中schema类的配置，所以在URL上指明目标数据库，并追加nullCatalogMeansCurrent属性为true
		jdbcConnectionConfig.addProperty("remarksReporting", "true");//针对oracle数据库无法读取表和字段备注
		jdbcConnectionConfig.addProperty("useInformationSchema", "true");//针对mysql数据库无法读取表和字段备注
		context.setJdbcConnectionConfiguration(jdbcConnectionConfig);

		/*Model生成器配置*/
		JavaModelGeneratorConfiguration javaModelGeneratorConfig = new JavaModelGeneratorConfiguration();
		javaModelGeneratorConfig.setTargetProject("permission/src/main/java");//目标项目(源码主路径)
		javaModelGeneratorConfig.setTargetPackage("com.xgclassroom.model");//目标包(Model类文件存放包)
		context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfig);

		/*SqlMapper生成器配置(*Mapper.xml类文件)，要javaClient生成器类型配合*/
		SqlMapGeneratorConfiguration sqlMapGeneratorConfig = new SqlMapGeneratorConfiguration();
		sqlMapGeneratorConfig.setTargetProject("permission/src/main/java");//目标项目(源码主路径)
		sqlMapGeneratorConfig.setTargetPackage("com.xgclassroom.mapper");//目标包(*Mapper.xml类文件存放包)
		context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfig);

		/*JavaClient生成器配置(*Mapper.java类文件)*/
		JavaClientGeneratorConfiguration javaClientGeneratorConfig = new JavaClientGeneratorConfiguration();
		javaClientGeneratorConfig.setConfigurationType("XMLMAPPER");//JavaClient生成器类型(主要有ANNOTATEDMAPPER、MIXEDMAPPER、XMLMAPPER，要Context的TargetRuntime配合)
		javaClientGeneratorConfig.setTargetProject("permission/src/main/java");//目标项目(源码主路径)
		javaClientGeneratorConfig.setTargetPackage("com.xgclassroom.mapper");//目标包(*Mapper.java类文件存放包)
		context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfig);

		/*表生成配置*/
		TableConfiguration tableConfig = new TableConfiguration(context);
		tableConfig.setTableName("%");
		GeneratedKey generatedKey = new GeneratedKey("id", "JDBC", true, null);//设置主键列和生成方式
		tableConfig.setGeneratedKey(generatedKey);
		context.addTableConfiguration(tableConfig);

		Configuration config = new Configuration();
		config.addContext(context);

		return config;
	}
}