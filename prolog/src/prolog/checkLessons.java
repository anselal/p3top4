package prolog;
import java.util.ArrayList;

import jpl.*;
public class checkLessons {

	public void check(ArrayList<String> e1, ArrayList<String> e2, ArrayList<String> e3, 
			ArrayList<String> e4, ArrayList<String> e5, ArrayList<String> e6, ArrayList<String> e7){
		
		//φορτώνω την prolog
        Query q1 = new Query("consult", new Term[] { new Atom(("Database.pl"))});
 
        if (q1.hasSolution()) {
        	System.out.println("Επιτυχής φόρτωση!");
        	
        	ArrayList <String> total=new ArrayList<String>();
        	ArrayList<String> totalLessons = new ArrayList<String>();
    		ArrayList<String> epilogiLessons = new ArrayList<String>();
    		
        	/*System.out.print("1o:");
        	for (int i=0;i<e1.size();i++)
        		System.out.print(e1.get(i)+", ");
        	System.out.println("");*/
    		
        	//θα ενώσω όλες τις λίστες με τις δηλώσεις των μαθημάτων που πέρασε
    		total.addAll(e1);
        	total.addAll(e2);
        	total.addAll(e3);
        	total.addAll(e4);
        	total.addAll(e5);
        	total.addAll(e6);
        	total.addAll(e7);

        	totalLessons.addAll(findDiff(total,"first"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 1ο εξάμηνο
        	totalLessons.addAll(findDiff(total,"second"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 2ο εξάμηνο
    		totalLessons.addAll(findDiff(total,"third"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 3ο εξάμηνο
    		totalLessons.addAll(findDiff(total,"fourth"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 4ο εξάμηνο
    		totalLessons.addAll(findDiff(total,"fifth"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 5ο εξάμηνο
    		totalLessons.addAll(findDiff(total,"sixth"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 6ο εξάμηνο
    		totalLessons.addAll(findDiff(total,"seventh"));//βρίσκω τα μαθήματα που πρέπει να πάρει από 7ο εξάμηνο
    		//totalLessons.addAll(findDiff(total,"epilogi"));//βρίσκω τα μαθήματα επιλογής που μπορεί να πάρει 
    		epilogiLessons.addAll(findDiff(total,"epilogi"));//βρίσκω τα μαθήματα επιλογής που μπορεί να πάρει
    		
        	//System.out.println(total.size());
        	//total.addAll(e1);//προσθέτω και το 1ο εξάμηνο, για να υπολογίσω τον αριθμό των μαθημάτων.
        	//System.out.println("----------------------------------");
    		
        	int dmperasmenes=findNumber(total);
        	int dmipoxreotikon=findNumber(totalLessons);

        	int dmepilogis=210-dmperasmenes-dmipoxreotikon;

        	finalFrame m = new finalFrame(totalLessons,epilogiLessons,dmepilogis);
            m.setVisible(true);
        }
        else
        	System.out.println("Error consulting Database");
	}
	
	private int findNumber(ArrayList<String> p3){
		int number=0;
		Query q3;
		for (int i=0; i<p3.size();i++){//για όλα τα μαθήματα που έχει περάσει με το παλιό πρόγραμμα
        		//εκτελώ το Query dm για να βρω τις διδακιτκές μονάδες
				
				if ((p3.get(i).contains("l48") ))
					continue;
            	q3 = new Query("dm", new Term[] { new Atom(p3.get(i).toString()),new Variable("X") });
            	number+=java.lang.Integer.parseInt(q3.oneSolution().get("X").toString());
            }


		return number;
	}
	
	private ArrayList<String> findDiff(ArrayList<String> e1, String s1){
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> rep = new ArrayList<String>();
		String reply = null;
		StringBuilder p2 = new StringBuilder();
		Query q3;
		//εύρεση μαθημάτων νέου προγράμματος για το εξάμηνο s1
    	q3 = new Query("newLesson", new Term[] { new Variable("X"), new Atom(s1) });
    	p2.append("[");            
        while (q3.hasMoreSolutions()) {//όσο υπάρχουν λύσεις (μαθήματα)
        	reply=q3.nextSolution().get("X").toString();//διαβάζω τη λύση
        	p2.append(reply+",");//και την προσθέτω στο StringBuilder
        }
        p2.deleteCharAt(p2.length()-1);//σβήνω το τελευταίο ,
        p2.append("]");
        
        p3=e1;
        Variable LL = new Variable("K");
        StringBuilder p1 = new StringBuilder();
        p1.append("[");
        for (int i=0; i<p3.size();i++){//για όλα τα μαθήματα που έχει περάσει με το παλιό πρόγραμμα
        	//θέλω να βρω τα αντίστοιχά τους
        	reply="";
        	//αν είναι μικτό μάθημα
        	if ((p3.get(i).toString().equals("l3103e") && p3.contains("l3103t")) ||
        			(p3.get(i).toString().equals("l3503e") && p3.contains("l3503t"))){
        		//θα εκτελέσω το Query mikto για να βρω το αντίστοιχο νέο μάθημα
        		q3 = new Query("mikto", new Term[] { new Atom(p3.get(i).toString()), new Atom(p3.get(i+1).toString()), new Variable("X") });
                while (q3.hasMoreSolutions()) {
                	reply=q3.nextSolution().get("X").toString();
                }
                if (reply.length()>0)//αν έχω βρει λύση
                	p1.append(reply+",");//το προσθέτω στο p1
                i++;
        	}
        	else {//αν δεν είναι μικτό μάθημα
        		//εκτελώ το Query oldToNew για να βρω το αντίστοιχο νέο μάθημα
            	q3 = new Query("oldToNew", new Term[] { new Atom(p3.get(i).toString()),new Variable("X") });
                while (q3.hasMoreSolutions()) {
                	reply=q3.nextSolution().get("X").toString();
            }
            if (reply.length()>0)//αν έχω βρει λύση
            	p1.append(reply+",");//το προσθέτω στο p1
        	}
        }
       
        if (p1.length()>1)
        	p1.deleteCharAt(p1.length()-1);//σβήνω το τελευταίο ,
        p1.append("]");

        //εκτελώ το Query findDif δίνοντας τα μαθήματα του νέου προγράμματος ως πρώτη παράμετρο
        //και τα μαθήματα που έχει περάσει ο φοιτητής (τα αντίστοιχα του Π3 στο Π4) ως δεύτερη παράμετρο
        q3 = new Query("findDif", new Term[] { Util.textToTerm(p2.toString()),Util.textToTerm(p1.toString()),LL });
        //το listTerm θα περιέχει όλα τα μαθήματα 
        Term listTerm = (Term) q3.oneSolution().get("K");

        try {
        	Term []s = listTerm.toTermArray(); 
        	for (int i=0;i<listTerm.listLength();i++){
            	//System.out.print(s[i].toString()+", ");
        		if (s1.equals("epilogi") ) // && (s[i].toString().contains("l48") || s[i].toString().contains("l47")))
        			rep.add(s[i].toString());
        		else if (!s1.equals("epilogi"))
        			rep.add(s[i].toString());
        	}
        	System.out.println();
        }
        catch (JPLException e){
        	
        }
        return rep;
	}
}
