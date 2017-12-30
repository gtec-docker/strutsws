
node {
  stage 'Building'
  checkout scm
  def mvnHome = tool 'Maven-3.3.9'
  stage 'Building'
	sh "${mvnHome}/bin/mvn install -Ptest" 
  // we want to pick up the version from the pom
  // Mark the code build 'stage'....
  stage 'Cleaning old build'
  	sh "sudo docker rm -f strutsWs || true"
  stage 'Deployment'
	sh "sudo docker  run -d --name strutsWs --link strutsWsDb:strutsWsDb -v ~/.m2/repository/com/concretepage/struts2rest/1.1-SNAPSHOT/struts2rest-1.1-SNAPSHOT.war:/usr/local/tomcat/webapps/myapp.war  -p 8000:8080  tomcat:8.0"
}
