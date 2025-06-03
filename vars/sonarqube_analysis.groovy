def call(String SonarQubeAPI, String Projectname, String ProjectKey){
  {
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -Dsonar.java.binaries=. -X"
  }
}
