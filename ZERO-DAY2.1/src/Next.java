import javax.swing.*;
import java.awt.*;


public class Next {
    public int num;

    public <button> void courseReg(){

    JFrame list = new JFrame("Course Registration Portal");

        JLabel noOfCourses = new JLabel("How many courses do you wish to register?");
        JTextField noOfCoursesTxt = new JTextField();

    JLabel listOfCourses = new JLabel("Select your courses");
    JCheckBox courses = new JCheckBox("CMP 301");
    courses.setBounds(100,100,50,50);
    JCheckBox courses2 = new JCheckBox("CMP 321");
        courses2.setBounds(100,100,50,50);
    JCheckBox courses3= new JCheckBox("CMP 323");
        courses3.setBounds(100,100,50,50);
    JCheckBox courses4 =new JCheckBox("CMP 309");
        courses4.setBounds(100,100,50,50);
    JCheckBox courses5 = new JCheckBox("CMP 325");
        courses5.setBounds(100,100,50,50);
    JCheckBox courses6 = new JCheckBox("CMP 327");
        courses6.setBounds(100,100,50,50);

    JButton button = new JButton("Register");
    JButton button1 = new JButton("Remove Course");

list.add(noOfCourses);
list.add(noOfCoursesTxt);
    list.add(courses);
    list.add(courses2);
    list.add(courses3);
    list.add(courses4);
    list.add(courses5);
    list.add(courses6);
    list.add(button);
    list.add(button1);

    list.setVisible(true);
    list.setSize(700,500);
    list.setLayout(new GridLayout(11,1));


 button.addActionListener(e -> {
    if(e.getSource()==button) {

        int num = Integer.parseInt(noOfCoursesTxt.getText());
        First first = new First(num);
        this.num = num;


        if (courses.isSelected()) {
            first.enQueue(courses.getText());
        }
        if (courses2.isSelected()) {
            first.enQueue(courses2.getText());
        }
        if (courses3.isSelected()) {
            first.enQueue(courses3.getText());
        }
        if (courses4.isSelected()) {
            first.enQueue(courses4.getText());
        }
        if (courses5.isSelected()) {
            first.enQueue(courses5.getText());
        }
        if (courses6.isSelected()) {
            first.enQueue(courses6.getText());
        }

        first.size = num;

        first.displayQueue();


    }


});





}

public static void main (String [] args){
        Next next = new Next();
        next.courseReg();
}


}
