package aplicacionEjerciciosLaboratorio;

import java.awt.CardLayout;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class jPanAcercaDe extends JPanel {
    private GridBagLayout gridBagLayout1 = new GridBagLayout();
    private JLabel jLblUniversidad = new JLabel();
    private JLabel jLblCurso = new JLabel();
    private JLabel jLblDescripcionAplicacion = new JLabel();
    private JLabel jLabelAutor = new JLabel();

    public jPanAcercaDe() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(gridBagLayout1);
        this.setSize(new Dimension(400, 300));
        jLblUniversidad.setText("Universidad Técnica Nacional – UTN");
        jLblUniversidad.setFont(new Font("Tahoma", 1, 14));
        jLblCurso.setText("ISW – 311 Programación II");
        jLblCurso.setFont(new Font("Tahoma", 1, 10));
        jLblDescripcionAplicacion.setText("Aplicación de ejemplo de objetos gráficos en Java");
        jLblDescripcionAplicacion.setFont(new Font("Tahoma", 1, 10));
        jLabelAutor.setText("Ing. Alexánder Agüero Castillo");
        jLabelAutor.setFont(new Font("Tahoma", 1, 10));
        this.add(jLblUniversidad, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(10, 0, 10, 0), 0, 0));
        this.add(jLblCurso, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
        this.add(jLblDescripcionAplicacion, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
        this.add(jLabelAutor, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
    }
}
