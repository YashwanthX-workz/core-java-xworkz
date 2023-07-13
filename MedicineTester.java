class MedicineTester {
    public static void main(String medicineName[]) {
        Medicine.addMedicineName("Paracetamol");
        Medicine.addMedicineName("Dolo-650");
        Medicine.addMedicineName("Aspirin");
        Medicine.addMedicineName("Saeden");
        Medicine.addMedicineName("VicksAction-500");
        Medicine.addMedicineName(null);
		Medicine.addMedicineName("vitamin-C");
		
        Medicine.getAllMedicineNames();
    }
}
