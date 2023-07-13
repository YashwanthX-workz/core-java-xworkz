class Medicine {
    static int index;
    static String medicineNames[] = {null, null, null, null, null, null, null};

    public static boolean addMedicineName(String medicineName) {
        boolean isCreated = false;

        if (medicineName != null) {
            medicineNames[index] = medicineName;
            index++;
            
        } else {
			isCreated = true;
            System.out.println("Null values Can't Added.");
        }

        return isCreated;
    }

    public static void getAllMedicineNames() {
        for (int medicine = 0; medicine < medicineNames.length; medicine++) {
            String reference = medicineNames[medicine];
       
                System.out.println("The " + reference + " medicine has been added.");
            }
        }
    }

