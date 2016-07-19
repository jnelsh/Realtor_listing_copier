package rg.ent;

import java.math.BigDecimal;
import java.sql.Date;

public class ListingDataObj {
	
	
	public  ListingDataObj(){}
	
	private int l_listingid;
	private String l_area;
	private BigDecimal l_askingprice;  // money
	private String l_city;
	private String l_displayid;
	private String l_status;
	private Date l_updatedate;
	private String l_address;
	private String l_addressdirection;
	private String l_addressnumber;
	private String l_addressstreet;
	private String l_addressunit;
	private Date l_listingdate;
	private Date l_last_photo_updt;  
	private String l_listagent1;
	private String l_listagent2;
	private String l_listagent3;
	private String l_listoffice1;
	private String l_listoffice2;
	private String l_listoffice3;
	private String lr_remarks33;
	private int l_picturecount;
	private String l_state;
	private String lfd_featuresincluded_24;
	private String lfd_siteinfluences_15;
	private String lfd_styleofhome_1;
	private String lmd_mp_latitude;
	private String lmd_mp_longitude;
	private String l_streetdesignationid;
	private String lo1_organizationname;
	private String lo1_phonenumber1;
	private String lo1_shortname;
	private String lo2_organizationname; 
	private String lo2_shortname;
	private String lo2_phonenumber1;
	private String lo3_organizationname;
	private String lo3_shortname;
	private String lo3_phonenumber1;
	private String lr_remarks22;
	private String la1_char100_1; 
	private String la1_loginname; 
	private String la1_phonenumber1; 
	private String la1_webpage; 
	private String la2_char100_1; 
	private String la2_loginname; 
	private String la2_phonenumber1;  
	private String la2_webpage; 
	private String la3_char100_1; 
	private String la3_loginname; 
	private String la3_phonenumber1;  
	private String la3_webpage; 
	private String lfd_amenities_25;
	private String lfd_basementarea_6; 
	private String lm_char10_11;  
	private String lm_char10_12;  
	private String lm_char10_23;   
	private String lm_char10_5;   
	private String lm_char10_6;  
	private String lm_dec_1;  
	private String lm_dec_11;  
	private String lm_dec_12;  
	private String lm_dec_13;  
	private String lm_dec_14;  
	private String lm_dec_16;  
	private String lm_dec_22;   
	private String lm_dec_7;  
	private String lm_dec_8;  
	private String lm_dec_9; 
	private String lm_int1_1; 
	private String lm_int1_17;  
	private int lm_int1_18; 
	private String lm_int1_19; 
	private String lm_int1_2; 
	private int lm_int1_4; 
	private String lm_int2_2; 
	private String lm_int2_3; 
	private String lm_int2_5;
	private String lm_int2_8; 
	private String lm_char100_3; 
	private String lm_char1_36;  
	private String lm_char30_28;  
	private String lv_vow_address; 
	private String lv_vow_include;  
	private String l_zip; 
	private String vt_vtoururl; 
	private boolean tokeep;
	private String phrase; // tsvector
	private String location; // tsvector
	private String six_forty_path; 
	private String three_twenty_path; 
	private String one_sixty_path;
	private int sqft_int;
	private String address_vector;
	
	
	
	public int getL_listingid() {
		return l_listingid;
	}
	public String getL_area() {
		return l_area;
	}
	public BigDecimal getL_askingprice() {
		return l_askingprice;
	}
	public String getL_city() {
		return l_city;
	}
	public String getL_displayid() {
		return l_displayid;
	}
	public String getL_status() {
		return l_status;
	}
	public Date getL_updatedate() {
		return l_updatedate;
	}
	public String getL_address() {
		return l_address;
	}
	public String getL_addressdirection() {
		return l_addressdirection;
	}
	public String getL_addressnumber() {
		return l_addressnumber;
	}
	public String getL_addressstreet() {
		return l_addressstreet;
	}
	public String getL_addressunit() {
		return l_addressunit;
	}
	public Date getL_listingdate() {
		return l_listingdate;
	}
	public Date getL_last_photo_updt() {
		return l_last_photo_updt;
	}
	public String getL_listagent1() {
		return l_listagent1;
	}
	public String getL_listagent2() {
		return l_listagent2;
	}
	public String getL_listagent3() {
		return l_listagent3;
	}
	public String getL_listoffice1() {
		return l_listoffice1;
	}
	public String getL_listoffice2() {
		return l_listoffice2;
	}
	public String getL_listoffice3() {
		return l_listoffice3;
	}
	public String getLr_remarks33() {
		return lr_remarks33;
	}
	public int getL_picturecount() {
		return l_picturecount;
	}
	public String getL_state() {
		return l_state;
	}
	public String getLfd_featuresincluded_24() {
		return lfd_featuresincluded_24;
	}
	public String getLfd_siteinfluences_15() {
		return lfd_siteinfluences_15;
	}
	public String getLfd_styleofhome_1() {
		return lfd_styleofhome_1;
	}
	public String getLmd_mp_latitude() {
		return lmd_mp_latitude;
	}
	public String getLmd_mp_longitude() {
		return lmd_mp_longitude;
	}
	public String getL_streetdesignationid() {
		return l_streetdesignationid;
	}
	public String getLo1_organizationname() {
		return lo1_organizationname;
	}
	public String getLo1_phonenumber1() {
		return lo1_phonenumber1;
	}
	public String getLo1_shortname() {
		return lo1_shortname;
	}
	public String getLo2_organizationname() {
		return lo2_organizationname;
	}
	public String getLo2_shortname() {
		return lo2_shortname;
	}
	public String getLo2_phonenumber1() {
		return lo2_phonenumber1;
	}
	public String getLo3_organizationname() {
		return lo3_organizationname;
	}
	public String getLo3_shortname() {
		return lo3_shortname;
	}
	public String getLo3_phonenumber1() {
		return lo3_phonenumber1;
	}
	public String getLr_remarks22() {
		return lr_remarks22;
	}
	public String getLa1_char100_1() {
		return la1_char100_1;
	}
	public String getLa1_loginname() {
		return la1_loginname;
	}
	public String getLa1_phonenumber1() {
		return la1_phonenumber1;
	}
	public String getLa1_webpage() {
		return la1_webpage;
	}
	public String getLa2_char100_1() {
		return la2_char100_1;
	}
	public String getLa2_loginname() {
		return la2_loginname;
	}
	public String getLa2_phonenumber1() {
		return la2_phonenumber1;
	}
	public String getLa2_webpage() {
		return la2_webpage;
	}
	public String getLa3_char100_1() {
		return la3_char100_1;
	}
	public String getLa3_loginname() {
		return la3_loginname;
	}
	public String getLa3_phonenumber1() {
		return la3_phonenumber1;
	}
	public String getLa3_webpage() {
		return la3_webpage;
	}
	public String getLfd_amenities_25() {
		return lfd_amenities_25;
	}
	public String getLfd_basementarea_6() {
		return lfd_basementarea_6;
	}
	public String getLm_char10_11() {
		return lm_char10_11;
	}
	public String getLm_char10_12() {
		return lm_char10_12;
	}
	public String getLm_char10_23() {
		return lm_char10_23;
	}
	public String getLm_char10_5() {
		return lm_char10_5;
	}
	public String getLm_char10_6() {
		return lm_char10_6;
	}
	public String getLm_dec_1() {
		return lm_dec_1;
	}
	public String getLm_dec_11() {
		return lm_dec_11;
	}
	public String getLm_dec_12() {
		return lm_dec_12;
	}
	public String getLm_dec_13() {
		return lm_dec_13;
	}
	public String getLm_dec_14() {
		return lm_dec_14;
	}
	public String getLm_dec_16() {
		return lm_dec_16;
	}
	public String getLm_dec_22() {
		return lm_dec_22;
	}
	public String getLm_dec_7() {
		return lm_dec_7;
	}
	public String getLm_dec_8() {
		return lm_dec_8;
	}
	public String getLm_dec_9() {
		return lm_dec_9;
	}
	public String getLm_int1_1() {
		return lm_int1_1;
	}
	public String getLm_int1_17() {
		return lm_int1_17;
	}
	public int getLm_int1_18() {
		return lm_int1_18;
	}
	public String getLm_int1_19() {
		return lm_int1_19;
	}
	public String getLm_int1_2() {
		return lm_int1_2;
	}
	public int getLm_int1_4() {
		return lm_int1_4;
	}
	public String getLm_int2_2() {
		return lm_int2_2;
	}
	public String getLm_int2_3() {
		return lm_int2_3;
	}
	public String getLm_int2_5() {
		return lm_int2_5;
	}
	public String getLm_int2_8() {
		return lm_int2_8;
	}
	public String getLm_char100_3() {
		return lm_char100_3;
	}
	public String getLm_char1_36() {
		return lm_char1_36;
	}
	public String getLm_char30_28() {
		return lm_char30_28;
	}
	public String getLv_vow_address() {
		return lv_vow_address;
	}
	public String getLv_vow_include() {
		return lv_vow_include;
	}
	public String getL_zip() {
		return l_zip;
	}
	public String getVt_vtoururl() {
		return vt_vtoururl;
	}
	public boolean isTokeep() {
		return tokeep;
	}
	public String getPhrase() {
		return phrase;
	}
	public String getLocation() {
		return location;
	}
	public String getSix_forty_path() {
		return six_forty_path;
	}
	public String getThree_twenty_path() {
		return three_twenty_path;
	}
	public String getOne_sixty_path() {
		return one_sixty_path;
	}
	public int getSqft_int() {
		return sqft_int;
	}
	public String getAddress_vector() {
		return address_vector;
	}
	
	
	
	
	public void setL_listingid(int i) {
		l_listingid = i;
	}
	public void setL_area(String s) {
		l_area = s;
	}
	public void setL_askingprice(String s) {
		
		l_askingprice = new BigDecimal(s);
		
	}
	public void setL_city(String s) {
		l_city = s;
	}
	public void setL_displayid(String s) {
		l_displayid = s;
	}
	public void setL_status(String s) {
		l_status = s;
	}
	public void setL_updatedate(Date d) {
		l_updatedate = d;
	}
	public void setL_address(String s) {
		l_address = s;
	}
	public void setL_addressdirection(String s) {
		l_addressdirection = s;
	}
	public void setL_addressnumber(String s) {
		l_addressnumber = s;
	}
	public void setL_addressstreet(String s) {
		l_addressstreet = s;
	}
	public void setL_addressunit(String s) {
		l_addressunit = s;
	}
	public void setL_listingdate(Date d) {
		l_listingdate = d;
	}
	public void setL_last_photo_updt(Date d) {
		l_last_photo_updt = d;
	}
	public void setL_listagent1(String s) {
		l_listagent1 = s;
	}
	public void setL_listagent2(String s) {
		l_listagent2 = s;
	}
	public void setL_listagent3(String s) {
		l_listagent3 = s;
	}
	public void setL_listoffice1(String s) {
		l_listoffice1 = s;
	}
	public void setL_listoffice2(String s) {
		l_listoffice2 = s;
	}
	public void setL_listoffice3(String s) {
		l_listoffice3 = s;
	}
	public void setLr_remarks33(String s) {
		lr_remarks33 = s;
	}
	public void setL_picturecount(int i) {
		l_picturecount = i;
	}
	public void setL_state(String s) {
		l_state = s;
	}
	public void setLfd_featuresincluded_24(String s) {
		lfd_featuresincluded_24 = s;
	}
	public void setLfd_siteinfluences_15(String s) {
		lfd_siteinfluences_15 = s;
	}
	public void setLfd_styleofhome_1(String s) {
		lfd_styleofhome_1 = s;
	}
	public void setLmd_mp_latitude(String s) {
		lmd_mp_latitude = s;
	}
	public void setLmd_mp_longitude(String s) {
		lmd_mp_longitude = s;
	}
	public void setL_streetdesignationid(String s) {
		l_streetdesignationid = s;
	}
	public void setLo1_organizationname(String s) {
		lo1_organizationname = s;
	}
	public void setLo1_phonenumber1(String s) {
		lo1_phonenumber1 = s;
	}
	public void setLo1_shortname(String s) {
		lo1_shortname = s;
	}
	public void setLo2_organizationname(String s) {
		lo2_organizationname = s;
	}
	public void setLo2_shortname(String s) {
		lo2_shortname = s;
	}
	public void setLo2_phonenumber1(String s) {
		lo2_phonenumber1 = s;
	}
	public void setLo3_organizationname(String s) {
		lo3_organizationname =s;
	}
	public void setLo3_shortname(String s) {
		lo3_shortname = s;
	}
	public void setLo3_phonenumber1(String s) {
		lo3_phonenumber1 = s;
	}
	public void setLr_remarks22(String s) {
		lr_remarks22 = s;
	}
	public void setLa1_char100_1(String s) {
		la1_char100_1 = s;
	}
	public void setLa1_loginname(String s) {
		la1_loginname = s;
	}
	public void setLa1_phonenumber1(String s) {
		la1_phonenumber1 = s;
	}
	public void setLa1_webpage(String s) {
		la1_webpage = s;
	}
	public void setLa2_char100_1(String s) {
		la2_char100_1 = s;
	}
	public void setLa2_loginname(String s) {
		la2_loginname = s;
	}
	public void setLa2_phonenumber1(String s) {
		la2_phonenumber1 = s;
	}
	public void setLa2_webpage(String s) {
		la2_webpage = s;
	}
	public void setLa3_char100_1(String s) {
		la3_char100_1 = s;
	}
	public void setLa3_loginname(String s) {
		la3_loginname = s;
	}
	public void setLa3_phonenumber1(String s) {
		la3_phonenumber1 = s;
	}
	public void setLa3_webpage(String s) {
		la3_webpage = s;
	}
	public void setLfd_amenities_25(String s) {
		lfd_amenities_25 = s;
	}
	public void setLfd_basementarea_6(String s) {
		lfd_basementarea_6 = s;
	}
	public void setLm_char10_11(String s) {
		lm_char10_11 = s;
	}
	public void setLm_char10_12(String s) {
		lm_char10_12 = s;
	}
	public void setLm_char10_23(String s) {
		lm_char10_23 = s;
	}
	public void setLm_char10_5(String s) {
		lm_char10_5 = s;
	}
	public void setLm_char10_6(String s) {
		lm_char10_6 = s;
	}
	public void setLm_dec_1(String s) {
		lm_dec_1 = s;
	}
	public void setLm_dec_11(String s) {
		lm_dec_11 = s;
	}
	public void setLm_dec_12(String s) {
		lm_dec_12 = s;
	}
	public void setLm_dec_13(String s) {
		lm_dec_13 = s;
	}
	public void setLm_dec_14(String s) {
		lm_dec_14 = s;
	}
	public void setLm_dec_16(String s) {
		lm_dec_16 = s;
	}
	public void setLm_dec_22(String s) {
		lm_dec_22 = s;
	}
	public void setLm_dec_7(String s) {
		lm_dec_7 = s;
	}
	public void setLm_dec_8(String s) {
		lm_dec_8 = s;
	}
	public void setLm_dec_9(String s) {
		lm_dec_9 = s;
	}
	public void setLm_int1_1(String s) {
		lm_int1_1 = s;
	}
	public void setLm_int1_17(String s) {
		lm_int1_17 = s;
	}
	public void setLm_int1_18(int i) {
		lm_int1_18 =i;
	}
	public void setLm_int1_19(String s) {
		lm_int1_19 = s;
	}
	public void setLm_int1_2(String s) {
		lm_int1_2 = s;
	}
	public void setLm_int1_4(int i) {
		lm_int1_4 = i;
	}
	public void setLm_int2_2(String s) {
		lm_int2_2 = s;
	}
	public void setLm_int2_3(String s) {
		lm_int2_3 = s;
	}
	public void setLm_int2_5(String s) {
		lm_int2_5 = s;
	}
	public void setLm_int2_8(String s) {
		lm_int2_8 = s;
	}
	public void setLm_char100_3(String s) {
		lm_char100_3 = s;
	}
	public void setLm_char1_36(String s) {
		lm_char1_36 = s;
	}
	public void setLm_char30_28(String s) {
		lm_char30_28 = s;
	}
	public void setLv_vow_address(String s) {
		lv_vow_address = s;
	}
	public void setLv_vow_include(String s) {
		lv_vow_include = s;
	}
	public void setL_zip(String s) {
		l_zip = s;
	}
	public void setVt_vtoururl(String s) {
		vt_vtoururl = s;
	}
	public void setTokeep(boolean b) {
		tokeep = b;
	}
	public void setPhrase(String s) {
		phrase = s;
	}
	public void setLocation(String s) {
		location = s;
	}
	public void setSix_forty_path(String s) {
		six_forty_path = s;
	}
	public void setThree_twenty_path(String s) {
		three_twenty_path = s;
	}
	public void setOne_sixty_path(String s) {
		one_sixty_path = s;
	}
	public void setSqft_int(int i) {
		sqft_int = i;
	}
	public void setAddress_vector(String s) {
		address_vector = s;
	}
	
	
	

}
