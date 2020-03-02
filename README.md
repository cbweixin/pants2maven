
# BUILD2pom

> extract dependencies from pants BUILD file and write to pom file


![build2](https://github.com/cbweixin/pants2maven/workflows/BUILD2pom/badge.svg)
---

## Table of Contents 

- [Installation](#installation)
- [Features](#features)
- [Usage](#usage)
- [Documentation](#documentation)
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
1. it would check if you current directory has `BUILD` file or not
2. it would check if you are at `palo` repo or not
3. for dependency which starts with `3rdparty`,such as `'3rdparty/jvm/com/google/guava'`,it would go to `3rdparty` folder and fetch this artifact, if `guava` has other dependencies , it would recursively fetch, and write all of them to pom.
4. for dependency which is other module, such as `backend/src/java/com/xyz/backend/shared/common`,I simply process this path, make `com.xyz.backend.shared` as `groupId`, `common` as `artifactId` 
5. for any `scala_jar`, I add `_scala_2.11` to its `groupId`


## Usage
1. go to folder where contains `BUILD` which you want to convert, for ex, `cd palo/backend/src/java/com/xyz/backend/shared/libraries/crm`.
2. run command `java -jar ~/Downloads/build2pom-1.0-jar-with-dependencies.jar`, please specify the correct file path for the jar.
3. `pom.xml` would be generated as well the pom.xml also whould be shown on your console

## Known issue
the generated `pom.xml` could contain duplicate dependencies
for ex, `backend/src/java/com/xyz/backend/shared/common`, the `BUILD` file is like this:
```
java_library(
    name='common',
    dependencies=[
        '3rdparty/jvm/com/google/guava:guava',
        '3rdparty/jvm/com/googlecode/json-simple:json-simple',
        '3rdparty/jvm/io/prometheus:simpleclient',
        '3rdparty/jvm/org/apache/commons:commons-lang3',
        '3rdparty/jvm/org/apache/httpcomponents:httpasyncclient',
        '3rdparty/jvm/org/apache/httpcomponents:httpclient',
        '3rdparty/jvm/org/json4s:jackson',
        '3rdparty/jvm/org/json4s:json4s-datatype-joda',
        'backend/src/java/com/xyz/backend/shared/enums',
        'common/src/java/com/xyz/enums',
    ],
    strict_deps=True,
    sources=globs('*.java'),
)

```
these 2 dependencies:
```
        '3rdparty/jvm/org/apache/httpcomponents:httpasyncclient',
        '3rdparty/jvm/org/apache/httpcomponents:httpclient',

```
they are defined as :
```
jar_library(name='httpclient',
  jars = [
    jar(org='org.apache.httpcomponents', name='httpclient', rev=HTTPCORE_REV)
  ],
  dependencies = [
      '3rdparty/jvm/commons-codec',
      '3rdparty/jvm/commons-logging',
      '3rdparty/jvm/org/apache/httpcomponents:httpcore',
  ]
)
```

and 

```
jar_library(name='httpasyncclient',
  jars = [
    jar(org='org.apache.httpcomponents', name='httpasyncclient', rev='4.1.2')
  ],
  dependencies = [
      '3rdparty/jvm/commons-codec',
      '3rdparty/jvm/commons-logging',
      '3rdparty/jvm/org/apache/httpcomponents:httpcore',
      '3rdparty/jvm/org/apache/httpcomponents:httpclient',
      '3rdparty/jvm/org/apache/httpcomponents:httpcore-nio',
  ]
)
```
those definitions would cause duplication in `pom` file.

I may fix it in future.

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

