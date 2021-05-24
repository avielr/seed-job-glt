pipelineJob('2 - Deploy_glt_tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/avielr/tsunami-glt-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile-deploy")
    }
  }
}
