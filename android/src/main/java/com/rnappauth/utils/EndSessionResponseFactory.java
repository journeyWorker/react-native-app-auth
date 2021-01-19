package com.rnappauth.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

import net.openid.appauth.EndSessionResponse;

public final class EndSessionResponseFactory {
  /*
   * Read raw endSession response into a React Native map to be passed down the bridge
   */
  public static final WritableMap endSessionResponseToMap(EndSessionResponse response) {
    WritableMap map = Arguments.createMap();
    map.putString("state", response.state);
    return map;
  }
}
