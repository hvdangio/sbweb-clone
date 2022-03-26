#!/bin/bash

#ln -s ~/build/sbweb-clone-1.0.1.jar ~/apps/sbweb-clone/sbweb-clone.jar
java -Dfile.encouding=UTF-8 \
   -Dspring.config.additional-location="file:$HOME/apps/sbweb-clone/" \
   -jar ~/apps/sbweb-clone/sbweb-clone.jar
