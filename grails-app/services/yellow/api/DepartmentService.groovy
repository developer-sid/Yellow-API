package yellow.api

import grails.gorm.transactions.Transactional

@Transactional
class DepartmentService {

    def list(def params, def request) 
    {
        return Department.findAll()
    }

    def save(def params, def request) 
    {    
        def dept = new Department(request.JSON)
        if (dept.validate()) 
        {
            dept.save()
            return dept.id
        }
        else 
        {
            return false
        }
    }
}
