import com.co.Example

def call(Map conf) {

    echo 'called'

    Example ee = new Example(this, conf)
    ee.exa()

}