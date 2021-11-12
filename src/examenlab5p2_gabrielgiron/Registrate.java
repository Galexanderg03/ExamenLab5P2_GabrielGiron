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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Galex
 */
public class Registrate extends JFrame{
    public JPanel panel = new JPanel();
    public String Nombre;
    public String Usuario;
    public String PersonajeFav;
    public int Edad;
    public long CuentaBac;
    public Registrate()
    {
        this.setSize(300,500);
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
        RadioBotones();
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
        JLabel RegistrateTitulo = new JLabel("Registrate");
        JLabel UsuarioText = new JLabel("Usuario");
        JLabel ContraText = new JLabel("Contraseña");
        JLabel NombreText = new JLabel("Nombre");
        JLabel EdadText = new JLabel("Edad");
        JLabel PersonajeFText = new JLabel("Personaje Favorito");
        JLabel CuentaBancaria = new JLabel("CuentaBancaria");
        
        RegistrateTitulo.setBounds(100,10,120,30);
        UsuarioText.setBounds(140,40,50,30);
        ContraText.setBounds(10,110,100,30);
        NombreText.setBounds(10,40,50,30);
        EdadText.setBounds(140,110,100,30);
        PersonajeFText.setBounds(10,180,150,30);
        CuentaBancaria.setBounds(140,180,150,30);
        
        RegistrateTitulo.setFont(new Font("arial",Font.PLAIN,20));
        
        panel.add(RegistrateTitulo);
        panel.add(UsuarioText);
        panel.add(ContraText);
        panel.add(NombreText);
        panel.add(EdadText);
        panel.add(PersonajeFText);
        panel.add(CuentaBancaria);
    }
    private void Botones()
    {
        JButton Registrame = new JButton();
        Registrame.setText("Registrame");
        Registrame.setBounds(90,400,110,50);
        panel.add(Registrame);
        ActionListener Registrar = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                
            }
        };
        Registrame.addActionListener(Registrar);
    }
    private void CajaTexto()
    {
        //Cajas de Texto
        JTextField Usuario = new JTextField();
        JTextField Contra = new JTextField();
        JTextField Nombre = new JTextField();
        JTextField Edad = new JTextField();
        JTextField Personaje = new JTextField();
        JTextField CuentaBancaria = new JTextField();
        
        Usuario.setBounds(140,70,120,30);
        Contra.setBounds(10,140,120,30);
        Nombre.setBounds(10,70,120,30);
        Edad.setBounds(140,140,120,30);
        Personaje.setBounds(140,210,120,30);
        CuentaBancaria.setBounds(10,210,120,30);
        
        panel.add(Usuario);
        panel.add(Contra);
        panel.add(Nombre);
        panel.add(Edad);
        panel.add(Personaje);
        panel.add(CuentaBancaria);
    }
    private void RadioBotones()
    {
        JRadioButton Admin = new JRadioButton("Administrador",false);
        JRadioButton Vendedor = new JRadioButton("Vendedor",false);
        JRadioButton Comprador = new JRadioButton("Comprador",false);
        
        Admin.setBounds(10,250,130,40);
        Vendedor.setBounds(10,280,130,40);
        Comprador.setBounds(10,310,130,40);
        
        panel.add(Admin);
        panel.add(Vendedor);
        panel.add(Comprador);
        
        ButtonGroup TipoCuenta = new ButtonGroup();
        TipoCuenta.add(Admin);
        TipoCuenta.add(Vendedor);
        TipoCuenta.add(Comprador);
    }  
}
