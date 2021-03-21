/*pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}*/
pipelineJob('enrollment-service-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/neeleshparihar/enrollment-service.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}