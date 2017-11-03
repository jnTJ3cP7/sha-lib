def call(ver) {
    def vvv = sh "git show-ref -s -d --abbrev ${ver} | awk '/\^{}$/ {print $1}'"
    echo "${vvv}"
}