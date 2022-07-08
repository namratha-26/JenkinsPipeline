pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac CalculatorClass.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java CalculatorClass'
            }
        }
    }
}