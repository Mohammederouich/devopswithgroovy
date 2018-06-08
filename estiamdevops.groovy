job('samplephpwebsiteJobBranch1') {
    description 'samplephpwebsiteVersion1'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/Mohammederouich/samplephpwebsite.git')
                }
                branch('v1')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('mohamedeoich/samplephpwebproj')
            registryCredentials('ee908362-1216-4dfc-b3bc-bca0783f2805')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}

job('samplephpwebsiteJobBranch2') {
    description 'samplephpwebsiteVersion2'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/Mohammederouich/samplephpwebsite.git')
                }
                branch('v2')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('mohamedeoich/samplephpwebproj')
            registryCredentials('ee908362-1216-4dfc-b3bc-bca0783f2805')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }

}

job('samplephpwebsiteJobBranch3') {
    description 'samplephpwebsiteVersion3'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/Mohammederouich/samplephpwebsite.git')
                }
                branch('v3')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
    steps {
        dockerBuildAndPublish {
            repositoryName('mohamedeoich/samplephpwebproj')
            registryCredentials('ee908362-1216-4dfc-b3bc-bca0783f2805')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}