def call(ver) {
    echo "${ver}"
    echo "git show-ref -s -d --abbrev ${ver} | awk '/\\^{}\$/ {print \$1}'"
    def vvv = sh "git show-ref -s -d --abbrev ${ver} | awk '/\\^{}\$/ {print \$1}'"
    echo "${vvv}"
}