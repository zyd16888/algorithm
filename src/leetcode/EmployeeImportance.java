package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyd
 * @date 2024/8/26
 *
 * 690. 员工的重要性
 * https://leetcode.cn/problems/employee-importance/description/
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

public class EmployeeImportance {

    Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee: employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id) {
        Employee employee = map.get(id);
        int res = employee.importance;
        for (int sub: employee.subordinates) {
            res += dfs(sub);
        }
        return res;
    }

    public static void main(String[] args) {

        EmployeeImportance test = new EmployeeImportance();
        List<Employee> employees = List.of(
                new Employee(1, 5, List.of(2, 3)),
                new Employee(2, 3, List.of()),
                new Employee(3, 3, List.of()),
                new Employee(4, 1, List.of())
        );
        int res = test.getImportance(employees, 1);
        System.out.println(res);
    }
}
