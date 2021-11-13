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
import javax.swing.JComboBox;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Galex
 */
public class Ventana extends JFrame {
    public JPanel Lpanel = new JPanel();
    public JPanel Rpanel = new JPanel();
    public JPanel Cpanel = new JPanel();
    public String nombre;
    public String usuario;
    public String PersonajeFav;
    public String edad;
    public String CuentaBac;
    public String contra;
    public String TipoDeCuenta;
    public ArrayList<Cuentas> Cuentas = new ArrayList();
    public Ventana()
    {
        this.setSize(300,300);
        setLocationRelativeTo(null);
        iniciarPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void StartPanel()
    {
        //Admin
        String Name = "Admin";
        String Usuario = "Admin";
        String PersonajeFav = "Link";
        String edad = "20";
        String CuentaBac = "12051024";
        String TipoDeCuenta = "Administrador";
        String Contra = "11101";
        
        Cuentas C = new Cuentas(Name, Usuario, PersonajeFav, edad, CuentaBac,TipoDeCuenta, Contra);
        Cuentas.add(C);
        Ventana V = new Ventana();
        V.setVisible(true);
    } 
    
    private void iniciarPanel()
    {
        this.setSize(300,300);
        LPaneles();
        LEtiquetas();
        LInteractivos();
    }
    
    private void LPaneles()
    {
       //Panel
       Lpanel.setLayout(null);
       this.getContentPane().add(Lpanel);  
    }
    private void LEtiquetas()
    {
        //Textos
        JLabel LogInTitulo = new JLabel("Log in");
        LogInTitulo.setBounds(110,10,70,30);
        LogInTitulo.setFont(new Font("arial",Font.PLAIN,20));
        Lpanel.add(LogInTitulo);
        JLabel UsuarioText = new JLabel("Usuario");
        UsuarioText.setBounds(10,40,50,30);
        Lpanel.add(UsuarioText);
        JLabel ContraText = new JLabel("Contraseña");
        ContraText.setBounds(10,110,100,30);
        Lpanel.add(ContraText);
    }
    private void LInteractivos()
    {
        //Botones
        JButton Ingresar = new JButton();
        Ingresar.setText("Ingresar");
        Ingresar.setBounds(10,180,110,50);   
        Ingresar.setEnabled(true);
        Lpanel.add(Ingresar);
        JButton Registrate = new JButton();
        Registrate.setText("Registrate");
        Registrate.setBounds(150,180,110,50);
        Lpanel.add(Registrate);
        
        //Cajas de Texto
        JTextField Usuario = new JTextField();
        JTextField Contra = new JTextField();
        Usuario.setBounds(10,70,120,30);
        Contra.setBounds(10,140,120,30);
        Lpanel.add(Usuario);
        Lpanel.add(Contra);
        
        ActionListener Registrar = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
               if(Lpanel.isVisible())
               {
                   Lpanel.setVisible(false);
                   RiniciarPanel();
                   Rpanel.setVisible(true);
               }
            }
        };
        ActionListener Ingresa = new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent ae)
          {
              String U = Usuario.getText();
              String P = Contra.getText();
              for(int i = 0; i < Cuentas.size(); i++)
              {
                  String Usuario = Cuentas.get(i).getUsuario();
                  String Password = Cuentas.get(i).getContraseña();
                  String TipoDeCuenta = Cuentas.get(i).getTipoCuenta();
                  if(Usuario.equals(U) && Password.equals(P) && TipoDeCuenta.equals("Administrador"))
                  {

                    Lpanel.setVisible(false);
                    CIniciarPanel();
                    Cpanel.setVisible(true);
                    System.out.println("Ingresaste exitosamente");
                  }
              }
          }
        };
        Registrate.addActionListener(Registrar);
        Ingresar.addActionListener(Ingresa);
    }

    //Registrate 
    private void RiniciarPanel()
    {
        this.setSize(300,500);
        RPaneles();
        REtiquetas();
        RInteractivo();
    }
    
    private void RPaneles()
    {
       //Panel
       Rpanel.setLayout(null);
       this.getContentPane().add(Rpanel);  
    }
    private void REtiquetas()
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
        
        Rpanel.add(RegistrateTitulo);
        Rpanel.add(UsuarioText);
        Rpanel.add(ContraText);
        Rpanel.add(NombreText);
        Rpanel.add(EdadText);
        Rpanel.add(PersonajeFText);
        Rpanel.add(CuentaBancaria);
    }
    private void RInteractivo()
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
        
        Rpanel.add(Usuario);
        Rpanel.add(Contra);
        Rpanel.add(Nombre);
        Rpanel.add(Edad);
        Rpanel.add(Personaje);
        Rpanel.add(CuentaBancaria);

        String[] TipoCuenta = {"Administrador","Comprador","Vendedor"};
        JComboBox ListaTipoCuenta = new JComboBox(TipoCuenta);
        ListaTipoCuenta.setBounds(10,250,130,40);
        
        Rpanel.add(ListaTipoCuenta);
        
        JButton Registrame = new JButton();
        Registrame.setText("Registrame");
        Registrame.setBounds(90,400,110,50);
        Rpanel.add(Registrame);
        ActionListener Registrar = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                usuario = Usuario.getText();
                nombre = Nombre.getText();
                edad = Edad.getText();
                PersonajeFav = Personaje.getText();
                CuentaBac = CuentaBancaria.getText();
                contra = Contra.getText();
                if(ListaTipoCuenta.getSelectedItem().equals("Administrador"))
                {
                    TipoDeCuenta = "Administrador";
                }
                else if(ListaTipoCuenta.getSelectedItem().equals("Vendedor"))
                {
                    TipoDeCuenta = "Vendedor";
                }
                else if(ListaTipoCuenta.getSelectedItem().equals("Comprador"))
                {
                    TipoDeCuenta = "Comprador";
                }
                
                Cuentas C = new Cuentas(nombre, usuario, PersonajeFav, edad, CuentaBac, TipoDeCuenta, contra);
                Cuentas.add(C);
                Rpanel.removeAll();
                Rpanel.setVisible(false);
                iniciarPanel();
                Lpanel.setVisible(true);
            }
        };
        Registrame.addActionListener(Registrar);
    }
    
    //CompradorGUI
    private void CIniciarPanel()
    {
        this.setSize(500,500);
        CPaneles();
        CEtiquetas();
        CInteractivo();
    }
    private void CPaneles()
    {
       Cpanel.setLayout(null);
       this.getContentPane().add(Cpanel); 
    }
    private void CEtiquetas()
    {
        JLabel AdminTitulo = new JLabel("Administrador: " + usuario);
        
        AdminTitulo.setBounds(10,10,200,20);
        
        Cpanel.add(AdminTitulo);
    }
    private void CInteractivo()
    {
        JButton CrearUsuario = new JButton("Crear Usuario");
        JButton EliminarUsuario = new JButton("Eliminar Usuario");
        JButton ModificarUsuario = new JButton("Modificar Usuario");
        
        CrearUsuario.setBounds(10,30,120,20);
        EliminarUsuario.setBounds(150,30,140,20);
        ModificarUsuario.setBounds(310,30,150,20);
        
        Cpanel.add(CrearUsuario);
        Cpanel.add(EliminarUsuario);
        Cpanel.add(ModificarUsuario);
        
        ActionListener BotonCrear = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                Cpanel.repaint();
                CcrearUsuario();
            }
        };
        
        
        CrearUsuario.addActionListener(BotonCrear);
    }
    private void CcrearUsuario()
    {
        JLabel Nombre = new JLabel("Nombre");
        JLabel Usuario = new JLabel("Usuario");
        JLabel Contra = new JLabel("Contraseña");
        JLabel Edad = new JLabel("Edad");
        JLabel TipoCuenta = new JLabel("Tipo De Cuenta");
        JLabel CuentaBac = new JLabel("Cuenta Bancaria");
        JLabel SaldoDisponible = new JLabel("Saldo Disponible");
        JLabel PersonajeFav = new JLabel("Personaje Favorito");
        
        Nombre.setBounds(20,80,140,20);
        Usuario.setBounds(20,140,140,20);
        Contra.setBounds(20,200,140,20);
        Edad.setBounds(20,260,140,20);
        TipoCuenta.setBounds(20,320,140,20);
        CuentaBac.setBounds(300,80,140,20);
        SaldoDisponible.setBounds(300,140,140,20);
        PersonajeFav.setBounds(300,200,140,20);
        
        JTextField Name = new JTextField();
        JTextField User = new JTextField();
        JTextField Pass = new JTextField();
        JTextField Age = new JTextField();
        JTextField Bank = new JTextField();
        JTextField Fav = new JTextField();
        
        Name.setBounds(20,100,140,20);
        User.setBounds(20,160,140,20);
        Pass.setBounds(20,220,140,20);
        Age.setBounds(20,280,40,20);
        Bank.setBounds(300,100,140,20);
        Fav.setBounds(300,220,140,20);
        
        String[] Types = {"Administrador","Comprador","Vendedor"};
        String[] Saldo = {"2,000","5,000","8,000","10,000"};
        
        JComboBox Tipos = new JComboBox(Types);
        JComboBox Dinero = new JComboBox(Saldo);
        
        Tipos.setBounds(20,340,140,20);
        Dinero.setBounds(300,160,140,20);
        
        JButton Crear = new JButton("Crear Usuario");
        Crear.setBounds(300,280,150,20);
        
        Cpanel.add(Nombre);
        Cpanel.add(Name);
        Cpanel.add(Usuario);
        Cpanel.add(User);
        Cpanel.add(Pass);
        Cpanel.add(Contra);
        Cpanel.add(Age);
        Cpanel.add(Edad);
        Cpanel.add(Tipos);
        Cpanel.add(TipoCuenta);
        Cpanel.add(Dinero);
        Cpanel.add(CuentaBac);
        Cpanel.add(Bank);
        Cpanel.add(Fav);
        Cpanel.add(PersonajeFav);
        Cpanel.add(Dinero);
        Cpanel.add(SaldoDisponible);
        Cpanel.add(Crear);
    }
}
