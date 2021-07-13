pipelineJob('1_Build_tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            branch('main')
            remote {
              url ('https://github.com/avielr/tsunami-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile-custom-dockerfile")
    }
  }
}
