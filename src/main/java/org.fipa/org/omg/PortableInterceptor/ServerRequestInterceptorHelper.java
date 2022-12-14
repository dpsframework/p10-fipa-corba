package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ServerRequestInterceptorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Server-side request interceptor.
   * <p>
   * A request Interceptor is designed to intercept the flow of a 
   * request/reply sequence through the ORB at specific points so that 
   * services can query the request information and manipulate the service 
   * contexts which are propagated between clients and servers. The primary 
   * use of request Interceptors is to enable ORB services to transfer 
   * context information between clients and servers. There are two types 
   * of request Interceptors: client-side and server-side. 
   * <p>
   * To write a server-side Interceptor, implement the 
   * ServerRequestInterceptor interface.
   *
   * @see ServerRequestInfo
   */
abstract public class ServerRequestInterceptorHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/ServerRequestInterceptor:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.ServerRequestInterceptor that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.ServerRequestInterceptor extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.PortableInterceptor.ServerRequestInterceptorHelper.id (), "ServerRequestInterceptor");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.ServerRequestInterceptor read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.ServerRequestInterceptor value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.PortableInterceptor.ServerRequestInterceptor narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.ServerRequestInterceptor)
      return (org.omg.PortableInterceptor.ServerRequestInterceptor)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  public static org.omg.PortableInterceptor.ServerRequestInterceptor unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.ServerRequestInterceptor)
      return (org.omg.PortableInterceptor.ServerRequestInterceptor)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

}
