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
           enchant \
           gstreamer \
           icu \
           jpeg \
           pango \
           libpng \
           sqlite3 \
           libtool \
           libxslt \
           libxt \
           libxtst \
           gnutls \
"

inherit autotools

SRC_URI = "git://git.webkit.org/WebKit.git;protocol=git;branch=master"
#SRC_URI = "git://git.webkit.org/WebKit.git"
SRCREV = "33f90bcbc485f60792dbbc54f63fc59ab6ac72c8"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

S = "${WORKDIR}/git"
