package wavetechstudio.designpatterns

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wavetechstudio.theiteratorpattern.PakistaniTeam
import com.wavetechstudio.theiteratorpatternusingbuiltiniterator.AustralianTeam
import com.wavetechstudio.theiteratorpatternusingbuiltiniterator.customObjectsIterator.AfricanTeam
import com.wavtechstudio.theobserverpatter.Celebrity
import com.wavtechstudio.theobserverpatter.Follower
import kotlinx.android.synthetic.main.activity_main.*
import wavetechstudio.thefactorypattern.BreadFactory

class MainActivity : AppCompatActivity() {

    var stringBuilder: StringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //The Factory Pattern
        theFactoryPatter()

        //The Observer Pattern
        theObserverPattern()

        // The Iterator Pattern
        theIteratorPattern()

        // The Iterator Pattern Using Built In Iterator
        theIteratorPatternUsigBuiltInIterator()

        // The Iterator Pattern Using Built In Iterator With Custom Data Types
        theIteratorPatternUsigBuiltInIteratorWithCutomDataTypes()
    }


    /**
     * The Factory Pattern
     */
    fun theFactoryPatter() {
        val breadFactory = BreadFactory()

        val baugette = breadFactory.getBread(BreadFactory.BAG)
        val brioche = breadFactory.getBread(BreadFactory.BRI)
        val roll = breadFactory.getBread(BreadFactory.ROL)

        label.text = stringBuilder.append(getString(R.string.the_factory_pattern))
        label.text = stringBuilder.append("\n").append(roll.name()).append(roll.calories())
        label.text = stringBuilder.append("\n").append(baugette.name()).append(baugette.calories())
        label.text = stringBuilder.append("\n").append(brioche.name()).append(brioche.calories())
    }


    /**
     * The Observer Pattern
     */
    private fun theObserverPattern() {

        // Creating two celebrities to test
        val ronaldo = Celebrity("Ronaldo")
        val afridi = Celebrity("Afridi")

        //Creating four fans
        val followerWaheed = Follower("Waheed")
        val followerJunaid = Follower("Junaid")
        val followerUsman = Follower("Usman")
        val followerMurtza = Follower("Murtza")

        //Registering three fans with Celebrity Ronaldo
        ronaldo.registerObserver(followerJunaid)
        ronaldo.registerObserver(followerWaheed)
        ronaldo.registerObserver(followerUsman)

        //Registering two fans with Celebrity Afridi
        afridi.registerObserver(followerMurtza)
        afridi.registerObserver(followerJunaid)

        // Ronaldo is tweeting
        ronaldo.tweet("Hey guys, came across this interesting match, check it out.")

        // Afridi is tweeting
        afridi.tweet("Good Morning..!!")

        // Unregistering a fan from Celebrity Afridi
        afridi.unRegisterObserver(followerJunaid)

        // Afridi is tweeting
        afridi.tweet("Cricket world cup 2019 has been started this month!!")

    }


    /**
     * The Iterator Pattern
     */
    private fun theIteratorPattern() {

        // Creating team object so that we can iterate players
        val pakistaniTeam = PakistaniTeam()
        val pakistaniTeamIterator = pakistaniTeam.createIterator()

        label.text = stringBuilder.append("\n\n\n").append(getString(R.string.the_iterator_pattern))

        while (pakistaniTeamIterator.hasNext()) {
            label.text = stringBuilder.append("\n").append(pakistaniTeamIterator.next())
        }

        pakistaniTeamIterator.first()
        label.text = stringBuilder.append("\n").append(pakistaniTeamIterator.currentItem())

    }

    /**
     * The Iterator Pattern using built in Iterator
     */
    private fun theIteratorPatternUsigBuiltInIterator() {

        // Creating team object so that we can iterate players
        // Creating team object so that we can iterate players
        val australianTeam = AustralianTeam()
        val australianTeamIterator = australianTeam.createIterator()

        label.text =
            stringBuilder.append("\n\n\n").append(getString(R.string.the_iterator_pattern_using_built_in_iterator))

        while (australianTeamIterator.hasNext()) {
            label.text = stringBuilder.append("\n").append(australianTeamIterator.next())
        }

        australianTeamIterator.first()
        label.text = stringBuilder.append("\n").append(australianTeamIterator.currentItem())
    }

    /**
     * The Iterator Pattern using built in Iterator With Custom Data Type
     */
    private fun theIteratorPatternUsigBuiltInIteratorWithCutomDataTypes() {

        // Creating team object so that we can iterate players
        // Creating team object so that we can iterate players
        val africanTeam = AfricanTeam()
        val africanTeamCustomIterator = africanTeam.createCustomIterator()

        label.text =
            stringBuilder.append("\n\n\n")
                .append(getString(R.string.the_iterator_pattern_using_built_in_iterator_with_custom_data_types))

        while (africanTeamCustomIterator.hasNext()) {
            label.text = stringBuilder.append("\n").append(africanTeamCustomIterator.next().toString())
        }

        africanTeamCustomIterator.first()
        label.text = stringBuilder.append("\n").append(africanTeamCustomIterator.currentItem().toString())
    }
}
