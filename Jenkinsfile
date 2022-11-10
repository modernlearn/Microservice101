node{

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
