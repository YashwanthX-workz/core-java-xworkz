class IceCream {
    static int index;
    static String flavorNames[] = {null, null, null, null, null, null, null};

    public static boolean addFlavorNames(String flavorName) {
        boolean isCreated = false;

        if (flavorName != null) {
            flavorNames[index] = flavorName;
            index++;
            isCreated = true;
        } else {
            System.out.println("Null values are not created.");
        }

        return isCreated;
    }

    public static void retrieveAllFlavorNames() {
        for (int flavor = 0; flavor < flavorNames.length; flavor++) {
            String reference = flavorNames[flavor];
            
                System.out.println("The " + reference + " flavor has been added.");
            }
        }
}


