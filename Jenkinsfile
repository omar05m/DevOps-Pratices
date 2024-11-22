pipeline{
            agent {
                docker {
                    image 'maven:3.6.3'
                }
            }
            stages {
                stage('build'){
                    steps{
                        sh 'mvn --version'
                        echo "building"
                    }
                }
                stage('test'){
                    steps{
                        echo "testing"
                    }
                }
                stage('test integration'){
                    steps{
                        echo "testing integrated done"
                    }
                }
            }

            post{
                always{
                    echo "i always executed"
                }
                success{
                    echo "deployement succefully"
                }
                failure{
                    echo "building failed"
                }
            }

        }
