import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Love_and_Breakup_Calculator extends JFrame {

    private JPanel contentPane;
    private JTextField name1;
    private JTextField name2;
    private JTextField answer;
    int ns1 = 0, ns2 = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Love_and_Breakup_Calculator frame = new Love_and_Breakup_Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Love_and_Breakup_Calculator() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\msi\\OneDrive\\Desktop\\LoveBreakup.png"));
        setTitle("Love and Breakup Calculator");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 160, 679, 606);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHello = new JLabel("Hello...");
        lblHello.setForeground(new Color(0, 255, 255));
        lblHello.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
        lblHello.setBounds(12, 13, 447, 45);
        contentPane.add(lblHello);

        JLabel lblNewLabel = new JLabel("This is Love and Breakup Calculator which will determine your Love & Breakup Chances.");
        lblNewLabel.setForeground(new Color(240, 248, 255));
        lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
        lblNewLabel.setBounds(12, 57, 649, 32);
        contentPane.add(lblNewLabel);

        JLabel lblEnterTwoNames = new JLabel("Enter two names for calculating...");
        lblEnterTwoNames.setForeground(new Color(240, 255, 255));
        lblEnterTwoNames.setFont(new Font("Tempus Sans ITC", Font.BOLD, 26));
        lblEnterTwoNames.setBounds(12, 86, 649, 32);
        contentPane.add(lblEnterTwoNames);

        JLabel lblMale = new JLabel("Male:");
        lblMale.setForeground(new Color(240, 248, 255));
        lblMale.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblMale.setBounds(66, 156, 83, 45);
        contentPane.add(lblMale);

        name1 = new JTextField();
        name1.setFont(new Font("Tahoma", Font.BOLD, 30));
        name1.setBounds(224, 144, 405, 70);
        contentPane.add(name1);
        name1.setColumns(10);

        JLabel lblFemale = new JLabel("Female:");
        lblFemale.setForeground(new Color(240, 248, 255));
        lblFemale.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblFemale.setBounds(66, 250, 130, 45);
        contentPane.add(lblFemale);

        name2 = new JTextField();
        name2.setFont(new Font("Tahoma", Font.BOLD, 30));
        name2.setColumns(10);
        name2.setBounds(224, 238, 405, 70);
        contentPane.add(name2);

        JLabel lblNewLabel_1 = new JLabel("Select your choice:");
        lblNewLabel_1.setForeground(new Color(240, 248, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(66, 347, 199, 32);
        contentPane.add(lblNewLabel_1);

        JButton btnLoveChances = new JButton("Love");
        btnLoveChances.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ns1 = 0;
                ns2 = 0;

                String maleName = name1.getText().toLowerCase();
                String femaleName = name2.getText().toLowerCase();

                for (int i = 0; i < maleName.length(); i++) {
                    ns1 += maleName.charAt(i);
                }

                for (int i = 0; i < femaleName.length(); i++) {
                    ns2 += femaleName.charAt(i);
                }

                int loveScore = (ns1 + ns2) % 100;

                answer.setText("Love Chances: " + loveScore + "%");
            }
        });
        btnLoveChances.setForeground(new Color(0, 0, 0));
        btnLoveChances.setBackground(new Color(240, 248, 255));
        btnLoveChances.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnLoveChances.setBounds(308, 343, 111, 44);
        contentPane.add(btnLoveChances);

        JButton btnBreakupChances = new JButton("Breakup");
        btnBreakupChances.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                ns1 = 0;
                ns2 = 0;

                String maleName = name1.getText().toLowerCase();
                String femaleName = name2.getText().toLowerCase();

                for (int i = 0; i < maleName.length(); i++) {
                    ns1 += maleName.charAt(i);
                }

                for (int i = 0; i < femaleName.length(); i++) {
                    ns2 += femaleName.charAt(i);
                }

                int breakupScore = (ns1 + ns2) % 80;

                answer.setText("Breakup Chances: " + breakupScore + "%");
            }
        });
        btnBreakupChances.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBreakupChances.setBounds(484, 343, 111, 44);
        contentPane.add(btnBreakupChances);

        JLabel lblYourAnswer = new JLabel("Your answer:");
        lblYourAnswer.setForeground(new Color(240, 248, 255));
        lblYourAnswer.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblYourAnswer.setBounds(66, 435, 146, 32);
        contentPane.add(lblYourAnswer);

        answer = new JTextField();
        answer.setHorizontalAlignment(SwingConstants.CENTER);
        answer.setFont(new Font("Tahoma", Font.BOLD, 30));
        answer.setColumns(10);
        answer.setBounds(224, 413, 405, 70);
        contentPane.add(answer);

        JButton btnNewButton = new JButton("Clear");
        btnNewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
         
                name1.setText("");
                name2.setText("");
                answer.setText("");
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.setBounds(274, 513, 185, 45);
        contentPane.add(btnNewButton);
    }
}
