
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import spock.lang.Stepwise
import spock.lang.Ignore
import com.pontus.external.AnglersAtlasPage

/*
https://www.luckyryan.com/2013/08/28/browser-testing-geb/

@Stepwise is a Spock annotation that will share the browser state and run the tests in order.

        http://farenda.com/spock/flexibly-ignore-tests-in-spock-framework/
@Ignore explaination
*/

@Stepwise
class StephanStanPontusSpec extends GebReportingSpec {

//    @Ignore
def "can navigate to the Stephan Stan Pontus page - Web Services"() {
    when:
    to StephanStanPontusPage
    then:
    at StephanStanPontusPage
}

   @Ignore
def "can get to the Stephan Stan pontus.html page try different approaches and assertions"() {

    /*
    when: … is where we put page interactions.
    Fills out the form, clicks the submit button.
    Notice how there is no reference to anything directly on the page,
    just to the abstracted names.
    This will help with readability and insulate page layout changes.
*/ when:
    to StephanStanPontusPage

//    and: //hover over to expand the menu
//    interact {
//            moveToElement(manualsMenu.toggle)
//    }

    /**
     then: … is just making sure we made it to the right place.
     We could add any other assertions here.
     * */

//    then: //first link is for the current manual
//        manualsMenu.links[0].text().endsWith("- CURRENT")
    assert title == "Stephan Stan's Web Services"
    //      assert $("p").text() == "Created May 4, 2002\nLast Updated February 12, 2017"
// same but defined as static content on page.
    assert versionParagraph == "Created May 4, 2002\nLast Updated October 14, 2018"
    //println("test")
// prints to Standard output of test results
    //println(versionParagraph)
    // click on a image by id
    $(By.id("id_ElkInc")).click()
    // use browser button to go back
    driver.navigate().back()

//        println($("div").has("a").size())  // 36
//        println($("div").has("div").size())  // 14
//        println($("a").size())  // 137
//        println($("a").asList().toString())  // 137

    when:
    //      manualsMenu.links[0].click()

    then:
    at StephanStanPontusPage
}

//@Ignore
    def "click on first 4 links of pontus.html - by ID"() {

    when:
    to StephanStanPontusPage

    then:         // click on a image by id

    atlasLink.click()
        then:
        at AnglersAtlasPage
        driver.navigate().back()
        then:
        at StephanStanPontusPage

//        then:
//        at StephanStanPontusPage
/*
    // 2
    faceBookLink.click()
    then:
    at FaceBookHomePage
    driver.navigate().back()

    then:
    at StephanStanPontusPage

    // 3
    huntFishLicenseLink.click()
    then:
    at AlbertaRELMPage

    driver.navigate().back()

    then:
    at StephanStanPontusPage

    // 4
    drCrowfootLink.click()
    then:
    at CrowfootVillageFamilyPracticePage
//        assert $("p", 0).text() == "At Crowfoot Village Family Practice our Mission is to provide outstanding care with compassion and integrity in an innovative, team-based, education focused setting."
    driver.navigate().back()

    then:
    at StephanStanPontusPage

}


    @Ignore
def "click on the various link by ID"() {

    when:
    to StephanStanPontusPage

    then:         // click on a image by id
    $(By.id("id_ElkInc")).click()
    // use browser button to go back
    driver.navigate().back()

    elkIncLink.click()
    driver.navigate().back()
    tkdLink.click()
    driver.navigate().back()
    faceBookLink.click()
    driver.navigate().back()

//        huntFishLicenseLink.click()
//        then:
//        at AlbertaRELMPage
//        driver.navigate().back()
    then:
    at StephanStanPontusPage

    atlasLink.click()
    then:
    at AnglersAtlasPage
    driver.navigate().back()
    then:
    at StephanStanPontusPage

    grailsLink.click()
    then:
    at GrailsDownloadPage
    driver.navigate().back()
    then:
    at StephanStanPontusPage

    tadaLink.click()

    driver.navigate().back()
    redArrowLink.click()
    then:
    at RedArrowBusPage
    driver.navigate().back()
    then:
    at StephanStanPontusPage

    londonDrugLink.click()
    then:
    at LondonDrugsPage
    driver.navigate().back()
    then:
    at StephanStanPontusPage

    huntWMULink.click()
    then:
    at HuntMWUPage
    driver.navigate().back()
    then:
    at StephanStanPontusPage

    when:
    //      manualsMenu.links[0].click()
*/
    then:
    at StephanStanPontusPage
}


}