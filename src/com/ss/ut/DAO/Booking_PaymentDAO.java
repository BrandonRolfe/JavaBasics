/**
 * 
 */
package com.ss.ut.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.ut.ent.Airplane;
import com.ss.ut.ent.Airport;
import com.ss.ut.ent.Booking_Payment;

/**
 * @author brandon
 *
 */
public class Booking_PaymentDAO extends BaseDAO {

	public Booking_PaymentDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Booking_Payment> format(ResultSet data) throws SQLException {
		List<Booking_Payment> booking_payments = new ArrayList<Booking_Payment>();
		
		while(data.next())
		{
			booking_payments.add(new Booking_Payment(data.getInt("booking_id"), data.getString("stripe_id"), data.getInt("refunded")));
		}
		
		return booking_payments;
	}
	
	public void insertBooking_Payment(Booking_Payment booking_payment) throws SQLException
	{
		write("INSERT INTO bookin_payment (booking_id, stripe_id, refunded) values (?, ?, ?)", new Object[] {booking_payment.getBooking_id(), booking_payment.getStripe_id(), booking_payment.getRefunded()});
	}

	public void updateBooking_Payment(Booking_Payment booking_payment) throws SQLException
	{
		write("UPDATE booking_payment SET (stripe_id = ?, refunded = ?) WHERE (booking_id = ?)", new Object[] {booking_payment.getStripe_id(), booking_payment.getRefunded(), booking_payment.getBooking_id()});
	}
	
	public void deleteBooking_Payment(Booking_Payment booking_payment) throws SQLException
	{
		write("DELETE FROM booking_payment WHERE (booking_id = ?)", new Object[] {booking_payment.getBooking_id()});
	}
	
	public List <Booking_Payment> readBooking_Payments() throws SQLException, ClassNotFoundException
	{
		return read("SELECT * FROM booking_payment", null);
	}
}
