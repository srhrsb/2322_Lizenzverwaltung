package dao;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class LicenseDAO {
    private List<License> licenseList;
    private List<User> userList;

    public LicenseDAO() {
        this.licenseList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public boolean addLicense(int id, int userId, String name, LicenseType licenseType){
        if(isLicenseIdUnique(id)) {
            var license = new License(id, name, licenseType);
            licenseList.add(license);
            return true;
        }

        return false;
    }

    public boolean addUser(int id, String lastName, String firstName){
        if(isUserIdUnique(id)) {
            var user = new User(id, lastName, firstName);
            userList.add(user);
            return true;
        }

        return false;
    }

    private boolean isUserIdUnique( int id){
        for(var user : userList){
            if(user.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private boolean isLicenseIdUnique( int id){
        for(var license : licenseList){
            if(license.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public License getLicenseById( int id ){
        for(var license : licenseList){
            if(license.getId() == id) {
                return license;
            }
        }
        return null;
    }

    public User getUserById( int id ){
        for(var user : userList){
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

   public boolean deleteUserById(int id){
       var user = getUserById(id);
       if(user != null){
           userList.remove(user);
           return true;
       }
       return false;
   }

    public boolean deleteLicenseById(int id){
        var license = getLicenseById(id);
        if(license != null){
            licenseList.remove(license);
            return true;
        }
        return false;
    }


}
