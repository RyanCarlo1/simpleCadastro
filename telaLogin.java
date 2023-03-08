import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class telaLogin  extends JFrame {
    private JButton btnOk;
    private JTextField txtUsuario;
    private JPasswordField pswSenha;
    private JPanel pnlTelaInicial;


    public telaLogin() {
        iniciarComponentes();
        criarListeners();

    }

    public void iniciarComponentes() {

        setTitle("Tela de login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaInicial);
        setVisible(true);
    }

    public void criarListeners() {

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();

            }
        });
    }

    private void validarLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(pswSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")) {
           telaMenu menu = new telaMenu();
           menu.setVisible(true);
           dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
        }



    }
    public static void main (String[]args) {

        telaLogin login = new telaLogin();
    }
}


