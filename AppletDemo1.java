import java.applet.*;
import java.awt.*;

public class AppletDemo1 extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello world!",100,150);
g.drawline(150,300,250,300);
}
}
