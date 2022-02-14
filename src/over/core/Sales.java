package over.core;

import com.banorte.BanorteException;
import com.banorte.pinpad.Vx820Segura;
import com.banorte.ConectorBanorte;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * <code>Sales</code> class.
 * @author Overload Inc.
 * @version 1.0, 13 Feb 2022
 */
public class Sales extends JFrame {
    private JButton btnSale;
    private JLabel lblAmount;
    private JLabel lblControlNumber;
    private JLabel lblLanguage;
    private JLabel lblMerchantId;
    private JLabel lblPassword;
    private JLabel lblTerminalId;
    private JLabel lblTitle;
    private JLabel lblUrl;
    private JLabel lblUser;
    private JPanel salePanel;
    private JPanel titlePanel;
    private JTextField txtAmount;
    private JTextField txtControlNumber;
    private JTextField txtLanguage;
    private JTextField txtMerchantId;
    private JTextField txtPassword;
    private JTextField txtTerminalId;
    private JTextField txtUrl;
    private JTextField txtUser;
    
    //Llenamos la tabla para enviar la transacción
    public Sales() {
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
        salePanel = new JPanel();
        lblMerchantId = new JLabel();
        txtMerchantId = new JTextField();
        lblUser = new JLabel();
        txtUser = new JTextField();
        lblPassword = new JLabel();
        txtPassword = new JTextField();
        lblTerminalId = new JLabel();
        txtTerminalId = new JTextField();
        lblAmount = new JLabel();
        txtAmount = new JTextField();
        lblControlNumber = new JLabel();
        txtControlNumber = new JTextField();
        lblLanguage = new JLabel();
        txtLanguage = new JTextField();
        lblUrl = new JLabel();
        txtUrl = new JTextField();
        btnSale = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPinpad v1.0");
        setMinimumSize(new Dimension(600, 400));
        setName("frmSales"); 

        titlePanel.setMinimumSize(new Dimension(600, 20));
        titlePanel.setName("titlePanel"); 
        titlePanel.setPreferredSize(new Dimension(600, 20));

        lblTitle.setFont(new Font("Tahoma", 1, 14)); 
        lblTitle.setText("Ventas");
        lblTitle.setName("lblTitle"); 

        GroupLayout titlePanelLayout = new GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(titlePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(titlePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(titlePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(titlePanel, BorderLayout.NORTH);

        salePanel.setMinimumSize(new Dimension(600, 380));
        salePanel.setName("salePanel"); 
        salePanel.setPreferredSize(new Dimension(600, 380));
        salePanel.setLayout(new GridBagLayout());

        lblMerchantId.setFont(new Font("Tahoma", 0, 12)); 
        lblMerchantId.setText("Merchant ID");
        lblMerchantId.setName("lblMerchantId"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblMerchantId, gridBagConstraints);

        txtMerchantId.setFont(new Font("Tahoma", 0, 12)); 
        txtMerchantId.setMinimumSize(new Dimension(200, 30));
        txtMerchantId.setName("txtMerchantId"); 
        txtMerchantId.setPreferredSize(new Dimension(200, 30));
        txtMerchantId.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtMerchantIdKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtMerchantId, gridBagConstraints);

        lblUser.setFont(new Font("Tahoma", 0, 12)); 
        lblUser.setText("User");
        lblUser.setName("lblUser"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblUser, gridBagConstraints);

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
        salePanel.add(txtUser, gridBagConstraints);

        lblPassword.setFont(new Font("Tahoma", 0, 12)); 
        lblPassword.setText("Password");
        lblPassword.setName("lblPassword"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblPassword, gridBagConstraints);

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
        salePanel.add(txtPassword, gridBagConstraints);

        lblTerminalId.setFont(new Font("Tahoma", 0, 12)); 
        lblTerminalId.setText("Terminal ID");
        lblTerminalId.setName("lblTerminalId"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblTerminalId, gridBagConstraints);

        txtTerminalId.setFont(new Font("Tahoma", 0, 12)); 
        txtTerminalId.setMinimumSize(new Dimension(200, 30));
        txtTerminalId.setName("txtTerminalId"); 
        txtTerminalId.setPreferredSize(new Dimension(200, 30));
        txtTerminalId.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtTerminalIdKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtTerminalId, gridBagConstraints);

        lblAmount.setFont(new Font("Tahoma", 0, 12)); 
        lblAmount.setText("Amount");
        lblAmount.setName("lblAmount"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblAmount, gridBagConstraints);

        txtAmount.setFont(new Font("Tahoma", 0, 12)); 
        txtAmount.setMinimumSize(new Dimension(200, 30));
        txtAmount.setName("txtAmount"); 
        txtAmount.setPreferredSize(new Dimension(200, 30));
        txtAmount.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtAmountKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtAmount, gridBagConstraints);

        lblControlNumber.setFont(new Font("Tahoma", 0, 12)); 
        lblControlNumber.setText("Control Number");
        lblControlNumber.setName("lblControlNumber"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblControlNumber, gridBagConstraints);

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
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtControlNumber, gridBagConstraints);

        lblLanguage.setFont(new Font("Tahoma", 0, 12)); 
        lblLanguage.setText("Language");
        lblLanguage.setName("lblLanguage"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblLanguage, gridBagConstraints);

        txtLanguage.setFont(new Font("Tahoma", 0, 12)); 
        txtLanguage.setMinimumSize(new Dimension(200, 30));
        txtLanguage.setName("txtLanguage"); 
        txtLanguage.setPreferredSize(new Dimension(200, 30));
        txtLanguage.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                txtLanguageKeyPressed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtLanguage, gridBagConstraints);

        lblUrl.setFont(new Font("Tahoma", 0, 12)); 
        lblUrl.setText("URL");
        lblUrl.setName("lblUrl"); 
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        salePanel.add(lblUrl, gridBagConstraints);

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
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(txtUrl, gridBagConstraints);

        btnSale.setFont(new Font("Tahoma", 0, 12)); 
        btnSale.setIcon(new ImageIcon(getClass().getResource("/over/resources/img/sales.png")));
        btnSale.setText("Vender");
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weighty = 1.0;
        salePanel.add(btnSale, gridBagConstraints);

        getContentPane().add(salePanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private void btnSaleActionPerformed(ActionEvent evt) {
        sale();
    }

    private void txtTerminalIdKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtMerchantIdKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtUserKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtPasswordKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    private void txtAmountKeyPressed(KeyEvent evt) {
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

    private void btnSaleKeyPressed(KeyEvent evt) {
        setFocus(evt);
    }

    /**
     * Sets the Sales frame's information
     */
    public void setDefaultInformation(){
        txtMerchantId.setText("");
        txtUser.setText("");
        txtPassword.setText("");
        txtTerminalId.setText("");
        txtControlNumber.setText("");
        txtAmount.setText("0.01");
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
                case "txtMerchantId": txtUser.requestFocusInWindow(); break;
                case "txtUser": txtPassword.requestFocusInWindow(); break;
                case "txtPassword": txtTerminalId.requestFocusInWindow(); break;
                case "txtTerminalId": txtAmount.requestFocusInWindow(); break;
                case "txtAmount": txtControlNumber.requestFocusInWindow(); break;
                case "txtControlNumber": txtLanguage.requestFocusInWindow(); break;
                case "txtLanguage": txtUrl.requestFocusInWindow(); break;
                case "txtUrl": btnSale.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 38){
            switch(key){                
                case "txtUser": txtMerchantId.requestFocusInWindow(); break;
                case "txtPassword": txtUser.requestFocusInWindow(); break;
                case "txtTerminalId": txtPassword.requestFocusInWindow(); break;                
                case "txtAmount": txtTerminalId.requestFocusInWindow(); break;                
                case "txtControlNumber": txtAmount.requestFocusInWindow(); break;
                case "txtLanguage": txtControlNumber.requestFocusInWindow(); break;
                case "txtUrl": txtLanguage.requestFocusInWindow(); break;
                case "btnSale": txtUrl.requestFocusInWindow(); break;
            }
        }
        else if(keyCode == 10 && key.equals("btnSale")){
            sale();
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
    
    public void sale(){
        //Pinpad object creation
        Vx820Segura pinpad  = new Vx820Segura("EN");

        //Creation of  HashMaps for setting card reading parameters
        HashMap inputReader = new HashMap(20);
        HashMap outputReader = new HashMap(20);
        
        //Creation of HashMaps for setting transaction parameters
        HashMap inputParameters = new HashMap(20);
        HashMap outputParameters = new HashMap(20);

        //Input parameters for card reading
        String amount = "0.01";
        String mobilePayment = "0";
        inputReader.put("AMOUNT", amount);
        inputReader.put("PAGO_MOVIL", mobilePayment);

        //Card reading request
        try {
            pinpad.readCard(inputReader, outputReader);
        }
        catch(BanorteException e) {
            System.out.println("Card reading failed " + e.getMessage());
        }

        //Card reading retrieval
        //String Track1 = (String) leerSalida.get("TRACK1");
        String track2= (String) outputReader.get("TRACK2");

        //Input type determination (Banda, Chip, Fallback)
        String posEntryMode = (String) outputReader.get("ENTRY_MODE");
        String declinedChip = "";
        String emvTags = "";

        //Obtaining EMVTAGS in case of CHIP mode
        if (posEntryMode.equals("CHIP")) {
            emvTags = (String) outputReader.get("EMV_TAGS");
            inputParameters.put("EMV_TAGS", emvTags);
            declinedChip = (String)outputReader.get("CHIP_DECLINED");
        }

        //Validate if is not Offline declined by DECLINADA_CHIP variable value
        if (declinedChip.equals("1")) {
            //End transaction
            System.out.println("Transaction declined offline");
            JOptionPane.showMessageDialog(null,"Declined Offline");
        }
        else {
            //Sending transaction to Banorte by using readCard method
            //Setting HashMaps transaction parameters
            inputParameters.put("MERCHANT_ID",txtMerchantId.getText());
            inputParameters.put("USER", txtUser.getText());
            inputParameters.put("PASSWORD", txtPassword.getText());
            inputParameters.put("CMD_TRANS", "AUTH");
            inputParameters.put("TERMINAL_ID", txtTerminalId.getText());
            inputParameters.put("CONTROL_NUMBER", txtControlNumber.getText());
            inputParameters.put("MODE", "PRD");
            inputParameters.put("AMOUNT", amount);
            inputParameters.put("TRACK2", track2);
            inputParameters.put("ENTRY_MODE", posEntryMode);
            inputParameters.put("RESPONSE_LANGUAGE", "EN");
            inputParameters.put("BANORTE_URL", "https://via.pagosbanorte.com/InterredesSeguro");

            //Validamos si el Track1 está presente
            //if (!"".equals(Track1))
            //{
            //parametrosEntrada.put("TRACK1", EmvTags);
            //}

            //Processing the transaction
            try {
                pinpad.processTransaction(inputParameters, outputParameters);
            } 
            catch (BanorteException e) {
                System.out.println("Transaction processing failed: " + e.getMessage());
            }

            //CHIP card mode validation
            if (posEntryMode.equals("CHIP")) {
                //Creation of HashMaps for notifying parameters result
                HashMap notifyInputParameters = new HashMap(20);
                HashMap notifyOutputParameters = new HashMap(20);
                
                //Obtaingin transaction process output data
                String payworksResult = (String) outputParameters.get("PAYW_RESULT");
                String authenticationCode = (String)outputParameters.get("AUTH_CODE");
                String emvData = (String)outputParameters.get("EMV_TAGS");
                
                //Null precense
                //Validating transaction response
                if(payworksResult != null) {
                    
                    //Validating DATOS_EMV data
                    if (emvData != null) {
                        notifyInputParameters.put("EMV_TAGS", emvData);
                    }
                    
                    if (payworksResult.equals("A")) {
                        notifyInputParameters.put("RESULT", "APPROVED");
                        notifyInputParameters.put("AUTH_CODE", authenticationCode);
                    }
                    else if (payworksResult.equals("D")) {
                        notifyInputParameters.put("RESULT", "DECLINED");
                    }
                    else {
                        notifyInputParameters.put("RESULT", "NO_RESPONSE");
                    }
                }
                else {
                    notifyInputParameters.put("RESULT", "NO_RESPONSE");
                }

                //Notify transaction result
                try {
                    pinpad.notifyResult(notifyInputParameters, notifyOutputParameters);
                }
                catch (BanorteException e) {
                    System.out.println("Result notification error: " +e.getMessage());
                }

                //Obtaining transaction result notification
                String emvResult = (String) notifyOutputParameters.get("EMV_RESULT");

                //Validation of resultadoEMV
                if (emvResult != null) {
                    if (emvResult.equals("D") && payworksResult.equals("A")) {
                        JOptionPane.showMessageDialog(null,"DECLINADA EMV");
                        
                        //Reverse generation for EMV declination
                        //HashMaps creation
                        HashMap inputReverse = new HashMap(20);
                        HashMap outputReverse = new HashMap(20);
                        
                        //Obtaining transaction reference
                        String reference = (String) outputParameters.get("REFERENCE");
                        
                        //Setting HashMap parameters
                        inputReverse.put("MERCHANT_ID", "7395007");
                        inputReverse.put("USER", "a7395007");
                        inputReverse.put("PASSWORD", "*******");
                        inputReverse.put("CMD_TRANS", "REVERSAL");
                        inputReverse.put("TERMINAL_ID", "327783832");
                        inputReverse.put("REFERENCE", reference);
                        inputReverse.put("MODE", "PRD");
                        inputReverse.put("RESPONSE_LANGUAGE", "EN");
                        inputReverse.put("BANORTE_URL", "https://via.pagosbanorte.com/InterredesSeguro");
                        
                        //Como fue un declinado EMV se envía el parámetro CAUSE con valor fijo 17
                        inputReverse.put("CAUSE", "17");

                        //Método Enviar Transacción para enviar el reverso
                        try {
                            ConectorBanorte.sendTransaction(inputReverse,outputReverse);
                        }
                        catch(BanorteException e) {
                            System.out.println("Operation sending failed: " +
                            e.getMessage());
                        }
                    }
                    else if (emvResult.equals("A") && payworksResult.equals("A")) {
                        JOptionPane.showMessageDialog(null,"APROBADA");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"DECLINADA1");
                    }
                }
                else {
                    //Si la transacción fue realizada con banda magnética
                    String result = (String)outputParameters.get("PAYW_RESULT");

                    //Únicamente se valida el resultado de Payworks
                    if (result.equals("A")) {
                        String authCode = (String) outputParameters.get("AUTH_CODE");
                        JOptionPane.showMessageDialog(null,"APROBADA: " + authCode);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"DECLINADA2");
                    }
                }
            }
        }

        //Terminar transacción
        try {
            pinpad.endTransaction();
        } 
        catch(BanorteException e) {
            System.out.println("Transaction ending failed: " +
            e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }
}