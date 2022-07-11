package views.contents;

import controllers.KeywordController;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.Database;
import models.Keyword;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Gatotkaca
 */
public class KeywordPanel extends javax.swing.JPanel {
    private String selectedId = "";

    public KeywordPanel() {
        initComponents();
        turnOff(deletePanel);
        turnOff(updatePanel);
        refresh();
        
        // agar background putih
        keywordTable.setOpaque(true);
        keywordTable.setFillsViewportHeight(true);
        
        keywordTable.setShowGrid(true);
    }

    public void refresh() {
        Object[][] dataTable = null;
        String[] HEADER = {"Id", "Keyword", "Response"};
        int columnSize = HEADER.length;
        
        KeywordController keywordController = new KeywordController();
        List<Keyword> listKeyword = keywordController.index();
        int baris = listKeyword.size();
        dataTable = new Object[baris][columnSize];
        
        for(int i = 0; i < baris; i++) {
            Keyword keyword = listKeyword.get(i);
            dataTable[i][0] = keyword.getId();
            dataTable[i][1] = keyword.getKeyword();
            dataTable[i][2] = keyword.getResponse();
        }
        
        keywordTable.setModel(new DefaultTableModel(dataTable, HEADER));
        
    }
    
    public void turnOff(JPanel jPanel) {
        jPanel.setBackground(new Color(43,43,43));
    }
    
    public void clearForm() {
        keywordField.setText("");
        responseTextArea.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();
        nameLabelPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        keywordFieldPanel = new javax.swing.JPanel();
        keywordField = new javax.swing.JTextField();
        usernameLabelPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameFieldPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        keywordTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(471, 414));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(471, 414));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(471, 414));

        addPanel.setBackground(new java.awt.Color(0, 204, 51));
        addPanel.setPreferredSize(new java.awt.Dimension(100, 40));

        addLabel.setForeground(new java.awt.Color(255, 255, 255));
        addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabel.setText("Add");
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

        updatePanel.setBackground(new java.awt.Color(204, 204, 0));
        updatePanel.setPreferredSize(new java.awt.Dimension(100, 40));

        updateLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLabel.setText("Update");
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

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

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Keyword");

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

        keywordFieldPanel.setEnabled(false);

        keywordField.setBackground(new java.awt.Color(255, 255, 255));
        keywordField.setForeground(new java.awt.Color(102, 102, 102));
        keywordField.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout keywordFieldPanelLayout = new javax.swing.GroupLayout(keywordFieldPanel);
        keywordFieldPanel.setLayout(keywordFieldPanelLayout);
        keywordFieldPanelLayout.setHorizontalGroup(
            keywordFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(keywordField)
        );
        keywordFieldPanelLayout.setVerticalGroup(
            keywordFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(keywordField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        usernameLabelPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setForeground(new java.awt.Color(102, 102, 102));
        usernameLabel.setText("Response");

        javax.swing.GroupLayout usernameLabelPanelLayout = new javax.swing.GroupLayout(usernameLabelPanel);
        usernameLabelPanel.setLayout(usernameLabelPanelLayout);
        usernameLabelPanelLayout.setHorizontalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        usernameLabelPanelLayout.setVerticalGroup(
            usernameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        usernameFieldPanel.setBackground(new java.awt.Color(255, 255, 255));
        usernameFieldPanel.setEnabled(false);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));

        responseTextArea.setBackground(new java.awt.Color(255, 255, 255));
        responseTextArea.setColumns(20);
        responseTextArea.setForeground(new java.awt.Color(102, 102, 102));
        responseTextArea.setLineWrap(true);
        responseTextArea.setRows(5);
        jScrollPane2.setViewportView(responseTextArea);

        javax.swing.GroupLayout usernameFieldPanelLayout = new javax.swing.GroupLayout(usernameFieldPanel);
        usernameFieldPanel.setLayout(usernameFieldPanelLayout);
        usernameFieldPanelLayout.setHorizontalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        usernameFieldPanelLayout.setVerticalGroup(
            usernameFieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernameFieldPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(nameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keywordFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keywordFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usernameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(usernameFieldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        keywordTable.setBackground(new java.awt.Color(255, 255, 255));
        keywordTable.setForeground(new java.awt.Color(102, 102, 102));
        keywordTable.setModel(new javax.swing.table.DefaultTableModel(
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
        keywordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keywordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(keywordTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
        if (!selectedId.equals("")) {
            KeywordController keywordController = new KeywordController();
            keywordController.destroy(selectedId);
            selectedId = "";
            turnOff(deletePanel);
            turnOff(updatePanel);
            addPanel.setBackground(new Color(0, 204, 51));
            clearForm();
            refresh();
        } else {
            // code here
        }
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        if (selectedId.equals("")) {
            String keyword = keywordField.getText();
            String response = responseTextArea.getText();
            
            boolean isKeywordFilled = !keyword.equals("");
            boolean isResponseFilled = !response.equals("");
            
            if (isKeywordFilled && isResponseFilled) {
                KeywordController keywordController = new KeywordController();
                Keyword newKeyword = new Keyword(keyword, response);
                if (keywordController.store(newKeyword)) {
                    clearForm();
                    refresh();
                    selectedId = "";
                } 
           } else {
                // code here
            }
        } else {
            selectedId = "";

            addPanel.setBackground(new Color(0, 204, 51));

            turnOff(deletePanel);
            turnOff(updatePanel);

            keywordField.setText("");
            responseTextArea.setText("");   
        }
    }//GEN-LAST:event_addLabelMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        if(!selectedId.equals("")) {
            String keyword = keywordField.getText();
            String response = responseTextArea.getText();
            
            boolean isKeywordFilled = !keyword.equals("");
            boolean isResponseFilled = !response.equals("");
            
            if (isKeywordFilled && isResponseFilled) {
                KeywordController keywordController = new KeywordController();
                Keyword newKeyword = new Keyword(selectedId, keyword, response);
                if(keywordController.update(newKeyword)) {
                    selectedId = "";
                    clearForm();
                    turnOff(deletePanel);
                    turnOff(updatePanel);
                    addPanel.setBackground(new Color(0, 204, 51));
                    refresh();    
                }
           } else {
                // do nothing
            }
        }
    }//GEN-LAST:event_updateLabelMouseClicked

    private void keywordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keywordTableMouseClicked
        try {
            int row = keywordTable.getSelectedRow();
            selectedId = "" + keywordTable.getValueAt(row, 0);
            
            turnOff(addPanel);
        
            deletePanel.setBackground(new Color(255,51,51));
            updatePanel.setBackground(new Color(204,204,0));

            String keyword = "" + keywordTable.getValueAt(row, 1);
            String response = "" + keywordTable.getValueAt(row, 2);

            keywordField.setText(keyword);
            responseTextArea.setText(response);
        } catch (Exception e) {
            clearForm();
            selectedId = "";
            turnOff(deletePanel);
            turnOff(updatePanel);
            addPanel.setBackground(new Color(0, 204, 51));
            
        }
        
    }//GEN-LAST:event_keywordTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keywordField;
    private javax.swing.JPanel keywordFieldPanel;
    private javax.swing.JTable keywordTable;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel nameLabelPanel;
    private javax.swing.JTextArea responseTextArea;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JPanel usernameFieldPanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usernameLabelPanel;
    // End of variables declaration//GEN-END:variables
}
