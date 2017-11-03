def call(ver) {
    echo "${ver}"
    def cmd = "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"

    sh "${cmd}"

    // def sout = new StringBuilder(), serr = new StringBuilder()
    // ['/bin/sh', '-c', "${cmd}"].execute().consumeProcessOutput(sout, serr)
    // ['/bin/sh', '-c', "ls -l"].execute().consumeProcessOutput(sout, serr)
    // "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'".execute().consumeProcessOutput(sout, serr)
    // def vvv = ['/bin/sh', '-c', "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"].execute().text
    def vvv = sh(script: "${cmd}", returnStdout: true)
    // println sout
    // println serr
    // echo "${sout}"
    // echo "${serr}"
    echo "${vvv}"
}