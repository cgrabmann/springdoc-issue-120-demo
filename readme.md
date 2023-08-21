# springdoc-demo

This project was created to demonstrate [this bug](https://github.com/springdoc/springdoc-openapi-gradle-plugin/issues/120).

To see the problem just run `gradlew build`

This results in the following error output:

```
FAILURE: Build failed with an exception.

* What went wrong:
Some problems were found with the configuration of task ':skeleton-server:forkedSpringBootRun' (type 'JavaExecFork').
  - Gradle detected a problem with the following location: 'C:\cloudflight\src\cloudflight\springdocs-demo\skeleton-server'.

    Reason: Task ':skeleton-server:forkedSpringBootRun' uses this output of task ':skeleton-server:bootJarMainClassName' without declaring an explicit or implicit dependency. This can lead to incorrect results being produced, depending on what order the tasks are executed.

    Possible solutions:
      1. Declare task ':skeleton-server:bootJarMainClassName' as an input of ':skeleton-server:forkedSpringBootRun'.
      2. Declare an explicit dependency on ':skeleton-server:bootJarMainClassName' from ':skeleton-server:forkedSpringBootRun' using Task#dependsOn.
      3. Declare an explicit dependency on ':skeleton-server:bootJarMainClassName' from ':skeleton-server:forkedSpringBootRun' using Task#mustRunAfter.

    Please refer to https://docs.gradle.org/8.1.1/userguide/validation_problems.html#implicit_dependency for more details about this problem.
  - Gradle detected a problem with the following location: 'C:\cloudflight\src\cloudflight\springdocs-demo\skeleton-server'.

    Reason: Task ':skeleton-server:forkedSpringBootRun' uses this output of task ':skeleton-server:compileTestJava' without declaring an explicit or implicit dependency. This can lead to incorrect results being produced, depending on what order the tasks are executed.

    Possible solutions:
      1. Declare task ':skeleton-server:compileTestJava' as an input of ':skeleton-server:forkedSpringBootRun'.
      2. Declare an explicit dependency on ':skeleton-server:compileTestJava' from ':skeleton-server:forkedSpringBootRun' using Task#dependsOn.
      3. Declare an explicit dependency on ':skeleton-server:compileTestJava' from ':skeleton-server:forkedSpringBootRun' using Task#mustRunAfter.

    Please refer to https://docs.gradle.org/8.1.1/userguide/validation_problems.html#implicit_dependency for more details about this problem.
  - Gradle detected a problem with the following location: 'C:\cloudflight\src\cloudflight\springdocs-demo\skeleton-server'.

    Reason: Task ':skeleton-server:forkedSpringBootRun' uses this output of task ':skeleton-server:compileTestKotlin' without declaring an explicit or implicit dependency. This can lead to incorrect results being produced, depending on what order the tasks are executed.

    Possible solutions:
      1. Declare task ':skeleton-server:compileTestKotlin' as an input of ':skeleton-server:forkedSpringBootRun'.
      2. Declare an explicit dependency on ':skeleton-server:compileTestKotlin' from ':skeleton-server:forkedSpringBootRun' using Task#dependsOn.
      3. Declare an explicit dependency on ':skeleton-server:compileTestKotlin' from ':skeleton-server:forkedSpringBootRun' using Task#mustRunAfter.

    Please refer to https://docs.gradle.org/8.1.1/userguide/validation_problems.html#implicit_dependency for more details about this problem.
  - Gradle detected a problem with the following location: 'C:\cloudflight\src\cloudflight\springdocs-demo\skeleton-server'.

    Reason: Task ':skeleton-server:forkedSpringBootRun' uses this output of task ':skeleton-server:javadoc' without declaring an explicit or implicit dependency. This can lead to incorrect results being produced, depending on what order the tasks are executed.

    Possible solutions:
      1. Declare task ':skeleton-server:javadoc' as an input of ':skeleton-server:forkedSpringBootRun'.
      2. Declare an explicit dependency on ':skeleton-server:javadoc' from ':skeleton-server:forkedSpringBootRun' using Task#dependsOn.
      3. Declare an explicit dependency on ':skeleton-server:javadoc' from ':skeleton-server:forkedSpringBootRun' using Task#mustRunAfter.

    Please refer to https://docs.gradle.org/8.1.1/userguide/validation_problems.html#implicit_dependency for more details about this problem.
  - Gradle detected a problem with the following location: 'C:\cloudflight\src\cloudflight\springdocs-demo\skeleton-server'.

    Reason: Task ':skeleton-server:forkedSpringBootRun' uses this output of task ':skeleton-server:javadocJar' without declaring an explicit or implicit dependency. This can lead to incorrect results being produced, depending on what order the tasks are executed.

    Possible solutions:
      1. Declare task ':skeleton-server:javadocJar' as an input of ':skeleton-server:forkedSpringBootRun'.
      2. Declare an explicit dependency on ':skeleton-server:javadocJar' from ':skeleton-server:forkedSpringBootRun' using Task#dependsOn.
      3. Declare an explicit dependency on ':skeleton-server:javadocJar' from ':skeleton-server:forkedSpringBootRun' using Task#mustRunAfter.

    Please refer to https://docs.gradle.org/8.1.1/userguide/validation_problems.html#implicit_dependency for more details about this problem.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 3s
```
