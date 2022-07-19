
interface Customer{
  
        public boolean createOrder(OrderDTO order);
		void getOrderDetails();
		boolean updateNameById(int id, String name);
		boolean updatequantityByName(String name, int quantity);
		boolean deleteByName(String name);
		boolean deleteById(int id);
		String getOrderTypeByName(String name);
		String getOrderNameById(int id);
		int[] getAllQuantities();
		String[] getAllOrderName();
		




}