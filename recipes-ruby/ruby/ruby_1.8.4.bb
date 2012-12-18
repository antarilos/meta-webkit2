DESCRIPTION = "Ruby"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=50c40ebe8a312b270356189ca1b36d51"

PR = "r0"

inherit autotools

SRC_URI = "ftp://ftp.ruby-lang.org/pub/ruby/1.8/ruby-${PV}.tar.gz"
SRC_URI[md5sum] = "bd8c2e593e1fa4b01fd98eaf016329bb"
SRC_URI[sha256sum] = "71432841b3965b7ab2d83f0dc7c3049195ea4e9267a8dc2d825a8a0466982930"

