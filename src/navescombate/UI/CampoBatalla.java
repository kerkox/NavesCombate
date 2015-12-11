/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navescombate.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import navescombate.UI.Animation.Animacion;

/**
 *
 * @author atenea
 */
public class CampoBatalla extends javax.swing.JFrame {

    /**
     * Creates new form CampoBatalla
     */
    Animacion animation;
    public CampoBatalla() {
        initComponents();
        animation = new Animacion();
        animation.init();
        this.panel.add(animation);
        this.initButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                animation.init();
            }
        });
        this.pauseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                animation.pause();
            }
        });
        this.restartButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                animation.restart();
            }
        });
        
        ListenerMover lm = new ListenerMover();
        this.ButtonDown.addActionListener(lm);
        this.ButtonLeft.addActionListener(lm);
        this.ButtonRight.addActionListener(lm);
        this.ButtonUp.addActionListener(lm);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        SpinnerMove = new javax.swing.JSpinner();
        PanelControles = new javax.swing.JPanel();
        ButtonUp = new javax.swing.JButton();
        ButtonLeft = new javax.swing.JButton();
        ButtonRight = new javax.swing.JButton();
        ButtonDown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        initButton.setText("Iniciar");

        restartButton.setText("Reiniciar");

        pauseButton.setText("Detener");

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panel.setMinimumSize(new java.awt.Dimension(4, 4));
        panel.setPreferredSize(new java.awt.Dimension(4, 4));
        panel.setLayout(new java.awt.BorderLayout());

        PanelControles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        ButtonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/arrows/Arrow-Up.PNG"))); // NOI18N

        ButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/arrows/Arrow-Left.PNG"))); // NOI18N

        ButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/arrows/Arrow-Right.PNG"))); // NOI18N

        ButtonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/arrows/Arrow-Down.PNG"))); // NOI18N

        javax.swing.GroupLayout PanelControlesLayout = new javax.swing.GroupLayout(PanelControles);
        PanelControles.setLayout(PanelControlesLayout);
        PanelControlesLayout.setHorizontalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ButtonLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonRight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelControlesLayout.setVerticalGroup(
            PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlesLayout.createSequentialGroup()
                .addGroup(PanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addComponent(ButtonUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDown))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ButtonRight))
                    .addGroup(PanelControlesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ButtonLeft)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pauseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(SpinnerMove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(initButton)
                        .addComponent(restartButton)
                        .addComponent(pauseButton))
                    .addComponent(SpinnerMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDown;
    private javax.swing.JButton ButtonLeft;
    private javax.swing.JButton ButtonRight;
    private javax.swing.JButton ButtonUp;
    private javax.swing.JPanel PanelControles;
    private javax.swing.JSpinner SpinnerMove;
    private javax.swing.JButton initButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton restartButton;
    // End of variables declaration//GEN-END:variables
public class ListenerMover implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton)e.getSource();
            String txt = boton.getIcon().toString() ;
            System.out.println("texto: "+ txt);
            if(txt.contains("Up")){
                animation.Mover((int)SpinnerMove.getValue(), 1);
            }else if(txt.contains("Down")){
                animation.Mover((int)SpinnerMove.getValue(), 2);
            }else if(txt.contains("Left")){
                animation.Mover((int)SpinnerMove.getValue(), 4);
            }else if(txt.contains("Right")){
                animation.Mover((int)SpinnerMove.getValue(), 3);
            }
        }
    
} 

}
