class StationaryTester {

public static void main(String args[]){
		//add,save,create
		Stationary.addStationaryItems("Books");
		Stationary.addStationaryItems("Pencil");
		Stationary.addStationaryItems("Pen");
		Stationary.addStationaryItems("Eraser");
		Stationary.addStationaryItems("SketchPens");
		Stationary.addStationaryItems("Ink Pen");
		Stationary.addStationaryItems("Safety Pin");
		Stationary.addStationaryItems("Charts");
		
		Stationary.editStationaryItemName("Cardboard Sheets","Safety Pin");   //update,edit
		Stationary.getAllStationaryItems();  //Read,get
		Stationary.searchStationaryItemByName("Ink Pen");
		//String Stationary.searchStationaryItemByName(Ink Pen);
		//delete,remove
		//int newLength=deleteStationaryItemName("Eraser");
		//getAllStationaryItemsPostDeletion(newLength);
	}
}