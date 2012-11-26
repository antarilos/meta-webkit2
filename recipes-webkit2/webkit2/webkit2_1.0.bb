DESCRIPTION = "WebKitGTK+ 2 browser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://Source/WebKit/LICENSE;md5=4646f90082c40bcf298c285f8bab0b12"

PR = "r1"

DEPENDS = "\
           automake \
           autotools-dev \
           bison \
           flex \
           gail-3.0 \
           gawk \
           gnome-common \
           autopoint \
           gperf \
           ruby \
           gtk-doc-tools \
           libenchant-dev \
           libgail-dev \
           libgail-3-dev \
           libgeoclue-dev \
           libgirepository1.0-dev \
           libgtk-3-dev \
           libgstreamer-plugins-base0.10-dev \
           libgudev-1.0-dev \
           libicu-dev \
           libgl1-mesa-glx \
           libgl1-mesa-dev \
           libjpeg62-dev \
           libpango1.0-dev \
           libpng12-dev \
           libsqlite3-dev \
           libtool \
           libxslt1-dev \
           libxt-dev \
           libxtst-dev \
           libgnutls-dev \
           libsecret-1-dev \
"

SRC_URI = "git://git.webkit.org/WebKit.git;protocol=git;branch=master"
#SRC_URI = "git://git.webkit.org/WebKit.git"
SRCREV = "3ff8da427d2db2c1646e64b5699b27cf2b2e5988"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git"

do_configure() {
        
}

do_compile() {
        
}

do_install() {
        
}

