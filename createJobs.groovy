/*pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}*/
/*pipelineJob('enrollment-service-job') {
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
}*/

pipelineJob('restataurant-service-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/neeleshparihar/restaurant-service.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}

/*
pipelineJob('enrollment-service-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/neeleshparihar/enrollment-service.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}
*/
