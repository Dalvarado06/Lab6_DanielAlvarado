/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_danielalvarado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dalva
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jd_CrearPlaylist = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_NombrePlaylist = new javax.swing.JTextField();
        jb_CrearPlaylist = new javax.swing.JButton();
        popup_Cancion = new javax.swing.JPopupMenu();
        jm_EditarCancion = new javax.swing.JMenuItem();
        jm_EliminarCancion = new javax.swing.JMenuItem();
        jm_AgregarPlaylist = new javax.swing.JMenuItem();
        jd_EditarCancion = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jt_Enombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        js_EditarP = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        js_EditarYear = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jt_EArtista = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jt_Ealbum = new javax.swing.JTextField();
        jb_GuardarCambios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_NombreCancion = new javax.swing.JTextField();
        js_Puntuacion = new javax.swing.JSpinner();
        js_Year = new javax.swing.JSpinner();
        jt_Artista = new javax.swing.JTextField();
        jt_Album = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_CancionesPlaylist = new javax.swing.JTable();
        jl_Playlist = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Canciones = new javax.swing.JList<>();
        jb_CrearCancion = new javax.swing.JButton();
        cb_Playlists = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_GuardarPlaylist = new javax.swing.JMenuItem();
        jm_AbrirPlaylist = new javax.swing.JMenuItem();
        jm_CrearPlaylist = new javax.swing.JMenuItem();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Crear Playlist");

        jLabel9.setText("Nombre: ");

        jb_CrearPlaylist.setText("Crear Playlist");
        jb_CrearPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearPlaylistMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearPlaylistLayout = new javax.swing.GroupLayout(jd_CrearPlaylist.getContentPane());
        jd_CrearPlaylist.getContentPane().setLayout(jd_CrearPlaylistLayout);
        jd_CrearPlaylistLayout.setHorizontalGroup(
            jd_CrearPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPlaylistLayout.createSequentialGroup()
                .addGroup(jd_CrearPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearPlaylistLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8))
                    .addGroup(jd_CrearPlaylistLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_NombrePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_CrearPlaylistLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jb_CrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jd_CrearPlaylistLayout.setVerticalGroup(
            jd_CrearPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearPlaylistLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8)
                .addGap(52, 52, 52)
                .addGroup(jd_CrearPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jt_NombrePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jb_CrearPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jm_EditarCancion.setText("Editar Cancion");
        jm_EditarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_EditarCancionActionPerformed(evt);
            }
        });
        popup_Cancion.add(jm_EditarCancion);

        jm_EliminarCancion.setText("Eliminar Cancion");
        jm_EliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_EliminarCancionActionPerformed(evt);
            }
        });
        popup_Cancion.add(jm_EliminarCancion);

        jm_AgregarPlaylist.setText("Agregar a playlist seleccionado");
        jm_AgregarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_AgregarPlaylistActionPerformed(evt);
            }
        });
        popup_Cancion.add(jm_AgregarPlaylist);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Editar Cancion");

        jLabel11.setText("Nombre:");

        jLabel12.setText("Puntuacion:");

        js_EditarP.setModel(new javax.swing.SpinnerNumberModel(5, 1, 10, 1));

        jLabel13.setText("I want my.... I want my MTV!");

        jLabel14.setText("Year:");

        js_EditarYear.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2020, 1));

        jLabel15.setText("Artista:");

        jLabel16.setText("Album:");

        jb_GuardarCambios.setText("Guardar Cambios");
        jb_GuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarCambiosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_EditarCancionLayout = new javax.swing.GroupLayout(jd_EditarCancion.getContentPane());
        jd_EditarCancion.getContentPane().setLayout(jd_EditarCancionLayout);
        jd_EditarCancionLayout.setHorizontalGroup(
            jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel10))
                    .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_Enombre)
                            .addComponent(js_EditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(js_EditarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_EArtista)
                            .addComponent(jt_Ealbum, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_GuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );
        jd_EditarCancionLayout.setVerticalGroup(
            jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jt_Enombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(js_EditarP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(js_EditarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jt_EArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jt_Ealbum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_EditarCancionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EditarCancionLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_GuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PlayLists");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Puntuacion:");

        jLabel4.setText("Year:");

        jLabel5.setText("Artista:");

        jLabel6.setText("Album:");

        js_Puntuacion.setModel(new javax.swing.SpinnerNumberModel(5, 1, 10, 1));

        js_Year.setModel(new javax.swing.SpinnerNumberModel(2000, 1900, 2020, 1));

        jt_CancionesPlaylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuacion", "Year", "Artista", "Album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_CancionesPlaylist);

        jLabel7.setText("Canciones Creadas");

        jl_Canciones.setModel(new DefaultListModel());
        jl_Canciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_CancionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_Canciones);

        jb_CrearCancion.setText("Crear Cancion");
        jb_CrearCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearCancionMouseClicked(evt);
            }
        });

        cb_Playlists.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_PlaylistsItemStateChanged(evt);
            }
        });

        jMenu1.setText("Herramientas");

        jm_GuardarPlaylist.setText("Guardar Playlist");
        jMenu1.add(jm_GuardarPlaylist);

        jm_AbrirPlaylist.setText("Abrir una Playlist");
        jMenu1.add(jm_AbrirPlaylist);

        jm_CrearPlaylist.setText("Crear Playlist");
        jm_CrearPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_CrearPlaylistActionPerformed(evt);
            }
        });
        jMenu1.add(jm_CrearPlaylist);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_CrearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_NombreCancion)
                                .addComponent(js_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(js_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt_Artista)
                                .addComponent(jt_Album, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jl_Playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(cb_Playlists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jt_NombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(js_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(js_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jt_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jt_Album, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_Playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Playlists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jb_CrearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_CrearPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_CrearPlaylistActionPerformed
        jd_CrearPlaylist.setModal(true);
        jd_CrearPlaylist.pack();
        jd_CrearPlaylist.setLocationRelativeTo(this);
        jd_CrearPlaylist.setVisible(true);
    }//GEN-LAST:event_jm_CrearPlaylistActionPerformed

    private void jb_CrearPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearPlaylistMouseClicked

        Playlist list = new Playlist(jt_NombrePlaylist.getText());

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_Playlists.getModel();

        modelo.addElement(list);

        cb_Playlists.setModel(modelo);

        JOptionPane.showMessageDialog(this, "La playlist ha sido creada exitosamente");

    }//GEN-LAST:event_jb_CrearPlaylistMouseClicked

    private void jb_CrearCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearCancionMouseClicked

        Cancion c = new Cancion(jt_NombreCancion.getText(),
                (int) js_Puntuacion.getValue(),
                (int) js_Year.getValue(),
                jt_Artista.getText(),
                jt_Album.getText()
        );

        DefaultListModel modelo = (DefaultListModel) jl_Canciones.getModel();

        modelo.addElement(c);

        jl_Canciones.setModel(modelo);

        jt_NombreCancion.setText("");
        js_Puntuacion.setValue(5);
        js_Year.setValue(2000);
        jt_Artista.setText("");
        jt_Album.setText("");

        JOptionPane.showMessageDialog(this, "La cancion ha sido creada exitosamente");
    }//GEN-LAST:event_jb_CrearCancionMouseClicked

    private void cb_PlaylistsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_PlaylistsItemStateChanged
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_Playlists.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) jt_CancionesPlaylist.getModel();

        if (evt.getStateChange() == 1) {

            Playlist p = (Playlist) modelo.getSelectedItem();

            for (Cancion c : p.getListaCanciones()) {

                Object[] newRow = {
                    c.getNombre(),
                    c.getPuntuacion(),
                    c.getAnio(),
                    c.getArtista(),
                    c.getAlbum()
                };

                modelo2.addRow(newRow);
            }

            jt_CancionesPlaylist.setModel(modelo2);
        }
    }//GEN-LAST:event_cb_PlaylistsItemStateChanged

    private void jl_CancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_CancionesMouseClicked
        if (evt.isMetaDown()) {
            if (jl_Canciones.getSelectedIndex() >= 0) {
                popup_Cancion.show(jl_Canciones, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_CancionesMouseClicked

    private void jm_EliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_EliminarCancionActionPerformed

        DefaultListModel modelo = (DefaultListModel) jl_Canciones.getModel();

        int index = jl_Canciones.getSelectedIndex();

        modelo.remove(index);
        cancionesCreadas.remove(index);

        JOptionPane.showMessageDialog(this, "La cancion se elimino exitosamente");
    }//GEN-LAST:event_jm_EliminarCancionActionPerformed

    private void jm_AgregarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_AgregarPlaylistActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jt_CancionesPlaylist.getModel();
        DefaultListModel modelo2 = (DefaultListModel) jl_Canciones.getModel();

        if (jl_Canciones.getSelectedIndex() >= 0) {

            int index = jl_Canciones.getSelectedIndex();
            Cancion c = (Cancion) modelo2.get(index);

            Object newRow[] = {
                c.getNombre(),
                c.getPuntuacion(),
                c.getAnio(),
                c.getArtista(),
                c.getAlbum()
            };

            modelo.addRow(newRow);

            jt_CancionesPlaylist.setModel(modelo);

            JOptionPane.showMessageDialog(this, "La cancion se ha agregado a "
                    + "la tabla del playlist correctamente");
        }


    }//GEN-LAST:event_jm_AgregarPlaylistActionPerformed

    private void jb_GuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarCambiosMouseClicked
        DefaultListModel modelo = (DefaultListModel) jl_Canciones.getModel();

        if (jt_Enombre.getText().equals("") || jt_EArtista.getText().equals("")
                || jt_Ealbum.getText().equals("")) {
            JOptionPane.showMessageDialog(jd_EditarCancion, "No puede dejar las casillas vacias!");
        } else {

            int index = jl_Canciones.getSelectedIndex();

            ((Cancion) modelo.get(index)).setNombre(jt_Enombre.getText());
            ((Cancion) modelo.get(index)).setPuntuacion((int) js_EditarP.getValue());
            ((Cancion) modelo.get(index)).setAnio((int) js_EditarYear.getValue());
            ((Cancion) modelo.get(index)).setArtista(jt_EArtista.getText());
            ((Cancion) modelo.get(index)).setAlbum(jt_Ealbum.getText());

            jl_Canciones.setModel(modelo);

            JOptionPane.showMessageDialog(this, "Se edito la cancion correctamente");
            jd_EditarCancion.setVisible(false);
        }

    }//GEN-LAST:event_jb_GuardarCambiosMouseClicked

    private void jm_EditarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_EditarCancionActionPerformed
        jd_EditarCancion.setModal(true);
        jd_EditarCancion.pack();
        jd_EditarCancion.setLocationRelativeTo(this);
        jd_EditarCancion.setVisible(true);

        DefaultListModel modelo = (DefaultListModel) jl_Canciones.getModel();
        
        int index = jl_Canciones.getSelectedIndex();
        
        Cancion c = (Cancion) modelo.get(index);
        
        jt_Enombre.setText(c.getNombre());
        js_EditarP.setValue(c.getPuntuacion());
        js_EditarYear.setValue(c.getAnio());
        jt_EArtista.setText(c.getArtista());
        jt_Ealbum.setText(c.getAlbum());
    }//GEN-LAST:event_jm_EditarCancionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Playlists;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_CrearCancion;
    private javax.swing.JButton jb_CrearPlaylist;
    private javax.swing.JButton jb_GuardarCambios;
    private javax.swing.JDialog jd_CrearPlaylist;
    private javax.swing.JDialog jd_EditarCancion;
    private javax.swing.JList<String> jl_Canciones;
    private javax.swing.JLabel jl_Playlist;
    private javax.swing.JMenuItem jm_AbrirPlaylist;
    private javax.swing.JMenuItem jm_AgregarPlaylist;
    private javax.swing.JMenuItem jm_CrearPlaylist;
    private javax.swing.JMenuItem jm_EditarCancion;
    private javax.swing.JMenuItem jm_EliminarCancion;
    private javax.swing.JMenuItem jm_GuardarPlaylist;
    private javax.swing.JSpinner js_EditarP;
    private javax.swing.JSpinner js_EditarYear;
    private javax.swing.JSpinner js_Puntuacion;
    private javax.swing.JSpinner js_Year;
    private javax.swing.JTextField jt_Album;
    private javax.swing.JTextField jt_Artista;
    private javax.swing.JTable jt_CancionesPlaylist;
    private javax.swing.JTextField jt_EArtista;
    private javax.swing.JTextField jt_Ealbum;
    private javax.swing.JTextField jt_Enombre;
    private javax.swing.JTextField jt_NombreCancion;
    private javax.swing.JTextField jt_NombrePlaylist;
    private javax.swing.JPopupMenu popup_Cancion;
    // End of variables declaration//GEN-END:variables

    ArrayList<Cancion> cancionesCreadas = new ArrayList();

}
