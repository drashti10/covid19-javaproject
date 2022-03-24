import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class display {
    JFrame f;
JTable table;
String columns[];
Connection con=null;
ResultSet rs=null;
Statement stmt=null;
ResultSetMetaData md;

display(){
try{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://127.0.0.1/corona_statistics?user=root&password=";
con=DriverManager.getConnection(url);
stmt=con.createStatement();
String qs= "SELECT state,TotalCases,NewCases,TotalDeaths,NewDeaths,TotalRecovered,ActiveCases"+
" FROM statistic";
rs = stmt.executeQuery(qs);



DefaultTableModel model = new DefaultTableModel();
String cols[]={"state", "TotalCases", "NewCases", "TotalDeaths","NewDeaths","TotalRceovered","ActiveCases"};
model.setColumnIdentifiers(cols);
System.out.println("Model built");

 table = new JTable();
//put model on the table
table.setModel(model);

 table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

 table.setFillsViewportHeight(true);
//Put the table in the scrollbar
JScrollPane scroll = new JScrollPane(table);

 scroll.setHorizontalScrollBarPolicy(

 JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

 scroll.setVerticalScrollBarPolicy(

 JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


String state = "";
String TotalCases = "";
String NewCases = "";
String TotalDeaths="";
String NewDeaths="";
String TotalRecovered ="";
String ActiveCases="";
while(rs.next())
{

state=rs.getString("state");
TotalCases=rs.getString("TotalCases");
NewCases=rs.getString("NewCases");
TotalDeaths=rs.getString("TotalDeaths");
NewDeaths=rs.getString("NewDeaths");
TotalRecovered=rs.getString("TotalRecovered");
ActiveCases=rs.getString("ActiveCases");
model.addRow(new Object[]{state, TotalCases, NewCases,
TotalDeaths,NewDeaths,TotalRecovered,ActiveCases});
}

//Frame setup
f=new JFrame();
f.setLayout(new BorderLayout());
f.add(scroll); // add table onto scrollbar and add scrollbar to frame
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setSize(900,700);
f.setVisible(true);

}
catch(Exception e){
System.out.println(e.getMessage());
}
}
public static void main(String[] args) {
new display();
}
}
