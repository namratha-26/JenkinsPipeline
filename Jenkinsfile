pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
		git 'https://github.com/namratha-26/JenkinsPipeline.git'
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