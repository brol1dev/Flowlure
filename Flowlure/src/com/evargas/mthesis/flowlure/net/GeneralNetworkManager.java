package com.evargas.mthesis.flowlure.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Network Manager Singleton to check general info
 * of the device's network.
 * 
 * @author Eric Vargas
 *
 */
public class GeneralNetworkManager implements INetworkManager {

	private static final String LOG_TAG = "GeneralNetworkManager";
	// Singleton instance
	private static GeneralNetworkManager generalNetMan = null;
	
	// Avoid instantation
	private GeneralNetworkManager() { }
	
	/**
	 * Get singleton
	 * @return singleton instance
	 */
	public static GeneralNetworkManager getInstance() {
		if (generalNetMan == null) {
			generalNetMan = new GeneralNetworkManager();
		}
		return generalNetMan;
	}
	
	@Override
	public boolean isConnected(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
		if (activeNetwork != null && activeNetwork.isConnectedOrConnecting()) {
			return true;
		} else {
			return false;
		}
	}
}
