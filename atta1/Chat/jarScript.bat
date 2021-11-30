@echo off

set CD=%~dp0
set mainPath=ru\vsu\cs\knyazev\roman
set binPath=%CD%bin

set use=%mainPath%\*.class
set service=%mainPath%\entity\console\*.class
set models=%mainPath%\entity\listUsers\*.class
set contact=%mainPath%\entity\user\contact\*.class
set interest=%mainPath%\entity\user\interest\*.class
set photo=%mainPath%\entity\user\photo\*.class
set profile=%mainPath%\entity\user\profile\*.class
set user=%mainPath%\entity\user\*.class
set utils=%mainPath%\utils\*.class

cd %binPath%
jar cvfe ../Chat.jar ru.vsu.cs.knyazev.roman.Main %use% %service% %models% %contact% %interest% %photo% %profile% %user% %utils%