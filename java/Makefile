default: img.svg
	@echo "view your image at: file://"`pwd`"/img.svg"

img.svg: Wow.java
	mkdir -p out
	javac -d ./out Wow.java
	java -cp ./out  hrj.interwow.Wow	> img.svg

clean:
	rm Wow.class

