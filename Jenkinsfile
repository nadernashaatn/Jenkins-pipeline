@Library('shared-library')
import com.mcnz.uatInput
WORKSPACE = pwd()
def uatInput = new uatInput()

pipeline {
    agent any
    stages {
        stage ('Run only if approval exists') {
            when {
                expression { uatInput.buildIsUatApproved(${WORKSPACE}) }
            }
            steps {
                echo "The build has been approved!!!"
            }
        }
    }
}