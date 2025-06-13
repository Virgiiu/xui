@echo off
set DIR=%~dp0
set APP_BASE_NAME=%~n0
... (сокращено)
java %JAVA_OPTS% %GRADLE_OPTS% -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
