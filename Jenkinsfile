node {
  stage('Staging') {
  checkout scm
  def mvnHome = tool 'Maven-3.3.9'
  }
  stage('Building') {
	  steps {
	sh "${mvnHome}/bin/mvn install -Ptest"
	 )	  
  }
  stage('Cleaning old builde') {
	  steps {
  	sh "sudo docker rm -f strutsWs || true"
	  }
  }
  stage('Deployment') {
	  steps {
	sh "sudo docker  run --name strutsWs --link strutsWsDb:strutsWsDb -v target/struts2rest-1.1-SNAPSHOT.war:/usr/local/tomcat/webapps/myapp.war -it -p 8080:8080 tomcat:8.0"
	  }
	  }
  }
