package oops.Encap;

public class p02EmpTest {
    public static void main(String[] args) {
        P02Emp p02Emp01 = new P02Emp();
        p02Emp01.setEmpId(14);
        p02Emp01.setEmpName("lalit");
        p02Emp01.setEmpAge(18);

        P02Emp p02Emp02 = new P02Emp();
        p02Emp02.setEmpId(83);
        p02Emp02.setEmpName("vaibhav");
        p02Emp02.setEmpAge(10);

        System.out.println(p02Emp02.getEmpId());
        System.out.println(p02Emp02.getEmpName());
        System.out.println(p02Emp02.getEmpAge());
        System.out.println("next Emp");
        System.out.println(p02Emp01.getEmpId());
        System.out.println(p02Emp01.getEmpName());
        System.out.println(p02Emp01.getEmpAge());

    }
}
