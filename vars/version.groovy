def call(ver) {
    echo "${ver}"
    sh "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"

    def sout = new StringBuilder(), serr = new StringBuilder()
    "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'".execute().consumeProcessOutput(sout, serr)
    // def vvv = ['/bin/sh', '-c', "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"].execute().text
    echo "${sout}"
    echo "${serr}"
}