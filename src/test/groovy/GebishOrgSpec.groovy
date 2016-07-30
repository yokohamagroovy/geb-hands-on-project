import geb.spock.GebReportingSpec
import page.GebishOrgHomePage

class GebishOrgSpec extends GebReportingSpec {

    def "Gebのホームページが表示できる"() {
        given: "Gebのホームページにいて"
        // TODO GOではなくTOに置き換え
//        to GebishOrgHomePage
        go "http://www.gebish.org/"

        when: "マニュアルのメニューのところにホバーして"
        interact {
            moveToElement($("#header-content ul li", 0).children("span"))
        }

        and: "最初のリンクをクリックすると"
        $("#header-content ul li", 0).$('.link-list li a')[0].click()

        then: "アニュアルページに遷移する"
        title == "The Book Of Geb"
    }
}