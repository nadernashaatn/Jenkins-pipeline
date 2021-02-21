/* 
* jenkins-shared-library/src/com/mcnz/uatInput.groovy
* https://github.com/learn-devops-fast/jenkins-shared-library.git
*/
package com.mcnz

  public class uatInput {
    def buildIsUatApproved() {
    def file = new File("./approved.txt")
    def workspace = pwd()
    echo $workspace
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
      return false; 
    }    
  }
}