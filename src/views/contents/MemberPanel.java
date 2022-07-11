package views.contents;

import controllers.MemberController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Database;
import models.Member;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Gatotkaca
 */
public class MemberPanel extends javax.swing.JPanel {
    /**
     * Creates new form MemberPanel
     */
    public MemberPanel() {
        initComponents();
        refresh();
        
        // agar background putih
        memberTable.setOpaque(true);
        memberTable.setFillsViewportHeight(true);
        
        memberTable.setShowGrid(true);
    }

    public void refresh() {
        Object[][] dataTable = null;
        String[] HEADER = {"Id", "Name", "Username"};
        int columnSize = HEADER.length;
        
        MemberController memberController = new MemberController();
        List<Member> listMember = memberController.index();
        int baris = listMember.size();
        dataTable = new Object[baris][columnSize];
        
        for(int i = 0; i < baris; i++) {
            Member member = listMember.get(i);
            dataTable[i][0] = member.getId();
            dataTable[i][1] = member.getName();
            dataTable[i][2] = member.getUsername();
        }
        
        memberTable.setModel(new DefaultTableModel(dataTable, HEADER));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deletePanel = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();
        nameLabelPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameFieldPanel = new javax.swing.JPanel();
        idField = new javax.swing.JTextField();
        usernameLabelPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        usernameFieldPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        emailLabelPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        emailFieldPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(471, 414));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(471, 414));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(471, 414));

        deletePanel.setBackground(new java.awt.Color(255, 51, 51));
        deletePanel.setPreferredSize(new java.awt.Dimension(100, 40));

        deleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLabel.setText("Delete");
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        nameLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        idLabel.setBackground(new java.awt.Color(255, 255, 255));
        idLabel.setForeground(new java.awt.Color(102, 102, 102));
        idLabel.setText("Id");

        javax.swing.GroupLayout nameLabelPanelLayout = new javax.swing.GroupLayout(nameLabelPanel);
        nameLabelPanel.setLayout(nameLabelPanelLayout);
        nameLabelPanelLayout.setHorizontalGroup(
            nameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        nameLabelPanelLayout.setVerticalGroup(
            nameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nameFieldPanel.setEnabled(false);

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(255, 255, 255));
        idField.setForeground(new java.awt.Color(102, 102, 102));
        idField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout nameFieldPanelLayout = new javax.swing.GroupLayout(nameFieldPanel);
        nameFieldPanel.setLayout(nameFieldPanelLayout);
        nameFieldPanelLayout.setHorizontalGroup(
            nameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idField)
        );
        nameFieldPanelLayout.setVerticalGroup(
            nameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        usernameLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Name");

        javax.swing.GroupLayout usernameLabelPanelLayout = new javax.swing.GroupLayout(usernameLabelPanel);
        usernameLabelPanel.setLayout(usernameLabelPanelLayout);
        usernameLabelPanelLayout.setHorizontalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        usernameLabelPanelLayout.setVerticalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        usernameFieldPanel.setEnabled(false);

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout usernameFieldPanelLayout = new javax.swing.GroupLayout(usernameFieldPanel);
        usernameFieldPanel.setLayout(usernameFieldPanelLayout);
        usernameFieldPanelLayout.setHorizontalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField)
        );
        usernameFieldPanelLayout.setVerticalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        emailLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Username");

        javax.swing.GroupLayout emailLabelPanelLayout = new javax.swing.GroupLayout(emailLabelPanel);
        emailLabelPanel.setLayout(emailLabelPanelLayout);
        emailLabelPanelLayout.setHorizontalGroup(
            emailLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        emailLabelPanelLayout.setVerticalGroup(
            emailLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        emailFieldPanel.setEnabled(false);

        usernameField.setEditable(false);
        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout emailFieldPanelLayout = new javax.swing.GroupLayout(emailFieldPanel);
        emailFieldPanel.setLayout(emailFieldPanelLayout);
        emailFieldPanelLayout.setHorizontalGroup(
            emailFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField)
        );
        emailFieldPanelLayout.setVerticalGroup(
            emailFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(usernameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(emailLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(emailLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(471, 414));

        memberTable.setBackground(new java.awt.Color(255, 255, 255));
        memberTable.setForeground(new java.awt.Color(102, 102, 102));
        memberTable.setModel(new javax.swing.table.DefaultTableModel(
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
        memberTable.setPreferredSize(new java.awt.Dimension(471, 80));
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memberTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        int row = memberTable.getSelectedRow();
        
        String id = "" + memberTable.getValueAt(row, 0);
        String name = "" + memberTable.getValueAt(row, 1);
        String username = "" + memberTable.getValueAt(row, 2);
        
        idField.setEditable(true);
        nameField.setEditable(true);
        usernameField.setEditable(true);
        
        idField.setText(id);
        nameField.setText(name);
        usernameField.setText(username);
        
        idField.setEditable(false);
        nameField.setEditable(false);
        usernameField.setEditable(false);
    }//GEN-LAST:event_memberTableMouseClicked

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        String username = usernameField.getText();
        if (!(username.equals(""))) {
            MemberController memberController = new MemberController();
            memberController.destroy(username);
            
            idField.setEditable(true);
            nameField.setEditable(true);
            usernameField.setEditable(true);

            idField.setText("");
            nameField.setText("");
            usernameField.setText("");

            idField.setEditable(false);
            nameField.setEditable(false);
            usernameField.setEditable(false);
            
            refresh();
        }
    }//GEN-LAST:event_deleteLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel emailFieldPanel;
    private javax.swing.JPanel emailLabelPanel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable memberTable;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel nameFieldPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel nameLabelPanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JPanel usernameFieldPanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usernameLabelPanel;
    // End of variables declaration//GEN-END:variables
}
