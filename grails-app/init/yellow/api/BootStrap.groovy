package yellow.api

import grails.util.Environment
import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {
    UserDataService userDataService

    def init = { servletContext ->
        // if (Environment.current == Environment.DEVELOPMENT) {
        //     final String username = 'developer-sid'
        //     final String password = 'de11#Lap'
        //     User user = userDataService.save(username, password, true, false, false, false, )
        // }
    }
    def destroy = {
    }
}
