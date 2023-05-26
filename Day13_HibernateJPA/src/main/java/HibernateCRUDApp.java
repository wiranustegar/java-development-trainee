import id.co.indivara.jdt12.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class HibernateCRUDApp {
    public static Session initHibernate(Class namaClassEntity){
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(namaClassEntity);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        return session;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Session session = initHibernate(Employee.class);

        while (true){
            session.getTransaction();
            System.out.println("===MENU===");
            System.out.println("1. TAMPILKAN SEMUA EMPLOYEE");
            System.out.println("2. INPUT DATA EMPLOYEE");
            System.out.println("3. UPDATE DATA EMPLOYEE");
            System.out.println("4. DELETE DATA EMPLOYEE");
            System.out.println("5. CARI DATA BY NIP");
            System.out.println("6. KELUAR");
            System.out.print("PILIH [1/2/3/4/5]: ");
            String pilihan = sc.nextLine();
            if (pilihan.equals("1")){
                List<Employee> emplyees = session.createQuery("from Employee").list();
                for (Employee e : emplyees){
                    System.out.println("NIP: " + e.getEmployeeId());
                    System.out.println("NAMA: " + e.getFirstName());
                    System.out.println("GAJI: " + e.getSalary());
                    System.out.println("------------");;
                }
            } else if (pilihan.equals("2")) {
                session.beginTransaction();
                System.out.println("=====INPUT DATA====");
                System.out.print("NIP: ");
                int nip = Integer.parseInt(sc.nextLine());
                System.out.print("NAMA: ");
                String nama = sc.nextLine();
                System.out.print("GAJI: ");
                double gaji = Double.parseDouble(sc.nextLine());
                Employee emp = new Employee();
                emp.setEmployeeId(nip);
                emp.setFirstName(nama);
                emp.setSalary(gaji);
                session.save(emp);
                session.getTransaction().commit();

                //SESSION CLEAR DIBUTUHKAN UNTUK MEREFRESH SUPAYA ID TIDAK JADI 0
                session.clear();

            } else if (pilihan.equals("3")) {
                session.beginTransaction();
                System.out.print("NIP yg akan diupdate: ");
                int nip = Integer.parseInt(sc.nextLine());
                Employee emp = session.load(Employee.class, nip);

                System.out.print("NAMA ["+ emp.getFirstName() +"]: ");
                String nama = sc.nextLine();
                if (!nama.isEmpty()){
                    emp.setFirstName(nama);
                }

                System.out.print("GAJI ["+ emp.getSalary() +"]: ");
                String gaji = sc.nextLine();
                if (!gaji.isEmpty()){
                    emp.setSalary(Double.parseDouble(gaji));
                }

                session.update(emp);
                session.getTransaction().commit();

            } else if (pilihan.equals("4")) {
                System.out.print("NIP yg akan didelete: ");
                int nip = Integer.parseInt(sc.nextLine());
                Employee emp = session.load(Employee.class, nip);
                session.beginTransaction();
                session.delete(emp);
                session.getTransaction().commit();

            } else if (pilihan.equals("5")) {
                System.out.print("NIP: ");
                int nip = Integer.parseInt(sc.nextLine());
                Employee emp = session.load(Employee.class, nip);
                System.out.println("===DATA EMPLOYEE===");
//                System.out.println("NIP: " + emp.getEmployeeId());
                System.out.println("NAMA: " + emp.getFirstName());
                System.out.println("GAJI: " + emp.getSalary());
                System.out.println("------------");;
            } else if (pilihan.equals("6")) {
                System.exit(0);
            }
        }
    }
}
