package net.workingdev.kotlin_oncreateoptionsmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

  val Log = Logger.getLogger(MainActivity::class.java.name)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    showMessage("onCreate")
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {

    menu?.add("File")
    menu?.add("Edit")
    menu?.add("Exit")

    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {
    when(item?.toString()) {
      "File" -> {
        showMessage("File")
      }
      "Edit" -> {
        showMessage("Edit")
      }
      "Exit" -> {
        showMessage("Exit")
        finish()
      }
    }
    return true
  }

  override fun onStop() {
    Log.info("onStop")
    super.onStop()
  }

  override fun onDestroy() {
    Log.info("onDestroy")
    super.onDestroy()
  }

  private fun showMessage(msg: String) {
    Log.info(msg)
    Toast.makeText(this@MainActivity, msg, Toast.LENGTH_LONG).show()
  }
}
