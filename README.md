
# BUILD2pom

> extract dependencies from pants BUILD file and write to pom file

![build2pom](https://user-images.githubusercontent.com/1326906/76693472-e3809f00-6622-11ea-9021-dc2a30c5b875.gif)


![build2](https://github.com/cbweixin/pants2maven/workflows/BUILD2pom/badge.svg)
---

## Table of Contents 

- [Installation](#installation)
- [Features](#features)
- [Usage](#usage)
- [How to convert pom.xml to build.gradle](#how-to-convert-pom.xml-to-build.gradl)
- [Tests](#tests-optional)
- [Contributing](#contributing)
- [Team](#team)
- [FAQ](#faq)
- [Support](#support)




---

## Installation
### executable jar
you can downlaod jar file directly from the [releases](https://github.com/cbweixin/pants2maven/releases) page

### build
- clone repo
- cd build2pom
- mvn clean package

the built jar `build2pom-1.0-jar-with-dependencies.jar` would be in `target` folder

---

## Features
1. it would check if you specify `3rdparty` jvm library path or not
2. it would check if you current directory has `BUILD` file or not
3. for dependency which starts with `3rdparty`,such as `'3rdparty/jvm/com/google/guava'`,it would go to `3rdparty` folder and fetch this artifact, if `guava` has other dependencies , it would recursively fetch, and write all of them to pom.
4. for dependency which is other module, such as `backend/src/java/com/xyz/backend/shared/common`,I simply process this path, make `com.xyz.backend.shared` as `groupId`, `common` as `artifactId` 
5. for any `scala_jar`, I add `_scala_2.11` to its `groupId`


## Usage
1. go to folder where contains `BUILD` which you want to convert, for ex, `cd ~/Desktop`.
2. assume your pant's `3rdparty` libraries at `~/Desktop` folder
2. run command `java -jar ~/Downloads/build2pom-1.0-jar-with-dependencies.jar ~/Desktop`, please specify the correct file path for the jar.
3. `pom.xml` would be generated as well the pom.xml also whould be shown on your console

## Known issue
in your `BUILD` file, you should only have one `java_library`, otherwise, it would report error. if you have mulitple, please comment out all `java_library` which you don't need, then run the command. 

## How to convert pom.xml to build.gradle
gradle support convert pom.xml to build.gradle. just do `gradle init --type pom` 

## Tests (Optional)
---

## Contributing


- **you can contribute** 🔨🔨🔨


---

## Team


---

## FAQ

---

## Support


---

