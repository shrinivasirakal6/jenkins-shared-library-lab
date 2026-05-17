// vars/standardJavaBuild.groovy

def call(String projectName) {
    echo "======================================"
    echo "🚀 Starting Standard Build for: ${projectName}"
    echo "======================================"
    
    // You can put standard pipeline steps in here!
    // sh 'mvn clean install'
    
    echo "✅ Build completed successfully."
}