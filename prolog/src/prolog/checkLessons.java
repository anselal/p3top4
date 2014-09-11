package prolog;
import java.util.ArrayList;

import jpl.*;
public class checkLessons {

	public void check(ArrayList<String> e1, ArrayList<String> e2, ArrayList<String> e3, 
			ArrayList<String> e4, ArrayList<String> e5, ArrayList<String> e6, ArrayList<String> e7){
		
		//������� ��� prolog
        Query q1 = new Query("consult", new Term[] { new Atom(("Database.pl"))});
 
        if (q1.hasSolution()) {
        	System.out.println("�������� �������!");
        	
        	ArrayList <String> total=new ArrayList<String>();
        	ArrayList<String> totalLessons = new ArrayList<String>();
    		ArrayList<String> epilogiLessons = new ArrayList<String>();
    		
        	/*System.out.print("1o:");
        	for (int i=0;i<e1.size();i++)
        		System.out.print(e1.get(i)+", ");
        	System.out.println("");*/
    		
        	//�� ����� ���� ��� ������ �� ��� �������� ��� ��������� ��� ������
    		total.addAll(e1);
        	total.addAll(e2);
        	total.addAll(e3);
        	total.addAll(e4);
        	total.addAll(e5);
        	total.addAll(e6);
        	total.addAll(e7);

        	totalLessons.addAll(findDiff(total,"first"));//������ �� �������� ��� ������ �� ����� ��� 1� �������
        	totalLessons.addAll(findDiff(total,"second"));//������ �� �������� ��� ������ �� ����� ��� 2� �������
    		totalLessons.addAll(findDiff(total,"third"));//������ �� �������� ��� ������ �� ����� ��� 3� �������
    		totalLessons.addAll(findDiff(total,"fourth"));//������ �� �������� ��� ������ �� ����� ��� 4� �������
    		totalLessons.addAll(findDiff(total,"fifth"));//������ �� �������� ��� ������ �� ����� ��� 5� �������
    		totalLessons.addAll(findDiff(total,"sixth"));//������ �� �������� ��� ������ �� ����� ��� 6� �������
    		totalLessons.addAll(findDiff(total,"seventh"));//������ �� �������� ��� ������ �� ����� ��� 7� �������
    		//totalLessons.addAll(findDiff(total,"epilogi"));//������ �� �������� �������� ��� ������ �� ����� 
    		epilogiLessons.addAll(findDiff(total,"epilogi"));//������ �� �������� �������� ��� ������ �� �����
    		
        	//System.out.println(total.size());
        	//total.addAll(e1);//�������� ��� �� 1� �������, ��� �� ��������� ��� ������ ��� ���������.
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
		for (int i=0; i<p3.size();i++){//��� ��� �� �������� ��� ���� ������� �� �� ����� ���������
        		//������ �� Query dm ��� �� ��� ��� ���������� �������
				
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
		//������ ��������� ���� ������������ ��� �� ������� s1
    	q3 = new Query("newLesson", new Term[] { new Variable("X"), new Atom(s1) });
    	p2.append("[");            
        while (q3.hasMoreSolutions()) {//��� �������� ������ (��������)
        	reply=q3.nextSolution().get("X").toString();//������� �� ����
        	p2.append(reply+",");//��� ��� �������� ��� StringBuilder
        }
        p2.deleteCharAt(p2.length()-1);//����� �� ��������� ,
        p2.append("]");
        
        p3=e1;
        Variable LL = new Variable("K");
        StringBuilder p1 = new StringBuilder();
        p1.append("[");
        for (int i=0; i<p3.size();i++){//��� ��� �� �������� ��� ���� ������� �� �� ����� ���������
        	//���� �� ��� �� ���������� ����
        	reply="";
        	//�� ����� ����� ������
        	if ((p3.get(i).toString().equals("l3103e") && p3.contains("l3103t")) ||
        			(p3.get(i).toString().equals("l3503e") && p3.contains("l3503t"))){
        		//�� �������� �� Query mikto ��� �� ��� �� ���������� ��� ������
        		q3 = new Query("mikto", new Term[] { new Atom(p3.get(i).toString()), new Atom(p3.get(i+1).toString()), new Variable("X") });
                while (q3.hasMoreSolutions()) {
                	reply=q3.nextSolution().get("X").toString();
                }
                if (reply.length()>0)//�� ��� ���� ����
                	p1.append(reply+",");//�� �������� ��� p1
                i++;
        	}
        	else {//�� ��� ����� ����� ������
        		//������ �� Query oldToNew ��� �� ��� �� ���������� ��� ������
            	q3 = new Query("oldToNew", new Term[] { new Atom(p3.get(i).toString()),new Variable("X") });
                while (q3.hasMoreSolutions()) {
                	reply=q3.nextSolution().get("X").toString();
            }
            if (reply.length()>0)//�� ��� ���� ����
            	p1.append(reply+",");//�� �������� ��� p1
        	}
        }
       
        if (p1.length()>1)
        	p1.deleteCharAt(p1.length()-1);//����� �� ��������� ,
        p1.append("]");

        //������ �� Query findDif �������� �� �������� ��� ���� ������������ �� ����� ���������
        //��� �� �������� ��� ���� ������� � �������� (�� ���������� ��� �3 ��� �4) �� ������� ���������
        q3 = new Query("findDif", new Term[] { Util.textToTerm(p2.toString()),Util.textToTerm(p1.toString()),LL });
        //�� listTerm �� �������� ��� �� �������� 
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
