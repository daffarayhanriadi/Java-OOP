package daffa.belajarjava.application;

import daffa.belajarjava.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("daffa", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest); // otomatis toString() di generate oleh Java nya

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("daffa"));
        System.out.println(new LoginRequest("daffa","rahasia"));

    }
}
