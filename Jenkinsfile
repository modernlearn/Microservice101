node{

    stage('Compile') {
  
            echo "-=- compiling project -=-"
            checkout scm 
            sh 'mvn -Dmaven.test.failure.ignore=true install' 
             
         
        
    }
 
    stage('Unit tests') {
      
            echo "-=- execute unit tests -=-"
        
        
    }
 
    stage('Mutation tests') {
 
            echo "-=- execute mutation tests -=-"
          
        
}

}
