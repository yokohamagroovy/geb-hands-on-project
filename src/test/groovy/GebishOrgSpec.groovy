import geb.spock.GebReportingSpec
import page.GebishOrgHomePage

class GebishOrgSpec extends GebReportingSpec {

    def "Gebのホームページが表示できる"() {
        given: "Gebのホームページにいて"
        to GebishOrgHomePage

        when: "マニュアルのメニューのところにホバーして"
        hoverManualsMenu()

        and: "最初のリンクをクリックすると"
        currentManualMenu.click()

        then: "アニュアルページに遷移する"
        title == "The Book Of Geb"
    }
}