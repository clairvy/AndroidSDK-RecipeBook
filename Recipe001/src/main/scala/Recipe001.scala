package com.example.android.recipe001

import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.provider.Settings.Secure;
import _root_.android.util.Log;

class Recipe001 extends Activity {

  private final val TAG = "Recipe001"

  override def onCreate(savedInstanceState : Bundle) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.main)

    val androidId : String = Secure.getString(getContentResolver, Secure.ANDROID_ID)
    if (androidId == null) {
      // Running on emulator
      Log.d(TAG, "Running on emulator")
    } else {
      // Running on real device
      Log.d(TAG, "Running on real device")
    }
  }
}
