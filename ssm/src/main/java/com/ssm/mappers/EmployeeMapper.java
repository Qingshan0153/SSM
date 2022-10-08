package com.ssm.mappers;

import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Employee;

import java.util.List;

/**
 * @author Mendax
 * @date 2022-10-05 17:15
 **/
public interface EmployeeMapper {

    /**
     * 获取所有用户
     *
     * @return 用户集合
     */
    List<Employee> getAllEmployee();

}
