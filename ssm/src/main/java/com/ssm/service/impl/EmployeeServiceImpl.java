package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.mappers.EmployeeMapper;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mendax
 * @date 2022-10-05 16:54
 **/
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getPageEmployee(Integer pageNum) {
        // 开启分页功能
        PageHelper.startPage(pageNum, 5);
        List<Employee> employees = employeeMapper.getAllEmployee();
        // 获取分页相关信息
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 5);
        return pageInfo;
    }
}
