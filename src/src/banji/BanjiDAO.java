package banji;

import java.util.List;


public interface BanjiDAO {
	public Banji findByBid(java.lang.String bid);
	public List<Banji> findByTid(java.lang.String tid);
	public Banji findByinvite(java.lang.String i);
	public void add(Banji bj);
	public List<Banji> findall();
}
