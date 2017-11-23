package com.co

import com.cloudbees.groovy.cps.NonCPS

// class Example implements Serializable {

    @NonCPS
    def exa(Map conf) {
        echo 'hogeeee'
        println conf
    }

// }