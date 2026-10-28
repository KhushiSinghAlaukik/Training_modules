# Windows run fix

If `.\mvnw.cmd spring-boot:run` fails with `Rename-Item ... Access is denied`, this can be a Windows temporary-folder / Maven Wrapper issue.

## Try this first
Close any terminal currently running the wrapper. Open a NEW PowerShell terminal in this project folder, then run:

```powershell
$env:MAVEN_USER_HOME = "$env:USERPROFILE\.maven"
New-Item -ItemType Directory -Force "$env:MAVEN_USER_HOME\wrapper\dists" | Out-Null
.\mvnw.cmd spring-boot:run
```

If the same wrapper error persists, use the manual Maven option below.

## Manual Maven option
1. Download the current Maven binary ZIP from the official Apache Maven site: https://maven.apache.org/download.cgi
2. Extract it to a simple folder, for example `C:\Tools\apache-maven`.
3. In PowerShell, set Maven for this terminal session (adjust the path if needed):

```powershell
$env:Path = "C:\Tools\apache-maven\bin;" + $env:Path
mvn -version
mvn spring-boot:run
```

If `mvn -version` prints a Maven version, run the second command from the project folder that contains `pom.xml`.

## Important
Do not run `javac EmployeeApplication.java`; that skips Maven dependencies, so Spring Boot imports cannot be found.
