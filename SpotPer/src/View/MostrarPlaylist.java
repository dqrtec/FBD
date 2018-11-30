/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conexao;
import Controller.FaixaSQL;
import Controller.PlaylistSQL;
import Model.Faixa;
import Model.Playlist;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tibet
 */
public class MostrarPlaylist extends javax.swing.JFrame {

    /**
     * Creates new form MostrarPlaylist
     */
    public MostrarPlaylist() {
        initComponents();
        atualizaTabelaPlaylist();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlaylists = new javax.swing.JTable();
        menuMusica = new javax.swing.JLabel();
        menuArtista = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        labelNovaPlaylist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(832, 37));

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        labelTitulo.setText("Playlists");

        tabelaPlaylists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Nome", "Data de criação", "Tempo total de execução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPlaylists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPlaylistsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaPlaylistsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPlaylists);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(labelTitulo)
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitulo)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuMusica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuMusica.setForeground(new java.awt.Color(204, 204, 204));
        menuMusica.setText("Músicas");

        menuArtista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuArtista.setForeground(new java.awt.Color(204, 204, 204));
        menuArtista.setText("Artistas");

        menuAlbum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(204, 204, 204));
        menuAlbum.setText("Álbuns");

        menuPlaylist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(204, 204, 204));
        menuPlaylist.setText("Playlists");

        jTextBuscar.setText("Buscar...");
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });

        labelNovaPlaylist.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        labelNovaPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        labelNovaPlaylist.setText("+ Nova Playlist");
        labelNovaPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNovaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuMusica)
                            .addComponent(menuArtista)
                            .addComponent(menuAlbum)
                            .addComponent(menuPlaylist)
                            .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(menuMusica)
                .addGap(18, 18, 18)
                .addComponent(menuArtista)
                .addGap(18, 18, 18)
                .addComponent(menuAlbum)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPlaylistsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPlaylistsMouseClicked
        int row = tabelaPlaylists.getSelectedRow();
        int idPlaylist = (int) tabelaPlaylists.getValueAt(row, 0);
        
        JPopupMenu jPopupMenu = new JPopupMenu();
        
        JMenuItem menuItemEditar = new JMenuItem("Editar");
        JMenuItem menuItemRemover = new JMenuItem("Remover");
        
        jPopupMenu.add(menuItemEditar);
        jPopupMenu.add(menuItemRemover);
        
        menuItemEditar.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        menuItemRemover.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?",
                        "Atenção!", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    removerPlaylist(idPlaylist);
                }
            }
        });
        
        tabelaPlaylists.addMouseListener(
                new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    jPopupMenu.show(tabelaPlaylists, e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_tabelaPlaylistsMouseClicked

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void labelNovaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseClicked
        new CriarPlaylist(this).setVisible(true);
        dispose();
    }//GEN-LAST:event_labelNovaPlaylistMouseClicked

    private void tabelaPlaylistsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPlaylistsMousePressed
        Point point = evt.getPoint();
        if (evt.getClickCount() == 2 && tabelaPlaylists.getSelectedRow() != -1) {
            int row = tabelaPlaylists.getSelectedRow();
            int idPlaylist = (int) tabelaPlaylists.getValueAt(row, 0);
            String nomePlaylist = (String) tabelaPlaylists.getValueAt(row, 1);
            new MostrarFaixasPlaylist(idPlaylist, nomePlaylist).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tabelaPlaylistsMousePressed

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
            java.util.logging.Logger.getLogger(MostrarPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarPlaylist().setVisible(true);
            }
        });
    }
    
    private void atualizaTabelaPlaylist() {
        Connection conn = Conexao.abrirConexao();
        PlaylistSQL playlistSQL = new PlaylistSQL(conn);
        List<Playlist> lista = playlistSQL.listarPlaylist();
        DefaultTableModel tbm = (DefaultTableModel) tabelaPlaylists.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Playlist tab : lista) {
            tbm.addRow(new String[i]);
            tabelaPlaylists.setValueAt(tab.getIdPlaylist(), i, 0);
            tabelaPlaylists.setValueAt(tab.getNome(), i, 1);
            tabelaPlaylists.setValueAt(tab.getDataCriacao(), i, 2);
            float time = tab.getTempoTotalExecucao();
            int minute = (int) time;
            float second = ((time - minute) * 100);
            tabelaPlaylists.setValueAt(String.format("%s:%.0f", minute, second), i, 3);
            i++;
        }
        Conexao.fecharConexao(conn);
    }
    
    private void removerPlaylist(int idPlaylist) {
        Connection conn = Conexao.abrirConexao();
        PlaylistSQL playlistSQL = new PlaylistSQL(conn);
        String message = playlistSQL.removerPlaylist(idPlaylist);
        Conexao.fecharConexao(conn);
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JLabel labelNovaPlaylist;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuArtista;
    private javax.swing.JLabel menuMusica;
    private javax.swing.JLabel menuPlaylist;
    private javax.swing.JTable tabelaPlaylists;
    // End of variables declaration//GEN-END:variables
}
