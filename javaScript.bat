@echo off

set CD=%~dp0

java --module-path %logPath% --add-modules ALL-MODULE-PATH -jar %CD%Chat.jar