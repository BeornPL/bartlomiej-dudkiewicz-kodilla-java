package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.annotations.NamedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@NamedQuery(
        name = "Facade.retrieveCompanyByName",
        query = "FROM Company WHERE name LIKE :ARG"
)

@NamedQuery(
        name = "Facade.retrieveEmployeeWithSurname",
        query = "FROM Employee WHERE lastname LIKE :ARG"
)

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public void searchCompanyByName(String searchPhrase) {
        LOGGER.info("Searching Companies by name containing: " + searchPhrase);
        companyDao.retrieveCompanyByName("%"+searchPhrase+"%");
    }

    public void searchEmployeeByLastname(String searchPhrase) {
        LOGGER.info("Searching Employess with " + searchPhrase);
        employeeDao
    }

}
