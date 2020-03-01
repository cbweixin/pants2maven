
[![catalyst](https://user-images.githubusercontent.com/54647133/74073665-08e51200-49c0-11ea-873d-27a96d1c48fa.png)](http://fvcproductions.com)


# BUILD2pom

> extract dependencies from pants BUILD file and write to pom file


![build1](https://user-images.githubusercontent.com/1326906/75621422-000fd800-5b49-11ea-8c7e-4c83dfc408fb.gif)

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
### quick start


---

## Features
Based on ops, now when we on-boarding module through scaffold, we don't need `apps`, `module` , `mesh` related manifest
files any more.
### for `service` module, we just need 
- manifest files in `service` folder
- `services.yaml`
- manifest files in `infra` folder if the module need infra resources
- `infras.yaml` if module need infra resources
- `images.yaml`

### for `worker` module, we just need 
- manifest files in `worker` folder
- `workers.yaml`
- manifest files in `infra` folder if the module need infra resources
- `infras.yaml` if module need infra resources
- `images.yaml`

catalyst would generate yaml skeleton for those needed files.
you need to set up your `module-config.yaml` file by passing in `module name`, `module title` etc.
please refer to the pic below:

![module_2](https://user-images.githubusercontent.com/54647133/75312705-9ec9cb00-580f-11ea-8057-ad142b8e2120.jpg)

## Usage
after you installed catalyst, you should follow steps listed below:
1. config your `module-config.yaml` file
2. run the tool by `./catalyst` or `make run`

![catalyst3](https://user-images.githubusercontent.com/54647133/74571036-253dfd00-4f32-11ea-8a75-af17b0b75801.gif)


## Documentation
### overview
`module-config.yaml` is the file where you could put your module configurations. you could specify `module name
`, `module namespace` etc. here is an example:
### structure and syntax
The schema of an `module-config.yaml` is given as follows:
```yaml
scaffold_path: /Users/xinwei/Documents/tinder/github/scaffold

module:
  name: tindertemplatetestservice
  title: TinderTemplateTestService
  namespace: templatetest
  owner: backend-infra
  repo: palo
  type: service
  language: java

infra:
  - test-dynatable
  - dynamostreamtestworker-dynatable
  - test-s3bucket
  - test-sqsq

```
The specifics of each field are:
- `scaffold_path`, must have, **absolute path** of your local scaffold repo, for ex,`/Users/xinwei/Documents/tinder
/github/scaffold`.
- `module`, must have
    - 'name', must have, the name of your module,for ex, `usersnapsdynamostreamworker`, `usergatewayservicegrpc`, etc.
    - 'title', must have,your module title,usually follown the camel-case of module name, for ex
    ,`UserSnapsDynamoStreamWorker`.
    - `namespace`, must have, your module namespace, for ex,`externaldatadynamostreamworker`, `apimessages`, etc
    - `owner`, must have,your module owner,for ex, `backend-infra`, `operations` etc
    - `repo`, must have, your module repo, for ex, api.go.tinder.com, palo, fireflow etc. check your `module` folder inside scaffold repo
    - `type`, must have, `service` or `worker`
    - `language`, must have, `java`, `python`, `ruby`, `node`, `go`.
 - `infra`, optional, infra related parameters, if you module need infra resources, please listed here. the entry
  should follow a pattern of `name-type` pattern, for ex, `test-dynatable`, `test-s3bucket` etc


## Tests (Optional)
if you want to run the unit test, you need to install `pytest` libraries. `pytest` would be only availabe
for `dev` env, so the previous installation would **not** install this module by default.
```shell script
pipenv install --dev pytest
```
after installation, you can run the test :
```shell script
make test
```
![make test](https://user-images.githubusercontent.com/54647133/74199042-e816f980-4c17-11ea-80ad-f4fcc01cb69b.gif)

---

## Contributing


- **you can contribute** 🔨🔨🔨


---

## Team
**backend-infra**


---

## FAQ

---

## Support


---

