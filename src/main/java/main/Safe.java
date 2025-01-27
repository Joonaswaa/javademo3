package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;
    

    public Safe(String pinCode) {
        this.pinCode = pinCode;
        this.safeFolder = new ArrayList<>();
    }

    public String getPin() {
        return pinCode;
    }

    public void setPin(String pinCode) {
        this.pinCode = pinCode;
    }

    public void changePin(String newPin) {
        this.pinCode = newPin;
    }
}        