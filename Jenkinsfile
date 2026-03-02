pipeline {
    agent any
    
    tools {
        maven 'Maven 3'
        jdk 'JDK 8'
    }
    
    environment {
        ARTIFACT_NAME = "first-jenkins-project-${BUILD_NUMBER}.jar"
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Clonage du repository Git...'
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Compilation du projet avec Maven...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Execution des tests unitaires...'
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                echo 'Generation du fichier JAR...'
                sh 'mvn package -DskipTests'
            }
        }
        
        stage('Archive') {
            steps {
                echo 'Archivage des artefacts...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                archiveArtifacts artifacts: 'pom.xml', fingerprint: true
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline execute avec succes!'
            echo "Artefact genere: ${ARTIFACT_NAME}"
        }
        failure {
            echo 'Le pipeline a echoue.'
        }
        always {
            echo 'Nettoyage...'
            cleanWs(deleteDirs: true)
        }
    }
}
