@echo off
cls
echo input file %1
echo Compilation...

java -jar lib\GraphLang.jar %1
if not exist GraphLangProgram.java goto end
cls
echo input file %1
echo Compilation... done
javac -cp lib\GraphLib.jar GraphLangProgram.java

if not exist GraphLangProgram.class goto end

echo Compilation %~n1.jar file...
jar cfm %~n1.jar lib\manifest.txt GraphLangProgram.class lib\GraphLib.jar
cls
echo input file %1
echo Compilation... done
echo Compilation %~n1.jar file... done

del GraphLangProgram.java
del GraphLangProgram.class

echo.
SET /p "O=run %~n1.jar? (y/n)"


IF "%O%"=="y" goto run_jar
IF "%O%"=="Y" goto run_jar
IF "%O%"=="n" goto end
IF "%O%"=="" goto end

: run_jar
echo.
echo ===run program===
echo.
java -jar %~n1.jar
echo.
echo ===end program===
echo.

: end