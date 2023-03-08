import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadProd extends JFrame {
    private JTextField txtCodigo;
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtQtd;
    private JButton btnOk;
    private JPanel pnlcadProd;
    private JButton btnVoltar;

    public cadProd() {
        iniciarComponentes();
        criarListeners();

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                telaMenu telaMenu = new telaMenu();
            }
        });
    }

    public void criarListeners() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                receberMostrarProdutos();

            }
        });
    }

    public void iniciarComponentes() {

        setTitle("Cadastro de produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlcadProd);
        setVisible(true);
    }
        public void receberMostrarProdutos() {
            String codigo = txtCodigo.getText();
            String descricao = txtDescricao.getText();
            String preco = txtPreco.getText();
            String quantidade = txtQtd.getText();
            JOptionPane.showMessageDialog(btnOk, "Código: " + codigo +"\n"+ "Descrição: " + descricao +"\n"+ "Preço: " + preco +"\n"+ "Quantidade: " + quantidade);

        }
    }



