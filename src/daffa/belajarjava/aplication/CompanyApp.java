package daffa.belajarjava.aplication;

import daffa.belajarjava.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Daffa");

//        employee.setName(company.getName()); -> tidak ada untungnya jika membuat inner class jika harus melakukan set kembali.

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Budi");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
