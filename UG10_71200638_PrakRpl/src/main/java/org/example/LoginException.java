package org.example;

public class LoginException extends Exception {
    private int errCode;
    private String errMessage;

    public LoginException(int errCode){
        super();
        this.errCode =errCode;
        if(this.errCode ==1){
            errMessage = "Username tidak boleh kosong";

        } else if (this.errCode ==2){
            errMessage ="Pasword tidak boleh kosong";

        }
        else if (this.errCode ==3){
            errMessage ="Susename dan pasword tidak boleh salah";

        }
    }
    public String getErrMessage(){
        return errMessage;
    }
    public int getErrCode(){
        return errCode;
    }
}
