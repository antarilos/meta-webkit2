DESCRIPTION = "Ruby"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=837b32593517ae48b9c3b5c87a5d288c"

PR = "r0"
S = "${WORKDIR}/ruby-1.9.3-p327"

inherit autotools

SRC_URI = "ftp://ftp.ruby-lang.org/pub/ruby/1.9/ruby-1.9.3-p327.tar.bz2"
SRC_URI[md5sum] = "7d602aba93f31ceef32800999855fbca"
SRC_URI[sha256sum] = "d989465242f9b11a8a3aa8cbd2c75a9b3a8c0ec2f14a087a0c7b51abf164e488"

