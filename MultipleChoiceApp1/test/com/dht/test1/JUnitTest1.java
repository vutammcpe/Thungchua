/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dht.test1;

import com.dht.pojo.Category;
import com.dht.services.CategoryServices;
import com.dht.services.Utils;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class JUnitTest1 {
    private static Connection coon;
    
    public JUnitTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        coon = (Connection) Utils.getCoon();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testNameISNotNull(){
        try {
            List<Category> cats = CategoryServices.getCategories();
            for(Category cat: cats){
            Assert.assertNotNull(cat.getName());
            Assert.assertNotEquals("",cat.getName().trim());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JUnitTest1.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    @Test
    public void testCateCounter(){
        try {
            List<Category> cats = CategoryServices.getCategories();
            Assert.assertTrue(cats.size()>=5);
        } catch (SQLException ex) {
            Logger.getLogger(JUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
