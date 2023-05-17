pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Do Something') {
            steps {
                echo 'Do Something'
            }
        }
        stage('Gooodbye') {
            steps {
                echo 'Goodbye nha'
            }
        }
    }
}
