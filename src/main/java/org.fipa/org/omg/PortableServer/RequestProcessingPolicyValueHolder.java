package org.omg.PortableServer;

/**
* org/omg/PortableServer/RequestProcessingPolicyValueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * The RequestProcessingPolicyValue can have the following
         * values.  USE_ACTIVE_OBJECT_MAP_ONLY - If the Object Id 
         * is not found in the Active Object Map, 
         * an OBJECT_NOT_EXIST exception is returned to the 
         * client. The RETAIN policy is also required.
         * USE_DEFAULT_SERVANT - If the Object Id is not found in 
         * the Active Object Map or the NON_RETAIN policy is 
         * present, and a default servant has been registered 
         * with the POA using the set_servant operation, 
         * the request is dispatched to the default servant. 
         * USE_SERVANT_MANAGER - If the Object Id is not found 
         * in the Active Object Map or the NON_RETAIN policy 
         * is present, and a servant manager has been registered 
         * with the POA using the set_servant_manager operation, 
         * the servant manager is given the opportunity to 
         * locate a servant or raise an exception. 
         */
public final class RequestProcessingPolicyValueHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableServer.RequestProcessingPolicyValue value = null;

  public RequestProcessingPolicyValueHolder ()
  {
  }

  public RequestProcessingPolicyValueHolder (org.omg.PortableServer.RequestProcessingPolicyValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableServer.RequestProcessingPolicyValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableServer.RequestProcessingPolicyValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableServer.RequestProcessingPolicyValueHelper.type ();
  }

}
