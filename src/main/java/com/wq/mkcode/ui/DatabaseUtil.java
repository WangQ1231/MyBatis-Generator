/*
 * DatabaseUtil.java
 *
 * Created on __DATE__, __TIME__
 */

package com.wq.mkcode.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.wq.mkcode.database.Util;
import com.wq.mkcode.xml.ConfigXml;
import com.wq.mkcode.xml.DatabaseXml;

public class DatabaseUtil extends javax.swing.JFrame {

	private static final long serialVersionUID = 3955129484074622850L;
	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	/**
	 * 测试连接
	 */
	private javax.swing.JButton jButton1;
	/**
	 * 跳过
	 */
	private javax.swing.JButton jButton2;
	/**
	 * 选择数据类型下拉框文本
	 */
	private javax.swing.JComboBox<String> jComboBox1;

	/**
	 * 请选择数据库文本框
	 */
	private javax.swing.JComboBox<String> jComboBox2;
	/**
	 * 选择数据类型
	 */
	private JLabel jLabel1;
	/**
	 * 用户名
	 */
	private JLabel jLabel2;
	/**
	 * 密码
	 */
	private JLabel jLabel3;
	/**
	 * 数据库
	 */
	private JLabel jLabel4;
	/**
	 * 服务器IP
	 */
	private JLabel jLabel5;
	/**
	 * 用户名
	 */
	private javax.swing.JTextField jTextField1;
	/**
	 * 密码
	 */
	private javax.swing.JTextField jTextField2;
	/**
	 * 服务器IP地址输入框
	 */
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

	/** Creates new form DatabaseUtil */
	public DatabaseUtil() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initComponents() {

		jLabel1 = new JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel2 = new JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new JLabel();

		setTitle("代码生成器1.0.0");
		setBackground(new java.awt.Color(204, 255, 204));
		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowOpened(WindowEvent evt) {
				formWindowOpened(evt);
			}

			public void windowClosing(WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jLabel1.setText("选择数据库类型:");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "----请选择----" }));

		jLabel2.setText("用户名");

		jLabel3.setText("密码");

		jLabel4.setText("数据库");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(
				new String[] { "--请选择数据库--" }));

		jButton1.setText("测试连接");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		//jButton2.setLabel("跳过");
		jButton2.setText("跳过");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.setText("root");
		jTextField2.setText("root");
		jTextField3.setText("127.0.0.1");

		jLabel5.setText("服务器IP");

		/**
		 * 创建一个容器
		 */
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								//左边距
								.addGap(75, 75, 75)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(jLabel5)
												.addComponent(jLabel1)
												.addComponent(jLabel2)
												.addComponent(jLabel4)
												.addComponent(jButton1))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		99,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(34, 34, 34)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jComboBox2,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						0,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						0,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE))))
								.addGap(106, 106, 106)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(53, 53, 53)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4)
												.addComponent(
														jComboBox2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap()));

		pack();
	}// </editor-fold>
		//GEN-END:initComponents

	private void formWindowClosing(WindowEvent evt) {
		dispose();
		System.exit(0);
		System.out.println("释放");
	}

	private void formWindowClosed(WindowEvent evt) {
		dispose();
		System.exit(0);
		System.out.println("释放");
	}

	private void formWindowOpened(WindowEvent evt) {
		setLocationRelativeTo(null);

		dbMap = ConfigXml.readConfig();

		for (String key : dbMap.keySet()) {
			this.jComboBox1.addItem(key);
		}

	}

	Map<String, Map<String, String>> dbMap;
	Util util;
	Map<String, String> propertyMap;
	/**
	 * 数据库类型
	 */
	String db = "";

	/**
	 * 跳过
	 */
	private void jButton2ActionPerformed(ActionEvent evt) {

		if (this.jButton2.getText().equals("下一步")) {
			this.jButton2.setText("运行中...");
			this.jButton2.setEnabled(false);

			try {
				db = this.jComboBox2.getSelectedItem().toString();
			} catch (Exception e1) {
			}

			util = new Util();
			util.setDbName(db);//设置数据库名称
			//获取指定数据库的属性
			util.setDbType(this.jComboBox1.getSelectedItem().toString());

			propertyMap = dbMap.get(util.getDbType());
			String url = propertyMap.get("url").replace("[ip]", this.jTextField3.getText());
			//此处可添加服务器端口号
			url = url.replace("[db]", db);

			util.setDriverName(propertyMap.get("driverName"));
			util.setUrl(url);
			util.setDbName(db);
			util.setIp(this.jTextField3.getText());
			util.setUserName(this.jTextField1.getText());
			util.setPassWord(this.jTextField2.getText());

			if (url.indexOf("&amp;") < 0 && url.indexOf("&") > 0) {
				url = url.replace("&", "&amp;");
			}

			propertyMap.put("url", url);

			final Thread t = new Thread(new Runnable() {
				public void run() {
					try {
						//获取当前文件夹下的模板目录下的所有文件夹
						String basePath = new File("").getAbsolutePath() + File.separator + "db";
						DatabaseXml.writeDatabaseXml(util, propertyMap, basePath);
					} catch (Exception e) {
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
								JOptionPane.INFORMATION_MESSAGE);
					}

					CodeUtil codeUtil = new CodeUtil();
					codeUtil.setVisible(true);
					codeUtil.setDbInfo(db, jTextField1.getText(),
							jTextField2.getText());

					setVisible(false);

				}
			});
			t.start();

		} else {
			CodeUtil codeUtil = new CodeUtil();
			codeUtil.setVisible(false);
			codeUtil.setDbInfo(db, jTextField1.getText(),
					jTextField2.getText());

			setVisible(false);
		}

	}

	/**
	 * 测试连接
	 * @author:sgllnh
	 * @date:2020年7月14日下午3:40:33
	 * jButton1ActionPerformed:
	 * @param evt 
	 * void
	 */
	private void jButton1ActionPerformed(ActionEvent evt) {
		//
		jButton1.setText("连接中...");
		jButton1.setEnabled(false);

		final Thread t = new Thread(new Runnable() {
			public void run() {
				try {

					Util util = new Util();

					Map<String, String> map = dbMap.get(jComboBox1.getSelectedItem());
					util.setDriverName(map.get("driverName"));
					String url = map.get("url").replace("[ip]", jTextField3.getText()).replace("[db]", "");

					util.setUrl(url);

					util.setUserName(jTextField1.getText());
					util.setPassWord(jTextField2.getText());

					List<String> catalogs = util.getSchemas();
					jComboBox2.removeAllItems();
					for (String c : catalogs) {
						jComboBox2.addItem(c);
					}

					JOptionPane.showMessageDialog(null, "连接成功", "提示",
							JOptionPane.DEFAULT_OPTION);
					jButton2.setText("下一步");

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "无法加载驱动类", "提示",
							JOptionPane.OK_OPTION);

				} catch (SQLException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "无法连接数据库，请核对连接信息是否正确", "提示",
							JOptionPane.OK_OPTION);

				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
							JOptionPane.INFORMATION_MESSAGE);

				}

				jButton1.setEnabled(true);
				jButton1.setText("测试连接");

			}
		});
		t.start();

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DatabaseUtil().setVisible(true);
			}
		});
	}

}