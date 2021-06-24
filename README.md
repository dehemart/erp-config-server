#erp-config-server

Server properties and configurations to erp

##Devops
###Build docker image
```
$ docker build --build-arg JAR_FILE=target/*.jar -t dehemart/erp-config-server:latest -t dehemart/erp-config-server:0.0.1 .