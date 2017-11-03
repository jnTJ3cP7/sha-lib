def call(ver) {
    echo "${ver}"
    def cmd = "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"

    sh "${cmd}"

    def sout = new StringBuilder(), serr = new StringBuilder()
    "${cmd}".execute().consumeProcessOutput(sout, serr)
    // "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'".execute().consumeProcessOutput(sout, serr)
    // def vvv = ['/bin/sh', '-c', "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"].execute().text
    echo "${sout}"
    echo "${serr}"
}