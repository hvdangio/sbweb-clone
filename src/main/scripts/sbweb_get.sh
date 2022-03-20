#!/bin/bash

APP_NAME=${1:-"sbweb-base-1.0.2.jar"}
USR_NAME=hvdangdev
USR_DOPS=devops

img_src=/home/${USR_NAME}/Downloads/${APP_NAME}
img_des=/home/${USR_DOPS}/build/${APP_NAME}

mkdir -p /home/${USR_DOPS}/build/
sudo cp $img_src $img_des \
  && sudo chown ${USR_DOPS}:${USR_DOPS} $img_des \
  && sudo chmod 755 $img_des
