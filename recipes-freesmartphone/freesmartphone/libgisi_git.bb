DESCRIPTION = "libgisi / gisicomm is a library implementing the Nokia ISI protocol"
SECTION = "libs/network"
AUTHOR = "Sebastian Reichel, Michael Lauer, Klaus Kurzmann"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "glib-2.0"
SRC_URI = "${FREESMARTPHONE_GIT}/libgisi.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

SRCREV = "af74507992ecbaa46583503cb7e3497e7975ad69"
PV = "0.1.0+gitr${SRCPV}"

inherit vala autotools

PACKAGES =+ "${PN}-tools"
FILES_${PN}-tools = "${sbindir}/sendisi"
