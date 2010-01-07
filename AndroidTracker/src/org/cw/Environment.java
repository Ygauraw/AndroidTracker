package org.cw;

import org.cw.connection.CrossingWaysConnection;
import org.cw.gps.DefaultGPSProvider;
import org.cw.gps.ILocationProvider;
import org.cw.settings.SettingsEnvironment;
import org.cw.utils.AlertBuilder;
//import org.cw.utils.StatisticItem;

import android.content.Context;

/**
 * Defines the environment for the tracker application 
 * which is available to all parts of the program 
 * 
 * @author Andreas Reiter <andreas.reiter@student.tugraz.at>
 *
 */
public class Environment 
{
	private static Environment _environment = null;	
	public static final Environment Instance()
	{
		if(_environment == null)
			_environment = new Environment();
		
		return _environment;
	}
	
	
	private AlertBuilder _alertBuilder = null;	
	public void CreateAlertBuilderInstance(Context ctx){
		_alertBuilder = new AlertBuilder(ctx);
	}	
	public AlertBuilder AlertBuilderInstance(){
		return _alertBuilder;
	}
	
	private CrossingWaysConnection _connectionInstance = null;	
	public CrossingWaysConnection ConnectionInstance()
	{
		if(_connectionInstance == null)
		{
			_connectionInstance = new CrossingWaysConnection();
			_connectionInstance.execute();
		}
		
		return _connectionInstance;
	}
	
	private ILocationProvider _gpsProvider = null;
	public  void CreateDefaultGPSProvider(Context ctx){
		_gpsProvider = new DefaultGPSProvider(ctx);
		
	}
	public ILocationProvider GPSProviderInstance(){
		return _gpsProvider;
	}
	
	private SettingsEnvironment _settings = null;
	public void CreateSettings(Context ctx){
		_settings = new SettingsEnvironment(ctx);
	}
	public SettingsEnvironment Settings(){return _settings;}
	
	
}
