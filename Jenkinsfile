node{

    stage('Compile') {
  
            echo "-=- compiling project -=-"
            checkout scm 
            mvn package
             
         
        
    }
 
    stage('Unit tests') {
      
            echo "-=- execute unit tests -=-"
        
        
    }
 
    stage('Mutation tests') {
 
            echo "-=- execute mutation tests -=-"
          
        
}

}
