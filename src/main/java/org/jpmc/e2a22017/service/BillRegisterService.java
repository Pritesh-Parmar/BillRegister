package org.jpmc.e2a22017.service;

import java.util.Collection;

import org.jpmc.e2a22017.model.BillRegister;

public interface BillRegisterService {

	Collection<BillRegister> getBills();
	
	BillRegister getBill(Long recordNum);
	
	BillRegister registerBill(BillRegister billRegister);
	
	BillRegister updateBill(BillRegister billRegister);
}
