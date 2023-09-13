import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		
		Product p1=new Product("iphone X",23000);
//		try {
//			cart.addtoCart(p1);
//		} catch (CartException e) {
//			e.printStackTrace();
//		}
//		try {
//			cart.addtoCart(new Product("Airpods2",8999));
//		} catch (CartException e) {
//			
//			e.printStackTrace();
//		}
//		try {
//			cart.addtoCart(new Product("Watch",33000));
//		} catch (CartException e) {
//			
//			e.printStackTrace();
//		}
//		try {
//			cart.addtoCart(new Product("Watch",33000));
//		} catch (CartException e) {
//
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		try {
//			cart.addtoCart(new Product("Airpods2",8999));
//		} catch (CartException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			cart.addtoCart(new Product("Airpods2",8999));
//		} catch (CartException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			cart.addtoCart(new Product("Airpods2",8999));
//		} catch (CartException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		cart.addtoCart(p1);
		cart.addtoCart(new Product("Airpods2",8999));
		cart.addtoCart(new Product("Watch",33000));
		cart.addtoCart(new Product("Watch",33000));
		cart.addtoCart(new Product("Airpods2",8999));
		cart.addtoCart(new Product("Airpods2",8999));
		cart.addtoCart(new Product("Airpods2",8999));
		cart.checkout();
	}

}
