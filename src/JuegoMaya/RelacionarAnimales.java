package JuegoMaya;

import Util.BD;
import Util.Botones;
import Util.Jugador;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class RelacionarAnimales extends javax.swing.JFrame {
    private String[][] animales = {{"Kaab", "Abeja"}, 
        {"Masam", "Ballena"}, {"Tunkuluchú", "Buho"}, 
        {"Tssímin", "Caballo"}, {"Kekén", "Cerdo"},
        {"Ts'unu'un", "Colibri"},  {"T'u'ul", "Conejo"},
        {"T'eel", "Gallo"}, {"Miis", "Gato"},
        {"Balam", "Jaguar"}, {"Peépem", "Mariposa"}, 
        {"Chi'ich", "Pajaro"}, {"Peek'", "Perro"}, 
        {"Kai", "Pez"}, {"Kan", "Serpiente"}, 
        {"Àak", "Tortuga"}};
    private int[] animal = new int[8];
    private int intentos;
    private boolean botonPresionado;
    private boolean primerB;
    private String primerP;
    private String segundaP;
    private JButton[] pbtn = new JButton [2];
    private String[][] opciones = new String[8][2];
    private boolean[] botonesVerde = new boolean[16];
    Jugador jugador;
    Color colorRojoBotones = new Color(0xA2, 0x23, 0x1D);//A2231D
    Color colorVerdeBotones = new Color(0x00, 0xA8, 0x6B);//00A86B
    BD mBD;
    public RelacionarAnimales(Jugador jugador) {
        this.jugador=jugador;
        mBD = new BD("BD_maya?useSSL=false","root","");
        
        initComponents();
        lblpuntuacionGlobal.setText(jugador.getPuntuacion()+"");
        Botones.transparenciaButton(btnImgRegresar);
        Botones.transparenciaButton(btnImgInicio);
        Botones.transparenciaButton(btnImgSoporte);
        Botones.transparenciaButtonBorder(reiniciar);
        comenzarJuego();
        setResizable(false);
    }
    
    Timer timer = new Timer(250, new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        if(botonPresionado && primerB){
            boolean resultado = false;
            System.out.println(primerP + "|" + segundaP);
            for(int i = 0; i < 8; i++){
                if(((primerP.equals(opciones[i][0]))&&(segundaP.equals(opciones[i][1])))||
                        ((segundaP.equals(opciones[i][0]))&&(primerP.equals(opciones[i][1])))){
                    resultado = true;
                    break;
                }
            }
            if(resultado) {
                pbtn[0].setBorder(getRoundedBorder(colorVerdeBotones));  // Borde verde
                pbtn[0].setEnabled(false);
                int index1 = getButtonIndex(pbtn[0].getText());
                if(index1 != -1) {
                    botonesVerde[index1] = true;
                }
                pbtn[1].setBorder(getRoundedBorder(colorVerdeBotones));  // Borde verde
                pbtn[1].setEnabled(false);
                int index2 = getButtonIndex(pbtn[1].getText());
                if(index2 != -1) {
                    botonesVerde[index2] = true;
                }
            } else if(intentos > 0){
                pbtn[0].setBorder(getRoundedBorder(colorRojoBotones));  // Borde rojo
                pbtn[1].setBorder(getRoundedBorder(colorRojoBotones));  // Borde rojo
                intentos--;
                lblIntentos.setText(intentos + "");
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
            } else {
                intentos--;
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
            }
            
            comprobarGanador();
            if(intentos < 0){
                perder();
            }
            botonPresionado=false;
        }
    }
    });
    
    private int getButtonIndex(String text) {
        for (int i = 0; i < opciones.length; i++) {
            // Recorre todas las combinaciones y checa si alguna coincide
            if (opciones[i][0].equals(text) || opciones[i][1].equals(text)) {
                return i;  // Retorna el índice o i del arreglo 'opciones'
            }
        }
        return -1;  // Si no se encuentra, retorna -1
    }
    
    // Borde redondeado
    private Border getRoundedBorder(Color borderColor) {
        return new LineBorder(borderColor, 5) {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(getLineColor());
                g2d.setStroke(new BasicStroke(getThickness()));
                g2d.drawRoundRect(x, y, width - 1, height - 1, 20, 20);  // Radio de 20 para bordes redondeados
            }
        };
    }
    
    //Redimensionar las imagenes
    private ImageIcon resizeImageIcon(String imagePath, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    
    private void comenzarJuego() {
        Arrays.fill(botonesVerde, false);
        intentos = 2;
        botonPresionado = false;
        primerB = false;
        opcion1.setBorder(getRoundedBorder(colorRojoBotones));
        opcion2.setBorder(getRoundedBorder(colorRojoBotones));
        opcion3.setBorder(getRoundedBorder(colorRojoBotones));
        opcion4.setBorder(getRoundedBorder(colorRojoBotones));
        opcion5.setBorder(getRoundedBorder(colorRojoBotones));
        opcion6.setBorder(getRoundedBorder(colorRojoBotones));
        opcion7.setBorder(getRoundedBorder(colorRojoBotones));
        opcion8.setBorder(getRoundedBorder(colorRojoBotones));
        opcion9.setBorder(getRoundedBorder(colorRojoBotones));
        opcion10.setBorder(getRoundedBorder(colorRojoBotones));
        opcion11.setBorder(getRoundedBorder(colorRojoBotones));
        opcion12.setBorder(getRoundedBorder(colorRojoBotones));
        opcion13.setBorder(getRoundedBorder(colorRojoBotones));
        opcion14.setBorder(getRoundedBorder(colorRojoBotones));
        opcion15.setBorder(getRoundedBorder(colorRojoBotones));
        opcion16.setBorder(getRoundedBorder(colorRojoBotones));
        
        if(jugador.getPuntuacion() == 0){
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
            intentos = 1;
        }
        else{
            intentos = 1;
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
        }
        lblIntentos.setText(intentos+"");
        Random random = new Random();
        animal[0] = animales.length;
        animal[1] = animales.length;
        animal[2] = animales.length;
        animal[3] = animales.length;
        animal[4] = animales.length;
        animal[5] = animales.length;
        animal[6] = animales.length;
        animal[7] = animales.length;
        
        int cont=0;
        int aleatorio;
        boolean repetido;
        while(cont<8){
            aleatorio = random.nextInt(animales.length);
            repetido = false;
            for(int i=0; i<8; i++){
                if(animal[i] == aleatorio){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                animal[cont] = aleatorio;
            } else {
                cont--;
            }
            cont++;
        }
        for(int i=0; i <8 ;i++){
            opciones[i][0] = animales[animal[i]][0];
            opciones[i][1] = animales[animal[i]][1];
        }
        
        String[] botones = {opciones[0][0],opciones[1][0],opciones[2][0],opciones[3][0],opciones[4][0],opciones[5][0],
            opciones[6][0], opciones[7][0],opciones[0][1],opciones[1][1],opciones[2][1],opciones[3][1],opciones[4][1],
            opciones[5][1], opciones[6][1], opciones[7][1]};
        
        cont=0;
        JButton[] opcion = {opcion1,opcion2,opcion3,opcion4,opcion5,opcion6,opcion7,opcion8,opcion9,opcion10,opcion11,
            opcion12,opcion13,opcion14,opcion15,opcion16};
        while(cont<16){
            opcion[cont].setIcon(null);
            opcion[cont].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            opcion[cont].setContentAreaFilled(true);
            opcion[cont].setBackground(new Color(255,237,213));
            aleatorio = random.nextInt(16);
            if(!botones[aleatorio].equals("")){
                opcion[cont].setText(botones[aleatorio]);
                opcion[cont].setName(botones[aleatorio]);
                if(aleatorio >= 8){
                    String imagePath = "/imgAnimales2/" + botones[aleatorio].toLowerCase() + ".png";
                    opcion[cont].setHorizontalTextPosition(SwingConstants.CENTER);
                    opcion[cont].setOpaque(true);
                    opcion[cont].setContentAreaFilled(true);
                    opcion[cont].setIcon(resizeImageIcon(imagePath, 91, 70));
                }
                
                for(int i = 0; i < animales.length; i++){
                    if(botones[aleatorio].equals(animales[i][1])){
                        opcion[cont].setText("");
                    }
                }
                opcion[cont].setEnabled(true);
                botones[aleatorio] = "";
                cont++;               
            }
        }

        timer.start();
    }
    
    private void btnEnabled(JButton btn){
        btn.setEnabled(false);
        if(!botonPresionado){
            primerP = btn.getName();
            pbtn[0] = btn;
            botonPresionado = true;
            primerB = false;
        }else{
            segundaP = btn.getName();
            pbtn[1] = btn;
            primerB = true;
        }

    }
    
    private void comprobarGanador() {
        boolean todasCorrectas = true;
        
        //Verifica si los botones estan en verde
        for(int i=0; i<8; i++){
            if(!botonesVerde[i]){
                todasCorrectas = false;
                System.out.println("Botón en índice " + i + " aún no está en verde.");
                break;
            }
        }
        
        if(todasCorrectas){
            if(intentos == 0 && jugador.getPuntuacion() >= 10){
                puntuacion(10);
                JOptionPane.showMessageDialog(this, "Usted ha ganado 10 puntos.", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado 20 puntos.", "Win!!", JOptionPane.INFORMATION_MESSAGE);
                puntuacion(20);
            }
            timer.stop();
            comenzarJuego();
        }
    }
    
    private void perder(){
        JOptionPane.showMessageDialog(this, "Has perdido. Tu puntaje es: 0", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        opcion4.setEnabled(false);
        opcion5.setEnabled(false);
        opcion6.setEnabled(false);
        opcion7.setEnabled(false);
        opcion8.setEnabled(false);
        opcion9.setEnabled(false);
        opcion10.setEnabled(false);
        opcion11.setEnabled(false);
        opcion12.setEnabled(false);
        opcion13.setEnabled(false);
        opcion14.setEnabled(false);
        opcion15.setEnabled(false);
        opcion16.setEnabled(false);
    }

    private void puntuacion(int puntos){
        jugador.actualizarPuntuacion(puntos);
        if(!jugador.isOffline() && mBD.conectar()){
            mBD.actualizarPuntuacion(jugador);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImgRegresar = new javax.swing.JButton();
        btnImgSoporte = new javax.swing.JButton();
        btnImgInicio = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpuntuacionGlobal = new javax.swing.JLabel();
        opcion1 = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        opcion3 = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        lblintentos = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        opcion4 = new javax.swing.JButton();
        opcion5 = new javax.swing.JButton();
        opcion6 = new javax.swing.JButton();
        opcion7 = new javax.swing.JButton();
        opcion8 = new javax.swing.JButton();
        opcion9 = new javax.swing.JButton();
        opcion10 = new javax.swing.JButton();
        opcion11 = new javax.swing.JButton();
        opcion12 = new javax.swing.JButton();
        opcion13 = new javax.swing.JButton();
        opcion14 = new javax.swing.JButton();
        opcion15 = new javax.swing.JButton();
        opcion16 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("+Maya");

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELACIONAR ANIMALES");

        btnImgRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar.png"))); // NOI18N
        btnImgRegresar.setBorder(null);
        btnImgRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar1.png"))); // NOI18N
        btnImgRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgRegresarActionPerformed(evt);
            }
        });

        btnImgSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda.png"))); // NOI18N
        btnImgSoporte.setBorder(null);
        btnImgSoporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda1.png"))); // NOI18N
        btnImgSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgSoporteActionPerformed(evt);
            }
        });

        btnImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio.png"))); // NOI18N
        btnImgInicio.setBorder(null);
        btnImgInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio1.png"))); // NOI18N
        btnImgInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgInicioActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Puntuación global:");

        opcion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion1.setText("jButton1");
        opcion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion2.setText("jButton2");
        opcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion3.setText("jButton3");
        opcion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        lblintentos.setText("Intentos:");

        lblIntentos.setText("1");

        opcion4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAnimales1/abeja.png"))); // NOI18N
        opcion4.setText("jButton4");
        opcion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        opcion5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion5.setText("jButton5");
        opcion5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });

        opcion6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion6.setText("jButton6");
        opcion6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ActionPerformed(evt);
            }
        });

        opcion7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion7.setText("jButton7");
        opcion7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion7ActionPerformed(evt);
            }
        });

        opcion8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion8.setText("jButton8");
        opcion8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion8ActionPerformed(evt);
            }
        });

        opcion9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion9.setText("jButton9");
        opcion9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion9ActionPerformed(evt);
            }
        });

        opcion10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion10.setText("jButton10");
        opcion10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion10ActionPerformed(evt);
            }
        });

        opcion11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion11.setText("jButton11");
        opcion11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion11ActionPerformed(evt);
            }
        });

        opcion12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion12.setText("jButton12");
        opcion12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion12ActionPerformed(evt);
            }
        });

        opcion13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion13.setText("jButton13");
        opcion13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion13ActionPerformed(evt);
            }
        });

        opcion14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion14.setText("jButton14");
        opcion14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion14ActionPerformed(evt);
            }
        });

        opcion15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion15.setText("jButton15");
        opcion15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion15ActionPerformed(evt);
            }
        });

        opcion16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion16.setText("jButton16");
        opcion16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 161, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(opcion14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(opcion15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcion16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblintentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblintentos)
                        .addComponent(lblIntentos))
                    .addComponent(reiniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImgInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImgRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosAnimales regresar = new JuegosAnimales(jugador);
        regresar.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSoporteActionPerformed
        JOptionPane.showMessageDialog(this, "Relaciona el nombre del animal con su nombre escrito \n en maya. \n", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgSoporteActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        MenuPrincipal inicio = new MenuPrincipal();
        inicio.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion1);
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion2);
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion3);
    }//GEN-LAST:event_opcion3ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        timer.stop();
        comenzarJuego();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion4);
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion5);
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion6);
    }//GEN-LAST:event_opcion6ActionPerformed

    private void opcion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion7ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion7);
    }//GEN-LAST:event_opcion7ActionPerformed

    private void opcion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion8ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion8);
    }//GEN-LAST:event_opcion8ActionPerformed

    private void opcion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion9ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion9);
    }//GEN-LAST:event_opcion9ActionPerformed

    private void opcion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion10ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion10);
    }//GEN-LAST:event_opcion10ActionPerformed

    private void opcion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion11ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion11);
    }//GEN-LAST:event_opcion11ActionPerformed

    private void opcion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion12ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion12);
    }//GEN-LAST:event_opcion12ActionPerformed

    private void opcion13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion13ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion13);
    }//GEN-LAST:event_opcion13ActionPerformed

    private void opcion14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion14ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion14);
    }//GEN-LAST:event_opcion14ActionPerformed

    private void opcion15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion15ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion15);
    }//GEN-LAST:event_opcion15ActionPerformed

    private void opcion16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion16ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion16);
    }//GEN-LAST:event_opcion16ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new completarPalabras(jugador).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImgInicio;
    private javax.swing.JButton btnImgRegresar;
    private javax.swing.JButton btnImgSoporte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lblpuntuacionGlobal;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion10;
    private javax.swing.JButton opcion11;
    private javax.swing.JButton opcion12;
    private javax.swing.JButton opcion13;
    private javax.swing.JButton opcion14;
    private javax.swing.JButton opcion15;
    private javax.swing.JButton opcion16;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton opcion3;
    private javax.swing.JButton opcion4;
    private javax.swing.JButton opcion5;
    private javax.swing.JButton opcion6;
    private javax.swing.JButton opcion7;
    private javax.swing.JButton opcion8;
    private javax.swing.JButton opcion9;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}
