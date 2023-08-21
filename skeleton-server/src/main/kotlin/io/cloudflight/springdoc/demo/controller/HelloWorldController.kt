package io.cloudflight.springdoc.demo.controller

import io.cloudflight.springdoc.demo.api.HelloWorldApi
import io.cloudflight.springdoc.demo.api.dto.OutputGreeting
import io.cloudflight.springdoc.demo.security.service.SecurityService
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    private val securityService: SecurityService
) : HelloWorldApi {

    override fun getHello(): OutputGreeting {
        return OutputGreeting("Hello ;)", "Pleasure to meet you!")
    }

    override fun getHelloAdmin(name: String): OutputGreeting {
        securityService.assertAdminAccess()
        return OutputGreeting("Hello $name ;)", "Pleasure to meet you $name!")
    }
}
