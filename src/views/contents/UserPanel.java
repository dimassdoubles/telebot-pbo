package views.contents;

import controllers.UserController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Database;
import models.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Gatotkaca
 */
public class UserPanel extends javax.swing.JPanel {
    
    public UserPanel() {
        initComponents();
        refresh();
        
        // agar background putih
        userTable.setOpaque(true);
        userTable.setFillsViewportHeight(true);
        
        userTable.setShowGrid(true);
    }

    public void refresh() {
        Object[][] dataTable = null;
        String[] HEADER = {"Id", "Name", "Username"};
        int columnSize = HEADER.length;
        
        
        UserController userController = new UserController();
        List<User> listUser = new ArrayList<User>();
        listUser = userController.index();
        
        dataTable = new Object[listUser.size()][columnSize];
        for (int i = 0; i < listUser.size(); i++) {
            User currentUser = listUser.get(i);
            dataTable[i][0] = currentUser.getId();
            dataTable[i][1] = currentUser.getName();
            dataTable[i][2] = currentUser.getUsername();
        }
        
        userTable.setModel(new DefaultTableModel(dataTable, HEADER));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        nameLabelPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameFieldPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        usernameLabelPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameFieldPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        passwordLabelPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordFieldPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(471, 414));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(471, 414));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(471, 180));

        userTable.setBackground(new java.awt.Color(255, 255, 255));
        userTable.setForeground(new java.awt.Color(102, 102, 102));
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userTable.setGridColor(new java.awt.Color(102, 102, 102));
        userTable.setOpaque(false);
        userTable.setPreferredSize(new java.awt.Dimension(471, 80));
        jScrollPane1.setViewportView(userTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(471, 414));

        addPanel.setBackground(new java.awt.Color(0, 204, 51));
        addPanel.setPreferredSize(new java.awt.Dimension(100, 40));

        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabel.setText("Add User");
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        nameLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Name");

        javax.swing.GroupLayout nameLabelPanelLayout = new javax.swing.GroupLayout(nameLabelPanel);
        nameLabelPanel.setLayout(nameLabelPanelLayout);
        nameLabelPanelLayout.setHorizontalGroup(
            nameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        nameLabelPanelLayout.setVerticalGroup(
            nameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nameFieldPanel.setEnabled(false);

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout nameFieldPanelLayout = new javax.swing.GroupLayout(nameFieldPanel);
        nameFieldPanel.setLayout(nameFieldPanelLayout);
        nameFieldPanelLayout.setHorizontalGroup(
            nameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField)
        );
        nameFieldPanelLayout.setVerticalGroup(
            nameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        usernameLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Username");

        javax.swing.GroupLayout usernameLabelPanelLayout = new javax.swing.GroupLayout(usernameLabelPanel);
        usernameLabelPanel.setLayout(usernameLabelPanelLayout);
        usernameLabelPanelLayout.setHorizontalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        usernameLabelPanelLayout.setVerticalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        usernameFieldPanel.setEnabled(false);

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout usernameFieldPanelLayout = new javax.swing.GroupLayout(usernameFieldPanel);
        usernameFieldPanel.setLayout(usernameFieldPanelLayout);
        usernameFieldPanelLayout.setHorizontalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField)
        );
        usernameFieldPanelLayout.setVerticalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        passwordLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password");

        javax.swing.GroupLayout passwordLabelPanelLayout = new javax.swing.GroupLayout(passwordLabelPanel);
        passwordLabelPanel.setLayout(passwordLabelPanelLayout);
        passwordLabelPanelLayout.setHorizontalGroup(
            passwordLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        passwordLabelPanelLayout.setVerticalGroup(
            passwordLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        passwordFieldPanel.setEnabled(false);

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout passwordFieldPanelLayout = new javax.swing.GroupLayout(passwordFieldPanel);
        passwordFieldPanel.setLayout(passwordFieldPanelLayout);
        passwordFieldPanelLayout.setHorizontalGroup(
            passwordFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField)
        );
        passwordFieldPanelLayout.setVerticalGroup(
            passwordFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(usernameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(passwordLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        String username = usernameField.getText();
        String name = nameField.getText();
        String password = passwordField.getText();
        
        boolean isUsernameFilled = !username.equals("");
        boolean isNameFilled = !name.equals("");
        boolean isPasswordFilled = !password.equals("");
        
        if (isUsernameFilled && isNameFilled && isPasswordFilled) {
            UserController userController = new UserController();
            
            User newUser = new User(name, username, password);
            userController.store(newUser);

            nameField.setText("");
            usernameField.setText("");
            passwordField.setText("");

            refresh();

        }
    }//GEN-LAST:event_addLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel nameFieldPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel nameLabelPanel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JPanel passwordFieldPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordLabelPanel;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JPanel usernameFieldPanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usernameLabelPanel;
    // End of variables declaration//GEN-END:variables
}
