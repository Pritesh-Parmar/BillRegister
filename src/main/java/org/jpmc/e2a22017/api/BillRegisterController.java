package org.jpmc.e2a22017.api;

import java.util.Collection;
import org.jpmc.e2a22017.model.BillRegister;
import org.jpmc.e2a22017.service.BillRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillRegisterController {

	@Autowired
	private BillRegisterService billRegisterService;
	
	@RequestMapping(value = "/api/bills", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<BillRegister>> getBills() {

		Collection<BillRegister> bills = billRegisterService.getBills();
		return new ResponseEntity<Collection<BillRegister>>(bills, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/bills/{billNum}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BillRegister> getBill(@PathVariable("billNum") Long billNum) {

		BillRegister br = billRegisterService.getBill(billNum);
		if (br == null) {
			return new ResponseEntity<BillRegister>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<BillRegister>(br, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BillRegister> registerBill(@RequestBody BillRegister billRegister) {

		BillRegister br = billRegisterService.registerBill(billRegister);
		return new ResponseEntity<BillRegister>(br, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/register", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BillRegister> updateBill(@RequestBody BillRegister billRegister){
		
		if(billRegister.getBillNum() == null) {
			return new ResponseEntity<BillRegister>(HttpStatus.NOT_FOUND);
		}
		BillRegister updatedBillRegister = billRegisterService.updateBill(billRegister);
		return new ResponseEntity<BillRegister>(updatedBillRegister,HttpStatus.CREATED);
	}
}
