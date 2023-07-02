#Hints

* The following steps need to be done before compiling the spring app natively
  * Install Docker Desktop App: `https://www.docker.com/products/docker-desktop/`
  * Install and setup zulu-17 jdk `https://www.azul.com/downloads/?package=jdk#zulu` (Note: It has to be JDK 17)
* run command `mvn -DbuilderImage=dashaun/java-native-builder-arm64 -am -Pnative spring-boot:build-image`
* run command `mvn -DbuilderImage=dashaun/java-native-builder-arm64 -pl client -am -Pnative spring-boot:build-image` for a submodule