package io.cloudflight.springdoc.demo.controller

import io.cloudflight.springdoc.demo.api.UserApi
import io.cloudflight.springdoc.demo.api.dto.CurrentUserDto
import io.cloudflight.springdoc.demo.security.service.SecurityService
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val securityService: SecurityService
) : UserApi {

    override fun getCurrentUser(): CurrentUserDto {
        return securityService.currentUser.let {
            CurrentUserDto(userName = it.userName, name = "${it.firstName} ${it.lastName}")
        }
    }
}
