import geb.spock.GebReportingSpec

class GebishOrgSpec extends GebReportingSpec {

    def "Gebのホームページが表示できる"() {
        when: "Gebのホームページに行くと"
        go "http://www.gebish.org/"

        then: "タイトルは'Geb - Very Groovy Browser Automation'であるべき"
        title == "Very Groovy Browser Automation!"
    }
}