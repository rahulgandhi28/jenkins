pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo 'Hello'
            }
        }
        stage('Test') { 
            steps {
                echo 'rahul'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'gandhi'
            }
        }
    }
}
