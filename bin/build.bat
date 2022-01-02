@echo off

set /P version="DoomsdayMod Version: "
cd ..
cmd /k bin\gradlew.bat -PprojVersion=%version% copy_test