package FnB_Main;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Vector;

//Interface untuk manajemen data pemesanan

public interface OrderManagement {
	void placeOrder(Customer customer, Vector<Menu> orderedItems) throws SQLException;
	
}
