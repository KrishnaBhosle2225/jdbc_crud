package com.spring.jdbc_crud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc_crud.dao.CustomerDao;
import com.spring.jdbc_crud.entities.Customer;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc_crud/config.xml");
        
        
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDao" );

////        *********** INSERT QUERY **************
//        Customer customer = new Customer();
//        customer.setId(444);
//        customer.setName("Chatan Jadhav");
//        customer.setEmail("ChetanJadhav@gmail.com");
//        customer.setCity("Thane");
//        customer.setContact(875496515);
//        
//        int row = customerDao.insert(customer);
//        System.out.println(row + " inserted");
        
////      ************** SELECT QUERY **********************
//        
//        Customer select = customerDao.select(111);
//        System.out.println(customer);
        
        
        
////        *********** UPDATE QUERY ************
////        Customer customer = new Customer();
//        customer.setId(111);
//        customer.setName("Shriram Kumawat");
//        customer.setEmail("shriramkumawat@gmail.com");
//        customer.setCity("Latur");
//        customer.setContact(929029323);
//        
//        int updateData = customerDao.updateData(customer);
//        System.out.println(updateData + " Data updated...");
        
        
////      ************** SELECT QUERY 1 ROW **********************
//        
//      Customer customer2 = customerDao.select(111);
//      System.out.println(customer2);
        
        
////        ************ DELETE QUERY *******************
//        int deleteData = customerDao.deleteData(111);
//        System.out.println(deleteData + " Data Deleted...");
        
        
//        **************** SELECT QUERY MULTIPLE ROWS *******************
        
        List<Customer> customers = customerDao.getAll();
        for(Customer cust : customers) {
        	System.out.println(cust);
        }
        
    }
}
