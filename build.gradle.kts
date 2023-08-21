plugins {
    id("org.springframework.boot") version "2.7.0" apply false
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
}

description = "Springdoc demo for issue #120"
group = "io.cloudflight.springdoc.demo"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")

    dependencies {
        implementation(platform(rootProject.libs.cloudflight.platform.spring.bom))
        annotationProcessor(platform(rootProject.libs.cloudflight.platform.spring.bom))
        testImplementation(platform(rootProject.libs.cloudflight.platform.spring.test.bom))
    }
}
