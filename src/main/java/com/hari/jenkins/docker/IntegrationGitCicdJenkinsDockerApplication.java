package com.hari.jenkins.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationGitCicdJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationGitCicdJenkinsDockerApplication.class, args);
	}

	
	/*echo "# integration-git-cicd-jenkins-docker" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/harishankar796/integration-git-cicd-jenkins-docker.git
	git push -u origin master*/
}
