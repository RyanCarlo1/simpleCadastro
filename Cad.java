import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cad extends JFrame {
    private JPanel pnlCad;
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JTextField txtSetor;
    private JTextField txtFuncao;
    private JPasswordField pswSenha;
    private JTextField txtLog;
    private JButton btnOk;
    private JButton btnVolt;

    public Cad() {
        iniciarComponentes();
        criarListeners();
        btnVolt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnVolt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                telaMenu telaMenu = new telaMenu();
            }
        });
    }

    public void iniciarComponentes() {

        setTitle("Cadastro de Formulário");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCad);
        setVisible(true);
    }

public void criarListeners() {
    btnOk.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            receberMostrarInformacoes();

        }

        public void receberMostrarInformacoes() {
            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String setor = txtSetor.getText();
            String funcao = txtFuncao.getText();
            String login = txtLog.getText();
            String senha = new String(pswSenha.getPassword());
            JOptionPane.showMessageDialog(btnOk, "Nome: "+nome+"\n"+"Sobrenome: "+sobrenome+"\n"+"Setor: "+setor+"\n"+"Função: "+funcao+"\n"+"Login: "+login+"\n"+"Senha: "+senha);

        }



    });
}
}
