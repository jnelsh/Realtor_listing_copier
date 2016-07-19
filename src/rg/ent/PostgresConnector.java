package rg.ent;

/*
 * This software is a part of the False Accusation Database - created by Diana Davison and John Hembling
 * Source code written by: John Hembling
 * Technical inquiries: john@johntheother.com
 * Project inquiries: diana.lee.davison@gmail.com
 * Copyright (c): I Am The Law (2016)
 */



//Amazon database credentials
//database rgrsite   
//database  rgrsitedata
//database user  rgrsiteuser
//pass shadrach99

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

public class PostgresConnector {

	private static java.sql.Connection connection;
	private static PostgresConnector pgc = new PostgresConnector( );
	private PostgresConnector(){ }
	public static PostgresConnector getInstance( ) {      return pgc;}
	public static java.sql.Connection getConnection(){ 
		try {
			if(connection==null || connection.isClosed()){ connection=init();}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return connection;
	}
	
	
	
	
	private static java.sql.Connection init(){
		connection = null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException "+e+"<br />");
			System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!<br />");
		}
		try {	
			connection = DriverManager.getConnection(		
				"jdbc:postgresql://aa1w2fh7xu35vbl.cngclcqagnfu.us-west-2.rds.amazonaws.com:5432/ebdb?user=rgrsiteuser&password=shadrach99"
				);
			/*		"jdbc:postgresql://127.0.0.1:5432/testDataOne", 
					"postgres",
					"Saturn5");
			*/
			//messages.append("connection succeeded <br />");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console<br />");
			e.printStackTrace();
		}
		if (connection == null) {
			System.out.println("Failed to make connection!\n");
		}
		return connection;
	}

	//select lo1_shortname from listing where lo1_shortname in ('V003843')
	
	
	public static HashSet<ListingDataObj> LoadRoyaltyListingsForCopy(Integer[] id_nums){
		HashSet<ListingDataObj> loaded_listings = new HashSet<ListingDataObj>();
		
		StringBuffer sb = new StringBuffer();
		sb.append(" select l_listingid, l_area, l_city, l_displayid, l_status, l_updatedate, l_address, ");
		sb.append(" l_addressdirection, l_addressnumber, l_addressstreet, l_addressunit, l_listingdate, ");
		sb.append(" l_last_photo_updt,  l_listagent1,l_listagent2, l_listagent3, l_listoffice1, l_listoffice2, ");
		sb.append(" l_listoffice3,  lr_remarks33 , l_picturecount, l_state, lfd_featuresincluded_24, lfd_siteinfluences_15, ");
		sb.append(" lfd_styleofhome_1, lmd_mp_latitude, lmd_mp_longitude, l_streetdesignationid, lo1_organizationname, ");
		sb.append(" lo1_phonenumber1, lo1_shortname, lo2_organizationname,  lo2_shortname, lo2_phonenumber1, lo3_organizationname, ");
		sb.append(" lo3_shortname, lr_remarks22, la1_char100_1,  la1_loginname, la1_phonenumber1, la1_webpage, ");
		sb.append(" la2_char100_1,  la2_loginname, la2_phonenumber1, la2_webpage, la3_char100_1, la3_loginname, ");
		sb.append(" la3_phonenumber1, la3_webpage, lfd_amenities_25, lfd_basementarea_6, lm_char10_11, lm_char10_12, ");
		sb.append(" lm_char10_23, lm_char10_5, lm_char10_6,lm_dec_1,lm_dec_11,lm_dec_12,lm_dec_13,lm_dec_14,");
		sb.append(" lm_dec_16,  lm_dec_22, lm_dec_7,  lm_dec_8,  lm_dec_9,  lm_int1_1,  lm_int1_17,  lm_int1_18, ");
		sb.append(" lm_int1_19, lm_int1_2, lm_int1_4, lm_int2_2, lm_int2_3, lm_int2_5, lm_int2_8, lm_char100_3, ");
		sb.append(" lm_char1_36, lm_char30_28,  lv_vow_address, lv_vow_include,  l_zip, vt_vtoururl, tokeep, ");
		sb.append(" sqft_int, l_askingprice,six_forty_path, three_twenty_path, one_sixty_path ");
		sb.append(" from Listing where l_listingid in (");
		
		for(int i=0; i<id_nums.length; i++){
			sb.append("?");
			if(i<id_nums.length-1){
				sb.append(",");
			}
		}
		
		sb.append(")");
		
		
		
		try {
			connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sb.toString());
			
			for(int i=0; i<id_nums.length; i++){
				pstmt.setInt(i+1, id_nums[i].intValue());
			}
			ListingDataObj ldo = null;
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				ldo = new ListingDataObj();
			
				ldo.setL_listingid(rs.getInt("l_listingid")); 
				ldo.setL_area(rs.getString("l_area")); 
				ldo.setL_city(rs.getString("l_city"));
				ldo.setL_displayid(rs.getString("l_displayid")); 
				ldo.setL_status(rs.getString("l_status"));
				ldo.setL_updatedate(rs.getDate("l_updatedate")); 
				ldo.setL_address(rs.getString("l_address"));
				ldo.setL_addressdirection(rs.getString("l_addressdirection"));
				ldo.setL_addressnumber(rs.getString("l_addressnumber"));
				ldo.setL_addressstreet(rs.getString("l_addressstreet"));
				ldo.setL_addressunit(rs.getString("l_addressunit"));
				ldo.setL_listingdate(rs.getDate("l_listingdate"));
				ldo.setL_last_photo_updt(rs.getDate("l_last_photo_updt"));
				ldo.setL_listagent1(rs.getString("l_listagent1"));
				ldo.setL_listagent2(rs.getString("l_listagent2"));
				ldo.setL_listagent3(rs.getString("l_listagent3"));
				ldo.setL_listoffice1(rs.getString("l_listoffice1")); 
				ldo.setL_listoffice2(rs.getString("l_listoffice2"));
				ldo.setL_listoffice3(rs.getString("l_listoffice3"));
				ldo.setLr_remarks33(rs.getString("lr_remarks33"));
				ldo.setL_picturecount(Integer.parseInt(rs.getString("l_picturecount")));
				ldo.setL_state(rs.getString("l_state")); 
				ldo.setLfd_featuresincluded_24(rs.getString("lfd_featuresincluded_24"));
				ldo.setLfd_siteinfluences_15(rs.getString("lfd_siteinfluences_15"));
				ldo.setLfd_styleofhome_1(rs.getString("lfd_styleofhome_1"));
				ldo.setLmd_mp_latitude(rs.getString("lmd_mp_latitude")); 
				ldo.setLmd_mp_longitude(rs.getString("lmd_mp_longitude"));
				ldo.setL_streetdesignationid(rs.getString("l_streetdesignationid")); 
				ldo.setLo1_organizationname(rs.getString("lo1_organizationname")); 
				ldo.setLo1_phonenumber1(rs.getString("lo1_phonenumber1")); 
				ldo.setLo1_shortname(rs.getString("lo1_shortname")); 
				ldo.setLo2_organizationname(rs.getString("lo2_organizationname"));  
				ldo.setLo2_shortname(rs.getString("lo2_shortname")); 
				ldo.setLo2_phonenumber1(rs.getString("lo2_phonenumber1"));
				ldo.setLo3_organizationname(rs.getString("lo3_organizationname")); 
				ldo.setLo3_shortname(rs.getString("lo3_shortname")); 
				//ldo.setLo3_phonenumber1(rs.getString("lo3_phonenumber1")); 
				ldo.setLr_remarks22(rs.getString("lr_remarks22")); 
				ldo.setLa1_char100_1(rs.getString("la1_char100_1"));  
				ldo.setLa1_loginname(rs.getString("la1_loginname")); 
				ldo.setLa1_phonenumber1(rs.getString("la1_phonenumber1")); 
				ldo.setLa1_webpage(rs.getString("la1_webpage"));
				ldo.setLa2_char100_1(rs.getString("la2_char100_1"));
				ldo.setLa2_loginname(rs.getString("la2_loginname")); 
				ldo.setLa2_phonenumber1(rs.getString("la2_phonenumber1")); 
				ldo.setLa2_webpage(rs.getString("la2_webpage")); 
				ldo.setLa3_char100_1(rs.getString("la3_char100_1")); 
				ldo.setLa3_loginname(rs.getString("la3_loginname"));
				ldo.setLa3_phonenumber1(rs.getString("la3_phonenumber1")); 
				ldo.setLa3_webpage(rs.getString("la3_webpage")); 
				ldo.setLfd_amenities_25(rs.getString("lfd_amenities_25")); 
				ldo.setLfd_basementarea_6(rs.getString("lfd_basementarea_6")); 
				ldo.setLm_char10_11(rs.getString("lm_char10_11")); 
				ldo.setLm_char10_12(rs.getString("lm_char10_12")); 
				ldo.setLm_char10_23(rs.getString("lm_char10_23")); 
				ldo.setLm_char10_5(rs.getString("lm_char10_5")); 
				ldo.setLm_char10_6(rs.getString("lm_char10_6"));
				ldo.setLm_dec_1(rs.getString("lm_dec_1"));
				ldo.setLm_dec_11(rs.getString("lm_dec_11"));
				ldo.setLm_dec_12(rs.getString("lm_dec_12"));
				ldo.setLm_dec_13(rs.getString("lm_dec_13"));
				ldo.setLm_dec_14(rs.getString("lm_dec_14"));
				ldo.setLm_dec_16(rs.getString("lm_dec_16"));
				ldo.setLm_dec_22(rs.getString("lm_dec_22")); 
				ldo.setLm_dec_7(rs.getString("lm_dec_7")); 
				ldo.setLm_dec_8(rs.getString("lm_dec_8"));
				ldo.setLm_dec_9(rs.getString("lm_dec_9"));
				ldo.setLm_int1_1(rs.getString("lm_int1_1")); 
				ldo.setLm_int1_17(rs.getString("lm_int1_17")); 
				ldo.setLm_int1_18(rs.getInt("lm_int1_18"));
				ldo.setLm_int1_19(rs.getString("lm_int1_19"));
				ldo.setLm_int1_2(rs.getString("lm_int1_2"));
				ldo.setLm_int1_4(rs.getInt("lm_int1_4"));
				ldo.setLm_int2_2(rs.getString("lm_int2_2"));
				ldo.setLm_int2_3(rs.getString("lm_int2_3"));
				ldo.setLm_int2_5(rs.getString("lm_int2_5"));
				ldo.setLm_int2_8(rs.getString("lm_int2_8"));
				ldo.setLm_char100_3(rs.getString("lm_char100_3"));
				ldo.setLm_char1_36(rs.getString("lm_char1_36"));
				ldo.setLm_char30_28(rs.getString("lm_char30_28")); 
				ldo.setLv_vow_address(rs.getString("lv_vow_address")); 
				ldo.setLv_vow_include(rs.getString("lv_vow_include"));
				ldo.setL_zip(rs.getString("l_zip"));
				ldo.setVt_vtoururl(rs.getString("vt_vtoururl")); 
				ldo.setTokeep(rs.getBoolean("tokeep"));
				ldo.setSqft_int(rs.getInt("sqft_int"));
				ldo.setL_askingprice(rs.getString("l_askingprice"));
				ldo.setSix_forty_path(rs.getString("six_forty_path"));
				ldo.setThree_twenty_path(rs.getString("three_twenty_path")); 
				ldo.setOne_sixty_path(rs.getString("one_sixty_path"));
				loaded_listings.add(ldo);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loaded_listings;
	}
	
	
	public static java.util.HashSet<Integer> getL_idNumbers(){
		//java.util.AbstractSet<Integer> id_numbers = new java.util.AbstractSet();
		
		HashSet<Integer> id_numbers= new HashSet<Integer>();
		try{
			connection = getConnection();
			PreparedStatement prep_stmt = connection.prepareStatement("select l_listingid, l_listoffice1, lo1_organizationname, l_listingdate from listing where l_listoffice1 in ('2870', '2832', '2901')  and l_listingdate>'2016-03-11' order by l_listingdate desc");
			ResultSet rs = prep_stmt.executeQuery();
			while(rs.next()){
				id_numbers.add(
					new Integer(rs.getInt("l_listingid"))
				);
			}
			connection.close();
			connection=null;
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println(e.getNextException());
		}
		return id_numbers;
	}
	

	public static java.util.ArrayList<String> loadAllMemberIds(){
		java.util.ArrayList<String> users_arr = new java.util.ArrayList<String>();
	
		try{
			connection = getConnection();
			//select * from listing where la1_loginname in (select mem_login from member where mem_login not in ('')) 
			
			PreparedStatement prep_stmt = connection.prepareStatement("select mem_login from member where mem_login not in ('') order by m_id desc");
			
			ResultSet rs = prep_stmt.executeQuery();
			while(rs.next()){
				users_arr.add(rs.getString("mem_login"));
			}
			connection.close();
			connection=null;
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println(e.getNextException());
		}
		return users_arr;
	}
	
	
	
	
	







	/*
	public static rg.ent.BasicUser updateBasicUser(rg.ent.BasicUser usr){
		
		try{
			connection = getConnection();
			connection = getConnection();
			
			PreparedStatement prep_stmt = connection.prepareStatement("update users set admin_level=?,  role=?, phone=? where id=?");
			prep_stmt.setInt(1, usr.getAdmin_level());
			prep_stmt.setString(2, usr.getRole());
			prep_stmt.setString(3, usr.getPhone()); 
			prep_stmt.setInt(4, usr.getId());
					
			prep_stmt.execute();
			
			connection.close();
			connection=null;
		}catch(SQLException e){
			System.out.println(e);
		}
		return usr;
	}
	*/
	

	
	
	
	

	
	
/*			
	public static rg.ent.NewUser tryLogin(rg.ent.NewUser the_user){	
		if(the_user.getPass()!=null && the_user.getPass().length()>0){
			try{
				connection = getConnection();
				PreparedStatement prepStmt = connection.prepareStatement("select m_id, first_name, last_name, email, phone, pass_hash, role, datecreated,admin_level from Member where lower(email)=?");
				prepStmt.setString(1, the_user.getEmail().toLowerCase());
				ResultSet rs = prepStmt.executeQuery();
				while(rs.next()){
					//System.out.println("found record");
					the_user.setFirst_name(rs.getString("first_name"));
					the_user.setLast_name(rs.getString("last_name"));	
					the_user.setLogged_in(rg.util.PasswordHash.validatePassword(the_user.getPass(), rs.getString("pass_hash")));
					the_user.setEmail(rs.getString("email"));
					the_user.setM_id(rs.getInt("m_id"));
					the_user.setAdmin_level(rs.getInt("admin_level"));
					the_user.setRole(rs.getString("role"));
				}

	
				connection.close();
				connection=null;
			}catch(SQLException e){
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (InvalidKeySpecException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("["+e+"]");
			}
		}else if (the_user.getPass()==null || the_user.getPass().length()<1){
			the_user.setLogged_in(false);
		}
	return the_user;
	}
	
*/	
		
	
	
	
	
	
	
}

