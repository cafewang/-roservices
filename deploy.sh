docker build -t customer-service:v1 ./customer/bootstrap
kind create cluster --config=cluster.yaml
kind load docker-image customer-service:v1 --name cluster
kubectl delete -f deploy.yaml
kubectl apply -f deploy.yaml
