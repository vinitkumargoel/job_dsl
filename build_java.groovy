job("build-java") {
    parameters{
      string(name: 'branch', defaultValue: 'master', description: 'Please enter branch')
    } 
    scm{
        git("https://github.com/vinitkumargoel/jenkin_l1","master")
    }
    steps {
        shell('javac JavaProgram.java')
    }
}