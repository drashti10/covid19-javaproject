import java.io.*; 
import java.sql.*; 

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;

import org.jfree.data.jdbc.JDBCPieDataset;

public class totalcaseschart  {
   
   public static void main1()throws Exception {
    //public JFreeChart demo1chart() throws Exception {
      
      String state[] = {
        "MAHARASHTRA",
 "ANDHRA PRADESH",
"TAMIL NADU",
"KARNATAKA",
"UTTAR PRADESH",
"DELHI",
"WEST BENGAL",
"ODISHA",
"TELENGANA",
"BIHAR",
"ASSAM",
"KERELA",
"GUJRAT",
"RAJASTHAN",
"HARYANA", 
"MADHYA PRADESH",
"PUNJAB",
"CHHATISGARH",
"JHARKHAND", 
"JAMMU AND KASHMIR",
"UTTRAKHAND",
"GOA",
"PUDUCHERRY",
"TRIPURA",
"HIMACHAL PRADESH", 
"CHANDIGARH",
"MANIPUR", 
"ARUNACHAL PRADESH",
"NAGALAND",
"MEGHALAYA",
" ANDAMAN AND NICOBAR",
"LADAKH",
"SIKKIM",
"MIZORAM",
"DADRA AND NAGAR HAVELI",
"DAMAN AND DIU",
"LAKSHADWEEP" 
      };
      
      /* Create MySQL Database Connection */
      Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
         "jdbc:mysql://localhost:3306/corona_statistics" ,     
         "root",     
         "");
      
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select * from statistic" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      
      while( resultSet.next( ) ) {
         dataset.setValue( 
         resultSet.getString( "state" ) ,
         Double.parseDouble( resultSet.getString( "ActiveCases" )));
      }
      
      JFreeChart chart = ChartFactory.createPieChart(
         "Total Cases",             
         dataset,                   
         true,                  
         true,           
         false );
      
      ChartFrame chartFrame = new ChartFrame("JDbC Pie Chart", chart);
      chartFrame.setVisible(true);
      chartFrame.setSize(560, 370);
     }
}
