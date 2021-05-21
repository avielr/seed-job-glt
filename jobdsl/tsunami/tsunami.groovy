pipelineJob('glt-tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/avielr/tsunami-glt-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile")
    }
  }
}
