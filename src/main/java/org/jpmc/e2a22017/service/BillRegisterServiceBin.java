package org.jpmc.e2a22017.service;

import java.util.Collection;
import org.jpmc.e2a22017.model.BillRegister;
import org.jpmc.e2a22017.repository.BillRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillRegisterServiceBin implements BillRegisterService {
		
	@Autowired
	BillRegisterRepository billRegisterRepository;
	
	BillRegisterService billRegisterService;	
	
	@Override
	public Collection<BillRegister> getBills() {
		
		Collection<BillRegister> bills = billRegisterRepository.findAll();
//		Collection<BillRegister> bills = billMap.values();
		return bills;
	}

	@Override
	public BillRegister getBill(Long billNum) {

		BillRegister billRegister = billRegisterRepository.findOne(billNum);
//		BillRegister br =  billMap.get(billNum);
		return billRegister;
	}

	@Override
	public BillRegister registerBill(BillRegister billRegister) {
		
		if(billRegister.getBillNum() != null) {
			return null;
		}
		BillRegister newBillRegister = billRegisterRepository.save(billRegister);
//		BillRegister br = register(billRegister);
		return newBillRegister;
	}

	@Override
	public BillRegister updateBill(BillRegister billRegister) {
		
		BillRegister updatedBillRegister = getBill(billRegister.getBillNum());
		if(updatedBillRegister == null) {
			return null;
		}
		updatedBillRegister = billRegisterRepository.save(billRegister);
//		BillRegister br = register(billRegister);
		return updatedBillRegister;
	}

}
