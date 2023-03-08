import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame {
    private JButton btnCadUsuario;
    private JButton btnCadProduto;
    private JPanel pnlTelaMenu;


    public telaMenu() {
        iniciarComponentes();
        createlistener();
    }

        public void iniciarComponentes () {

            setTitle("Formulário Usuário");
            setSize(300, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setContentPane(pnlTelaMenu);
            setVisible(true);
        }
        public void createlistener () {
            btnCadUsuario.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FormularioUsuario usuario = new FormularioUsuario();
                    usuario.setVisible(true);
                    dispose();
                }
            });


        btnCadProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormularioProduto produto = new FormularioProduto();
                produto.setVisible(true);
                dispose();
            }
        });
    }

            public static void main (String[]args){
            telaMenu menu = new telaMenu();
    }
}