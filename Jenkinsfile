pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Deploy to Production') {
            // This 'when' block is the secret weapon of multibranch pipelines!
            // It ensures this stage ONLY runs if the branch is exactly 'main'
            when {
                branch 'main'
            }
            steps {
                echo "✅ Deploying to Production Servers!"
            }
        }
    }
}