@Grab('org.yaml:snakeyaml:1.17')

import org.yaml.snakeyaml.Yaml

def call(File path) {
    echo 'shared library phase 2!!'

    Yaml parser = new Yaml()
    List example = parser.load("${path}").text)

    example.each{println it.subject}
}