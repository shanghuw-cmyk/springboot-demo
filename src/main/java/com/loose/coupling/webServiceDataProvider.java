package com.loose.coupling;

public class webServiceDataProvider implements UserDataProvider {

   @Override
    public String getUserDetails() {
        return "Fetching Data From WebService";
    }

}
