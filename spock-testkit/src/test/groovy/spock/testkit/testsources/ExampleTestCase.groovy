package spock.testkit.testsources

import spock.lang.Ignore
import spock.lang.Specification

class ExampleTestCase extends Specification{

  def "first"() {
    expect: true
  }

  def "failMe"() {
    expect: false
  }

  @Ignore
  def "ignoreMe"() {
    expect: false
  }
}
