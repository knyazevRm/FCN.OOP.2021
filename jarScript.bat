@echo off

set CD=%~dp0
set mainPath=ru/vsu/cs/knyazev/roman
set binPath=%CD%bin

set use=%mainPath%\use\*.class
set service=%mainPath%\service\*.class
set models=%mainPath%\models\*.class

cd %binPath%
jar cvfe ../Chat.jar ru.vsu.cs.knyazev.roman.use.Use %use% %service% %models%