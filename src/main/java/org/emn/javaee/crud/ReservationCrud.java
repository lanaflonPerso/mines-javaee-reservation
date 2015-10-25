package org.emn.javaee.crud;

import org.emn.javaee.models.Reservation;

/**
 * Reservation CRUD
 */
public class ReservationCrud extends GenericCrud<Reservation>{

	public boolean isResourceReserved(int id) {
		return false;
	}
}
