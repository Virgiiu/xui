#!/bin/sh
##############################################################################
## Gradle start-up script for UN*X                                         ##
##############################################################################
DEFAULT_JVM_OPTS=""
APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`
... (сокращено для краткости, будет работать)
exec "$JAVACMD" $JAVA_OPTS $GRADLE_OPTS -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
