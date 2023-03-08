import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioProduto extends  JFrame {
    private JPanel pnlFormCadProduto;
    private JTextField txtcodigo;
    private JTextField txtdescricao;
    private JTextField txtpreco;
    private JTextField txtqtdeestoque;
    private JLabel lblcodigo;
    private JLabel lbldescricao;
    private JLabel lblpreco;
    private JLabel lblqtdeestoque;
    private JButton btnOK;

    public FormularioProduto() {
        iniciarComponentes();


        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String codproduto = txtcodigo.getText();
                String descproduto = txtdescricao.getText();
                String precoproduto = txtpreco.getText();
                String qtdeproduto = txtqtdeestoque.getText();

                JOptionPane.showMessageDialog(btnOK,"Produto cadastrado com sucesso!\n"
                        +"Código:" + codproduto + "\n"
                        +"Descrição:" + descproduto + "\n"
                        +"Preço:" +precoproduto + "\n"
                        +"Quantidade em estoque:" + qtdeproduto + "\n");

                telaMenu voltar = new telaMenu();
                voltar.setVisible(true);
                dispose();
            }
        });



    }

    public void iniciarComponentes() {

        setTitle("Formulário Produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlFormCadProduto);
        setVisible(true);
    }

    public static void main(String[] args) { FormularioProduto produto = new FormularioProduto();

    }
}