package com.rnfirebasev7;

import com.facebook.react.ReactActivity;

import org.devio.rn.splashscreen.SplashScreenReactPackage;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "RNFirebaseV7";
  }

  @Override
  protected String onCreate(Bundle savedInstanceState) {
    SplashScreen.show(this);
    super.onCreate(savedInstanceState);
  }
}
