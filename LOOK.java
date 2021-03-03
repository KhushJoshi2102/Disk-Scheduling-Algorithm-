/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiskScheduling;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Collections;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author KHUSH
 */

public class LOOK extends javax.swing.JFrame {

    /**
     * Creates new form LOOK
     */
     data d;
    public LOOK(data m){
        d=m;
        initComponents();
    }
    public LOOK() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        h = new javax.swing.JTextField();
        hLabel = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        n = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Compare = new javax.swing.JButton();
        fd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOOK");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" DESCRIPTION :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("It is similar to the SCAN disk scheduling algorithm except for the difference that the disk arm in spite of going to the end of the disk goes only to the last request to be serviced in front of the head and then ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("reverses its direction from there only. Thus it prevents the extra delay which occurred due to unnecessary traversal to the end of the disk.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        hLabel.setForeground(new java.awt.Color(255, 255, 255));
        hLabel.setText("Head");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of entries  ->");

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 204, 255));
        panel.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left", "Right" }));

        Compare.setText("Compare");
        Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareActionPerformed(evt);
            }
        });

        fd.setText("Fetch Data");
        fd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(361, 361, 361)
                                .addComponent(jLabel15)
                                .addGap(498, 498, 498)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fd))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hLabel)
                                    .addComponent(jButton1)
                                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(613, 613, 613))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Compare))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(752, 752, 752))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Compare)))
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(hLabel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Add)))
                .addGap(39, 39, 39))
        );

        h.setVisible(false);
        hLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LOOK(int arr[], int head,
                        String direction) 
{ 
    int seek_count = 0; 
    int distance, cur_track; 
    int size = arr.length;
    Vector<Integer> left = new Vector<Integer>(); 
    Vector<Integer> right = new Vector<Integer>(); 
    Vector<Integer> seek_sequence = new Vector<Integer>(); 
   
    // Appending values which are 
    // currently at left and right 
    // direction from the head. 
    for(int i = 0; i < size; i++) 
    { 
        if (arr[i] < head) 
            left.add(arr[i]); 
        if (arr[i] > head) 
            right.add(arr[i]); 
    }  
   
    // Sorting left and right vectors 
    // for servicing tracks in the 
    // correct sequence. 
    Collections.sort(left);  
    Collections.sort(right);  
     
    // MainPage the while loop two times. 
    // one by one scanning right 
    // and left side of the head 
    int run = 2; 
    while (run-- > 0)
    { 
        if (direction == "left") 
        { 
            for(int i = left.size() - 1; 
                    i >= 0; i--)
            { 
                cur_track = left.get(i); 
   
                // Appending current track to
                // seek sequence 
                seek_sequence.add(cur_track); 
   
                // Calculate absolute distance 
                distance = Math.abs(cur_track - head); 
   
                // Increase the total count 
                seek_count += distance; 
   
                // Accessed track is now the new head 
                head = cur_track; 
            } 
             
            // Reversing the direction 
            direction = "right"; 
        } 
        else if (direction == "right")
        { 
            for(int i = 0; i < right.size(); i++)
            {
                cur_track = right.get(i); 
                 
                // Appending current track to 
                // seek sequence 
                seek_sequence.add(cur_track); 
   
                // Calculate absolute distance 
                distance = Math.abs(cur_track - head); 
   
                // Increase the total count 
                seek_count += distance; 
   
                // Accessed track is now new head 
                head = cur_track; 
            } 
             
            // Reversing the direction 
            direction = "left"; 
        } 
    } 
     
    System.out.println("Total number of seek " +
                       "operations = " + seek_count);
   
    System.out.println("Seek Sequence is"); 
    int[] g = new int[seek_sequence.size()];
    for(int i = 0; i < seek_sequence.size(); i++)
    {
        System.out.println(seek_sequence.get(i));
        g[i] = seek_sequence.get(i);
    } 
    graph(g);
} 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        //        Scanner sc = new Scanner(System.in);
        //    System.out.println("Enter size of array : ");
        //    System.out.println("Enter array elements : ");
        int n = model.getColumnCount();
        int arr[] = new int[n];
        int j=0;
        while(j<n){
            arr[j] = Integer.parseInt((String)model.getValueAt(0,j));
            j++;
        }
        int head = Integer.parseInt(h.getText());
        String dir = "";
        if (jComboBox1.getSelectedIndex()==0){
    dir ="left";
}
else{
    dir = "right";
}
        LOOK(arr,head,dir);
        d.fetch(arr,head);
    }//GEN-LAST:event_jButton1ActionPerformed
 private void graph(int[] in){
//        int s1 = Integer.parseInt(txt_1.getText());
//        int s2 = Integer.parseInt(txt_2.getText());
//        int s3 = Integer.parseInt(txt_3.getText());
//        int s4 = Integer.parseInt(txt_4.getText());
//        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i=0;
        while(i<in.length){
            dataset.setValue(in[i], "", "Request_"+i);
            i++;
        }
//        dataset.setValue(s1, "", "statisctic_1");
//        dataset.setValue(s2, "", "statisctic_2");
//        dataset.setValue(s3, "", "statisctic_3");
//        dataset.setValue(s4, "", "statisctic_4");
        
        JFreeChart chart = ChartFactory.createLineChart("LOOK Scheduling", "", "Disk Request", dataset);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.RED);
        catPlot.setBackgroundPaint(Color.BLACK);
        
        LineAndShapeRenderer ren = new LineAndShapeRenderer();
        catPlot.setRenderer(ren);
        ren.setSeriesStroke(0, new BasicStroke(4.0f));
        
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.removeAll();
        panel.add(chartPanel , BorderLayout.CENTER);
        panel.validate();
    }
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int sizeOfArray = Integer.parseInt(n.getText());
        int x=model.getColumnCount();
//        model.setColumnCount(0);
        int i=0;
        while(i<sizeOfArray){
            //            arr[x] = sc.nextInt();
            model.addColumn("Statistics "+String.valueOf(x+1));
            i++;
            x++;
        }
        h.setVisible(true);
        hLabel.setVisible(true);
    }//GEN-LAST:event_AddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainPage jfrm2= new MainPage(d);
//        jfrm2.setTitle("Round Robin Scheduling");
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        //        Scanner sc = new Scanner(System.in);
        //    System.out.println("Enter size of array : ");
        //    System.out.println("Enter array elements : ");
        int n = model.getColumnCount();
        int arr[] = new int[n];
        CompGraph g = new CompGraph();
        int j =0 ;
        while(j<n){
            arr[j] = Integer.parseInt((String)model.getValueAt(0,j));
            j++;
        }
        //     System.out.println("Enter the value of head : ");
        int head;
        if(h.getText()==null){
            head = 1;
        }
        else{
            head = Integer.parseInt(h.getText());
        }
        int[] a = g.fetch(arr,head);
        CG cg = new CG(a);
        cg.setVisible(true);
    }//GEN-LAST:event_CompareActionPerformed

    private void fdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdActionPerformed
        // TODO add your handling code here:
        int[] data = d.get();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setColumnCount(0);
        int i=0;
        while(i<data.length){
            //            arr[x] = sc.nextInt();
            model.addColumn("Statistics "+String.valueOf(i+1));
            i++;
        }
        model.setRowCount(0);
        String[] row = new String[data.length];
        int j=0;
        for(int e:data){
            row[j] = Integer.toString(e);
            j++;
        }
        model.addRow(row);
        h.setText(Integer.toString(d.gh()));
        h.setVisible(true);
        hLabel.setVisible(true);
    }//GEN-LAST:event_fdActionPerformed

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
            java.util.logging.Logger.getLogger(LOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOOK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Compare;
    private javax.swing.JButton fd;
    private javax.swing.JTextField h;
    private javax.swing.JLabel hLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField n;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
