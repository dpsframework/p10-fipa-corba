package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/ClientRequestInterceptorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Client-side request interceptor.
   * <p>
   * A request Interceptor is designed to intercept the flow of a 
   * request/reply sequence through the ORB at specific points so that 
   * services can query the request information and manipulate the service 
   * contexts which are propagated between clients and servers. The primary 
   * use of request Interceptors is to enable ORB services to transfer 
   * context information between clients and servers. There are two types 
   * of request Interceptors: client-side and server-side. 
   * <p>
   * To write a client-side Interceptor, implement the 
   * <code>ClientRequestInterceptor</code> interface. 
   *
   * @see ClientRequestInfo
   */
public final class ClientRequestInterceptorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.ClientRequestInterceptor value = null;

  public ClientRequestInterceptorHolder ()
  {
  }

  public ClientRequestInterceptorHolder (org.omg.PortableInterceptor.ClientRequestInterceptor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.ClientRequestInterceptorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.ClientRequestInterceptorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.ClientRequestInterceptorHelper.type ();
  }

}