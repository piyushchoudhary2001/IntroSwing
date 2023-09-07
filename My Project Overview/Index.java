import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index implements ActionListener {

    JFrame window;
    JButton button;

    JButton button2;

   public Index(){
      window=new JFrame("Happy Janamasthmi");
      window.setLayout(null);
      window.setVisible(true);
      window.setSize(400,500);
      window.getContentPane().setBackground(Color.black);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      button=new JButton("button");
      button.setSize(100,50);
      button.addActionListener(this);

      window.add(button);

      button2=new JButton("button2");
      button2.setSize(100,50);

      button2.setLocation(200,0);

      button2.addActionListener(this);

      window.add(button2);


    }

    public static void main(String[] args) {
        Index index=new Index();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String s=e.getActionCommand();
     if(s.equals("button"))
     {
         window.getContentPane().setBackground(Color.red);
     }else if(s.equals("button2"))
     {
         window.getContentPane().setBackground(Color.black);
     }
    }
}
