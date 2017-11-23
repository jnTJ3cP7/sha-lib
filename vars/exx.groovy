import com.co.Example

def call(Map conf) {

    echo 'called'

    Example ee = new Example(this, conf)
    if (ee.isDirExisting()) {
        echo 'trueee'
    } else {
        echo 'falseee'
    }

}