package com.dgit.finaltest.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dgit.finaltest.jdbc.ConnectionFactory;
import com.dgit.finaltest.jdbc.DBconnection;
import com.dgit.finaltest.jdbc.JdbcUtil;


public class ConnectionFactoryTest {
	private static Connection instance;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = ConnectionFactory.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		JdbcUtil.close(instance);
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(instance);
	}
	@Test
	public void testDbExists() {
		Assert.assertNotNull(DBconnection.getConnection());
	}
	@Test
	public void testEmployee() {
		Assert.assertNotNull(null);
	}
}
