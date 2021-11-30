@echo off

set CD=%~dp0
set mainPath=%CD%src\ru\vsu\cs\knyazev\roman
set logPath=%CD%lib\logback

set use=-d bin %mainPath%\*.java
set service=-d bin %mainPath%\entity\console\*.java
set models=-d bin %mainPath%\entity\listUsers\*.java
set contact=-d bin %mainPath%\entity\user\contact\*.java
set interest=-d bin %mainPath%\entity\user\interest\*.java
set photo=-d bin %mainPath%\entity\user\photo\*.java
set profile=-d bin %mainPath%\entity\user\profile\*.java
set user=-d bin %mainPath%\entity\user\*.java
set utils=-d bin %mainPath%\utils\*.java

javac --module-path %logPath% --add-modules ALL-MODULE-PATH %use% %service% %models% %contact% %interest% %photo% %profile% %user% %utils%