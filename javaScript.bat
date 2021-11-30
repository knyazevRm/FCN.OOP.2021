@echo off

set CD=%~dp0
set logPath=%CD%lib\logback

java --module-path %logPath% --add-modules ALL-MODULE-PATH -jar %CD%Chat.jar