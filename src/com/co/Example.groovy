package com.co

import com.cloudbees.groovy.cps.NonCPS

class Example implements Serializable {

    String sta
    Example(String sta) {this.sta = sta}

    @NonCPS
    def exa(Map conf) {
        println conf
        echo sta
    }

}