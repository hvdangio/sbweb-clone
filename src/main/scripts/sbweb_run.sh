#!/bin/bash

#ln -s ~/build/sbweb-base-1.0.1.jar ~/apps/sbweb-base/sbweb-base.jar
java -Dfile.encouding=UTF-8 \
   -Dspring.config.additional-location="file:$HOME/apps/sbweb-base/" \
   -jar ~/apps/sbweb-base/sbweb-base.jar
