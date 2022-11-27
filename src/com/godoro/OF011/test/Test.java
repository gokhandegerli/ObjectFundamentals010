package com.godoro.OF011.test;

import com.godoro.OF011.inheritance.Agent;
import com.godoro.OF011.inheritance.Customer;
import com.godoro.OF011.inheritance.Employee;
import com.godoro.OF011.person.Person;
import com.godoro.OF011.inheritance.Supplier;

public class Test {


    public static void main(String[] args) {


        Customer customer = new Customer();
        customer.setCustomerId(401);
        customer.setFirstName("Yıldırım");
        customer.setLastName("Gürses");
        customer.setTotalDebit(500);
        customer.setEmailAddress("gurses@gmail.com");

        Person person = new Customer();
        person.setFirstName("Erdoğan");
        person.setLastName("Berker");
        person.setEmailAddress("berker@gmail.com");


        if (person instanceof Customer) {
            Customer customerPerson = (Customer) person;
            customerPerson.setCustomerId(402);
            customerPerson.setTotalDebit(300);
            //System.out.println(customerPerson.getLastName()); //Erdoğan değeri de buraya geldi. Ek olarak if
            // dışında customerPerson tanınmıyor. Burada person'da olmayan Customer fieldlarını da ekleyebilmek
            // için böyle bir şey yaptık.
        }

        // Person person2 = new Person(); // Abstract! Bana bir kuş getirin dedik; ya güvercin ya kartal gelecek
        // yani bir tür kuş getirilecek, tipsiz (kartal, güvercin, serçe vs demeden) bir kuş olamaz.

        Supplier supplier = new Supplier();
        supplier.setSupplierId(831);
        supplier.setFirstName("Zekai");
        supplier.setLastName("Tunca");
        supplier.setMainSector("Kırtasiye");
        supplier.setEmailAddress("tunca@gmail.com");

        Employee employee = new Employee();
        employee.setEmployeeId(651);
        employee.setFirstName("Suat");
        employee.setLastName("Sayın");
        employee.setDepartmentName("Pazarlama");
        employee.setEmailAddress("sayin@gmail.com");


        System.out.println(customer.getGreetings() + " Müşteri: " + customer.getFullName());
        System.out.println(person.getGreetings() + " Kişi: " + person.getFullName());
        System.out.println(supplier.getGreetings() + " Tedarikçi: "+ supplier.getFullName());
        System.out.println(employee.getGreetings() + " Çalışan: "+ employee.getFullName());


        Agent agent = new Agent();
        agent.setAgentId(491);
        agent.setActivityRegion("Marmara Bölgesi");
        agent.setFirstName("Ajan");
        agent.setLastName("Smith");
        agent.setEmailAddress("smith@matrix.com");

        Mailer mailer = new Mailer();
        mailer.send(customer);
        mailer.send(person);
        mailer.send(supplier);
        mailer.send(employee);
        mailer.send(agent);














    }

}
