# Infinispan Embedded Mode with Spring Boot - Cluster Configuration

This project demonstrates how to set up **Infinispan in embedded mode** with **Spring Boot** in a **cluster configuration**. The application can be containerized and deployed to a Kubernetes cluster.

---

## Features
- **Embedded Infinispan**: Configure and use Infinispan in embedded mode for caching and distributed data.
- **Spring Boot Integration**: Leverage the simplicity of Spring Boot for application configuration.
- **Cluster Support**: Deploy multiple instances of the application in a Kubernetes cluster to enable high availability.
- **Docker Support**: Easily build and containerize the application using Docker.

---

## Prerequisites
1. Docker installed on your local machine.
2. Access to a Kubernetes cluster (e.g., Minikube, AKS, EKS, GKE).
3. `kubectl` CLI configured to manage the Kubernetes cluster.

---

## Build and Deploy

### 1. Build the Docker Image
To build the Docker image for the application:
```bash
docker build -t infinispan-embedded .

docker build -t infinispan-embedded .

kubectl delete all --all -n infinispan

kubectl apply -f . -n infinispan
