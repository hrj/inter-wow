CFLAGS= --std=c99

default: img.svg
	@echo "view your image at: file://"`pwd`"/img.svg"

img.svg: wow.scala
	scala wow.scala > img.svg

