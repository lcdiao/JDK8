package cn.lcdiao.jdk8.optional;

import java.util.*;

/**
 * Created by lcd on 2018/11/21.
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");
        Employee employee2 = new Employee();
        employee.setName("lisi");
        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee,employee2);
//        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();
        System.out.println(list);                           //没值时这里会返回 null
        //获取list，如果为空则返回一个空list（[]）
//        if(null!=list){
//            return list;
//        }else{
//            return new ArrayList<Employee>();
//        }
        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(theCompany->theCompany.getEmployees()).orElse(Collections.emptyList()));    //没值时这里会返回 []


    }

    public  void test(Optional optional){}  //不建议将Optional作为参数，没有实现各种接口(如序列化接口)
}
