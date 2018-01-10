/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import UserTypes.*;
import RoomTypes.*;
import Util.UniAccessSystem;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.table.*;

/**
 *
 * @author odmoa
 */
public class SystemUi extends javax.swing.JFrame {

    /**
     * Creates new form SystemUi
     */
    public SystemUi() {
        initComponents();
    }
    
    private static UniAccessSystem system;

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTabs = new javax.swing.JTabbedPane();
        RoomsTab = new javax.swing.JSplitPane();
        RoomsScrollPane = new javax.swing.JScrollPane();
        RoomsTable = new javax.swing.JTable();
        RoomsButtonsScrollPane = new javax.swing.JScrollPane();
        RoomsButtonsPanel = new javax.swing.JPanel();
        CreateUserBtn2 = new javax.swing.JButton();
        UsersTab = new javax.swing.JSplitPane();
        UsersScrollPane = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        UsersButtonsScrollPane = new javax.swing.JScrollPane();
        UsersButtonsPanel = new javax.swing.JPanel();
        CreateUserFirstNameTextField = new javax.swing.JTextField();
        CreateUserLastNameTextField = new javax.swing.JTextField();
        CreateUserTypeComboBox = new javax.swing.JComboBox<>();
        CreateUserBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        ModifyUserIdTextField = new javax.swing.JTextField();
        ModifyUserFirstNameTextField = new javax.swing.JTextField();
        ModifyUserLastNameTextField = new javax.swing.JTextField();
        ModifyUserTypeComboBox = new javax.swing.JComboBox<>();
        ModifyUserBtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        RemoveUserIdTextField = new javax.swing.JTextField();
        ModifyUserBtn1 = new javax.swing.JButton();
        LogsTab = new javax.swing.JSplitPane();
        LogsScrollPane = new javax.swing.JScrollPane();
        LogTextArea = new javax.swing.JTextArea();
        LogsButtonsScrollPane = new javax.swing.JScrollPane();
        LogsButtonsPanel = new javax.swing.JPanel();
        SaveLogBtn = new javax.swing.JButton();
        LoadLogBtn = new javax.swing.JButton();
        SimulationTab = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        MenuBAr = new javax.swing.JMenuBar();
        FileBtn = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ExitBtn = new javax.swing.JMenuItem();
        ViewBtn = new javax.swing.JMenu();
        ViewCurrentLogBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        RoomsTab.setResizeWeight(1.0);

        RoomsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        RoomsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        RoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room Code", "Access Type", "Emergency Mode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RoomsScrollPane.setViewportView(RoomsTable);

        RoomsTab.setTopComponent(RoomsScrollPane);

        RoomsButtonsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        RoomsButtonsScrollPane.setHorizontalScrollBar(null);
        RoomsButtonsScrollPane.setMinimumSize(new java.awt.Dimension(170, 6));

        RoomsButtonsPanel.setMinimumSize(new java.awt.Dimension(120, 6));

        CreateUserBtn2.setText("Create User");
        CreateUserBtn2.setMinimumSize(new java.awt.Dimension(120, 6));
        CreateUserBtn2.setPreferredSize(new java.awt.Dimension(100, 25));
        CreateUserBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomsButtonsPanelLayout = new javax.swing.GroupLayout(RoomsButtonsPanel);
        RoomsButtonsPanel.setLayout(RoomsButtonsPanelLayout);
        RoomsButtonsPanelLayout.setHorizontalGroup(
            RoomsButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateUserBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        RoomsButtonsPanelLayout.setVerticalGroup(
            RoomsButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomsButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateUserBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );

        RoomsButtonsScrollPane.setViewportView(RoomsButtonsPanel);

        RoomsTab.setRightComponent(RoomsButtonsScrollPane);

        MainTabs.addTab("Rooms", RoomsTab);

        UsersTab.setResizeWeight(1.0);

        UsersScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        UsersScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        UsersScrollPane.setMinimumSize(new java.awt.Dimension(200, 6));

        UsersTable.setAutoCreateRowSorter(true);
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UsersTable.setToolTipText("");
        UsersTable.setAutoscrolls(false);
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        UsersScrollPane.setViewportView(UsersTable);

        UsersTab.setTopComponent(UsersScrollPane);

        UsersButtonsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        UsersButtonsScrollPane.setHorizontalScrollBar(null);
        UsersButtonsScrollPane.setMinimumSize(new java.awt.Dimension(170, 6));

        UsersButtonsPanel.setMinimumSize(new java.awt.Dimension(120, 6));

        CreateUserFirstNameTextField.setText("First Name");
        CreateUserFirstNameTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        CreateUserFirstNameTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        CreateUserLastNameTextField.setText("Last Name");
        CreateUserLastNameTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        CreateUserLastNameTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        CreateUserTypeComboBox.setModel(new DefaultComboBoxModel(UserType.values()));
        CreateUserTypeComboBox.setMinimumSize(new java.awt.Dimension(120, 6));
        CreateUserTypeComboBox.setPreferredSize(new java.awt.Dimension(100, 25));
        CreateUserTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserTypeComboBoxActionPerformed(evt);
            }
        });

        CreateUserBtn.setText("Create User");
        CreateUserBtn.setMinimumSize(new java.awt.Dimension(120, 6));
        CreateUserBtn.setPreferredSize(new java.awt.Dimension(100, 25));
        CreateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserBtnActionPerformed(evt);
            }
        });

        jSeparator3.setMinimumSize(new java.awt.Dimension(120, 6));
        jSeparator3.setPreferredSize(new java.awt.Dimension(100, 25));

        ModifyUserIdTextField.setText("User ID");
        ModifyUserIdTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserIdTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        ModifyUserFirstNameTextField.setText("New First Name");
        ModifyUserFirstNameTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserFirstNameTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        ModifyUserLastNameTextField.setText("New Last Name");
        ModifyUserLastNameTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserLastNameTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        ModifyUserTypeComboBox.setModel(new DefaultComboBoxModel(UserType.values()));
        ModifyUserTypeComboBox.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserTypeComboBox.setPreferredSize(new java.awt.Dimension(100, 25));
        ModifyUserTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyUserTypeComboBoxActionPerformed(evt);
            }
        });

        ModifyUserBtn.setText("Modify User");
        ModifyUserBtn.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserBtn.setPreferredSize(new java.awt.Dimension(100, 25));
        ModifyUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyUserBtnActionPerformed(evt);
            }
        });

        jSeparator4.setMinimumSize(new java.awt.Dimension(120, 6));
        jSeparator4.setPreferredSize(new java.awt.Dimension(100, 25));

        RemoveUserIdTextField.setText("User ID");
        RemoveUserIdTextField.setMinimumSize(new java.awt.Dimension(120, 6));
        RemoveUserIdTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        ModifyUserBtn1.setText("Remove User");
        ModifyUserBtn1.setMinimumSize(new java.awt.Dimension(120, 6));
        ModifyUserBtn1.setPreferredSize(new java.awt.Dimension(100, 25));
        ModifyUserBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyUserBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsersButtonsPanelLayout = new javax.swing.GroupLayout(UsersButtonsPanel);
        UsersButtonsPanel.setLayout(UsersButtonsPanelLayout);
        UsersButtonsPanelLayout.setHorizontalGroup(
            UsersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UsersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateUserTypeComboBox, 0, 148, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateUserLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateUserFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserFirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserLastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveUserIdTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModifyUserBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        UsersButtonsPanelLayout.setVerticalGroup(
            UsersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsersButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateUserFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateUserLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModifyUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ModifyUserFirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModifyUserLastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModifyUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModifyUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModifyUserBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UsersButtonsScrollPane.setViewportView(UsersButtonsPanel);

        UsersTab.setRightComponent(UsersButtonsScrollPane);

        MainTabs.addTab("Users", UsersTab);

        LogsTab.setResizeWeight(1.0);

        LogsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        LogsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        LogTextArea.setColumns(20);
        LogTextArea.setRows(5);
        LogsScrollPane.setViewportView(LogTextArea);

        LogsTab.setTopComponent(LogsScrollPane);

        LogsButtonsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        LogsButtonsScrollPane.setHorizontalScrollBar(null);
        LogsButtonsScrollPane.setMinimumSize(new java.awt.Dimension(170, 6));

        LogsButtonsPanel.setMinimumSize(new java.awt.Dimension(120, 6));

        SaveLogBtn.setText("Save Log");
        SaveLogBtn.setMinimumSize(new java.awt.Dimension(120, 6));
        SaveLogBtn.setPreferredSize(new java.awt.Dimension(100, 25));
        SaveLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveLogBtnActionPerformed(evt);
            }
        });

        LoadLogBtn.setText("Load Log");
        LoadLogBtn.setMinimumSize(new java.awt.Dimension(120, 6));
        LoadLogBtn.setPreferredSize(new java.awt.Dimension(100, 25));
        LoadLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadLogBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogsButtonsPanelLayout = new javax.swing.GroupLayout(LogsButtonsPanel);
        LogsButtonsPanel.setLayout(LogsButtonsPanelLayout);
        LogsButtonsPanelLayout.setHorizontalGroup(
            LogsButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogsButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LogsButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaveLogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(LoadLogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        LogsButtonsPanelLayout.setVerticalGroup(
            LogsButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogsButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoadLogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        LogsButtonsScrollPane.setViewportView(LogsButtonsPanel);

        LogsTab.setRightComponent(LogsButtonsScrollPane);

        MainTabs.addTab("Logs", LogsTab);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jFormattedTextField1.setText("jFormattedTextField1");

        jButton1.setText("SIMULATE!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SimulationTabLayout = new javax.swing.GroupLayout(SimulationTab);
        SimulationTab.setLayout(SimulationTabLayout);
        SimulationTabLayout.setHorizontalGroup(
            SimulationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SimulationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SimulationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(628, Short.MAX_VALUE))
        );
        SimulationTabLayout.setVerticalGroup(
            SimulationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SimulationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        MainTabs.addTab("Simulation", SimulationTab);

        FileBtn.setText("File");
        FileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FileBtn.setName("FileBtn"); // NOI18N
        FileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileBtnActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setLabel("Save");
        FileBtn.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setLabel("Open");
        FileBtn.add(jMenuItem2);
        FileBtn.add(jSeparator1);

        ExitBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        FileBtn.add(ExitBtn);

        MenuBAr.add(FileBtn);

        ViewBtn.setText("View");

        ViewCurrentLogBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ViewCurrentLogBtn.setText("Current Log");
        ViewCurrentLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCurrentLogBtnActionPerformed(evt);
            }
        });
        ViewBtn.add(ViewCurrentLogBtn);

        MenuBAr.add(ViewBtn);

        setJMenuBar(MenuBAr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        MainTabs.getAccessibleContext().setAccessibleName("Users");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ViewCurrentLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCurrentLogBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewCurrentLogBtnActionPerformed

    private void CreateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserBtnActionPerformed
        
        User newUser = new User() {};
        newUser.SetName(CreateUserFirstNameTextField.getText() + " " + CreateUserLastNameTextField.getText());
        newUser.SetUserType((UserType)CreateUserTypeComboBox.getSelectedItem());
        
        system.userList.CreateUser(newUser);
        
        RefreshUserTable();
    }//GEN-LAST:event_CreateUserBtnActionPerformed

    private void SaveLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveLogBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveLogBtnActionPerformed

    private void CreateUserBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateUserBtn2ActionPerformed

    private void LoadLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadLogBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadLogBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ModifyUserTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyUserTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyUserTypeComboBoxActionPerformed

    private void CreateUserTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateUserTypeComboBoxActionPerformed

    private void ModifyUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyUserBtnActionPerformed

        int modId = Integer.parseInt(ModifyUserIdTextField.getText());
        User modUser = system.userList.FindUserById(modId);
        if(modUser != null){
            
            String modName = ModifyUserFirstNameTextField.getText() + " " + ModifyUserLastNameTextField.getText();
            UserType modType = (UserType)ModifyUserTypeComboBox.getSelectedItem();
            
            modUser.SetName(modName);
            modUser.SetUserType(modType);
            
            system.userList.SetUser(modId, modUser);
            RefreshUserTable();
        }
        else{
            ShowIssue("Cannot find user!");
        }
    }//GEN-LAST:event_ModifyUserBtnActionPerformed

    private void ModifyUserBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyUserBtn1ActionPerformed
    
        int removeId = Integer.parseInt(RemoveUserIdTextField.getText());
        User removeUser = system.userList.FindUserById(removeId);
        if(removeUser != null){
            
            ShowMessage("User " + removeUser.GetId() + " (" + removeUser.GetName() + ", " + removeUser.GetUserType() + "),\nhas been removed.");
            
            system.userList.RemoveUser(removeId);            
            RefreshUserTable();
        }
        else{
            ShowIssue("Cannot find user!");
        }
    }//GEN-LAST:event_ModifyUserBtn1ActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        
        int row = UsersTable.getSelectedRow();
        String userId = UsersTable.getModel().getValueAt(row, 0).toString();
        String userWholeName = UsersTable.getModel().getValueAt(row, 1).toString();
        String[] userSplitName = userWholeName.split("\\s+");
        ModifyUserIdTextField.setText(userId);
        ModifyUserFirstNameTextField.setText(userSplitName[0]);
        if(userSplitName.length > 1){
            ModifyUserLastNameTextField.setText(userSplitName[1]);
        }
        else{
            ModifyUserLastNameTextField.setText("");
        }
        
        RemoveUserIdTextField.setText(userId);
    }//GEN-LAST:event_UsersTableMouseClicked

    private void ShowMessage(String message){
        JFrame frame = new JFrame("Message");
            JOptionPane.showMessageDialog(frame, message);
    }
    
    private void ShowIssue(String issue){
        JFrame frame = new JFrame("Issue");
            JOptionPane.showMessageDialog(frame, issue);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new SystemUi().setVisible(true);

            system = new UniAccessSystem();

            system.userList.CreateUser("Jeff");
            system.userList.CreateUser("Ron");
            system.userList.CreateUser("Jane");
            system.userList.CreateUser("Rosetta");
            system.userList.CreateUser("Keith");
        
            RefreshUserTable();
            }
        });
    }
    
    public static void RefreshRoomTable(){
        
        DefaultTableModel model = (DefaultTableModel) RoomsTable.getModel();
        
        
        
        for(int i = 0; i < system.userList.GetUsers().size(); i++){
            
            User user = system.userList.GetUsers().get(i);
            int idFieldData = user.GetId();
            String nameFieldData = user.GetName();
            String typeFieldData = user.GetUserType().toString();
            model.addRow(new Object[]{idFieldData, nameFieldData, typeFieldData});
        }
        
        RoomsTable.setModel(model);
    }
    
    public static void RefreshUserTable(){
        
        DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        
        model.setRowCount(0);
        
        for(int i = 0; i < system.userList.GetUsers().size(); i++){
            
            User user = system.userList.GetUsers().get(i);
            int idFieldData = user.GetId();
            String nameFieldData = user.GetName();
            String typeFieldData = user.GetUserType().toString();
            model.addRow(new Object[]{idFieldData, nameFieldData, typeFieldData});
        }
        
        UsersTable.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateUserBtn;
    private javax.swing.JButton CreateUserBtn2;
    private javax.swing.JTextField CreateUserFirstNameTextField;
    private javax.swing.JTextField CreateUserLastNameTextField;
    private javax.swing.JComboBox<UserType> CreateUserTypeComboBox;
    private javax.swing.JMenuItem ExitBtn;
    private javax.swing.JMenu FileBtn;
    private javax.swing.JButton LoadLogBtn;
    private javax.swing.JTextArea LogTextArea;
    private javax.swing.JPanel LogsButtonsPanel;
    private javax.swing.JScrollPane LogsButtonsScrollPane;
    private javax.swing.JScrollPane LogsScrollPane;
    private javax.swing.JSplitPane LogsTab;
    private javax.swing.JTabbedPane MainTabs;
    private javax.swing.JMenuBar MenuBAr;
    private javax.swing.JButton ModifyUserBtn;
    private javax.swing.JButton ModifyUserBtn1;
    private javax.swing.JTextField ModifyUserFirstNameTextField;
    private javax.swing.JTextField ModifyUserIdTextField;
    private javax.swing.JTextField ModifyUserLastNameTextField;
    private javax.swing.JComboBox<String> ModifyUserTypeComboBox;
    private javax.swing.JTextField RemoveUserIdTextField;
    private javax.swing.JPanel RoomsButtonsPanel;
    private javax.swing.JScrollPane RoomsButtonsScrollPane;
    private javax.swing.JScrollPane RoomsScrollPane;
    private static javax.swing.JSplitPane RoomsTab;
    private static javax.swing.JTable RoomsTable;
    private javax.swing.JButton SaveLogBtn;
    private javax.swing.JPanel SimulationTab;
    private javax.swing.JPanel UsersButtonsPanel;
    private javax.swing.JScrollPane UsersButtonsScrollPane;
    private javax.swing.JScrollPane UsersScrollPane;
    private javax.swing.JSplitPane UsersTab;
    private static javax.swing.JTable UsersTable;
    private javax.swing.JMenu ViewBtn;
    private javax.swing.JMenuItem ViewCurrentLogBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
