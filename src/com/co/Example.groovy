package com.co

import com.cloudbees.groovy.cps.NonCPS

class Example implements Serializable {

    // String sta
    def steps
    Example(steps) {this.steps = steps}

    @NonCPS
    def exa(Map conf) {
        println conf
        steps.echo 'fugaa'
    }

}