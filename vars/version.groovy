def call(ver) {
    echo "${ver}"
    sh "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"
    def vvv = "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'".execute().text
    // def vvv = ['/bin/sh', '-c', "git show-ref -s -d --abbrev ${ver} | awk '/\\^{\\}\$/ {print \$1}'"].execute().text
    echo "${vvv}"
}