def call(ver) {
    echo "${ver}"
    def vvv = "git show-ref -s -d --abbrev ${ver} | awk '/\^{}$/ {print $1}'".execute()
    echo "${vvv}"
}