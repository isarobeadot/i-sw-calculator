#!/bin/sh

version=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)

rm -f target/calculator-$version.jar
rm -rf target/archive-tmp
rm -rf target/classes
rm -rf target/generated-sources
rm -rf target/generated-test-sources
rm -rf target/maven-archiver
rm -rf target/maven-status
rm -rf target/test-classes

jpackage --input target/ \
    --name "I-SW Calculator" \
    --main-jar calculator-$version-jar-with-dependencies.jar \
    --main-class inaki.sw.calc.Calculator \
    --app-version $version \
    --icon src/main/resources/inaki/sw/calc/icon/isw-calc-512.png \
    --description "Basic calculator, available for Windows, Linux and Android" \
    --linux-package-name isw-calculator \
    --linux-menu-group Utility \
    --type deb