package com.co

import com.cloudbees.groovy.cps.NonCPS

class Example implements Serializable {

    def steps
    String sta

    Example(steps, sta) {
        this.steps = steps
        this.sta = sta
    }

    @NonCPS
    def exa(Map conf) {
        println conf
        steps.echo sta
    }

}