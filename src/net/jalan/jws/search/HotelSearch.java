package net.jalan.jws.search;
import java.util.LinkedHashMap;
import java.util.HashMap;
import net.jalan.jws.search.APIRequest;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class HotelSearch {
	public String sarea;
	public Boolean advance = false;
	public LinkedHashMap<String,Hotel> hotels;
	private APIRequest request;
	public int total = 0;
	public int count = 0;
	public int start;
	public HashMap params;
	public HotelSearch() {
	}
	public HotelSearch(Boolean advance) {
		this.advance = advance;
	}
	public void request() { request(1); }
	public void request(int start) { request(new HashMap(),start); }
	public void request(HashMap params) { request(params,1); }
	public void request(HashMap params,int start) {
		this.params = params;
		this.start = start>1?start:1;
		request = new APIRequest(APIRequest.HOTEL_ADVANCE,params);
		Document doc = request.connect();
		NodeList list = doc.getElementsByTagName("Hotel");
		int len = list.getLength();
		hotels = new LinkedHashMap<String,Hotel>();
		for(int i=0;i<len;++i) {
			Node n = (Node) list.item(i);
			if(n.getNodeName().equals(Hotel.TAG_NAME)){
				Hotel h = new Hotel(n);
				hotels.put(h.id,h);
			}
		}
	}
}