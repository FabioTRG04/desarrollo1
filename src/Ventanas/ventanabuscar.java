package Ventanas;
import interfaz.principal;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;

public class ventanabuscar extends javax.swing.JFrame {

    public class archivos {

        public static void main(String[] args) {

        }

    }

 
    public ventanabuscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        apellidoou = new javax.swing.JLabel();
        salariot = new javax.swing.JLabel();
        direccionou = new javax.swing.JLabel();
        nombreou = new javax.swing.JLabel();
        telefinoou = new javax.swing.JLabel();
        Dniou = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numerocuentau = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registrarEmpleado1 = new javax.swing.JButton();
        buscarempleado = new javax.swing.JButton();
        BotonMenu1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        puesto = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        salariototal = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        desempleo = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        formacion = new javax.swing.JLabel();
        año_ = new javax.swing.JLabel();
        mes_ = new javax.swing.JLabel();
        dia_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel17.setBackground(new java.awt.Color(216, 243, 220));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText(" Menu De Buscar Empleado");
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 230, 18));

        jLabel30.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText(" Nombre");
        jPanel17.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 30));

        jLabel32.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText(" DNI");
        jPanel17.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 40, 30));

        jLabel34.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Direccion");
        jPanel17.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, 30));

        jLabel35.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Apellido");
        jPanel17.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 70, 30));

        jLabel36.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Telefono");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 70, 30));

        jLabel39.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Salario total");
        jPanel17.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 110, -1));

        apellidoou.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        apellidoou.setForeground(new java.awt.Color(0, 0, 0));
        apellidoou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(apellidoou, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 150, 30));

        salariot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salariot.setForeground(new java.awt.Color(255, 255, 255));
        salariot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(salariot, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 140, 30));

        direccionou.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        direccionou.setForeground(new java.awt.Color(0, 0, 0));
        direccionou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(direccionou, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 150, 30));

        nombreou.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        nombreou.setForeground(new java.awt.Color(0, 0, 0));
        nombreou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(nombreou, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 150, 30));

        telefinoou.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        telefinoou.setForeground(new java.awt.Color(0, 0, 0));
        telefinoou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(telefinoou, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, 30));

        Dniou.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        Dniou.setForeground(new java.awt.Color(0, 0, 0));
        Dniou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(Dniou, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 150, 30));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 103, -1));

        numerocuentau.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        numerocuentau.setForeground(new java.awt.Color(0, 0, 0));
        numerocuentau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(numerocuentau, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 150, 30));

        jLabel40.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("N# Cuenta");
        jPanel17.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, 30));

        txt_buscar.setBackground(new java.awt.Color(183, 228, 199));
        txt_buscar.setToolTipText("Introducir DNI");
        txt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_buscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_buscarMousePressed(evt);
            }
        });
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        jPanel17.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 136, -1));

        jLabel37.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Introducir dni de empleado a buscar");
        jPanel17.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 250, 20));

        jPanel2.setBackground(new java.awt.Color(159, 223, 188));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derechos-de-autor.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PROGRAMA PARA LA GESTION DE NOMINAS DE EMPLEADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel17.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel3.setBackground(new java.awt.Color(183, 228, 199));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N

        registrarEmpleado1.setBackground(new java.awt.Color(153, 51, 0));
        registrarEmpleado1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        registrarEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        registrarEmpleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrato (2).png"))); // NOI18N
        registrarEmpleado1.setText("Registrar Empleado");
        registrarEmpleado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 243, 220)));
        registrarEmpleado1.setContentAreaFilled(false);
        registrarEmpleado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarEmpleado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarEmpleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarEmpleado1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarEmpleado1MouseExited(evt);
            }
        });
        registrarEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleado1ActionPerformed(evt);
            }
        });

        buscarempleado.setBackground(new java.awt.Color(183, 228, 199));
        buscarempleado.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        buscarempleado.setForeground(new java.awt.Color(255, 255, 255));
        buscarempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        buscarempleado.setText("    Buscar Empleado");
        buscarempleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 243, 220)));
        buscarempleado.setContentAreaFilled(false);
        buscarempleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarempleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarempleadoMouseExited(evt);
            }
        });
        buscarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarempleadoActionPerformed(evt);
            }
        });

        BotonMenu1.setBackground(new java.awt.Color(183, 228, 199));
        BotonMenu1.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        BotonMenu1.setForeground(new java.awt.Color(255, 255, 255));
        BotonMenu1.setText("MENU PRINCIPAL");
        BotonMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 243, 220)));
        BotonMenu1.setContentAreaFilled(false);
        BotonMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMenu1MouseExited(evt);
            }
        });
        BotonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenu1ActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(183, 228, 199));
        salir.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atajo.png"))); // NOI18N
        salir.setText("              Salir");
        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 243, 220)));
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrarEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(BotonMenu1)
                .addGap(12, 12, 12)
                .addComponent(registrarEmpleado1)
                .addGap(18, 18, 18)
                .addComponent(buscarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addGap(70, 70, 70))
        );

        jPanel17.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 450));

        jLabel41.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Puesto");
        jPanel17.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 57, 30));

        puesto.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        puesto.setForeground(new java.awt.Color(0, 0, 0));
        puesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, 30));

        jLabel42.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Categoria");
        jPanel17.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 80, 30));

        categoria.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        categoria.setForeground(new java.awt.Color(0, 0, 0));
        categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 140, 30));

        jLabel43.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("T. contrato");
        jPanel17.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 90, 30));

        jLabel44.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("ss");
        jPanel17.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 20, 30));

        jLabel45.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("desempleo");
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 80, 30));

        salariototal.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        salariototal.setForeground(new java.awt.Color(0, 0, 0));
        salariototal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(salariototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 140, 20));

        ss.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ss.setForeground(new java.awt.Color(0, 0, 0));
        ss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(ss, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 140, 30));

        desempleo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        desempleo.setForeground(new java.awt.Color(0, 0, 0));
        desempleo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(desempleo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 140, 30));

        jLabel46.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("formacion");
        jPanel17.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 80, 30));

        formacion.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        formacion.setForeground(new java.awt.Color(0, 0, 0));
        formacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.add(formacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 140, 30));

        año_.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        año_.setForeground(new java.awt.Color(0, 0, 0));
        año_.setText("año");
        jPanel17.add(año_, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, 30));

        mes_.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        mes_.setForeground(new java.awt.Color(0, 0, 0));
        mes_.setText("mes");
        jPanel17.add(mes_, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, 30));

        dia_.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        dia_.setForeground(new java.awt.Color(0, 0, 0));
        dia_.setText("dia");
        jPanel17.add(dia_, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, 30));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("-");
        jPanel17.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 10, 30));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("-");
        jPanel17.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 10, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void txt_buscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMousePressed
        txt_buscar.setText("");
    }//GEN-LAST:event_txt_buscarMousePressed

    private void txt_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMouseExited

    }//GEN-LAST:event_txt_buscarMouseExited

    private void txt_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMouseEntered

    }//GEN-LAST:event_txt_buscarMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/registros", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from empleados where ID = ?");

            pst.setString(1,txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                Dniou.setText(rs.getString("ID"));
                nombreou.setText(rs.getString("Nombre"));
                apellidoou.setText(rs.getString("Apellido"));
                telefinoou.setText(rs.getString("Telefono"));
                direccionou.setText(rs.getString("Direccion"));
                numerocuentau.setText(rs.getString("NumeroCuenta"));
                puesto.setText(rs.getString("puesto"));
                categoria.setText(rs.getString("categoria"));
                año_.setText(rs.getString("año"));
                mes_.setText(rs.getString("mes"));
                dia_.setText(rs.getString("dia"));
                ss.setText(rs.getString("ss"));
                desempleo.setText(rs.getString("desempleo"));
                formacion.setText(rs.getString("formacion"));
                salariototal.setText(rs.getString("salariototal"));


            }else{
                JOptionPane.showMessageDialog(null, "empleado no resgistrado");
            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registrarEmpleado1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarEmpleado1MouseEntered
        registrarEmpleado1.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_registrarEmpleado1MouseEntered

    private void registrarEmpleado1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarEmpleado1MouseExited
        registrarEmpleado1.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_registrarEmpleado1MouseExited

    private void registrarEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleado1ActionPerformed

        ventanaRegistrarNombres vr = new ventanaRegistrarNombres();
        vr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarEmpleado1ActionPerformed

    private void buscarempleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarempleadoMouseEntered
        buscarempleado.setForeground(Color.BLACK);
    }//GEN-LAST:event_buscarempleadoMouseEntered

    private void buscarempleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarempleadoMouseExited
        buscarempleado.setForeground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_buscarempleadoMouseExited

    private void buscarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarempleadoActionPerformed
        ventanabuscar b = new ventanabuscar();

        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buscarempleadoActionPerformed

    private void BotonMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMenu1MouseEntered
        BotonMenu1.setForeground(Color.BLACK);
    }//GEN-LAST:event_BotonMenu1MouseEntered

    private void BotonMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMenu1MouseExited
        BotonMenu1.setForeground(Color.WHITE);
    }//GEN-LAST:event_BotonMenu1MouseExited

    private void BotonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenu1ActionPerformed
        principal d = new principal();

        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonMenu1ActionPerformed

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir .setForeground(Color.WHITE);     // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseExited

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanabuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMenu1;
    private javax.swing.JLabel Dniou;
    private javax.swing.JLabel apellidoou;
    private javax.swing.JLabel año_;
    private javax.swing.JButton buscarempleado;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel desempleo;
    private javax.swing.JLabel dia_;
    private javax.swing.JLabel direccionou;
    private javax.swing.JLabel formacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mes_;
    private javax.swing.JLabel nombreou;
    private javax.swing.JLabel numerocuentau;
    private javax.swing.JLabel puesto;
    private javax.swing.JButton registrarEmpleado1;
    private javax.swing.JLabel salariot;
    private javax.swing.JLabel salariototal;
    private javax.swing.JButton salir;
    private javax.swing.JLabel ss;
    private javax.swing.JLabel telefinoou;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
