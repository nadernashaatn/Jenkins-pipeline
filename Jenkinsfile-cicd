@Library('shared-library')
import com.mcnz.uatInput
def uatInput = new uatInput()

pipeline {
    agent any
    environment{
        MY_FILE = fileExists 'report.txt'
    }
    stages {
        stage ('Run only if approval exists') {
            when {
                expression { uatInput.buildIsUatApproved() }
            }
            steps {
                echo "The build has been approved!!!"
            }
        }
        stage('conditional if exists'){
            when { expression { MY_FILE == 'true' } }
            steps {
                echo "file exists"
            }
        }
        stage('conditional if not exists'){
            when { expression { MY_FILE == 'false' } }
            steps {
                echo "file does not exist"
            }
        }
    }
}