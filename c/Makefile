CFLAGS= --std=c99

default: img.svg
	@echo "view your image at: file://"`pwd`"/img.svg"

img.svg: wow
	./wow > img.svg

wow : wow.o


clean:
	rm wow wow.o
