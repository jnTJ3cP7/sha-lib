package com.co

import com.cloudbees.groovy.cps.NonCPS

class Example implements Serializable {

    def steps
    Map conf

    Example(steps, conf) {
        this.steps = steps
        this.conf = conf
    }

    // @NonCPS
    def exa() {
        println conf
        steps.echo conf.field2
    }

    @NonCPS
    def isDirExisting() {
        println conf.pathh
        steps.fileExists conf.pathh
    }

}