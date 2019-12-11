# chmod -R 777 cmd

# ./cmd/redis.sh

# netstat -tunlp | grep redis
# kill -9 80


redis-server /opt/redis/conf/redis-master_6400.conf;
redis-server /opt/redis/conf/redis-slave1_6401.conf;
redis-server /opt/redis/conf/redis-slave2_6402.conf;

redis-sentinel /opt/redis/conf/sentinel-master_26400.conf;
redis-sentinel /opt/redis/conf/sentinel-slave1_26401.conf;
redis-sentinel /opt/redis/conf/sentinel-slave2_26402.conf;



# /usr/local/bin/redis-cli -h 127.0.0.1 -p 6501 -a 1234 --cluster create 127.0.0.1:6501 127.0.0.1:6502 127.0.0.1:6503 127.0.0.1:6504 127.0.0.1:6505 127.0.0.1:6506 --cluster-replicas 1
# /usr/local/bin/redis-cli -c -h 127.0.0.1 -p 6501 -a 1234


redis-server /opt/redis/conf/redis_6501.conf;
redis-server /opt/redis/conf/redis_6502.conf;
redis-server /opt/redis/conf/redis_6503.conf;
redis-server /opt/redis/conf/redis_6504.conf;
redis-server /opt/redis/conf/redis_6505.conf;
redis-server /opt/redis/conf/redis_6506.conf;
