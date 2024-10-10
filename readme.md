Infinispan embedded mode with spring-boot in cluster configuration 

docker build -t infinispan-embedded .

kubectl delete all --all -n infinispan

kubectl apply -f . -n infinispan
