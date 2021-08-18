/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerson.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trigo extends JFrame implements ActionListener{
private JButton b1;
private JTextField campo1;
private JTextField campo2;
private JLabel etq1;
private JLabel etq2;
private Panel panelEntrada, panelSalida;
private JPanel panelDeLaVentana;

public Trigo(){
//Creamos el boton
b1 = new JButton("seno");

//Registramos a la ventana como oyente
b1.addActionListener(this);

//Creamos las etiquetas
etq1 = new JLabel("Angulo: ");
etq2 = new JLabel("Resultado: ");

//Creamos los campos de Texto
campo1 = new JTextField();
campo2 = new JTextField();

//Cambiamos la propiedades de los TextFields
campo2.setEditable(false);
campo2.setColumns(20);
campo2.setBackground(Color.lightGray);
campo1.setColumns(20);

//Creamos los paneles auxiliares
panelEntrada = new Panel();
panelSalida = new Panel();

//Obtenemos la referencia al panel principal
panelDeLaVentana = (JPanel)this.getContentPane();

//Agregamos los componentes del panel de entrada
panelEntrada.add(campo1,BoxLayout.X_AXIS);
panelEntrada.add(etq1,BoxLayout.X_AXIS);

//Agregamos los componentes del panel de salida
panelSalida.add(campo2,BoxLayout.X_AXIS);
panelSalida.add(etq2,BoxLayout.X_AXIS);

//Agregamos todo al panel Principal
panelDeLaVentana.add(panelEntrada,BorderLayout.NORTH);
panelDeLaVentana.add(b1,BorderLayout.CENTER);
panelDeLaVentana.add(panelSalida,BorderLayout.SOUTH);
}

@Override
public void actionPerformed(ActionEvent e){
double angulo = Double.parseDouble(campo1.getText());
double resultado = Math.sin(angulo);
    campo2.setText(resultado+"");
   }

public static void main(String[] arg){
    Trigo miAplicacion = new Trigo();
    miAplicacion.setBounds(20,20,250,250);
    miAplicacion.pack();
    miAplicacion.setVisible(true);
   }
}
