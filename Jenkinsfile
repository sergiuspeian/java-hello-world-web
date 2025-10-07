pipeline {
    agent { label 'master' }
    options {
        ansiColor('xterm')
        buildDiscarder(logRotator(numToKeepStr: '5', daysToKeepStr: '5'))
    }

    stages {
        stage('Build') {
            steps {
                echo "Cloning repo..."
                git branch: 'main', url: 'https://github.com/sergiuspeian/java-hello-world-web.git'
                echo "Building project"
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo "Testing"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying"
            }
        }
    }
}
