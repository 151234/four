package dao;

import model.*;

import java.util.List;


public interface SbDAO {
	public List<Sb> findBySid(java.lang.String sid);
	public List<Sb> findByBid(java.lang.String bid);
	public Sb findBysb(java.lang.String sid,java.lang.String bid);
	public boolean joinclass(Sb sb);
}
