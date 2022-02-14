package over.core;

import com.banorte.BanorteException;
import com.banorte.pinpad.Vx820Segura;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <code>DeviceConfiguration</code> class.
 * @author Overload Inc.
 * @version 1.0, 13 Feb 2022
 */
public class DeviceConfiguration extends JFrame {
    private JButton btnNext;
    private JButton btnStart;
    private JPanel initPanel;
    private JLabel lblDataBit;
    private JLabel lblParity;
    private JLabel lblPort;
    private JLabel lblStopBit;
    private JLabel lblTitle;
    private JLabel lblVelocity;
    private JPanel mainPanel;
    private JPanel menuPanel;
    private JPanel titlePanel;
    private JTextField txtDataBit;
    private JTextField txtParity;
    private JTextField txtPort;
    private JTextField txtStopBit;
    private JTextField txtVelocity;
    
    /**
     * Constructor for component initialization
     */
    public DeviceConfiguration() {
        initComponents();
        setDefaultInformation();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        mainPanel = new JPanel();
        titlePanel = new JPanel();
        lblTitle = new JLabel();
        menuPanel = new JPanel();
        lblPort = new JLabel();
        txtPort = new JTextField();
        lblVelocity = new JLabel();
        txtVelocity = new JTextField();
        lblParity = new JLabel();
        txtParity = new JTextField();
        lblDataBit = new JLabel();
        txtDataBit = new JTextField();
        lblStopBit = new JLabel();
        txtStopBit = new JTextField();
        btnStart = new JButton();
        initPanel = new JPanel();
        btnNext = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPinpad v1.0");
        setName("frmInit"); 

        mainPanel.setName("mainPanel"); 
        mainPanel.setPreferredSize(new Dimension(400, 300));
        mainPanel.setLayout(new BorderLayout());

        titlePanel.setName("titlePanel"); 
        titlePanel.setLayout(new BorderLayout());

        lblTitle.setFont(new Font("Tahoma", 1, 14)); 
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setText("Iniciar Pinpad VeriFone vx820");
        lblTitle.setMaximumSize(new Dimension(206, 33));
        lblTitle.setMinimumSize(new Dimension(206, 33));
        lblTitle.setName("lblTitle"); 
        lblTitle.setPreferredSize(new Dimension(206, 33));
        titlePanel.add(lblTitle, BorderLayout.CENTER);

        mainPanel.add(titlePanel, BorderLayout.NORTH);

        menuPanel.setName("menuPanel"); 
        menuPanel.setPreferredSize(new Dimension(400, 231));
        GridBagLayout menuPanelLayout = new GridBagLayout();
        menuPanelLayout.columnWeights = new double[] {0.0};
        menuPanelLayout.rowWeights = new double[] {0.0};
        menuPanel.setLayout(menuPanelLayout);

        lblPort.setFont(new Font("Tahoma", 0, 12)); 
        lblPort.setHorizontalAlignment(SwingConstants.CENTER);
        lblPort.setText("Puerto");
        lblPort.setHorizontalTextPosition(SwingConstants.CENTER);
        lblPort.setName("lblPort"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        menuPanel.add(lblPort, gridBagConstraints);

        txtPort.setFont(new Font("Tahoma", 0, 12)); 
        txtPort.setHorizontalAlignment(JTextField.LEFT);
        txtPort.setToolTipText("Número de puerto de comunicación");
        txtPort.setMinimumSize(new Dimension(100, 30));
        txtPort.setName("txtPort"); 
        txtPort.setPreferredSize(new Dimension(100, 30));
        txtPort.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtPortKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        menuPanel.add(txtPort, gridBagConstraints);

        lblVelocity.setFont(new Font("Tahoma", 0, 12)); 
        lblVelocity.setHorizontalAlignment(SwingConstants.CENTER);
        lblVelocity.setText("Velocidad");
        lblVelocity.setHorizontalTextPosition(SwingConstants.CENTER);
        lblVelocity.setName("lblVelocity"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        menuPanel.add(lblVelocity, gridBagConstraints);

        txtVelocity.setFont(new Font("Tahoma", 0, 12)); 
        txtVelocity.setToolTipText("Velocidad de respuesta");
        txtVelocity.setMinimumSize(new Dimension(200, 30));
        txtVelocity.setName("txtVelocity"); 
        txtVelocity.setPreferredSize(new Dimension(200, 30));
        txtVelocity.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtVelocityKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weighty = 1.0;
        menuPanel.add(txtVelocity, gridBagConstraints);
        txtVelocity.getAccessibleContext().setAccessibleName("");

        lblParity.setFont(new Font("Tahoma", 0, 12)); 
        lblParity.setHorizontalAlignment(SwingConstants.CENTER);
        lblParity.setText("Paridad");
        lblParity.setHorizontalTextPosition(SwingConstants.CENTER);
        lblParity.setName("lblParity"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        menuPanel.add(lblParity, gridBagConstraints);

        txtParity.setFont(new Font("Tahoma", 0, 12)); 
        txtParity.setToolTipText("Paridad de datos");
        txtParity.setMinimumSize(new Dimension(200, 30));
        txtParity.setName("txtParity"); 
        txtParity.setPreferredSize(new Dimension(200, 30));
        txtParity.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtParityKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 1.0;
        menuPanel.add(txtParity, gridBagConstraints);

        lblDataBit.setFont(new Font("Tahoma", 0, 12)); 
        lblDataBit.setHorizontalAlignment(SwingConstants.CENTER);
        lblDataBit.setText("Bits de Datos ");
        lblDataBit.setHorizontalTextPosition(SwingConstants.CENTER);
        lblDataBit.setName("lblDataBit"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        menuPanel.add(lblDataBit, gridBagConstraints);

        txtDataBit.setFont(new Font("Tahoma", 0, 12)); 
        txtDataBit.setToolTipText("Bits de datos");
        txtDataBit.setMinimumSize(new Dimension(200, 30));
        txtDataBit.setName("txtDataBit"); 
        txtDataBit.setPreferredSize(new Dimension(200, 30));
        txtDataBit.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtDataBitKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 1.0;
        menuPanel.add(txtDataBit, gridBagConstraints);

        lblStopBit.setFont(new Font("Tahoma", 0, 12)); 
        lblStopBit.setHorizontalAlignment(SwingConstants.CENTER);
        lblStopBit.setText("Bits de Paro");
        lblStopBit.setHorizontalTextPosition(SwingConstants.CENTER);
        lblStopBit.setName("lblStopBit"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        menuPanel.add(lblStopBit, gridBagConstraints);

        txtStopBit.setFont(new Font("Tahoma", 0, 12)); 
        txtStopBit.setToolTipText("Bits de paro");
        txtStopBit.setMinimumSize(new Dimension(200, 30));
        txtStopBit.setName("txtStopBit"); 
        txtStopBit.setPreferredSize(new Dimension(200, 30));
        txtStopBit.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtStopBitKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weighty = 1.0;
        menuPanel.add(txtStopBit, gridBagConstraints);

        btnStart.setFont(new Font("Tahoma", 0, 12)); 
        btnStart.setIcon(new ImageIcon(getClass().getResource("/over/resources/img/pinpad_start.png")));
        btnStart.setText("Iniciar");
        btnStart.setToolTipText("Iniciar la configuración del dispositivo");
        btnStart.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnStart.setMaximumSize(new Dimension(100, 33));
        btnStart.setMinimumSize(new Dimension(100, 33));
        btnStart.setName("btnStart"); 
        btnStart.setPreferredSize(new Dimension(100, 33));
        btnStart.addActionListener(evt -> btnStartActionPerformed(evt));
        btnStart.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnStartKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        menuPanel.add(btnStart, gridBagConstraints);

        mainPanel.add(menuPanel, BorderLayout.CENTER);

        initPanel.setName("initPanel"); 
        initPanel.setLayout(new BorderLayout());

        btnNext.setFont(new Font("Tahoma", 0, 12)); 
        btnNext.setIcon(new ImageIcon(getClass().getResource("/over/resources/img/next.png")));
        btnNext.setText("Siguiente");
        btnNext.setToolTipText("Siguiente formulario");
        btnNext.setMaximumSize(new Dimension(83, 33));
        btnNext.setMinimumSize(new Dimension(83, 33));
        btnNext.setName("btnNext"); 
        btnNext.setPreferredSize(new Dimension(83, 33));
        btnNext.addActionListener(evt -> btnNextActionPerformed(evt));
        btnNext.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnNextKeyPressed(evt);
            }
        });
        initPanel.add(btnNext, BorderLayout.CENTER);

        mainPanel.add(initPanel, BorderLayout.PAGE_END);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnNextActionPerformed(ActionEvent evt) {
        openFrameKey();
    }

    private void btnStartActionPerformed(ActionEvent evt) {
        start();
    }

    private void txtPortKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtVelocityKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtParityKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtDataBitKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtStopBitKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void btnNextKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void btnStartKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }
    
    /**
     * Sets the JTextField information
     */
    public void setDefaultInformation(){
        txtPort.setText("COM9");
        txtVelocity.setText("19200");
        txtParity.setText("N");
        txtStopBit.setText("1");
        txtDataBit.setText("8");
    }
    
    /**
     * Sets the key where the cursor must be located
     * @param evt the key event
     */
    public void setFocus(KeyEvent evt) {
        String key = getKeySource(evt);
        int keyCode = evt.getKeyCode();                
        
        if(keyCode == 40) {                        
            switch(key){
                case "txtPort": txtVelocity.requestFocusInWindow(); break;
                case "txtVelocity": txtParity.requestFocusInWindow(); break;
                case "txtParity": txtDataBit.requestFocusInWindow(); break;
                case "txtDataBit": txtStopBit.requestFocusInWindow(); break;
                case "txtStopBit": btnStart.requestFocusInWindow(); break;
                case "btnStart": btnNext.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 38){
            switch(key){                
                case "txtVelocity": txtPort.requestFocusInWindow(); break;
                case "txtParity": txtVelocity.requestFocusInWindow(); break;
                case "txtDataBit": txtParity.requestFocusInWindow(); break;
                case "txtStopBit": txtDataBit.requestFocusInWindow(); break;
                case "btnStart": txtStopBit.requestFocusInWindow(); break;
                case "btnNext": btnStart.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 10 && key.equals("btnNext")){
            openFrameKey();
        }
        else if(keyCode == 10 && key.equals("btnStart")){
            start();
        }
    }
    
    /**
     * Gets the name of the key event source.
     * @param evt the key event
     * @return the name of the source where the event is found
     */
    public String getKeySource(KeyEvent evt) {
        String keySource = evt.getSource().getClass().getSimpleName();
        String key = null;
        
        if(keySource.equals("JTextField"))
            key = ((JTextField)evt.getSource()).getName();
        else if(keySource.equals("JButton"))
            key = ((JButton)evt.getSource()).getName();
        
        return key;
    }
    
    /**
     * Opens the KeyLoader window
     */
    public void openFrameKey(){
        this.setVisible(false);
        
        KeyLoader frm = new KeyLoader();
        frm.setVisible(true);        
    }
    
    /**
     * Starts the device configuration
     */
    public void start(){
        Vx820Segura pinpad = new Vx820Segura("EN");        
        
        //Initial parameters
        HashMap configuration = new HashMap(5);
        
        configuration.put("PORT", txtPort.getText());
        configuration.put("BAUD_RATE", txtVelocity.getText());
        configuration.put("PARITY", txtParity.getText());
        configuration.put("STOP_BITS", txtStopBit.getText());
        configuration.put("DATA_BITS", txtDataBit.getText());
        
        //Pinpad initializated according to the established parameters
        try {
            pinpad.prepareDevice(configuration);
            
            JOptionPane.showMessageDialog(null, "Device successfully initialized");
        }
        catch(BanorteException e) {
            System.out.println("Pinpad initialization error: " + e.getMessage());
        }
    }
    
    /**
     * Main method for application execution
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeviceConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(() -> {
            new DeviceConfiguration().setVisible(true);
        });
    }
}