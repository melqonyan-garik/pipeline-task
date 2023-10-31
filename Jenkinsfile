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
                withSonarQubeEnv('Sonar-scanner') {
                    bat 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                bat 'copy target\\spring-mvc-app1-0.0.1-SNAPSHOT.war C:\\path\\to\\tomcat\\webapps\\'
            }
        }
    }
}
