package org.jpmc.e2a22017.repository;

import org.jpmc.e2a22017.model.BillRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRegisterRepository extends JpaRepository<BillRegister, Long> {

}
