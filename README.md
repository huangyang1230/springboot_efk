# 制作包含es插件的fluentd镜像
```shell
cd docker-compose 
docker build -t fluentd_es:v1 . 
```

# 运行efk容器
```shell
cd docker-compose 
docker-compose up -d
#查看fluentd日志
docker-compose logs -f fluentd
```

# 访问Kibana
http://localhost:5601/
账号密码在脚本中

# 详情查看CSDN
https://blog.csdn.net/qq_25416531/article/details/133961415

