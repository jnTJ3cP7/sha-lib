package com.co

import com.cloudbees.groovy.cps.NonCPS

// class Example implements Serializable {

    def sta  = 'fugaa'
    Example(sta) {this.sta = sta}

    @NonCPS
    def exa(Map conf) {
        echo 'hogeeee'
        println conf
        echo sta
    }

// }