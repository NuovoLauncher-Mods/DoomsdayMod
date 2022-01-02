
echo -n "DoomsdayMod Version: "; read version
cd ..
./gradlew -PprojVersion=$version copy