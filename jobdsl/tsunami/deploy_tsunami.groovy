pipelineJob('2_Deploy_tsunami') {
  parameters {
    stringParam('serversToScan', '184.168.131.241,184.168.139.128,185.17.73.13', 'IPs to scan')
    stringParam('EMAIL_ADDRESS', 'aviel1988@gmail.com, demo.avlr@gmail.com', 'Enter EMAIL address to send the report to')
  }
  definition {
    cpsScm {
        scm {
          git {
            remote {
              branch('main')
              url ('https://github.com/avielr/tsunami-glt-pipelines.git')
            }
          }
        }
        scriptPath("Jenkinsfile-deploy-declerative")
    }
  }
}
