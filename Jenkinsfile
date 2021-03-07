@Library('shared-library')
import com.mcnz.uatInput
env.WORKSPACE = pwd()
def uatInput = new uatInput()

pipeline {
    agent any
    stages {
        stage ('Run only if approval exists') {
            when {
                expression { uatInput.buildIsUatApproved(${env.WORKSPACE}) }
            }
            steps {
                echo "The build has been approved!!!"
            }
        }
    }
}