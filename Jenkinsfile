node{
      agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'Java 11.0.17'
    }

    stage('Compile') {
  
            echo "-=- compiling project -=-"
            checkout scm 
            sh 'mvn clean compile'
         
        
    }
 
    stage('Unit tests') {
      
            echo "-=- execute unit tests -=-"
        
        
    }
 
    stage('Mutation tests') {
 
            echo "-=- execute mutation tests -=-"
          
        
}

}
