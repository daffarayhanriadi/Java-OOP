package daffa.belajarjava.application;

import daffa.belajarjava.data.CreateUserRequest;
import daffa.belajarjava.data.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("daffa");
        request.setPassword("daffa");
        request.setName("daffa");

        ValidationUtil.validationReflection(request);

    }
}
