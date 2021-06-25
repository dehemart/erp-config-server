#erp-config-server

Server properties and configurations to erp

##Development
###Environment

Setting environment's variables: ex...
```
PORT = 8888 
PROPERTIES_URI = https://github.com/owner/repository}
```

##Devops
###Build docker image
```
$ docker build --build-arg JAR_FILE=target/*.jar -t dehemart/erp-config-server:latest -t dehemart/erp-config-server:0.0.1 .
```
###Run docker-compose
```
$ docker-compose up -d
```