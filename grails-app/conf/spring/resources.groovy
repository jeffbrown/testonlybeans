import grails.util.Environment

// Place your Spring DSL code here
beans = {
    if(Environment.current == Environment.TEST) {
        commonsMathBean org.apache.commons.math3.analysis.function.Multiply
    }
}
