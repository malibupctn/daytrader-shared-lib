#!/usr/bin/groovy
def call(directory, params = ' -Dmaven.test.skip=true', containerName = 'maven') {
 container(containerName) {
    dir (directory) {
        sh "mvn package -B -e ${params}"
    }
  }
}
