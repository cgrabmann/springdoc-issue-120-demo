plugins {
    id("maven-publish")
    id("org.springframework.boot")
    id("org.springdoc.openapi-gradle-plugin") version "1.7.0"
}

group = "io.cloudflight.springdoc.demo"

java {
    withJavadocJar()
}

dependencies {
    implementation(project(":skeleton-api"))

    implementation("io.cloudflight.platform.spring:platform-spring-i18n")
    implementation("io.cloudflight.platform.spring:platform-spring-logging")
    implementation("io.cloudflight.platform.spring:platform-spring-json")
    implementation("io.cloudflight.platform.spring:platform-spring-server-config")
    testImplementation("io.cloudflight.platform.spring:platform-spring-test")
    testImplementation("io.cloudflight.platform.spring:platform-spring-test-archunit")

    implementation("org.springframework.boot:spring-boot-actuator")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation(libs.springdoc.openapi.starter.webmvc.api)
}

openApi {
    outputDir.set(layout.buildDirectory.dir("openapi"))
    outputFileName.set("custom-openapi.json")
}

springBoot {
    mainClass.set("io.cloudflight.springdoc.demo.ApplicationKt")
}

tasks.build {
    dependsOn("generateOpenApiDocs")
}
