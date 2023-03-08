import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame {
    private JButton btnCadUsuario;
    private JButton btnCadProduto;
    private JPanel pnlTelaMenu;
    public telaMenu() {
    iniciarComponentes();
    criarListeners();
    }
    public void iniciarComponentes() {

        setTitle("Opções de Cadastro");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }


    public void criarListeners() {

    btnCadUsuario.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Cad cad = new Cad();
            cad.setVisible(true);
            dispose();

        }
    });

    btnCadProduto.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cadProd cadProd = new cadProd();
            cadProd.setVisible(true);
            dispose();

        }
    });
}
}
