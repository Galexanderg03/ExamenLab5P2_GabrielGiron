/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5p2_gabrielgiron;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Galex
 */
public class Ventana extends JFrame {
    public JPanel panel = new JPanel();
    public ArrayList<Cuentas> Cuentas = new ArrayList();
    public Ventana()
    {
        this.setSize(300,300);
        setLocationRelativeTo(null);
        iniciarPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarPanel()
    {
        Paneles();
        Etiquetas();
        Botones();
        CajaTexto();
    }
    
    private void Paneles()
    {
       //Panel
       panel.setLayout(null);
       this.getContentPane().add(panel);  
    }
    private void Etiquetas()
    {
        //Textos
        JLabel LogInTitulo = new JLabel("Log in");
        LogInTitulo.setBounds(110,10,70,30);
        LogInTitulo.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(LogInTitulo);
        JLabel UsuarioText = new JLabel("Usuario");
        UsuarioText.setBounds(10,40,50,30);
        panel.add(UsuarioText);
        JLabel ContraText = new JLabel("Contraseña");
        ContraText.setBounds(10,110,100,30);
        panel.add(ContraText);
    }
    private void Botones()
    {
        //Botones
        JButton Ingresar = new JButton();
        Ingresar.setText("Ingresar");
        Ingresar.setBounds(10,180,110,50);   
        Ingresar.setEnabled(true);
        panel.add(Ingresar);
        JButton Registrate = new JButton();
        Registrate.setText("Registrate");
        Registrate.setBounds(150,180,110,50);
        panel.add(Registrate);
        
        ActionListener Registrar = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                Registrate R = new Registrate();
                R.setVisible(true);
            }
        };
        ActionListener Ingresa = new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent ae)
          {
              
          }
        };
        
        Registrate.addActionListener(Registrar);
    }
    private void CajaTexto()
    {
        //Cajas de Texto
        JTextField Usuario = new JTextField();
        JTextField Contra = new JTextField();
        Usuario.setBounds(10,70,120,30);
        Contra.setBounds(10,140,120,30);
        panel.add(Usuario);
        panel.add(Contra);
    }
}
