package over.core;

import com.banorte.BanorteException;
import com.banorte.pinpad.Vx820Segura;
import com.banorte.ConectorBanorte;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <code>KeyLoader</code> class.
 * @author Overload Inc.
 * @version 1.0, 13 Feb 2022
 */
public class KeyLoader extends JFrame {
    private JButton btnCharge;
    private JButton btnSale;
    private JLabel lblControlNumber;
    private JLabel lblId;
    private JLabel lblLanguage;
    private JLabel lblPassword;
    private JLabel lblTitle;
    private JLabel lblUrl;
    private JLabel lblUser;
    private JPanel mainPanel;
    private JPanel titlePanel;
    private JTextField txtControlNumber;
    private JTextField txtId;
    private JTextField txtLanguage;
    private JTextField txtPassword;
    private JTextField txtUrl;
    private JTextField txtUser;

    /**
     * Constructor of FrameKey class
     */
    public KeyLoader() {
        initComponents();
        setDefaultInformation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        titlePanel = new JPanel();
        lblTitle = new JLabel();
        mainPanel = new JPanel();
        lblId = new JLabel();
        txtId = new JTextField();
        lblUser = new JLabel();
        txtUser = new JTextField();
        lblPassword = new JLabel();
        txtPassword = new JTextField();
        lblControlNumber = new JLabel();
        txtControlNumber = new JTextField();
        lblLanguage = new JLabel();
        txtLanguage = new JTextField();
        lblUrl = new JLabel();
        txtUrl = new JTextField();
        btnSale = new JButton();
        btnCharge = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPinpad v1.0");
        setMinimumSize(new Dimension(600, 350));
        setName("frmKey"); 

        titlePanel.setMinimumSize(new Dimension(600, 20));
        titlePanel.setName("titlePanel"); 
        titlePanel.setPreferredSize(new Dimension(600, 20));
        titlePanel.setLayout(new BorderLayout());

        lblTitle.setFont(new Font("Tahoma", 1, 14)); 
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setText("Carga de Llave");
        lblTitle.setHorizontalTextPosition(SwingConstants.CENTER);
        lblTitle.setName("lblTitle"); 
        titlePanel.add(lblTitle, BorderLayout.NORTH);

        getContentPane().add(titlePanel, BorderLayout.NORTH);

        mainPanel.setMinimumSize(new Dimension(600, 330));
        mainPanel.setName("mainPanel"); 
        mainPanel.setPreferredSize(new Dimension(600, 330));
        mainPanel.setLayout(new GridBagLayout());

        lblId.setFont(new Font("Tahoma", 0, 12)); 
        lblId.setText("Id");
        lblId.setName("lblId"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblId, gridBagConstraints);

        txtId.setFont(new Font("Tahoma", 0, 12)); 
        txtId.setMinimumSize(new Dimension(100, 30));
        txtId.setName("txtId"); 
        txtId.setPreferredSize(new Dimension(100, 30));
        txtId.addActionListener(evt -> txtIdActionPerformed(evt));
        txtId.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtId, gridBagConstraints);

        lblUser.setFont(new Font("Tahoma", 0, 12)); 
        lblUser.setText("User");
        lblUser.setName("lblUser"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblUser, gridBagConstraints);

        txtUser.setFont(new Font("Tahoma", 0, 12)); 
        txtUser.setMinimumSize(new Dimension(200, 30));
        txtUser.setName("txtUser"); 
        txtUser.setPreferredSize(new Dimension(200, 30));
        txtUser.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtUser, gridBagConstraints);

        lblPassword.setFont(new Font("Tahoma", 0, 12)); 
        lblPassword.setText("Password");
        lblPassword.setName("lblPassword"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblPassword, gridBagConstraints);

        txtPassword.setFont(new Font("Tahoma", 0, 12)); 
        txtPassword.setMinimumSize(new Dimension(200, 30));
        txtPassword.setName("txtPassword"); 
        txtPassword.setPreferredSize(new Dimension(200, 30));
        txtPassword.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtPassword, gridBagConstraints);

        lblControlNumber.setFont(new Font("Tahoma", 0, 12)); 
        lblControlNumber.setText("Control No.");
        lblControlNumber.setName("lblControlNumber"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblControlNumber, gridBagConstraints);

        txtControlNumber.setFont(new Font("Tahoma", 0, 12)); 
        txtControlNumber.setMinimumSize(new Dimension(200, 30));
        txtControlNumber.setName("txtControlNumber"); 
        txtControlNumber.setPreferredSize(new Dimension(200, 30));
        txtControlNumber.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtControlNumberKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtControlNumber, gridBagConstraints);

        lblLanguage.setFont(new Font("Tahoma", 0, 12)); 
        lblLanguage.setText("Languange");
        lblLanguage.setName("lblLanguage"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblLanguage, gridBagConstraints);

        txtLanguage.setFont(new Font("Tahoma", 0, 12)); 
        txtLanguage.setMinimumSize(new Dimension(100, 30));
        txtLanguage.setName("txtLanguage"); 
        txtLanguage.setPreferredSize(new Dimension(100, 30));
        txtLanguage.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtLanguageKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtLanguage, gridBagConstraints);

        lblUrl.setFont(new Font("Tahoma", 0, 12)); 
        lblUrl.setText("URL");
        lblUrl.setName("lblUrl"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        mainPanel.add(lblUrl, gridBagConstraints);

        txtUrl.setFont(new Font("Tahoma", 0, 12)); 
        txtUrl.setMinimumSize(new Dimension(400, 30));
        txtUrl.setName("txtUrl"); 
        txtUrl.setPreferredSize(new Dimension(400, 30));
        txtUrl.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtUrlKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(txtUrl, gridBagConstraints);

        btnSale.setFont(new Font("Tahoma", 0, 12)); 
        btnSale.setIcon(new ImageIcon(getClass().getResource("/over/resources/img/sale.png")));
        btnSale.setText("Venta");
        btnSale.setMaximumSize(new Dimension(100, 33));
        btnSale.setMinimumSize(new Dimension(100, 33));
        btnSale.setName("btnSale"); 
        btnSale.setPreferredSize(new Dimension(100, 33));
        btnSale.addActionListener(evt -> btnSaleActionPerformed(evt));
        btnSale.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnSaleKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(btnSale, gridBagConstraints);

        btnCharge.setFont(new Font("Tahoma", 0, 12)); 
        btnCharge.setIcon(new ImageIcon(getClass().getResource("/over/resources/img/load.png")));
        btnCharge.setText("Cargar");
        btnCharge.setMaximumSize(new Dimension(100, 33));
        btnCharge.setMinimumSize(new Dimension(100, 33));
        btnCharge.setName("btnCharge"); 
        btnCharge.setPreferredSize(new Dimension(100, 33));
        btnCharge.addActionListener(evt -> btnChargeActionPerformed(evt));
        btnCharge.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                btnChargeKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(btnCharge, gridBagConstraints);

        getContentPane().add(mainPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private void btnSaleActionPerformed(ActionEvent evt) {
        openSaleWindow();
    }

    private void btnChargeActionPerformed(ActionEvent evt) {
        load();
    }

    private void txtIdActionPerformed(ActionEvent evt) {
        
    }

    private void txtIdKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtUserKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtPasswordKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtControlNumberKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtLanguageKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtUrlKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void btnChargeKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void btnSaleKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    /**
     * Sets the KeyLoader frame's information
     */
    public void setDefaultInformation(){
        txtId.setText("");
        txtUser.setText("");
        txtPassword.setText("");
        txtControlNumber.setText("");
        txtLanguage.setText("EN");
        txtUrl.setText("https://via.pagosbanorte.com/InterredesSeguro");
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
                case "txtId": txtUser.requestFocusInWindow(); break;
                case "txtUser": txtPassword.requestFocusInWindow(); break;
                case "txtPassword": txtControlNumber.requestFocusInWindow(); break;
                case "txtControlNumber": txtLanguage.requestFocusInWindow(); break;
                case "txtLanguage": txtUrl.requestFocusInWindow(); break;
                case "txtUrl": btnCharge.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 38){
            switch(key){                
                case "txtUser": txtId.requestFocusInWindow(); break;
                case "txtPassword": txtUser.requestFocusInWindow(); break;
                case "txtControlNumber": txtPassword.requestFocusInWindow(); break;
                case "txtLanguage": txtControlNumber.requestFocusInWindow(); break;
                case "txtUrl": txtLanguage.requestFocusInWindow(); break;
                case "btnCharge": 
                case "btnSale": txtUrl.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 10 && key.equals("btnCharge")){
            load();
        }
        else if(keyCode == 10 && key.equals("btnSale")){
            openSaleWindow();
        }
        else if(keyCode == 37 && key.equals("btnCharge")){
            btnSale.requestFocusInWindow();
        }
        else if(keyCode == 39 && key.equals("btnSale")){
            btnCharge.requestFocusInWindow();
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
     * Performs the information load
     */
    public void load(){
        Vx820Segura pinpad  = new Vx820Segura("EN");

        HashMap information = new HashMap();
        
        String serialNumber = "";

        try {
            pinpad.getInformation(information);
            
            serialNumber = String.valueOf(information.get("SERIAL_NUMBER"));
        }
        catch (BanorteException e){
            System.out.println("Information retrieval failed: " + e.getMessage());
        }

        //Creation of HashMap to get the selector
        HashMap outgoingSelector = new HashMap();
        
        String selector = "";
        
        try {
            pinpad.getSelector(outgoingSelector);
            
            selector = String.valueOf(outgoingSelector.get("SELECTOR"));
        }
        catch (BanorteException e){
            System.out.println("Selector retrieval failed: " + e.getMessage());
        }

        //Creation of HashMaps to get the key
        HashMap incomingKey = new HashMap();
        HashMap outgoingKey = new HashMap();                        

        //Setting the incomingKey HashMap parameters
        incomingKey.put("MERCHANT_ID", txtId.getText());
        incomingKey.put("USER", txtUser.getText());
        incomingKey.put("PASSWORD", txtPassword.getText());
        incomingKey.put("RESPONSE_LANGUAGE", txtLanguage.getText());
        incomingKey.put("CMD_TRANS", "GET_KEY");
        incomingKey.put("CONTROL_NUMBER", txtControlNumber.getText());
        incomingKey.put("BANORTE_URL", "https://via.pagosbanorte.com/InterredesSeguro");
        incomingKey.put("SELECTOR", selector);

        //Using sendTransaction method to request the key
        try {
            ConectorBanorte.sendTransaction(incomingKey, outgoingKey);
        }
        catch (BanorteException e){
            System.out.println("Key retrieval failed: " + e.getMessage());
        }

        //Getting response information
        String payworksResult = String.valueOf(outgoingKey.get("PAYW_RESULT"));
        String payworksCode = String.valueOf(outgoingKey.get("PAYW_CODE"));        
        String masterKey = String.valueOf(outgoingKey.get("TEXT"));

        //payworksResult correctness validation ("A")        
        if (!payworksResult.equals("A")) {
            HashMap loadCancellation = new HashMap();
            
            loadCancellation.put("SERIAL_NUMBER", serialNumber);

            //Key load cancellation
            try {
                pinpad.cancelarCargaLlave(incomingKey);
            }
            catch (BanorteException e){
                System.out.println("Charge cancellation failed: " + e.getMessage());
            }
        } 
        else {
            //HashMap creation to load the pinpad key
            HashMap keyLoad = new HashMap();
            
            keyLoad.put("SERIAL_NUMBER", serialNumber);
            keyLoad.put("MASTER_KEY", masterKey);

            //Charging Pinpad key
            try {
                pinpad.loadMasterKey(keyLoad);
            } 
            catch (BanorteException e) {
                System.out.println("Key charge failed: " + e.getMessage());
            }
        }     
    }
    
    /**
     * Opens the FrameVenta window
     */
    public void openSaleWindow(){
        Sales mvv = new Sales();
        
        mvv.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeyLoader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyLoader().setVisible(true);
            }
        });
    }
}