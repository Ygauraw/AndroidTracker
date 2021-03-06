package org.cw;

import org.cw.connection.CallbackInfo;

public class CWWithCallbackInfoException extends CWException 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7460640935424620864L;
	
	private CallbackInfo _callbackInfo;
	
	public CallbackInfo getCallbackInfo() { return _callbackInfo; }
	
	public CWWithCallbackInfoException(String message, CallbackInfo callbackInfo)
	{
		super(message);	
		_callbackInfo = callbackInfo;
	}

}
