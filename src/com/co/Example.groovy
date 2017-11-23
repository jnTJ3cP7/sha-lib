package com.co

import com.cloudbees.groovy.cps.NonCPS

// class Example implements Serializable {

    String sta  = 'fugaa'

    @NonCPS
    def exa(Map conf) {
        echo 'hogeeee'
        println conf
        echo sta
    }

// }