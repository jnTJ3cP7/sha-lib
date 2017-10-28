def call() {
    stage ('shared lib2') {
        steps {
            echo 'shared library phase 2!!'
        }
    }
}