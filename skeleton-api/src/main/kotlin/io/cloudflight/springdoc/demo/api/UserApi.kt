package io.cloudflight.springdoc.demo.api

import io.cloudflight.springdoc.demo.api.dto.CurrentUserDto
import org.springframework.web.bind.annotation.GetMapping

interface UserApi {

    @GetMapping("$CONTEXT_PATH/user")
    fun getCurrentUser(): CurrentUserDto

    companion object {
        private const val CONTEXT_PATH = "/api"
    }
}
