docker build -t infinispan-embedded .

kubectl delete all --all -n infinispan

kubectl apply -f . -n infinispan