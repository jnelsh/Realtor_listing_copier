package rg.ent;

import java.util.Iterator;


public class ListingCopier {

	private java.util.HashSet<Integer> listing_ids;
	private java.util.HashSet<ListingDataObj> listings_to_copy;
	
	public ListingCopier(){}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListingCopier lc = new ListingCopier();
		lc.loadListingIDs();
		lc.workThroughListing_Numbers();
		lc.report();
		
		
	}
	
	public void loadListingIDs(){
		
		listing_ids = rg.ent.PostgresConnector.getL_idNumbers();
	}
	
	
	public void workThroughListing_Numbers(){
		if(listing_ids!=null){
			while(!listing_ids.isEmpty()){
				takeThree(3);
			}
		}
	}
	public void takeThree(int how_many){
		
		int sze = listing_ids.size();
		
		if(how_many>sze){
			how_many=sze;
		}
		Integer[] to_copy = new Integer[how_many];
		Iterator<Integer> it = listing_ids.iterator();
		int counter=0;
		
		
		while(it.hasNext() && counter<how_many){
			to_copy[counter] = it.next();
			it.remove();
			counter++;
		}
		copyMemberListings(to_copy);
		System.out.println("listing_ids.size(); ["+sze+"]");
	}
	
	public void copyMemberListings(Integer[] to_copy){
		if(listings_to_copy==null){
			listings_to_copy = rg.ent.PostgresConnector.LoadRoyaltyListingsForCopy(to_copy); 
		}else if(listings_to_copy!=null){
			listings_to_copy.addAll(rg.ent.PostgresConnector.LoadRoyaltyListingsForCopy(to_copy));
		}
		System.out.println(" listings_to_copy.size()" +listings_to_copy.size());
	}
	
	
	
	
	public void report(){
		System.out.println("exiting listing_ids.size(); ["+listing_ids.size()+"]");
	}
	

}
