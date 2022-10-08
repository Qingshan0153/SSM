package com.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Employee;

import java.util.List;

/**
 * @author Mendax
 * @date 2022-10-05 16:54
 **/
public interface EmployeeService {

    /**
     * 获取所有用户
     *
     * @return 用户集合
     */
    List<Employee> getAllEmployee();

    /**
     * 查询员工分页信息
     *
     * @param pageNum 页码
     * @return page信息
     */
    PageInfo<Employee> getPageEmployee(Integer pageNum);
}
