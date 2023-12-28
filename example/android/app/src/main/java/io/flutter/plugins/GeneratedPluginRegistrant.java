package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.zuvola.flutter_icmp_ping.FlutterIcmpPingPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_icmp_ping, com.zuvola.flutter_icmp_ping.FlutterIcmpPingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.sersoluciones.flutter_pos_printer_platform.FlutterPosPrinterPlatformPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_pos_printer_platform, com.sersoluciones.flutter_pos_printer_platform.FlutterPosPrinterPlatformPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin network_info_plus, dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin", e);
    }
  }
}