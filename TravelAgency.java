class TravelAgency {
    static int index;
    static String travelAgencyNames[] = {null, null, null, null, null, null, null};

    public static boolean addTravelAgencyName(String travelAgencyName) {
        boolean isCreated = false;

        if (travelAgencyName != null) {
            travelAgencyNames[index] = travelAgencyName;
            index++;
            isCreated = true;
        } else {
            System.out.println("Null values are not created.");
        }

        return isCreated;
    }

    public static void retrieveAllTravelAgencyNames() {
        for (int agency = 0; agency < travelAgencyNames.length; agency++) {
            String reference = travelAgencyNames[agency];
           
                System.out.println("The " + reference + " travel agency has been added.");
            }
        }
    }



