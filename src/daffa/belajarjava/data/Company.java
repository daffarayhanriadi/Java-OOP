package daffa.belajarjava.data;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {

        private String name;

//        private String company;

        // karena inner join
        public String getCompany() {
//            return Company.this.name;
            // atau
            return Company.this.getName();
        }

//        public void setCompany(String company) {
//            this.company = company;
//        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
