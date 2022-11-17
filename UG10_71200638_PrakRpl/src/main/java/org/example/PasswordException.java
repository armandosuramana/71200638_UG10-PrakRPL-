package org.example;

public class PasswordException extends Exception{
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        super();
        this.errCode = errCode;
        if (this.errCode == 1) {
            errMessage = "Maaf, Pasword tidak boleh kosong";

        } else if (this.errCode == 2) {
            errMessage = "Maaf, password minimal harus terdiri dari 7 karakter";

        } else if (this.errCode == 3) {
            errMessage = "Maaf, Password minimal harus mengandung 1 karakter huruf kecil,huruf besar,simbol,angka";

        } else if (this.errCode == 4) {
            errMessage = "Maaf, Password tidak boleh sama dengan username";
        } else if (this.errCode == 5) {
            errMessage = "Maaf, Pasword harus sama dengan konfirmasi pasword";

        }

    }
    public String getErrMessage(){
        return errMessage;
    }
    public int getErrCode(){
        return errCode;
    }

}
