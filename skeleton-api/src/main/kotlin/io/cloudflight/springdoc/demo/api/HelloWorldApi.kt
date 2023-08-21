package io.cloudflight.springdoc.demo.api

import io.cloudflight.springdoc.demo.api.dto.OutputGreeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

interface HelloWorldApi {

    @GetMapping("$CONTEXT_PATH/hello")
    fun getHello(): OutputGreeting

    @GetMapping("$CONTEXT_PATH/hello-admin")
    fun getHelloAdmin(@RequestParam() name: String): OutputGreeting

    companion object {
        private const val CONTEXT_PATH = "/api"
    }

}
