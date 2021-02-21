@Library('shared-library')
import com.mcnz.uatInputdss
def uatInput = new uatInput()

pipeline {
    agent any
    stages {
        stage ('Run only if approval exists') {
            when {
                expression { uatInput.buildIsUatApproved() }
            }
            steps {
                echo "The build has been approved!!!"
            }
        }
    }
}