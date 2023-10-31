pipeline {
    agent any
 tools {
        maven '3.8.7'
        jdk '17.0.5'
    }
  stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
       stage('SonarQube') {
            steps {
                withSonarQubeEnv('Sonar-instance') {
                    bat 'mvn sonar:sonar'
                }
            }
        }

       stage('Deploy to Tomcat') {
            steps {
               bat 'xcopy /Y target\\spring-mvc-app1-0.0.1-SNAPSHOT.war "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps"'
            }
       }
    }
}
