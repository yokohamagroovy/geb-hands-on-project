package page

import geb.Page
import module.MenuModule

class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { module MenuModule, $("#header-content ul li", 0) }
    }

    def hoverManualsMenu() {
        interact {
            moveToElement(manualsMenu.toggle)
        }
    }

    def clickCurrentManualLink() {
        manualsMenu.links[0].click()
    }
}
