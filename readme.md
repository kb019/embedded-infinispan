# Infinispan Embedded Mode with Spring Boot - Cluster Configuration

This project demonstrates setting up **Infinispan in embedded mode** with **Spring Boot** in a **cluster configuration**. It uses **JGroups for cluster discovery** and takes the **cache configuration from a `config.xml` file**. The application is containerized for deployment in a Kubernetes cluster.

---

## Features
- **Embedded Infinispan**: Configure Infinispan in embedded mode for caching and distributed data management.
- **JGroups Cluster Discovery**: Leverage JGroups for seamless discovery and communication between cluster nodes.
- **XML-Based Configuration**: Cache configuration is loaded from an external `infinispan.xml` file for flexibility.
- **Spring Boot Integration**: Simplify application setup with Spring Boot.
- **Kubernetes-Ready**: Easily deploy and scale the application in a Kubernetes cluster.

---

## Prerequisites
### Tools
1. **Docker**: Installed on your local machine.
2. **Kubernetes**: Access to a Kubernetes cluster (e.g., Minikube, AKS, EKS, GKE).
3. **kubectl CLI**: Configured to interact with your Kubernetes cluster.

### Java
- **JDK 17** or higher installed on your local machine.
- **Maven** for building the project.

---

## Configuration Details

### JGroups Cluster Discovery
- The application uses **JGroups** to enable automatic node discovery and communication within the cluster.
- Ensure the Kubernetes network policies allow inter-pod communication for clustering.

### Cache Configuration
- Cache definitions and settings are provided in the `infinispan.xml` file located in the project resources.
- Modify the `infinispan.xml` to customize cache names, eviction policies, expiration, and other settings.
- For cluster discovery `KUBE_PING` and `TCP_PING` also configured

---

## How to Run

### 1. Build the Project
Compile the project and package it into a JAR file using Maven:
```bash
mvn clean package

docker build -t infinispan-embedded .

kubectl delete all --all -n infinispan

kubectl apply -f . -n infinispan
