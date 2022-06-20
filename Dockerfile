FROM openjdk:11
EXPOSE 8081
ADD target/integration-git-cicd-jenkins-docker.jar integration-git-cicd-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/integration-git-cicd-jenkins-docker.jar"]