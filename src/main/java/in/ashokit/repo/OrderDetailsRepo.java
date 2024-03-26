package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer> {
	

}
