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

  //      canadaPostLink    { $(By.id("id_CanadaPost")) }
        drCrowfootLink      { $(By.id("id_CrowfootFamily")) }
        elkIncLink          { $(By.id("id_ElkInc")) }
        eRegistryLink       { $(By.id("id_AlbertaAutoRegistraion")) }
        faceBookLink        { $(By.id("id_Facebook")) }

        geocacheLink        { $(By.id("id_GeoCaching")) }
        grailsLink          { $(By.id("id_Grails")) }
        huntFishLicenseLink { $(By.id("id_AlbertaHunting")) }
        huntWMULink         { $(By.id("id_WMUDescriptions")) }
        londonDrugLink      { $(By.id("id_LondonDrugs")) }
        mitLink             { $(By.id("id_MIT")) }
        merriamWebsterLink  { $(By.id("id_MeriDic")) }
        redArrowLink        { $(By.id("id_RedArrow")) }
        simonPiesLink       { $(By.id("id_SimpleSimonPies")) }
        tadaLink            { $(By.id("id_TadaList")) }
        tkdLink             { $(By.id("id_Poomse")) }
        wikiTravelLink      { $(By.id("id_WikiTravel")) }
        zooLink             { $(By.id("id_Zoo")) }

}

}