package prog1;

import java.util.Arrays;
import java.util.Date;



public class Node {
	
	public Date ts;
	public Data data ;
	public int nodeno;
	public String nodeid;
	public String refnodeid;
	public String[] childrefid  ;
	public String genesisRefid;
	public String hashvalue;
	
	
	
	
	public Node(Date ts, Data data, int nodeno, String nodeid, String refnodeid, String[] childrefid,
			String genesisRefid, String hashvalue) {
		super();
		this.ts = ts;
		this.data = data;
		this.nodeno = nodeno;
		this.nodeid = nodeid;
		this.refnodeid = refnodeid;
		this.childrefid = childrefid;
		this.genesisRefid = genesisRefid;
		this.hashvalue = String.valueOf(hashCode());
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(childrefid);
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((genesisRefid == null) ? 0 : genesisRefid.hashCode());
		result = prime * result + ((hashvalue == null) ? 0 : hashvalue.hashCode());
		result = prime * result + ((nodeid == null) ? 0 : nodeid.hashCode());
		result = prime * result + nodeno;
		result = prime * result + ((refnodeid == null) ? 0 : refnodeid.hashCode());
		result = prime * result + ((ts == null) ? 0 : ts.hashCode());
		return result;
	}




	@Override
	public String toString() {
		return "Node [ts=" + ts + ", data=" + data + ", nodeno=" + nodeno + ", nodeid=" + nodeid + ", refnodeid="
				+ refnodeid + ", childrefid=" + Arrays.toString(childrefid) + ", genesisRefid=" + genesisRefid
				+ ", hashvalue=" + hashvalue + "]";
	}


	
	
	

}
