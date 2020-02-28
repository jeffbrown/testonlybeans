package testonlybeans

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification
import org.apache.commons.math3.analysis.function.Multiply

@Integration
@Rollback
class BeansSpec extends Specification {

    Multiply commonsMathBean


    void "test something"() {
        expect:
        commonsMathBean
    }
}
