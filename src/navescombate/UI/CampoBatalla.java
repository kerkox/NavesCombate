package navescombate.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import navescombate.UI.Animation.Animation;

public class CampoBatalla extends javax.swing.JFrame {

    Animation animacion=null;
    
    public CampoBatalla() {
        initComponents();
        SpinnerMove.setValue(10);
        animacion = new Animation();
        animacion.init();
        this.panel.add(animacion);
        ListenerMover lm = new ListenerMover();
        this.ButtonMoveDown.addActionListener(lm);
        this.ButtonMoveLeft.addActionListener(lm);
        this.ButtonMoveRight.addActionListener(lm);
        this.ButtonMoveUp.addActionListener(lm);
        
        this.ButtonStart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                animacion.init();
            }
        });
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        ButtonStart = new javax.swing.JButton();
        ButtonMoveUp = new javax.swing.JButton();
        ButtonMoveRight = new javax.swing.JButton();
        ButtonMoveLeft = new javax.swing.JButton();
        ButtonMoveDown = new javax.swing.JButton();
        SpinnerMove = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        ButtonStart.setText("Iniciar");

        ButtonMoveUp.setText("Mover Arriba");

        ButtonMoveRight.setText("Mover Derecha");

        ButtonMoveLeft.setText("Mover Izquierda");

        ButtonMoveDown.setText("Mover Abajo");

        jLabel1.setText("Unidades a mover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonStart)
                        .addGap(87, 87, 87)
                        .addComponent(ButtonMoveUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(SpinnerMove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(ButtonMoveLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonMoveRight)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(ButtonMoveDown)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerMove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonMoveRight))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonStart)
                            .addComponent(ButtonMoveUp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(ButtonMoveLeft)))
                .addGap(18, 18, 18)
                .addComponent(ButtonMoveDown)
                .addGap(47, 47, 47))
        );

        ButtonMoveUp.getAccessibleContext().setAccessibleDescription("1");
        ButtonMoveRight.getAccessibleContext().setAccessibleDescription("3");
        ButtonMoveLeft.getAccessibleContext().setAccessibleDescription("4");
        ButtonMoveDown.getAccessibleContext().setAccessibleDescription("2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMoveDown;
    private javax.swing.JButton ButtonMoveLeft;
    private javax.swing.JButton ButtonMoveRight;
    private javax.swing.JButton ButtonMoveUp;
    private javax.swing.JButton ButtonStart;
    private javax.swing.JSpinner SpinnerMove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
public class ListenerMover implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton)e.getSource();
            String txt = boton.getText();
            if(txt.contains("Arriba")){
                animacion.Mover((int)SpinnerMove.getValue(), 1);
            }else if(txt.contains("Abajo")){
                animacion.Mover((int)SpinnerMove.getValue(), 2);
            }else if(txt.contains("Izquierda")){
                animacion.Mover((int)SpinnerMove.getValue(), 4);
            }else if(txt.contains("Derecha")){
                animacion.Mover((int)SpinnerMove.getValue(), 3);
            }
        }
    
} 


}
