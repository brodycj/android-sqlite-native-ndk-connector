
all: javabuild

javabuild:
	rm -rf build
	mkdir build
	javac -source 1.6 -target 1.6 -Xlint:-options -d build src/io/liteglue/*.java
	cd build && jar cf ../sqlite-native-ndk-connector.jar *

clean:
	rm -rf build *.jar

