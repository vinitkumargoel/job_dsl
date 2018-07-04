def pipelineScript = 'your pipeline script'

def scriptApproval = Jenkins.instance.getExtensionList('org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval')[0]

scriptApproval.approveScript(scriptApproval.hash(pipelineScript, 'groovy'))

script pipelineScript

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