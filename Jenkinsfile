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

    }
}
