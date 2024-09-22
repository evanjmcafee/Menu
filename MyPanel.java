import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class MyPanel extends JPanel {
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int height = (int)screenSize.getHeight();
    int a = 130;
    int wexp = 10;
    static JFrame frame = new JFrame();
    private JLabel jcomp1;
    private JLabel L;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    int h = 253;

    public MyPanel() {


        //construct components
        jcomp1 = new JLabel(System.getProperty("user.name"));
        jcomp1.setForeground(new Color(a, a, a, 255));
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/Person.png"));
            jcomp1.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        L = new JLabel(System.getProperty("user.name"));
        try {
            Image Li = ImageIO.read(getClass().getResource("resources/UVLOGO.png"));
            L.setIcon(new ImageIcon(Li));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp2 = new JButton("Files");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/File.png"));
            jcomp2.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp2.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("pcmanfm");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp3 = new JButton("Apps");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/APP.png"));
            jcomp3.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp3.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("pcmanfm menu://applications");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp4 = new JButton("Settings");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/SETTING.png"));
            jcomp4.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp4.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("pcmanfm /settings");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp5 = new JButton("Search");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/Glass.png"));
            jcomp5.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp5.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {

                    Process process = Runtime.getRuntime().exec("pcmanfm -f");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp6 = new JButton("Shut Down");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/off.png"));
            jcomp6.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp6.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("shutdown -h now");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp7 = new JButton("Restart");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/reboot.png"));
            jcomp7.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp7.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("reboot");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp8 = new JButton("Sleep");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/sleep.png"));
            jcomp8.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp8.addActionListener( new ActionListener()
        {
            @Override

            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("systemctl suspend");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp9 = new JButton("Lock");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/sw.png"));
            jcomp9.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp9.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("xscreensaver-command -lock");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp10 = new JButton("Sign out");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/Signout.png"));
            jcomp10.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp10.addActionListener( new ActionListener()
        {
            @Override
            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    Process process = Runtime.getRuntime().exec("kill -9 -1");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jcomp11 = new JButton("hibernate");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/hibernate.png"));
            jcomp11.setIcon(new ImageIcon(img1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        jcomp11.addActionListener( new ActionListener()
        {
            @Override
            @SuppressWarnings({"unchecked", "deprecation"})
            public void actionPerformed(ActionEvent e)
            {
                try {
                    //
                    Process pr = Runtime.getRuntime().exec("blkid -s UUID /dev/sda3xlb | cut-d '\"' -f 2");
                    OutputStream p = pr.getOutputStream();
                    Process process = Runtime.getRuntime().exec("systemctl hibernate "+p);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //adjust size and set layout
        setPreferredSize(new Dimension(265+wexp, 175));



        setLayout(null);
        jcomp1.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp2.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp3.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp4.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp5.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp6.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp7.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp8.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp9.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp10.setHorizontalAlignment(SwingConstants.LEFT);
        jcomp11.setHorizontalAlignment(SwingConstants.LEFT);
        L.setHorizontalAlignment(SwingConstants.LEFT);
        //add components
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);
        add(jcomp5);
        add(jcomp6);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        add(jcomp11);
        add(L);

        jcomp1.setBounds(5, 0, 170, 35);

        jcomp2.setBounds(5, 70, 135, 35);
        jcomp3.setBounds(5, 35, 135, 35);
        jcomp4.setBounds(5, 105, 135, 35);
        jcomp5.setBounds(5, 140, 135, 35);
        jcomp6.setBounds(145, 160, a, 15);
        jcomp7.setBounds(145, 140, a, 15);
        jcomp8.setBounds(145, 120, a, 15);
        jcomp9.setBounds(145, 80, a, 15);
        jcomp10.setBounds(145, 100, a, 15);
        jcomp11.setBounds(145, 60, a, 15);
        L.setBounds(145, 5, 119,51);
    }


    static class CustomWindowListener implements WindowListener {
        public void windowOpened(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {

        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

            System.exit(0);

        }
    }
    public static void main(String[] args) {
        //    setBackground(Color.black);



        frame.addWindowListener(new CustomWindowListener());
        frame.setUndecorated(true);

        java.net.URL url = ClassLoader.getSystemResource("resources/Empty.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        frame.setIconImage(img);
        JPanel jj = new MyPanel();
        jj.setBackground(Color.BLACK);
        frame.add( jj );
        frame.getContentPane().setBackground(Color.black);

        frame.setLocation(0,height-216);
        frame.pack();
        frame.setVisible( true );
    }
}