package yellow.api

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.userdetails.GrailsUser

@Secured('isAuthenticated()')
class DepartmentController extends RestfulController 
{
	def departmentService
    static responseFormats = ['json', 'xml']
    SpringSecurityService springSecurityService

    DepartmentController() 
    {
        super(Department)
    }	
    
    def index() 
    {
        respond departmentService.list(params,request)
    }

    def save() 
    {       
        def resp = [] 
        def id = departmentService.save(params, request)             
        if (id)
        {
            resp = ["id": id]
        }
        else
        {
            resp = ["error": "validation failed"]
        }
        respond resp        
    }
}
