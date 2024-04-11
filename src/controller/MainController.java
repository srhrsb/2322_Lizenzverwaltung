package controller;

import dao.LicenseDAO;
import view.MainView;

import java.awt.event.ActionEvent;

public class MainController {
    private final LicenseDAO licenseDB;
    private final MainView mainView;
    public MainController( LicenseDAO licenseDB, MainView mainView){
        this.licenseDB = licenseDB;
        this.mainView = mainView;

        mainView.addShowLicenseHandler(this::onClickShowLicense);
        mainView.addSaveLicenseHandler(this::onClickSaveLicense);
        mainView.addDeleteLicenseHandler(this::onClickDeleteLicense);

        mainView.addShowUserHandler(this::onClickShowUser);
        mainView.addSaveUserHandler(this::onClickSaveUser);
        mainView.addDeleteUserHandler(this::onClickDeleteUser);

    }

    public static void main(String[] args) {
        new MainController(new LicenseDAO(), new MainView(600,250));
    }

    public void onClickShowLicense(ActionEvent event){
      //ToDo
    }

    public void onClickSaveLicense(ActionEvent event){
        //ToDo
    }

    public void onClickDeleteLicense(ActionEvent event){
        //ToDo
    }

    public void onClickShowUser(ActionEvent event){
        //ToDo
    }

    public void onClickSaveUser(ActionEvent event){
        //ToDo
    }

    public void onClickDeleteUser(ActionEvent event){
        //ToDo
    }

}