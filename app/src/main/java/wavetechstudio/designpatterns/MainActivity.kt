package wavetechstudio.designpatterns

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import wavetechstudio.thefactorypattern.BreadFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * The Factory Pattern
         */
        theFactoryPatter()
    }

    /**
     * The Factory Pattern
     */
    fun theFactoryPatter() {
        val breadFactory = BreadFactory()

        val baugette = breadFactory.getBread(BreadFactory.BAG)
        val brioche = breadFactory.getBread(BreadFactory.BRI)
        val roll = breadFactory.getBread(BreadFactory.ROL)

        val stringBuilder = StringBuilder()

        label.text = stringBuilder.append(getString(R.string.the_factory_pattern))
        label.text = stringBuilder.append("\n").append(roll.name()).append(roll.calories())
        label.text = stringBuilder.append("\n").append(baugette.name()).append(baugette.calories())
        label.text = stringBuilder.append("\n").append(brioche.name()).append(brioche.calories())
    }
}
