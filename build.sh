export BB_ENV_PASSTHROUGH_ADDITIONS="DL_DIR SSTATE_DIR"
export DL_DIR="${HOME}/yocto/downloads"
export SSTATE_DIR="${HOME}/yocto/sstate-cache"

#source
source oe-init-build-env

#Baking


bitbake core-image-base

#sudo bmaptool copy --bmap build/tmp/deploy/images/raspberrypi3/core-image-base-raspberrypi3.rootfs.wic.bmap build/tmp/deploy/images/raspberrypi3/core-image-base-raspberrypi3.rootfs.wic /dev/sdb
