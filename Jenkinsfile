node{
   stage('SCM Checkout'){
      git 'https://github.com/vm31/CucumberBddPoc'
   }
   stage('Compile Stage'){
      def mvnHome = tool name: 'maven_3_5_0', type: 'maven'
      bat "${mvnHome}/bin/mvn clean install"
   }
   Stage('Test Stage'){
      bat "${mvnHome}/bin/ mvn test -Dcucumber.options='--tags @regression'"
   }

}