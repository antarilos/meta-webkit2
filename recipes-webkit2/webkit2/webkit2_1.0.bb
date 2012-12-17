DESCRIPTION = "WebKitGTK+ 2 browser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://Source/WebKit/LICENSE;md5=4646f90082c40bcf298c285f8bab0b12"

PR = "r1"

DEPENDS = "\
           automake \
           bison \
           flex \
           gtk+3 \
           gawk \
           gnome-common \
           gettext \
           gperf \
           ruby \
           gtk-doc \
           enchant-dev \
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

inherit autotools

SRC_URI = "git://git.webkit.org/WebKit.git;protocol=git;branch=master"
#SRC_URI = "git://git.webkit.org/WebKit.git"
SRCREV = "33f90bcbc485f60792dbbc54f63fc59ab6ac72c8"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git"

do_configure() {
        
}

do_compile() {
        
}

do_install() {
        
}

