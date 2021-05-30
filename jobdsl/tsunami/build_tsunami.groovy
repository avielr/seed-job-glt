pipelineJob('1_Build_glt_tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            branch('glt/tests')
            remote {
              url ('https://github.com/avielr/tsunami-glt-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile-custom-dockerfile")
    }
  }
}