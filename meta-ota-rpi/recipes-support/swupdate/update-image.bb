DESCRIPTION = "SWUpdate bundle for Raspberry Pi 3"
LICENSE = "CLOSED"

inherit swupdate

SRC_URI += "file://sw-description"

# Reference the image recipe name, not the full file path
SWUPDATE_IMAGES = "core-image-base"

# Tell Yocto which built artifact to package into the .swu
SWUPDATE_IMAGES_FSTYPES[core-image-base] = ".ext4"

# Map the recipe to the exact artifact name (with machine suffix)
SWUPDATE_IMAGES_FSTYPES[core-image-base] = "-${MACHINE}.rootfs.ext4"
SWUPDATE_HW_COMPAT = "a02082"