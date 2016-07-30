package page

import geb.Page

class GebishOrgHomePage extends Page {

    static at = { title == "Geb - Very Groovy Browser Automation" }

    static content = {
        manualsMenu { $("#header-content ul li", 0).children("span") }
        currentManualMenu { $("#header-content ul li", 0).$('.link-list li a')[0] }
    }

    def hoverManualsMenu() {
        interact {
            moveToElement(manualsMenu)
        }
    }
}
