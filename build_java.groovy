job("build-java") {
    scm{
        git("https://github.com/vinitkumargoel/jenkin_l1")
    }
    steps {
        shell('javac JavaProgram.java')
    }
}