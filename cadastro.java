import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField pswsenha;
    private JButton btnOK;
    private JLabel lblUsuário;
    private JLabel lblSenha;
    private JPanel telaInicial;

    public cadastro() {
        iniciarComponentes();
        criarListeners();
    }
    public void iniciarComponentes(){

        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaInicial);
        setVisible(true);
    }
    public void criarListeners(){

    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarLogin();

        }
    });
}
private void validarLogin(){
        String usuario = txtUsuario.getText();
        String senha = new String(pswsenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")) {

            telaMenu menu = new telaMenu();
            menu.setVisible(true);
            dispose();

        }else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
        }
}

    public static void main(String[] args) {
        cadastro iniciar = new cadastro();
    }
}
