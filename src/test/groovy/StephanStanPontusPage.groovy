import geb.Page

import org.openqa.selenium.By

class StephanStanPontusPage extends Page {

    static at = { title == "Stephan Stan's Web Services" }

    static content = {
        //      manualsMenu { $("#header-content ul li", 0).module(MenuModule) }
/*
        versionParagraph { $("p").text() }
        //build list of link references
*/
        atlasLink           { $(By.id("id_AnglerAtlas")) }
        atlasObscuraLink    { $(By.id("id_AtlasObscura")) }
        drCrowfootLink      { $(By.id("id_CrowfootFamily")) }
        elkIncLink          { $(By.id("id_ElkInc")) }
        faceBookLink        { $(By.id("id_Facebook")) }
        grailsLink          { $(By.id("id_Grails")) }
        huntFishLicenseLink { $(By.id("id_AlbertaHunting")) }
        huntWMULink         { $(By.id("id_WMUDescriptions")) }
        londonDrugLink      { $(By.id("id_LondonDrugs")) }
        redArrowLink        { $(By.id("id_RedArrow")) }
        tadaLink            { $(By.id("id_TadaList")) }
        tkdLink             { $(By.id("id_Poomse")) }
        wikiTravelLink      { $(By.id("id_WikiTravel")) }
}

}