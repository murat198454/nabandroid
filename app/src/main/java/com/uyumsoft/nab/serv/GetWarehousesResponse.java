package com.uyumsoft.nab.serv;

import java.util.Date;
import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetWarehousesResponse extends BaseObject {

    public ServiceResponseOfListOfNameContainer GetWarehousesResult;


    public Object getProperty(int index)
    {

    	return GetWarehousesResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetWarehousesResult";
        info.type = PropertyInfo.STRING_CLASS;

    }

    public void setProperty(int index, Object value)
    {

    	GetWarehousesResult = (ServiceResponseOfListOfNameContainer)value;

    }
    
	public void loadSoapObject(SoapObject property){
		if(property == null) return;
		GetWarehousesResult = new ServiceResponseOfListOfNameContainer();
		GetWarehousesResult.loadSoapObject(property);
	}           

    /*public void register(SoapSerializationEnvelope envelope) {        
        envelope.addMapping(NAMESPACE, "GetWarehousesResponse", this.getClass());
        new ServiceResponseOfListOfNameContainer().register(envelope);
    }*/

}