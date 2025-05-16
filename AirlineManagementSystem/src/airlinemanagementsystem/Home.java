package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener {
    
    public Home() {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);
        
        JLabel heading = new JLabel("Air India Welcomes You");
        heading.setBounds(500, 40, 400, 40);
        heading.setForeground(Color.blue);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenu("Flight Details");
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenu("Add Customer Details");
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenu("Book Flight");
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenu("Journey Details");
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenu("Ticket Cancellation");
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenu("Boarding Pass");
        ticket.add(boardingPass);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    
    
    public static void main(String[] args){
        new Home();
    }
}
