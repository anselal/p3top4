package prolog;
import java.util.ArrayList;
public class finalFrame  extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//δηλώσεις μεταβλητών
    private javax.swing.JPanel asem;
    private javax.swing.JPanel asem1;
    private javax.swing.JPanel bsem;
    private javax.swing.JPanel bsem1;
    private javax.swing.JPanel bsem2;
    private javax.swing.JPanel bsem3;
    private javax.swing.JPanel bsem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox l4101e;
    private javax.swing.JCheckBox l4101t;
    private javax.swing.JCheckBox l4102e;
    private javax.swing.JCheckBox l4102t;
    private javax.swing.JCheckBox l4103;
    private javax.swing.JCheckBox l4104;
    private javax.swing.JCheckBox l4105e;
    private javax.swing.JCheckBox l4105t;
    private javax.swing.JCheckBox l4201e;
    private javax.swing.JCheckBox l4201t;
    private javax.swing.JCheckBox l4202e;
    private javax.swing.JCheckBox l4202t;
    private javax.swing.JCheckBox l4203;
    private javax.swing.JCheckBox l4204e;
    private javax.swing.JCheckBox l4204t;
    private javax.swing.JCheckBox l4205;
    private javax.swing.JCheckBox l4301e;
    private javax.swing.JCheckBox l4301t;
    private javax.swing.JCheckBox l4302e;
    private javax.swing.JCheckBox l4302t;
    private javax.swing.JCheckBox l4303e;
    private javax.swing.JCheckBox l4303t;
    private javax.swing.JCheckBox l4304e;
    private javax.swing.JCheckBox l4304t;
    private javax.swing.JCheckBox l4305e;
    private javax.swing.JCheckBox l4305t;
    private javax.swing.JCheckBox l4401e;
    private javax.swing.JCheckBox l4401t;
    private javax.swing.JCheckBox l4402e;
    private javax.swing.JCheckBox l4402t;
    private javax.swing.JCheckBox l4403e;
    private javax.swing.JCheckBox l4403t;
    private javax.swing.JCheckBox l4404;
    private javax.swing.JCheckBox l4405e;
    private javax.swing.JCheckBox l4405t;
    private javax.swing.JCheckBox l4501;
    private javax.swing.JCheckBox l4502e;
    private javax.swing.JCheckBox l4502t;
    private javax.swing.JCheckBox l4503e;
    private javax.swing.JCheckBox l4503t;
    private javax.swing.JCheckBox l4504e;
    private javax.swing.JCheckBox l4504t;
    private javax.swing.JCheckBox l4505;
    private javax.swing.JCheckBox l4601e;
    private javax.swing.JCheckBox l4601t;
    private javax.swing.JCheckBox l4602e;
    private javax.swing.JCheckBox l4602t;
    private javax.swing.JCheckBox l4603e;
    private javax.swing.JCheckBox l4603t;
    private javax.swing.JCheckBox l4604;
    private javax.swing.JCheckBox l4605;
    private javax.swing.JCheckBox l4701e;
    private javax.swing.JCheckBox l4701t;
    private javax.swing.JCheckBox l4702e;
    private javax.swing.JCheckBox l4702t;
    private javax.swing.JCheckBox l4703;
    private javax.swing.JCheckBox l4704;
    private javax.swing.JCheckBox l4705;
    private javax.swing.JCheckBox l4801;
    private javax.swing.JCheckBox l4802;
    private javax.swing.JCheckBox l4803;
    private javax.swing.JCheckBox l4804e;
    private javax.swing.JCheckBox l4804t;
    private javax.swing.JCheckBox l4805e;
    private javax.swing.JCheckBox l4805t;
    private javax.swing.JCheckBox l4806;
    private javax.swing.JCheckBox l4807;
    private javax.swing.JCheckBox l4808;
    
    public finalFrame() {
        initComponents();
    }
    
    //constructor που δέχεται σαν παράμετρο τα μαθήματα που πρέπει να 
    //παρακολουθήσει ο φοιτητής και ενεργοποιεί τα checkbox
    public finalFrame(ArrayList<String> p, ArrayList<String> epilogi,int total){
    	initComponents();
    	l4101t.setEnabled(false);
    	l4101e.setEnabled(false);
    	l4102t.setEnabled(false);
    	l4102e.setEnabled(false);
    	l4103.setEnabled(false);
    	l4104.setEnabled(false);
    	l4105t.setEnabled(false);
    	l4105e.setEnabled(false);
    	l4201t.setEnabled(false);
    	l4201e.setEnabled(false);
    	l4202t.setEnabled(false);
    	l4202e.setEnabled(false);
    	l4203.setEnabled(false);
    	l4204t.setEnabled(false);
    	l4204e.setEnabled(false);
    	l4205.setEnabled(false);
    	l4301t.setEnabled(false);
    	l4301e.setEnabled(false);
    	l4302t.setEnabled(false);
    	l4302e.setEnabled(false);
    	l4303t.setEnabled(false);
    	l4303e.setEnabled(false);
    	l4304t.setEnabled(false);
    	l4304e.setEnabled(false);
    	l4305t.setEnabled(false);
    	l4305e.setEnabled(false);
    	l4401t.setEnabled(false);
    	l4401e.setEnabled(false);
    	l4402t.setEnabled(false);
    	l4402e.setEnabled(false);
    	l4403t.setEnabled(false);
    	l4403e.setEnabled(false);
    	l4404.setEnabled(false);
    	l4405t.setEnabled(false);
    	l4405e.setEnabled(false);
    	l4501.setEnabled(false);
    	l4502t.setEnabled(false);
    	l4502e.setEnabled(false);
    	l4503t.setEnabled(false);
    	l4503e.setEnabled(false);
    	l4504t.setEnabled(false);
    	l4504e.setEnabled(false);
    	l4505.setEnabled(false);
    	l4601t.setEnabled(false);
    	l4601e.setEnabled(false);
    	l4602t.setEnabled(false);
    	l4602e.setEnabled(false);
    	l4603t.setEnabled(false);
    	l4603e.setEnabled(false);
    	l4604.setEnabled(false);
    	l4605.setEnabled(false);
    	l4701e.setEnabled(false);
    	l4701t.setEnabled(false);
    	l4702t.setEnabled(false);
    	l4702e.setEnabled(false);
    	l4703.setEnabled(false);
    	l4704.setEnabled(false);
    	l4705.setEnabled(false);
    	l4801.setEnabled(false);
    	l4802.setEnabled(false);
    	l4803.setEnabled(false);
    	l4804t.setEnabled(false);
    	l4804e.setEnabled(false);
    	l4805t.setEnabled(false);
    	l4805e.setEnabled(false);
    	l4806.setEnabled(false);
    	l4807.setEnabled(false);
    	l4808.setEnabled(false);
    	
    	//ενεργοποίηση checkbox
    	if (p.contains("l4101t")){
    		l4101t.setSelected(true);
    	}
    	if (p.contains("l4101e")){
    		l4101e.setSelected(true);
    	}
    	if (p.contains("l4102t")){
    		l4102t.setSelected(true);
    	}
    	if (p.contains("l4102e")){
    		l4102e.setSelected(true);
    	}
    	if (p.contains("l4103")){
    		l4103.setSelected(true);
    	}
    	if (p.contains("l4104")){
    		l4104.setSelected(true);
    	}
    	if (p.contains("l4105t")){
    		l4105t.setSelected(true);
    	}
    	if (p.contains("l4105e")){
    		l4105e.setSelected(true);
    	}
    	if (p.contains("l4201t")){
    		l4201t.setSelected(true);
    	}
    	if (p.contains("l4201e")){
    		l4201e.setSelected(true);
    	}
    	if (p.contains("l4202t")){
    		l4202t.setSelected(true);
    	}
    	if (p.contains("l4202e")){
    		l4202e.setSelected(true);
    	}
    	if (p.contains("l4203")){
    		l4203.setSelected(true);
    	}
    	if (p.contains("l4204t")){
    		l4204t.setSelected(true);
    	}
    	if (p.contains("l4204e")){
    		l4204e.setSelected(true);
    	}
    	if (p.contains("l4205")){
    		l4205.setSelected(true);
    	}
    	if (p.contains("l4301t")){
    		l4301t.setSelected(true);
    	}
    	if (p.contains("l4301e")){
    		l4301e.setSelected(true);
    	}
    	if (p.contains("l4302t")){
    		l4302t.setSelected(true);
    	}
    	if (p.contains("l4302e")){
    		l4302e.setSelected(true);
    	}
    	if (p.contains("l4303t")){
    		l4303t.setSelected(true);
    	}
    	if (p.contains("l4303e")){
    		l4303e.setSelected(true);
    	}
    	if (p.contains("l4304t")){
    		l4304t.setSelected(true);
    	}
    	if (p.contains("l4304e")){
    		l4304e.setSelected(true);
    	}
    	if (p.contains("l4305t")){
    		l4305t.setSelected(true);
    	}
    	if (p.contains("l4305e")){
    		l4305e.setSelected(true);
    	}
    	if (p.contains("l4401t")){
    		l4401t.setSelected(true);
    	}
    	if (p.contains("l4401e")){
    		l4401e.setSelected(true);
    	}
    	if (p.contains("l4402t")){
    		l4402t.setSelected(true);
    	}
    	if (p.contains("l4402e")){
    		l4402e.setSelected(true);
    	}
    	if (p.contains("l4403t")){
    		l4403t.setSelected(true);
    	}
    	if (p.contains("l4403e")){
    		l4403e.setSelected(true);
    	}
    	if (p.contains("l4404")){
    		l4404.setSelected(true);
    	}
    	if (p.contains("l4405t")){
    		l4405t.setSelected(true);
    	}
    	if (p.contains("l4405e")){
    		l4405e.setSelected(true);
    	}
    	if (p.contains("l4501")){
    		l4501.setSelected(true);
    	}
    	if (p.contains("l4502")){
    		l4502t.setSelected(true);
    		l4502e.setSelected(true);
    	}
    	if (p.contains("l4502e")){
    		
    	}
    	if (p.contains("l4503t")){
    		l4503t.setSelected(true);
    	}
    	if (p.contains("l4503e")){
    		l4503e.setSelected(true);
    	}
    	if (p.contains("l4505")){
    		l4505.setSelected(true);
    	}
    	if (p.contains("l4603t")){
    		l4603t.setSelected(true);
    	}
    	if (p.contains("l4603e")){
    		l4603e.setSelected(true);
    	}
    	if (p.contains("l4604")){
    		l4604.setSelected(true);
    	}
    	if (p.contains("l4701t")){
    		l4701t.setSelected(true);
    	}
    	if (p.contains("l4701e")){
    		l4701e.setSelected(true);
    	}
    	if (epilogi.contains("l4504t")){
    		l4504t.setSelected(true);
    	}
    	if (epilogi.contains("l4504e")){
    		l4504e.setSelected(true);
    	}
    	if (epilogi.contains("l4601t")){
    		l4601t.setSelected(true);
    	}
    	if (epilogi.contains("l4601e")){
    		l4601e.setSelected(true);
    	}
    	if (epilogi.contains("l4602t")){
    		l4602t.setSelected(true);
    	}
    	if (epilogi.contains("l4602e")){
    		l4602e.setSelected(true);
    	}
    	if (epilogi.contains("l4801")){
    		l4801.setSelected(true);
    	}
    	if (epilogi.contains("l4702t")){
    		l4702t.setSelected(true);
    	}
    	if (epilogi.contains("l4702e")){
    		l4702e.setSelected(true);
    	}
    	if (epilogi.contains("l4802")){
    		l4802.setSelected(true);
    	}
    	if (epilogi.contains("l4803")){
    		l4803.setSelected(true);
    	}
    	if (epilogi.contains("l4804t")){
    		l4804t.setSelected(true);
    	}
    	if (epilogi.contains("l4804e")){
    		l4804e.setSelected(true);
    	}
    	if (epilogi.contains("l4805t")){
    		l4805t.setSelected(true);
    	}
    	if (epilogi.contains("l4805e")){
    		l4805e.setSelected(true);
    	}
    	if (epilogi.contains("l4806")){
    		l4806.setSelected(true);
    	}
    	if (epilogi.contains("l4807")){
    		l4807.setSelected(true);
    	}
    	if (epilogi.contains("l4808")){
    		l4808.setSelected(true);
    	}
    	asem.setEnabled(false);
    	bsem4.setEnabled(false);
    	if (total>0)
    		jLabel2.setText("<html><font color='red'>Πρέπει να επιλέξετε " + total +" ΔΜ σε μαθήματα επιλογής</font></html>");
    	else
    		jLabel2.setText("<html><font color='red'>Δε χρειάζεται να δηλώσετε κανένα μάθημα επιλογής</font></html>");
    }

    private void initComponents() {//GEN-BEGIN:initComponents

        asem = new javax.swing.JPanel();
        l4101t = new javax.swing.JCheckBox();
        l4102t = new javax.swing.JCheckBox();
        l4103 = new javax.swing.JCheckBox();
        l4104 = new javax.swing.JCheckBox();
        l4105t = new javax.swing.JCheckBox();
        l4101e = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l4102e = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l4105e = new javax.swing.JCheckBox();
        bsem = new javax.swing.JPanel();
        l4401t = new javax.swing.JCheckBox();
        l4402t = new javax.swing.JCheckBox();
        l4403t = new javax.swing.JCheckBox();
        l4404 = new javax.swing.JCheckBox();
        l4405t = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        l4405e = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        l4403e = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        l4402e = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        l4401e = new javax.swing.JCheckBox();
        bsem2 = new javax.swing.JPanel();
        l4201t = new javax.swing.JCheckBox();
        l4202t = new javax.swing.JCheckBox();
        l4203 = new javax.swing.JCheckBox();
        l4204t = new javax.swing.JCheckBox();
        l4205 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        l4201e = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        l4202e = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l4204e = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        asem1 = new javax.swing.JPanel();
        l4501 = new javax.swing.JCheckBox();
        l4502t = new javax.swing.JCheckBox();
        l4503t = new javax.swing.JCheckBox();
        l4504t = new javax.swing.JCheckBox();
        l4505 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        l4502e = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        l4503e = new javax.swing.JCheckBox();
        l4504e = new javax.swing.JCheckBox();
        bsem3 = new javax.swing.JPanel();
        l4601t = new javax.swing.JCheckBox();
        l4602t = new javax.swing.JCheckBox();
        l4603t = new javax.swing.JCheckBox();
        l4604 = new javax.swing.JCheckBox();
        l4605 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        l4601e = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        l4602e = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        l4603e = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        bsem4 = new javax.swing.JPanel();
        l4701t = new javax.swing.JCheckBox();
        l4702t = new javax.swing.JCheckBox();
        l4703 = new javax.swing.JCheckBox();
        l4704 = new javax.swing.JCheckBox();
        l4705 = new javax.swing.JCheckBox();
        l4801 = new javax.swing.JCheckBox();
        l4802 = new javax.swing.JCheckBox();
        l4803 = new javax.swing.JCheckBox();
        l4804t = new javax.swing.JCheckBox();
        l4805t = new javax.swing.JCheckBox();
        l4807 = new javax.swing.JCheckBox();
        l4806 = new javax.swing.JCheckBox();
        l4808 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        l4701e = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        l4702e = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        l4804e = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        l4805e = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        bsem1 = new javax.swing.JPanel();
        l4301t = new javax.swing.JCheckBox();
        l4302t = new javax.swing.JCheckBox();
        l4303t = new javax.swing.JCheckBox();
        l4304t = new javax.swing.JCheckBox();
        l4305t = new javax.swing.JCheckBox();
        l4301e = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        l4302e = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        l4303e = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        l4304e = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        l4305e = new javax.swing.JCheckBox();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Αντιστοίχιση Μαθημάτων Π3->Π4");

        asem.setBorder(javax.swing.BorderFactory.createTitledBorder("A εξάμηνο"));

        l4102t.setName("l4102t"); // NOI18N

        jLabel3.setText("4101 Εισαγωγή στην Πληροφορική");

        jLabel4.setText("4102 Προγραμματισμός Υπολογιστών Ι");

        l4102e.setName("l4102"); // NOI18N

        jLabel5.setText("4103 Ψηφιακά Συστήματα (Θ)");

        jLabel6.setText("4104 Μαθηματική Ανάλυση");

        jLabel7.setText("4105 Δεξιότητες Επικοινωνίας");

        javax.swing.GroupLayout asemLayout = new javax.swing.GroupLayout(asem);
        asem.setLayout(asemLayout);
        asemLayout.setHorizontalGroup(
            asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asemLayout.createSequentialGroup()
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asemLayout.createSequentialGroup()
                        .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4102t)
                            .addComponent(l4103)
                            .addComponent(l4104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(asemLayout.createSequentialGroup()
                                .addComponent(l4102e)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(asemLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))))
                    .addGroup(asemLayout.createSequentialGroup()
                        .addComponent(l4101t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4101e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(asemLayout.createSequentialGroup()
                        .addComponent(l4105t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4105e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asemLayout.setVerticalGroup(
            asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4101t)
                    .addComponent(l4101e)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(l4102t)
                    .addComponent(l4102e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4103)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4104)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(asemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l4105t)
                        .addComponent(l4105e))
                    .addComponent(jLabel7))
                .addGap(17, 17, 17))
        );

        bsem.setBorder(javax.swing.BorderFactory.createTitledBorder("Δ εξάμηνο"));

        l4402t.setName("c3102"); // NOI18N

        jLabel18.setText("4405 Θεωρία Πιθανοτήτων και Στατιστική");

        jLabel19.setText("4404 Θεωρία Λειτουργικών Συστημάτων");

        jLabel20.setText("4403 Τηλ/νίες και Δίκτυα Υπολογιστών");

        jLabel21.setText("4402 Τεχν.Νοημ.:Γλώσσες και Τεχνικές");

        l4402e.setName("c3102"); // NOI18N

        jLabel22.setText("4401 Μεθοδολογίες Προγραμματισμού");

        javax.swing.GroupLayout bsemLayout = new javax.swing.GroupLayout(bsem);
        bsem.setLayout(bsemLayout);
        bsemLayout.setHorizontalGroup(
            bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsemLayout.createSequentialGroup()
                .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsemLayout.createSequentialGroup()
                        .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addComponent(l4405t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4405e))
                            .addComponent(l4404))
                        .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel18))))
                    .addGroup(bsemLayout.createSequentialGroup()
                        .addComponent(l4403t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4403e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(bsemLayout.createSequentialGroup()
                        .addComponent(l4402t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4402e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21))
                    .addGroup(bsemLayout.createSequentialGroup()
                        .addComponent(l4401t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4401e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        bsemLayout.setVerticalGroup(
            bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsemLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l4401t)
                        .addComponent(l4401e))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsemLayout.createSequentialGroup()
                        .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addComponent(l4402t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsemLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(1, 1, 1)))
                        .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addComponent(l4403e)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l4405e))
                            .addGroup(bsemLayout.createSequentialGroup()
                                .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l4403t)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bsemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bsemLayout.createSequentialGroup()
                                        .addComponent(l4404)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l4405t))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsemLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18))))))
                    .addComponent(l4402e))
                .addGap(17, 17, 17))
        );

        bsem2.setBorder(javax.swing.BorderFactory.createTitledBorder("B εξάμηνο"));

        l4202t.setName("c3102"); // NOI18N

        jLabel8.setText("4201Αντικειμενοστραφής Προγραμματισμός");

        jLabel9.setText("4202 Εισαγωγή στα Λειτουργικά Συστήματα");

        l4202e.setName("c3102"); // NOI18N

        jLabel10.setText("4203 Διακριτά Μαθηματικά");

        jLabel11.setText("<html>4205 Πληροφοριακά Συστήματα Ι</html>");

        jLabel12.setText("4204 Γλώσσες και Τεχνολογίες Ιστού");

        javax.swing.GroupLayout bsem2Layout = new javax.swing.GroupLayout(bsem2);
        bsem2.setLayout(bsem2Layout);
        bsem2Layout.setHorizontalGroup(
            bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem2Layout.createSequentialGroup()
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem2Layout.createSequentialGroup()
                        .addComponent(l4201t)
                        .addGap(4, 4, 4)
                        .addComponent(l4201e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(bsem2Layout.createSequentialGroup()
                        .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem2Layout.createSequentialGroup()
                                .addComponent(l4202t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4202e))
                            .addComponent(l4203))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)))
                    .addGroup(bsem2Layout.createSequentialGroup()
                        .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem2Layout.createSequentialGroup()
                                .addComponent(l4204t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4204e))
                            .addComponent(l4205))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bsem2Layout.setVerticalGroup(
            bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4201t, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l4201e, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4202t)
                    .addComponent(jLabel9)
                    .addComponent(l4202e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4203)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4204t)
                    .addComponent(jLabel12)
                    .addComponent(l4204e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l4205)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        asem1.setBorder(javax.swing.BorderFactory.createTitledBorder("E εξάμηνο"));

        l4502t.setName("c3102"); // NOI18N

        jLabel23.setText("4501 Πληροφοριακά Συστήματα ΙΙ");

        jLabel24.setText("4502 Μηχανική Λογισμικού Ι");

        l4502e.setName("c3102"); // NOI18N

        jLabel25.setText("4503 Δίκτυα Υπολογιστών");

        jLabel26.setText("<html>4504 Ανάπτυξη Διαδ/κών Συστ/των &<br>Εφαρμογών <font color='red'>(Επιλογής)</font></html>");

        jLabel27.setText("4505 Επιχειρησιακή Έρευνα");

        javax.swing.GroupLayout asem1Layout = new javax.swing.GroupLayout(asem1);
        asem1.setLayout(asem1Layout);
        asem1Layout.setHorizontalGroup(
            asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asem1Layout.createSequentialGroup()
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asem1Layout.createSequentialGroup()
                        .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l4501)
                            .addComponent(l4502t))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4502e))
                    .addGroup(asem1Layout.createSequentialGroup()
                        .addComponent(l4503t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4503e))
                    .addGroup(asem1Layout.createSequentialGroup()
                        .addComponent(l4504t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4504e))
                    .addComponent(l4505))
                .addGap(17, 17, 17)
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        asem1Layout.setVerticalGroup(
            asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4501)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4502t)
                    .addComponent(jLabel24)
                    .addComponent(l4502e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4503t)
                    .addComponent(jLabel25)
                    .addComponent(l4503e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4504t)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4504e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(asem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l4505)
                    .addComponent(jLabel27))
                .addGap(29, 29, 29))
        );

        bsem3.setBorder(javax.swing.BorderFactory.createTitledBorder("ΣΤ εξάμηνο"));

        l4602t.setName("c3102"); // NOI18N

        jLabel28.setText("<html>4601 Ασφάλεια Πλ/κών Συστημάτων <font color='red'>(Επιλογής)</font></html>");

        jLabel29.setText("<html>4602 Μηχανική Μάθηση <font color='red'>(Επιλογής)</font><html>");

        l4602e.setName("c3102"); // NOI18N

        jLabel30.setText("4603 Τεχνολογία Βάσεων Δεδομένων");

        jLabel31.setText("4604 Μηχανική Λογισμικού ΙI");

        jLabel32.setText("<html>4605 <font color='red'>Μάθημα Επιλογής</font></html>");

        javax.swing.GroupLayout bsem3Layout = new javax.swing.GroupLayout(bsem3);
        bsem3.setLayout(bsem3Layout);
        bsem3Layout.setHorizontalGroup(
            bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem3Layout.createSequentialGroup()
                .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem3Layout.createSequentialGroup()
                        .addComponent(l4601t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4601e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(bsem3Layout.createSequentialGroup()
                        .addComponent(l4602t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4602e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addGroup(bsem3Layout.createSequentialGroup()
                        .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem3Layout.createSequentialGroup()
                                .addComponent(l4603t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4603e))
                            .addComponent(l4604)
                            .addComponent(l4605))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bsem3Layout.setVerticalGroup(
            bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4601t)
                    .addComponent(jLabel28)
                    .addComponent(l4601e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4602t)
                    .addGroup(bsem3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel29))
                    .addComponent(l4602e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem3Layout.createSequentialGroup()
                        .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4603t)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4604)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4605)
                            .addComponent(jLabel32)))
                    .addComponent(l4603e))
                .addGap(30, 30, 30))
        );

        bsem4.setBorder(javax.swing.BorderFactory.createTitledBorder("Z εξάμηνο"));

        l4702t.setName("c3102"); // NOI18N

        jLabel1.setText("Υποχρεωτικά Μαθήματα");

        jLabel2.setText("Μαθήματα Επιλογής");

        jLabel33.setText("<html>4701 Ανάπτυξη και Διαχ. Ολοκλ.<br>Πλ. Συστ/των & Εφαρμογών</html>");

        jLabel34.setText("4703 Μάθημα Επιλογής 2");

        jLabel35.setText("4704 Μάθημα Επιλογής 3");

        jLabel36.setText("4705 Μάθημα Επιλογής 4");

        jLabel37.setText("4702 Τεχνολογία Πολυμέσων");

        l4702e.setName("c3102"); // NOI18N

        jLabel38.setText("4801 Ευφυή Συστήματα");

        jLabel39.setText("<html>4802 Προηγμένες Αρχ. Υπολ.<br>και Παράλληλα Συστήματα</html>");

        jLabel40.setText("<html>4803 Οργάνωση Δεδομένων και<br>Εξόρυξη Πληροφορίας</html>");

        jLabel41.setText("4804 Ειδικά Θέματα Δικτύων Ι");

        jLabel42.setText("4805 Ειδικά Θέματα Δικτύων ΙI");

        jLabel43.setText("<html>4806 Διαδικτυακές Υπηρεσίες<br>Προστιθέμενης Αξίας</html>");

        jLabel44.setText("<html>4807 Ασύρματα και Κινητά Δίκτυα<br>Επικοινωνιών</html>");

        jLabel45.setText("4808 Γραφικά Υπολογιστών");

        javax.swing.GroupLayout bsem4Layout = new javax.swing.GroupLayout(bsem4);
        bsem4.setLayout(bsem4Layout);
        bsem4Layout.setHorizontalGroup(
            bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsem4Layout.createSequentialGroup()
                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem4Layout.createSequentialGroup()
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4703)
                            .addComponent(l4704)
                            .addComponent(l4705))
                        .addGap(27, 27, 27)
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel36)))
                    .addGroup(bsem4Layout.createSequentialGroup()
                        .addComponent(l4701t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4701e)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bsem4Layout.createSequentialGroup()
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(l4702t)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l4702e))
                                    .addComponent(l4801))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addComponent(l4802)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(l4803)
                                        .addGap(30, 30, 30))
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(l4804t)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l4804e)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(l4805t)
                                        .addGap(7, 7, 7)
                                        .addComponent(l4805e))
                                    .addComponent(l4806))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4807)
                                    .addComponent(l4808))
                                .addGap(32, 32, 32)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(149, 149, 149))
        );
        bsem4Layout.setVerticalGroup(
            bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsem4Layout.createSequentialGroup()
                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4701t)
                                    .addComponent(l4701e)
                                    .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l4702t)
                                        .addComponent(l4805t)
                                        .addComponent(jLabel37))
                                    .addComponent(l4702e)))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4805e)
                                    .addComponent(jLabel42))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4806)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(l4807)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bsem4Layout.createSequentialGroup()
                                        .addComponent(l4801)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l4703)
                                            .addComponent(jLabel34))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(l4704)
                                            .addComponent(l4802)))
                                    .addComponent(jLabel38))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(l4705)
                                .addComponent(l4803, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bsem4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(bsem4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l4808)))
                .addGap(17, 17, 17)
                .addGroup(bsem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(l4804t)
                    .addComponent(l4804e))
                .addGap(23, 23, 23))
        );

        bsem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Γ εξάμηνο"));

        l4302t.setName("c3102"); // NOI18N

        jLabel14.setText("<html>4301 Αριθ. Ανάλυση και Προγ/μος<br>Επιστημονικών Εφαρμογών</html>");

        l4302e.setName("c3102"); // NOI18N

        jLabel13.setText("4302 Δομές Δεδ/νων και Ανάλυση Αλγορίθμων");

        jLabel15.setText("<html>4303 Οργάνωση και Αρχιτεκτονική<br>Υπολογιστικών Συστημάτων</html>");

        jLabel16.setText("<html>4304 Αλληλεπίδραση Ανθρώπου-Μηχανής &<br<Ανάπτυξη Διεπιφανειών Χρήστη</html>");

        jLabel17.setText("4305 Συστήματα Διαχ/ισης Βάσεων Δεδομένων");

        javax.swing.GroupLayout bsem1Layout = new javax.swing.GroupLayout(bsem1);
        bsem1.setLayout(bsem1Layout);
        bsem1Layout.setHorizontalGroup(
            bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem1Layout.createSequentialGroup()
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bsem1Layout.createSequentialGroup()
                        .addComponent(l4301t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4301e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bsem1Layout.createSequentialGroup()
                        .addComponent(l4302t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4302e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(bsem1Layout.createSequentialGroup()
                        .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bsem1Layout.createSequentialGroup()
                                .addComponent(l4303t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4303e))
                            .addGroup(bsem1Layout.createSequentialGroup()
                                .addComponent(l4304t)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l4304e)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bsem1Layout.createSequentialGroup()
                        .addComponent(l4305t)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l4305e)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        bsem1Layout.setVerticalGroup(
            bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bsem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4301e)
                    .addComponent(l4301t))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l4302e)
                        .addComponent(jLabel13))
                    .addComponent(l4302t, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7)
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4303e)
                    .addComponent(l4303t)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4304t)
                    .addComponent(l4304e)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bsem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l4305t)
                    .addComponent(l4305e)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsem4, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsem1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bsem3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bsem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }



}
