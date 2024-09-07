pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('4b2193b1-bc39-4d76-b110-c185d05a572c')  // Reemplaza por el ID de tu credencial de SonarQube
    }

    tools {
        maven 'jenkins_maven'  // Nombre de la instalación de Maven definida en "Global Tool Configuration"
    }

    stages {
        stage('SonarQube Analysis Test') {
            steps {
                withSonarQubeEnv('sonar.idevcode.xyz') {  // Nombre del servidor configurado en Jenkins
                    sh '''
                    mvn clean verify sonar:sonar \
                    -Dsonar.token=$SONAR_TOKEN
                    '''
                }
            }
        }
    }
}