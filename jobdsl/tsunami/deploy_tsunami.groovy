pipelineJob('2_Deploy_glt_tsunami') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              branch('glt/tests')
              url ('https://github.com/avielr/tsunami-glt-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile-deploy-declerative")
    }
  }
}
