package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Customer_Address;
import in.ashokit.entity.OrderDetails;
import in.ashokit.repo.Customer_AddressRepo;
import in.ashokit.repo.OrderDetailsRepo;

@Service
public class OrderDetailsService {

	private OrderDetailsRepo orderRepo;
	private Customer_AddressRepo crepo;
	public OrderDetailsService(OrderDetailsRepo orderRepo, Customer_AddressRepo crepo) {
		super();
		this.orderRepo = orderRepo;
		this.crepo = crepo;
	}
	
	@Transactional(rollbackFor = Exception.class)
       public void addCustomerOrder() {
    	   OrderDetails od = new OrderDetails();
    	   od.setItem("Electric Cattle");
    	   od.setQuantity(1);
    	   od.setAmount(1440.0);
    	   od.setPayment_mode("COD");
    	   od.setStatus("out for delievery");
           
    	   OrderDetails details = orderRepo.save(od);
    	   
    	   Customer_Address cd = new Customer_Address();
    	   cd.setCustomer_Name("Manish");
    	   cd.setEmail("manish123@gmail.com");
    	   cd.setMobile("+911223898");
    	   cd.setCity("Ameerpet");
    	   cd.setState("Telangana");
    	   cd.setPincode(849749);
    	   
    	   System.out.println(10/0);
    	   
    	   cd.setOrderId(details.getOrderId());
    	   
    	   crepo.save(cd);
    	   
    	   
       
       
       }
	
}
