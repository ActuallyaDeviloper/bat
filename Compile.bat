cmd /C "..\Gradle\bin\Gradle.bat" shadowJar
copy build\libs\bat-velocity.jar ..\Velocity\plugins\bat-velocity.jar
pause