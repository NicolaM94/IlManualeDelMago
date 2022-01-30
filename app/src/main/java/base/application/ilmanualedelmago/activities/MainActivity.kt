package base.application.ilmanualedelmago.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import base.application.ilmanualedelmago.R
import java.io.File

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    init {
        Log.d(TAG,"Checking resource file existance")
        if (File("$filesDir/spells.json").exists()) {
            Log.d(TAG,"Spells.json file exists")
        } else {
            Log.d(TAG,"Spells.json file do not exists")
            File("$filesDir/spells.json").createNewFile()

        }
    }

    private lateinit var navController :NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || navController.navigateUp()
    }

}