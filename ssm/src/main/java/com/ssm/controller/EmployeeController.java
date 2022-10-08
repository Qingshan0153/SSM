package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mendax
 * @date 2022-10-05 13:33
 * 查询所有员工信息 /employee -> get
 * 查询员工分页信息 /employee/page/1 -> get
 * 根据id查询员工信息 /employee/1 -> get
 * 跳转至添加页面 /to/add -> get
 * 添加员工信息 /employee -> post
 * 修改员工信息 /employee -> put
 * 删除员工信息 /employee/1-> delete
 **/

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee/page/{pageNum}")
    public String getPageEmployee(@PathVariable("pageNum") Integer pageNum, Model model) {

        // 查询员工分页信息
        PageInfo<Employee> page = employeeService.getPageEmployee(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }


    /**
     * 查询所有员工信息
     *
     * @param model 模式对象
     * @return 转发页面
     */
    @GetMapping("/employee")
    public String getAllEmployee(Model model) {

        // 查询所有员工信息
        List<Employee> employees = employeeService.getAllEmployee();
        // 域数据共享
        model.addAttribute("employees", employees);
        return "employee_list";
    }

}



















