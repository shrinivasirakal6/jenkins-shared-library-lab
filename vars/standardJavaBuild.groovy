def call(String projectName) {
    // We put the ENTIRE pipeline block inside the call function!
    pipeline {
        agent any
        
        stages {
            stage('Initialize') {
                steps {
                    echo "🚀 Booting up standard build for: ${projectName}"
                }
            }
            stage('Build & Test') {
                steps {
                    echo "Running Maven clean install..."
                    // sh 'mvn clean install'
                }
            }
            stage('Security Scan') {
                steps {
                    echo "Scanning ${projectName} for vulnerabilities..."
                }
            }
        }
        post {
            always {
                echo "🧹 Cleaning up workspace for ${projectName}"
            }
        }
    }
}
