#!/bin/bash

JAVA_CMD=java
APP_NAME=sbweb-base-1.0.1.jar
APP_LOCATION=./$APP_NAME

echo 'running app: '$APP_LOCATION
$JAVA_CMD -jar $APP_LOCATION
