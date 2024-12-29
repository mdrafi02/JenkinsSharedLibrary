@Library('first_shared_library') _
pipeline{
    agent any
    stages{
        stage('Test Shared Library'){
            steps{
            helloWorldExternal(name:"Rafi", dayOfWeek:"Sunday")
        }
        }
    }
}