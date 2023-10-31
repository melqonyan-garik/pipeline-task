pipeline {
    agent any
 tools {
        maven '3.8.7'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

    }
}
