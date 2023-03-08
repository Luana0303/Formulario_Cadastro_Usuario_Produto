import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioUsuario extends JFrame{
    private JPanel pnlFormCadUsuario;
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JTextField txtSetor;
    private JTextField txtfuncao;
    private JTextField txtlogin;
    private JLabel lblNome;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JLabel lblLogin;
    private JPasswordField pswSenha;
    private JLabel lblSenha;
    private JButton btnOK;
    public FormularioUsuario() {
        iniciarComponentes();



    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String nomeusuario = txtNome.getText();
            String sobrenomeusuario = txtSobrenome.getText();
            String setorusuario = txtSetor.getText();
            String funcaousuario = txtfuncao.getText();
            String loginusuario = txtlogin.getText();
            String senhausuario = pswSenha.getText();

            JOptionPane.showMessageDialog(btnOK,"Usuário cadastrado com sucesso!\n"
            +"Nome" + nomeusuario + "\n"
            +"Sobrenome" + sobrenomeusuario + "\n"
            +"Setor" +setorusuario + "\n"
            +"Funçao" + funcaousuario + "\n"
            +"Login" + loginusuario + "\n"
            +"Senha" + senhausuario + "\n"
                    );

            telaMenu voltar = new telaMenu();
            voltar.setVisible(true);
            dispose();

        }



    });

}
    public void iniciarComponentes(){

        setTitle("Formulário Usuário");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlFormCadUsuario);
        setVisible(true);



    }


    public static void main(String[] args) { FormularioUsuario usuario = new FormularioUsuario();



    }


}
