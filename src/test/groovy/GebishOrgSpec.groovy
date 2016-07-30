import geb.spock.GebReportingSpec

class GebishOrgSpec extends GebReportingSpec {

    def "Gebのマニュアルページが表示できる"() {
        given: "Gebのホームページにいて"
        go "http://www.gebish.org/"

        when: "マニュアルのメニューのところにホバーして"

        and: "最初のリンクをクリックすると"

        then: "アニュアルページに遷移する"
        title == "The Book Of Geb"
    }
}