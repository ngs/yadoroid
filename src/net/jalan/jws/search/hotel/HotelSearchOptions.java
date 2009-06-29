package net.jalan.jws.search.hotel;
import java.util.HashMap;
import android.graphics.Point;
import net.jalan.jws.search.hotel.HotelType;
import net.jalan.jws.search.HotelXMLPattern;
import net.jalan.jws.search.hotel.PictSize;
public class HotelSearchOptions {
	public static final String TRUE = "1";
	public static final String FALSE = "0";
	public String region="";
	public String prefecture="";
	public String largeArea="";
	public String smallArea="";
	public String hotelID="";
	public String onsenAreaID="";
	public String onsenID="";
	//public String x;
	//public String y;
	public Point latlng = null;
	public double range = 5;
	public String hotelName="";
	public int hotelType=HotelType.NONE; //HotelType
	public Boolean outerPool=false;
	public Boolean parking=false;
	public Boolean pubBath=false;
	public Boolean onsen=false;
	public Boolean prvBath=false;
	public Boolean vBath=false;
	public Boolean sauna=false;
	public Boolean jacz=false;
	public Boolean mssg=false;
	public Boolean ski=false;
	public Boolean rentalBoard=false;
	public Boolean pet=false;
	public Boolean esthe=false;
	public Boolean pingPong=false;
	public Boolean limo=false;
	public Boolean roomBreakfast=false;
	public Boolean roomDinner=false;
	public Boolean privateBreakfast=false;
	public Boolean privateDinner=false;
	public Boolean earlyCheckin=false;
	public Boolean lateCheckout=false;
	public Boolean noSmoking=false;
	public Boolean net=false;
	public Boolean roomRoten=false;
	public Boolean high=false;
	public Boolean point=false;
	public Boolean special=false;
	public Boolean bathToilet=false;
	public Boolean onsenBath=false;
	public Boolean pourBath=false;
	public Boolean cloudyBath=false;
	public Boolean innerPool=false;
	public Boolean fitness=false;
	public Boolean gym=false;
	public Boolean playField=false;
	public Boolean bbq=false;
	public Boolean hall=false;
	public Boolean nearStation=false;
	public Boolean nearBeach=false;
	public Boolean nearSlope=false;
	public Boolean card=false;
	public Boolean cardJCB=false;
	public Boolean cardVisa=false;
	public Boolean cardMaster=false;
	public Boolean cardAMEX=false;
	public Boolean cardUC=false;
	public Boolean cardDC=false;
	public Boolean cardNicos=false;
	public Boolean cardDiners=false;
	public Boolean cardSaison=false;
	public Boolean cardUFJ=false;
	public Boolean cvs=false;
	public Boolean noMeal=false;
	public Boolean onlyBreakfast=false;
	public Boolean onlyDinner=false;
	public Boolean meals=false;
	public Boolean singleRoom=false;
	public Boolean twinRoom=false;
	public Boolean doubleRoom=false;
	public Boolean tripleRoom=false;
	public Boolean quadBedRoom=false;
	public Boolean jpRoom=false;
	public Boolean jpWesternRoom=false;
	public Boolean childPrice=false;
	public Boolean childBedMeal=false;
	public Boolean childNoBedMeal=false;
	public Boolean childMeal=false;
	public Boolean childBed=false;
	//
	public int pict_size = PictSize.DEFAULT;
	public int picts=1;
	public int order = HotelOrderType.DEFAULT;
	public int start=1;
	public int count=10;
	public int xml_ptn=HotelXMLPattern.STANDARD;
	public HotelSearchOptions(){
		
	}
	public HashMap<String,String> getHashMap() {
		final HashMap<String,String> map = new HashMap<String,String>();
		map.put("bath_to",bathToilet?TRUE:FALSE);
		map.put("bbq",bbq?TRUE:FALSE);
		map.put("c_amex",cardAMEX?TRUE:FALSE);
		map.put("c_dc",cardDC?TRUE:FALSE);
		map.put("c_diners",cardDiners?TRUE:FALSE);
		map.put("c_jcb",cardJCB?TRUE:FALSE);
		map.put("c_master",cardMaster?TRUE:FALSE);
		map.put("c_nicos",cardNicos?TRUE:FALSE);
		map.put("c_saison",cardSaison?TRUE:FALSE);
		map.put("c_uc",cardUC?TRUE:FALSE);
		map.put("c_ufj",cardUFJ?TRUE:FALSE);
		map.put("c_visa",cardVisa?TRUE:FALSE);
		map.put("c_card",card?TRUE:FALSE);
		map.put("c_bed_only",childBed?TRUE:FALSE);
		map.put("c_bed_meal",childBedMeal?TRUE:FALSE);
		map.put("c_meal_only",childMeal?TRUE:FALSE);
		map.put("c_no_bed_meal",childNoBedMeal?TRUE:FALSE);
		map.put("child_price",childPrice?TRUE:FALSE);
		map.put("cloudy",cloudyBath?TRUE:FALSE);
		map.put("count",Integer.toString(count));
		map.put("cvs",cvs?TRUE:FALSE);
		map.put("dbl_room",doubleRoom?TRUE:FALSE);
		map.put("early_in",earlyCheckin?TRUE:FALSE);
		map.put("esthe",esthe?TRUE:FALSE);
		map.put("fitness",fitness?TRUE:FALSE);
		map.put("gym",gym?TRUE:FALSE);
		map.put("hall",hall?TRUE:FALSE);
		map.put("high",high?TRUE:FALSE);
		map.put("h_id",hotelID);
		map.put("h_name",hotelName);
		map.put("h_type",Integer.toString(hotelType));
		map.put("i_pool",innerPool?TRUE:FALSE);
		map.put("jacz",jacz?TRUE:FALSE);
		map.put("jpn_room",jpRoom?TRUE:FALSE);
		map.put("j_w_room",jpWesternRoom?TRUE:FALSE);
		map.put("l_area",largeArea);
		map.put("late_out",lateCheckout?TRUE:FALSE);
		if(latlng!=null) {
			map.put("x",Integer.toString(latlng.x));
			map.put("y",Integer.toString(latlng.y));
			map.put("range",Double.toString(range));
		}
		map.put("limo",limo?TRUE:FALSE);
		map.put("2_meals",meals?TRUE:FALSE);
		map.put("mssg",mssg?TRUE:FALSE);
		map.put("5_beach",nearBeach?TRUE:FALSE);
		map.put("5_slope",nearSlope?TRUE:FALSE);
		map.put("5_station",nearStation?TRUE:FALSE);
		map.put("net",net?TRUE:FALSE);
		map.put("no_meal",noMeal?TRUE:FALSE);
		map.put("no_smk",noSmoking?TRUE:FALSE);
		map.put("b_only",onlyBreakfast?TRUE:FALSE);
		map.put("d_only",onlyDinner?TRUE:FALSE);
		map.put("onsen",onsen?TRUE:FALSE);
		map.put("o_area_id",onsenAreaID);
		map.put("o_bath",onsenBath?TRUE:FALSE);
		map.put("o_id",onsenID);
		map.put("order",Integer.toString(order));
		map.put("o_pool",outerPool?TRUE:FALSE);
		map.put("parking",parking?TRUE:FALSE);
		map.put("pet",pet?TRUE:FALSE);
		map.put("pict_size",Integer.toString(pict_size));
		map.put("picts",Integer.toString(picts));
		map.put("p_pong",pingPong?TRUE:FALSE);
		map.put("p_field",playField?TRUE:FALSE);
		map.put("p_ok",point?TRUE:FALSE);
		map.put("pour",pourBath?TRUE:FALSE);
		map.put("pref",prefecture);
		map.put("prv_b",privateBreakfast?TRUE:FALSE);
		map.put("prv_d",privateDinner?TRUE:FALSE);
		map.put("prv_bath",prvBath?TRUE:FALSE);
		map.put("pub_bath",pubBath?TRUE:FALSE);
		map.put("4bed_room",quadBedRoom?TRUE:FALSE);
		map.put("reg",region);
		map.put("r_brd",rentalBoard?TRUE:FALSE);
		map.put("room_b",roomBreakfast?TRUE:FALSE);
		map.put("room_d",roomDinner?TRUE:FALSE);
		map.put("r_room",roomRoten?TRUE:FALSE);
		map.put("sauna",sauna?TRUE:FALSE);
		map.put("sng_room",singleRoom?TRUE:FALSE);
		map.put("r_ski",ski?TRUE:FALSE);
		map.put("s_area",smallArea);
		map.put("sp_room",special?TRUE:FALSE);
		map.put("start",Integer.toString(start));
		map.put("tri_room",tripleRoom?TRUE:FALSE);
		map.put("twn_room",twinRoom?TRUE:FALSE);
		map.put("v_bath",vBath?TRUE:FALSE);
		map.put("xml_ptn",Integer.toString(xml_ptn));
		return map;
	}	

}

