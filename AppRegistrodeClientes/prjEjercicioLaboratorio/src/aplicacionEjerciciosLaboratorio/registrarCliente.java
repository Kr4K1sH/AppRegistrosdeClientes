package aplicacionEjerciciosLaboratorio;

import entidades.Cliente;
import entidades.ClienteFrecuente;
import entidades.ClienteRegular;
import entidades.TipoPago;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import utilitarioVentanas.UtilitarioVentana;

import validadorFormatos.ValidadorFormatos;

public class registrarCliente extends JPanel {
    private JLabel jNumCliente = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jlblPuntos = new JLabel();
    private JLabel jlblTipoPago = new JLabel();
    private JEditorPane jtxtNCliente = new JEditorPane();
    private JEditorPane jtxtCliente = new JEditorPane();
    private JEditorPane jtxtCedula = new JEditorPane();
    private JEditorPane jtxtMontoCompra = new JEditorPane();
    private JEditorPane jtxtPuntos = new JEditorPane();
    private JRadioButton jrbtnFrecuente = new JRadioButton();
    private JRadioButton jrbtnRegular = new JRadioButton();
    private JComboBox jcmbTipoPago = new JComboBox();
    private JButton jButton1 = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jtxtAreaRegistro = new JTextArea();
    ButtonGroup botones= new   ButtonGroup ();
    Cliente micliente; 
    public registrarCliente() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(429, 431));
        this.addAncestorListener(new AncestorListener() {
                public void ancestorAdded(AncestorEvent e) {
                    this_ancestorAdded(e);
                }

                public void ancestorRemoved(AncestorEvent e) {
                }

                public void ancestorMoved(AncestorEvent e) {
                }
            });
        jNumCliente.setBounds(new Rectangle(35, 10, 65, 30));
        jNumCliente.setText("Num Cliente");
        jLabel2.setText("Nombre");
        jLabel2.setBounds(new Rectangle(50, 40, 45, 30));
        jLabel3.setText("Cedula");
        jLabel3.setBounds(new Rectangle(55, 80, 40, 30));
        jLabel4.setText("Monto Compra");
        jLabel4.setBounds(new Rectangle(20, 115, 80, 30));
        jlblPuntos.setText("Puntos");
        jlblPuntos.setBounds(new Rectangle(20, 215, 40, 30));
        jlblTipoPago.setText("TipoPago");
        jlblTipoPago.setBounds(new Rectangle(215, 215, 55, 30));
        jtxtNCliente.setBounds(new Rectangle(105, 15, 125, 20));
        jtxtNCliente.setEditable(false);
        jtxtCliente.setBounds(new Rectangle(105, 45, 220, 20));
        jtxtCedula.setBounds(new Rectangle(105, 85, 220, 20));
        jtxtMontoCompra.setBounds(new Rectangle(105, 120, 220, 20));
        jtxtPuntos.setBounds(new Rectangle(60, 220, 115, 20));
        jtxtPuntos.setEditable(false);
        jrbtnFrecuente.setText("Frecuente");
        jrbtnFrecuente.setBounds(new Rectangle(60, 170, 95, 20));
        jrbtnFrecuente.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jrbtnFrecuente_actionPerformed(e);
                }
            });
        jrbtnRegular.setText("Regular");
        jrbtnRegular.setBounds(new Rectangle(195, 170, 95, 20));
        jrbtnRegular.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jrbtnRegular_actionPerformed(e);
                }
            });
        jcmbTipoPago.setBounds(new Rectangle(265, 220, 130, 20));
        jButton1.setText("Registrar");
        jButton1.setBounds(new Rectangle(115, 260, 160, 20));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jScrollPane1.setBounds(new Rectangle(35, 290, 340, 120));
        jScrollPane1.getViewport().add(jtxtAreaRegistro, null);
        this.add(jScrollPane1, null);
        this.add(jButton1, null);
        this.add(jcmbTipoPago, null);
        this.add(jrbtnRegular, null);
        this.add(jrbtnFrecuente, null);
        this.add(jtxtPuntos, null);
        this.add(jtxtMontoCompra, null);
        this.add(jtxtCedula, null);
        this.add(jtxtCliente, null);
        this.add(jtxtNCliente, null);
        this.add(jlblTipoPago, null);
        this.add(jlblPuntos, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jNumCliente, null);
        
        this.jcmbTipoPago.setModel(new DefaultComboBoxModel(TipoPago.values()));
          
          this.botones.add(this.jrbtnFrecuente);
          this.botones.add(this.jrbtnRegular);
    }
    private void this_ancestorAdded(AncestorEvent e) {
 this.jtxtPuntos.setEnabled(false);
 this.jcmbTipoPago.setEnabled(false);
 this.jlblPuntos.setEnabled(false);
 this.jlblTipoPago.setEnabled(false);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
          if(ValidadorFormatos.validarVacio(this.jtxtCliente.getText())){
            JOptionPane.showMessageDialog(this,"Se necesita un nombre.");
        }      
        if(ValidadorFormatos.validarVacio(this.jtxtCedula.getText() )){
            JOptionPane.showMessageDialog(this,"Se necesita una cedula.");
        }
        if(ValidadorFormatos.validarVacio(this.jtxtMontoCompra.getText() )){
            JOptionPane.showMessageDialog(this,"Se necesita un monto de compra.");
        }
        if(this.jrbtnFrecuente.isSelected()){
            micliente = new ClienteFrecuente (this.jtxtCliente.getText(),
                                              this.jtxtCedula.getText(),
                                              Double.parseDouble(this.jtxtMontoCompra.getText()),
                                              Integer.parseInt(this.jtxtPuntos.getText()));
            
        }else{
            if(this.jrbtnRegular.isSelected()){
                micliente = new ClienteRegular(this.jtxtCedula.getText(),
                                               this.jtxtCedula.getText(),
                                               Double.parseDouble(this.jtxtMontoCompra.getText()),
                                               (TipoPago)this.jcmbTipoPago.getSelectedItem() );
            }
            this.jtxtNCliente.setText(String.valueOf(micliente.getNumeroCliente()) );
            
            this.jtxtAreaRegistro.setText(micliente.toString());
            
            
            
            
        }
       
        
    
    
    }

    private void jrbtnFrecuente_actionPerformed(ActionEvent e) {
        if(this.jrbtnFrecuente.isSelected()){
            this.jcmbTipoPago.setEnabled(false);
            this.jlblTipoPago.setEnabled(false);
            this.jtxtPuntos.setEnabled(true);
            this.jlblPuntos.setEnabled(true);
        }
    }

    private void jrbtnRegular_actionPerformed(ActionEvent e) {
        if(this.jrbtnRegular.isSelected()){
            this.jcmbTipoPago.setEnabled(true);
            this.jlblTipoPago.setEnabled(true);
            this.jtxtPuntos.setEnabled(false);
            this.jlblPuntos.setEnabled(false);
        }
    }
}
