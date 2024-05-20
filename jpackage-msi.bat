@echo off

set /p version=Version: 

del /q target\calculator-%version%.jar
rmdir /s /q target\archive-tmp
rmdir /s /q target\classes
rmdir /s /q target\generated-sources
rmdir /s /q target\generated-test-sources
rmdir /s /q target\maven-archiver
rmdir /s /q target\maven-status
rmdir /s /q target\test-classes

jpackage --input target/ ^
    --name "I-SW Calculator" ^
    --vendor "I-SW - I. Software" ^
    --main-jar calculator-%version%-jar-with-dependencies.jar ^
    --main-class inaki.sw.calc.Calculator ^
    --app-version %version% ^
    --icon src\main\resources\inaki\sw\calc\icon\isw-calc-512.ico ^
    --description "Basic calculator, available for Windows, Linux and Android" ^
	--win-dir-chooser ^
	--win-menu ^
	--win-menu-group I-SW ^
	--win-shortcut ^
	--win-shortcut-prompt ^
    --type msi

pause