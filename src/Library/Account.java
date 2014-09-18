package Library;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Account {
	private int userID;
	private String firstName;
	private String lastName;
	private String address;
	private BigDecimal balance;

	private ArrayList<BookCopy> checkouts;
}