class Telecom {
    static int index;
    static String telecomNames[] = {null, null, null, null, null, null, null};

    public static boolean addTelecomName(String telecomName) {
        boolean isCreated = false;

        if (telecomName != null) {
            telecomNames[index] = telecomName;
            index++;
            isCreated = true;
        } else {
            System.out.println("Null values are not created.");
        }

        return isCreated;
    }

    public static void getAllTelecomNames() {
        for (int telecom = 0; telecom < telecomNames.length; telecom++) {
            String reference = telecomNames[telecom];
            
                System.out.println("The " + reference + " telecom has been added.");
            
        }
    }
}

