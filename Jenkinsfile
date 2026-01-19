pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                sh 'python -V'
                sh 'python -m venv .venv'
                sh '. .venv/bin/activate && pip install -r requirements.txt'
            }
        }

        stage('Test') {
            steps {
                sh '. .venv/bin/activate && pytest -q --junitxml=pytest-report.xml'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'pytest-report.xml', allowEmptyArchive: true
            junit 'pytest-report.xml'
        }
    }
}
