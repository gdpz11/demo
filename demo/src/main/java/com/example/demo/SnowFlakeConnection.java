package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.Properties;

// provide some connection details
@RestController
@RequestMapping("/main")
public class SnowFlakeConnection {

    @RequestMapping("/connect")
    public static void connect(){
        Properties properties = new Properties();
        //setting properties
        properties.put("user", "shanedcr");
        properties.put("password", "Itlizetech2023");
        properties.put("account", "zreyrxj-pnb61324"); //account-id followed by cloud region.
        properties.put("warehouse", "COMPUTE_WH");
        properties.put("db", "SNOWFLAKE_SAMPLE_DATA");
        properties.put("schema", "TPCH_SF1");
        properties.put("role", "SYSADMIN");
        //change this below URL as per your snowflake instance
        String jdbcUrl = "jdbc:snowflake://https://zreyrxj-pnb61324.snowflakecomputing.com/";
        //change this select statement, but make sure the logic below is hard coded for now.
        String testString = "SELECT CURRENT_WAREHOUSE()";
        String warehouse = "COMPUTE_WH";
        String useWarehouseQuery = "USE WAREHOUSE " + warehouse;

        String useWh = "USE WAREHOUSE TEST_WH";
        String selectSQL = "SELECT * FROM  SNOWFLAKE_SAMPLE_DATA.TPCH_SF1.CUSTOMER";
        //try-catch block
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, properties);
            System.out.println("\tConnection established, connection id : " + connection);
            Statement stmt = connection.createStatement();
            System.out.println("\tGot the statement object, object-id : " + stmt);
            //stmt.executeQuery(useWarehouseQuery);
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("\tGot the result set object, object-id : " + rs);
            System.out.println("\t----------------------------------------");
//            while(rs.next()) {
//                //following rs.getXXX should also change as per your select query
//                System.out.println(" \tEmployee ID: " + rs.getInt("ID"));
//                System.out.println(" \tEmployee Age: " + rs.getInt("AGE"));
//                System.out.println(" \tEmployee First: " + rs.getString("FIRST"));
//                System.out.println(" \tEmployee Last: " + rs.getString("LAST"));
//            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        System.out.println("\t----------------------------------------");
        System.out.println("\tProgram executed successfully");


    }


}
