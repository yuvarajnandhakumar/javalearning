package org.collects;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmplyeeDetail {

	public void datas()
	{
		SimpleData data = new SimpleData();
		data.setAge(26);
		data.setName("yuvaraj");

		LinkedList<SimpleData> ll = new LinkedList<SimpleData>();
		ll.add(data);

		SimpleData data1 = new SimpleData();
		data1.setAge(25);
		data1.setName("fayaz");
		ll.add(data1);

		for (int i = 0; i < ll.size(); i++) {

			System.out.println(ll.get(i).getName());
			System.out.println(ll.get(i).getAge());

		}


		Map<Integer, SimpleData> jj = new HashMap<>();

		EmpPhno e = new EmpPhno(); //e-ph-mail id
		e.setMailid("yuvraj@gmail.com");
		e.setPhno(94512587);

		SimpleData mape= new SimpleData();
		mape.setEmp(e); // storing  it in a method

		jj.put(1, mape);


		EmpPhno e1 = new EmpPhno(); //e-ph-mail id
		e1.setPhno(45454545);
		e1.setMailid("vishali@gmail.com");
		SimpleData mape2= new SimpleData();

		mape2.setEmp(e1);
		jj.put(2, mape2);
		
		Set<Entry<Integer, SimpleData>> e2 = jj.entrySet();
		for (Entry<Integer, SimpleData> entry : e2) 
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmp().getMailid());
			System.out.println(entry.getValue().getEmp().getPhno());

		}




	}

	public static void main(String[] args) {
		EmplyeeDetail k = new EmplyeeDetail();
		k.datas();



	}

}
