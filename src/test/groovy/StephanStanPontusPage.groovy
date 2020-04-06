import geb.Page
import org.openqa.selenium.By

class StephanStanPontusPage extends Page {

    static at = { title == "Stephan Stan's Web Services" }

    static content = {
        //      manualsMenu { $("#header-content ul li", 0).module(MenuModule) }
/*
        versionParagraph { $("p").text() }
        //build list of link references

        tkdLink { $(By.id("id_Poomse")) }


        faceBookLink { $(By.id("id_Facebook")) }

        huntFishLicenseLink { $(By.id("id_AlbertaHunting")) }
*/

        drCrowfootLink { $(By.id("id_CrowfootFamily"))  }
/*
        elkIncLink { $(By.id("id_ElkInc"))   }
*/
        atlasLink {  $(By.id("id_AnglerAtlas"))
        }

   /*
        grailsLink { $(By.id("id_Grails"))
        }
        tadaLink {  $(By.id("id_TadaList"))
        }
        redArrowLink {  $(By.id("id_RedArrow"))
        }
   */
        londonDrugLink {  $(By.id("id_LondonDrugs"))
        }
        /*
        huntWMULink { $(By.id("id_WMUDescriptions"))
        }
*/
    }

}