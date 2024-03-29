package inaki.sw.calc.view.swing;

import inaki.sw.calc.controller.Controller;
import inaki.sw.calc.view.IMainView;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import static javax.swing.UIManager.setLookAndFeel;

/**
 *
 * @author inaki
 * @version 1.1.1
 * @since 1.0
 */
public class MainView extends javax.swing.JFrame implements IMainView {

    private Controller c;

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTop = new javax.swing.JPanel();
        jtfTop = new javax.swing.JTextField();
        jtfOp = new javax.swing.JTextField();
        jtfMain = new javax.swing.JTextField();
        jpMainLeft = new javax.swing.JPanel();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbEmpty = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbDot = new javax.swing.JButton();
        jpMainRight = new javax.swing.JPanel();
        jbDivide = new javax.swing.JButton();
        jbMultiply = new javax.swing.JButton();
        jbPlusMinus = new javax.swing.JButton();
        jbPow = new javax.swing.JButton();
        jbAdd = new javax.swing.JButton();
        jbSubstract = new javax.swing.JButton();
        jbEqual = new javax.swing.JButton();
        jbBackSpace = new javax.swing.JButton();
        jpBottom = new javax.swing.JPanel();
        jbQuit = new javax.swing.JButton();
        jbAns = new javax.swing.JButton();
        jbClean = new javax.swing.JButton();
        jlVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/inaki/sw/calc/icon/isw-calc-96.png")).getImage());

        jpTop.setFocusable(false);

        jtfTop.setEditable(false);
        jtfTop.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfTop.setFocusable(false);

        jtfOp.setEditable(false);
        jtfOp.setColumns(1);
        jtfOp.setFocusable(false);

        jtfMain.setEditable(false);
        jtfMain.setColumns(20);
        jtfMain.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jpTopLayout = new javax.swing.GroupLayout(jpTop);
        jpTop.setLayout(jpTopLayout);
        jpTopLayout.setHorizontalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTopLayout.createSequentialGroup()
                        .addComponent(jtfTop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpTopLayout.setVerticalGroup(
            jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMainLeft.setFocusable(false);

        jb7.setText("7");
        jb7.setFocusable(false);

        jb8.setText("8");
        jb8.setFocusable(false);

        jb9.setText("9");
        jb9.setFocusable(false);

        jb4.setText("4");
        jb4.setFocusable(false);

        jb5.setText("5");
        jb5.setFocusable(false);

        jb6.setText("6");
        jb6.setFocusable(false);

        jb1.setText("1");
        jb1.setFocusable(false);

        jb2.setText("2");
        jb2.setFocusable(false);

        jb3.setText("3");
        jb3.setFocusable(false);

        jbEmpty.setText(" ");
        jbEmpty.setEnabled(false);
        jbEmpty.setFocusable(false);

        jb0.setText("0");
        jb0.setFocusable(false);

        jbDot.setText(".");
        jbDot.setFocusable(false);

        javax.swing.GroupLayout jpMainLeftLayout = new javax.swing.GroupLayout(jpMainLeft);
        jpMainLeft.setLayout(jpMainLeftLayout);
        jpMainLeftLayout.setHorizontalGroup(
            jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMainLeftLayout.createSequentialGroup()
                        .addComponent(jb7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb9))
                    .addGroup(jpMainLeftLayout.createSequentialGroup()
                        .addComponent(jb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb6))
                    .addGroup(jpMainLeftLayout.createSequentialGroup()
                        .addComponent(jb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb3))
                    .addGroup(jpMainLeftLayout.createSequentialGroup()
                        .addComponent(jbEmpty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDot)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMainLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jbDot, jbEmpty});

        jpMainLeftLayout.setVerticalGroup(
            jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7)
                    .addComponent(jb8)
                    .addComponent(jb9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4)
                    .addComponent(jb5)
                    .addComponent(jb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEmpty)
                    .addComponent(jb0)
                    .addComponent(jbDot))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMainLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jbDot, jbEmpty});

        jpMainRight.setFocusable(false);

        jbDivide.setText("/");
        jbDivide.setFocusable(false);

        jbMultiply.setText("*");
        jbMultiply.setFocusable(false);

        jbPlusMinus.setText("+/-");
        jbPlusMinus.setFocusable(false);

        jbPow.setText("^");
        jbPow.setFocusable(false);

        jbAdd.setText("+");
        jbAdd.setFocusable(false);

        jbSubstract.setText("-");
        jbSubstract.setFocusable(false);

        jbEqual.setText("=");
        jbEqual.setFocusable(false);

        jbBackSpace.setText("<-");
        jbBackSpace.setFocusable(false);

        javax.swing.GroupLayout jpMainRightLayout = new javax.swing.GroupLayout(jpMainRight);
        jpMainRight.setLayout(jpMainRightLayout);
        jpMainRightLayout.setHorizontalGroup(
            jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpMainRightLayout.createSequentialGroup()
                        .addComponent(jbPow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbPlusMinus))
                    .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainRightLayout.createSequentialGroup()
                            .addComponent(jbMultiply)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbDivide))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainRightLayout.createSequentialGroup()
                            .addComponent(jbBackSpace)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbEqual)))
                    .addGroup(jpMainRightLayout.createSequentialGroup()
                        .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSubstract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpMainRightLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbBackSpace, jbDivide, jbEqual, jbMultiply, jbPlusMinus, jbPow});

        jpMainRightLayout.setVerticalGroup(
            jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPow)
                    .addComponent(jbPlusMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDivide)
                    .addComponent(jbMultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd)
                    .addComponent(jbSubstract))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEqual)
                    .addComponent(jbBackSpace))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpMainRightLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbBackSpace, jbDivide, jbEqual, jbMultiply, jbPlusMinus, jbPow});

        jpBottom.setFocusable(false);

        jbQuit.setText("Quit");
        jbQuit.setFocusable(false);

        jbAns.setText("Ans");
        jbAns.setFocusable(false);

        jbClean.setText("Clean");
        jbClean.setFocusable(false);

        jlVersion.setText("?");

        javax.swing.GroupLayout jpBottomLayout = new javax.swing.GroupLayout(jpBottom);
        jpBottom.setLayout(jpBottomLayout);
        jpBottomLayout.setHorizontalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlVersion)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jbQuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbClean)
                .addContainerGap())
        );
        jpBottomLayout.setVerticalGroup(
            jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbQuit)
                    .addComponent(jbAns)
                    .addComponent(jbClean)
                    .addComponent(jlVersion))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpMainLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpMainRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMainLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMainRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setController(Controller c) {
        this.c = c;
        jtfMain.addActionListener(this.c);
        jtfMain.addKeyListener(this.c);
        jtfMain.setActionCommand(EQUAL);
        /* NUMBERS */
        jb0.addActionListener(this.c);
        jb0.setActionCommand(B0);
        jb1.addActionListener(this.c);
        jb1.setActionCommand(B1);
        jb2.addActionListener(this.c);
        jb2.setActionCommand(B2);
        jb3.addActionListener(this.c);
        jb3.setActionCommand(B3);
        jb4.addActionListener(this.c);
        jb4.setActionCommand(B4);
        jb5.addActionListener(this.c);
        jb5.setActionCommand(B5);
        jb6.addActionListener(this.c);
        jb6.setActionCommand(B6);
        jb7.addActionListener(this.c);
        jb7.setActionCommand(B7);
        jb8.addActionListener(this.c);
        jb8.setActionCommand(B8);
        jb9.addActionListener(this.c);
        jb9.setActionCommand(B9);
        jbDot.addActionListener(this.c);
        jbDot.setActionCommand(DOT);
        /* OPERATORS */
        jbAdd.addActionListener(this.c);
        jbAdd.setActionCommand(ADD);
        jbSubstract.addActionListener(this.c);
        jbSubstract.setActionCommand(SUBSTRACT);
        jbMultiply.addActionListener(this.c);
        jbMultiply.setActionCommand(MULTIPLY);
        jbDivide.addActionListener(this.c);
        jbDivide.setActionCommand(DIVIDE);
        jbPow.addActionListener(this.c);
        jbPow.setActionCommand(POW);
        jbPlusMinus.addActionListener(this.c);
        jbPlusMinus.setActionCommand(PLUS_MINUS);
        jbBackSpace.addActionListener(this.c);
        jbBackSpace.setActionCommand(BACKSPACE);
        jbEqual.addActionListener(this.c);
        jbEqual.setActionCommand(EQUAL);
        /* ACTIONS */
        jbQuit.addActionListener(this.c);
        jbQuit.setActionCommand(QUIT);
        jbAns.addActionListener(this.c);
        jbAns.setActionCommand(ANS);
        jbClean.addActionListener(this.c);
        jbClean.setActionCommand(CLEAN);
    }

    @Override
    public void startView() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code ">
        try {
            setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            updateComponentTreeUI(this);
            this.repaint();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        } finally {
            this.pack();
        }
        //</editor-fold>

        this.clean();
        this.setVisible(true);
    }

    @Override
    public void clean() {
        jtfTop.setText("");
        jtfOp.setText("");
        jtfMain.setText(B0);
    }

    @Override
    public String getTopText() {
        return jtfTop.getText();
    }

    @Override
    public void setTopText(String s) {
        jtfTop.setText(s);
    }

    @Override
    public String getOpText() {
        return jtfOp.getText();
    }

    @Override
    public void setOpText(String s) {
        jtfOp.setText(s);
    }

    @Override
    public String getMainText() {
        return jtfMain.getText();
    }

    @Override
    public void setMainText(String s) {
        jtfMain.setText(s);
    }

    @Override
    public void setAnsEnabled(boolean b) {
        jbAns.setEnabled(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbAns;
    private javax.swing.JButton jbBackSpace;
    private javax.swing.JButton jbClean;
    private javax.swing.JButton jbDivide;
    private javax.swing.JButton jbDot;
    private javax.swing.JButton jbEmpty;
    private javax.swing.JButton jbEqual;
    private javax.swing.JButton jbMultiply;
    private javax.swing.JButton jbPlusMinus;
    private javax.swing.JButton jbPow;
    private javax.swing.JButton jbQuit;
    private javax.swing.JButton jbSubstract;
    private javax.swing.JLabel jlVersion;
    private javax.swing.JPanel jpBottom;
    private javax.swing.JPanel jpMainLeft;
    private javax.swing.JPanel jpMainRight;
    private javax.swing.JPanel jpTop;
    private javax.swing.JTextField jtfMain;
    private javax.swing.JTextField jtfOp;
    private javax.swing.JTextField jtfTop;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setVersion(String version) {
        if (version == null) {
            this.jlVersion.setVisible(false);
        } else {
            this.jlVersion.setVisible(true);
            this.jlVersion.setText(version);
        }
    }
}
