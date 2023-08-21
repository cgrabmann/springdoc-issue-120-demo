package io.cloudflight.springdoc.demo.security.service

import io.cloudflight.springdoc.demo.security.model.CurrentUser

interface SecurityService {
    val currentUser: CurrentUser

    fun assertAdminAccess()

    fun getUserName(): String
}
