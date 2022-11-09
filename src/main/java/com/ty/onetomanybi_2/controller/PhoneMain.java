package com.ty.onetomanybi_2.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.onetomany_2.dao.PhoneDao;
import com.ty.onetomanybi_2.dto.Phone;
import com.ty.onetomanybi_2.dto.Sim;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone=new Phone();
		phone.setId(1);
		phone.setName("J7");
		phone.setBrand("samsung");

		Sim sim1=new Sim();
		sim1.setId(101);
		sim1.setSimnum(12300);
		sim1.setPrice(250);
		sim1.setPhone(phone);

		Sim sim2=new Sim();
		sim2.setId(102);
		sim2.setSimnum(12345);
		sim2.setPrice(300);
		sim2.setPhone(phone);

		List<Sim>sim=new ArrayList<Sim>();
		sim.add(sim1);
		sim.add(sim2);
		phone.setSim(sim);

		PhoneDao dao=new PhoneDao();
		dao.savePhone(phone);
	}

}
