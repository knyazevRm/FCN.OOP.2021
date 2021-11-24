@echo off

set CD=%~dp0
set mainPath=%CD%src/ru/vsu/cs/knyazev/roman
set logPath=%CD%lib\logback

set use=-d bin %mainPath%\use\*.java
set service=-d bin %mainPath%\service\*.java
set models=-d bin %mainPath%\models\*.java

javac --module-path %logPath% --add-modules ALL-MODULE-PATH %use% %service% %models%