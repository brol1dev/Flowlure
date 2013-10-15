package com.evargas.mthesis.flowlure.net;

import android.content.Context;

public interface INetworkManager {

	/**
	 * Used to know if the device is connected to Internet.
	 * 
	 * @param context Context, generally, used by caller.
	 * @return true if it is connected, false otherwise.
	 */
	public boolean isConnected(Context context);
}
