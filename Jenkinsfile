pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
              git 'https://github.com/may2313ank/userServices.git'  
              echo 'project is success clone'
            }
        }
        stage('Compile') {
            steps {
              bat 'mvn compile'
              echo 'project is Compile'
            }
        }
        stage('Test') {
            steps {
              bat 'mvn test'
              echo 'project is a test'
            }
        }
        stage('Package') {
            steps {
              bat 'mvn package' 
              echo 'project is a package'
            }
        }
    }
}
