package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    public List<Company> retrieveCompanyByNameContaining(final CompanyDao companyDao, final String searchPhrase) {
        return companyDao.retrieveCompanyByNameContaining("%"+searchPhrase+"%");
    }

    public List<Employee> retrieveEmployeesWithSurnameContaining(final EmployeeDao employeeDao, final String searchPhrase) {
        return employeeDao.retrieveEmployeeWithSurnameContaining("%"+searchPhrase+"%");
    }
}
