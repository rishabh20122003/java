import java.awt.*;
import java.awt.event.*;
class Additionframe extends Frame implements ActionListener
{
Label LFN,LSN,LRes;
TextField TFFN,TFSN,TFRes;
Button plus,close;
Additionframe()
{
setLayout(new FlowLayout());
LFN=new Label("Enter First Number:=");
LSN=new Label("Enter Second Number:=");
LRes=new Label("Result");
TFFN=new TextField(10);
TFSN=new TextField(10);
TFRes=new TextField(10);
plus=new Button("+");
close=new Button("X");
plus.addActionListener(this);
close.addActionListener(this);
add(LFN);add(TFFN);
add(LSN);add(TFSN);
add(LRes);add(TFRes);
add(plus);add(close);
}
public void actionPerformed(ActionEvent ae)
{
String fn,sn,result;
int num1,num2,sum;
if(ae.getSource()==plus)
{
fn=TFFN.getText();
sn=TFSN.getText();
num1=Integer.parseInt(fn);
num2=Integer.parseInt(sn);
sum=num1+num2;
result=String.valueOf(sum);
TFRes.setText(result);
}
else
if(ae.getSource()==close)
{
System.exit(0);
}
}
}
class Frameshow
{
public static void main(String []args)
{
Additionframe A=new Additionframe();
A.setSize(350,350);
A.setTitle("Addition");
A.setVisible(true);
}
}