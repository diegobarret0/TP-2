package Interface;

import Services.Client;
import Services.Divice;
import Services.InterfaceServices;

import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientPermissionsInternalFrame extends javax.swing.JInternalFrame {

    public ClientPermissionsInternalFrame() {
        initComponents();
        try {
            permissionsTable.setModel(new InterfaceServices().getDiviceGrid());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        txtClientUsername = new javax.swing.JTextField();
        btnSeek = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        permissionsTable = new javax.swing.JTable();
        btnRemovePermission = new javax.swing.JButton();
        txtPermissionCode = new javax.swing.JTextField();
        btnsavePermission = new javax.swing.JButton();
        txtNewDiviceCode = new javax.swing.JTextField();
        txtNewDiviceName = new javax.swing.JTextField();
        txtNewDiviceDescrption = new javax.swing.JTextField();
        txtNewDiviceLocation = new javax.swing.JTextField();
        btnSaveNewDivece = new javax.swing.JButton();
        txtRemoveDiviceCode = new javax.swing.JTextField();
        btnRemoveDivice = new javax.swing.JButton();
        btnAllDivices = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Permisos");

        jLabel2.setText("Usuario de Cliente");

        jLabel4.setText("Email");

        jLabel6.setText("Nombre");

        jLabel8.setText("Apellido");

        btnSeek.setText("Buscar");
        btnSeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeekActionPerformed(evt);
            }
        });

        permissionsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "id", "codigo", "equipo", "descripcion", "ubicacion"
                }
        ));
        jScrollPane1.setViewportView(permissionsTable);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
                panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTablaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
                panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTablaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .addContainerGap())
        );

        btnRemovePermission.setText("Quitar Permiso");
        btnRemovePermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePermissionActionPerformed(evt);
            }
        });

        btnsavePermission.setText("Agregar permiso");
        btnsavePermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavePermissionActionPerformed(evt);
            }
        });

        txtNewDiviceCode.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));

        txtNewDiviceName.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipo"));

        txtNewDiviceDescrption.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));

        txtNewDiviceLocation.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));

        btnSaveNewDivece.setText("Guardar equipo");
        btnSaveNewDivece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNewDiveceActionPerformed(evt);
            }
        });

        txtRemoveDiviceCode.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));

        btnRemoveDivice.setText("Eliminar equipo");
        btnRemoveDivice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDiviceActionPerformed(evt);
            }
        });

        btnAllDivices.setText("Ver todos los equipos");
        btnAllDivices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllDivicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel8)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txtClientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnSeek)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnRemovePermission))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtPermissionCode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnsavePermission)
                                                                .addGap(425, 425, 425)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtRemoveDiviceCode, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                                        .addComponent(txtNewDiviceLocation)
                                                                        .addComponent(txtNewDiviceName)
                                                                        .addComponent(txtNewDiviceCode))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtNewDiviceDescrption, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnSaveNewDivece)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnAllDivices, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                                        .addComponent(btnRemoveDivice))))
                                                .addContainerGap(52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNewDiviceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNewDiviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(txtClientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnSeek)
                                                                        .addComponent(btnRemovePermission))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(txtNewDiviceDescrption))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPermissionCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNewDiviceLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnSaveNewDivece)
                                                                .addComponent(btnAllDivices)))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnRemoveDivice)
                                                        .addComponent(txtRemoveDiviceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btnsavePermission))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnSeekActionPerformed(java.awt.event.ActionEvent evt) {
        String clientUsername = txtClientUsername.getText();

        try {
            String clientValidation = new Client().clientValidation(clientUsername);
            if (clientValidation==null) {
                Client client = new Client(clientUsername);
                lblName.setText(client.getName());
                lblSurname.setText(client.getSurname());
                lblEmail.setText(client.getEmail());

                permissionsTable.setModel(new InterfaceServices().getDivicesGrid(clientUsername));

            }
            else {
                JOptionPane.showMessageDialog(null, clientValidation);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnRemovePermissionActionPerformed(java.awt.event.ActionEvent evt) {
        int row = permissionsTable.getSelectedRow();
        int codeDivice = Integer.parseInt(String.valueOf(permissionsTable.getModel().getValueAt(row,1)));
        String clientUsername = txtClientUsername.getText();

        try {
            new InterfaceServices().deletePermission(codeDivice, clientUsername);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            permissionsTable.setModel(new InterfaceServices().getDivicesGrid(clientUsername));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnsavePermissionActionPerformed(java.awt.event.ActionEvent evt) {
        int codeDivice = Integer.parseInt(txtPermissionCode.getText());
        String clientUsername = txtClientUsername.getText();

        try {
            new InterfaceServices().saveNewPermission(codeDivice, clientUsername);
        } catch (SQLException e) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            permissionsTable.setModel(new InterfaceServices().getDivicesGrid(clientUsername));
        } catch (SQLException e) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void btnSaveNewDiveceActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            String diviceValidation = new Divice().diviceValidation(Integer.parseInt(txtNewDiviceCode.getText()));
            if( diviceValidation == null) {
                new InterfaceServices().saveNewDivice(Integer.parseInt(txtNewDiviceCode.getText()),
                        txtNewDiviceName.getText(), txtNewDiviceDescrption.getText(), txtNewDiviceLocation.getText());
                txtNewDiviceCode.setText("");
                txtNewDiviceName.setText("");
                txtNewDiviceLocation.setText("");
                txtNewDiviceDescrption.setText("");
                permissionsTable.setModel(new InterfaceServices().getDiviceGrid());
            }
            else {
                JOptionPane.showMessageDialog(null, diviceValidation);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnAllDivicesActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            permissionsTable.setModel(new InterfaceServices().getDiviceGrid());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void btnRemoveDiviceActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String diviceValidation = new Divice().diviceValidation(Integer.parseInt(txtRemoveDiviceCode.getText()));

            if(diviceValidation != null){
                new InterfaceServices().deleteDivice(Integer.parseInt(txtRemoveDiviceCode.getText()));
                txtRemoveDiviceCode.setText("");
                permissionsTable.setModel(new InterfaceServices().getDiviceGrid());
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe equipo con este codigo.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private javax.swing.JButton btnAllDivices;
    private javax.swing.JButton btnRemoveDivice;
    private javax.swing.JButton btnRemovePermission;
    private javax.swing.JButton btnSaveNewDivece;
    private javax.swing.JButton btnSeek;
    private javax.swing.JButton btnsavePermission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable permissionsTable;
    private javax.swing.JTextField txtClientUsername;
    private javax.swing.JTextField txtNewDiviceCode;
    private javax.swing.JTextField txtNewDiviceDescrption;
    private javax.swing.JTextField txtNewDiviceLocation;
    private javax.swing.JTextField txtNewDiviceName;
    private javax.swing.JTextField txtPermissionCode;
    private javax.swing.JTextField txtRemoveDiviceCode;
}

