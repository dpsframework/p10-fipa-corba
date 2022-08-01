package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/PolicyFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Enables policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>.
   * <p>
   * A portable ORB service implementation registers an instance of the 
   * <code>PolicyFactory</code> interface during ORB initialization in order 
   * to enable its policy types to be constructed using 
   * <code>CORBA.ORB.create_policy</code>. The POA is required to preserve 
   * any policy which is registered with <code>ORBInitInfo</code> in this 
   * manner.
   *
   * @see ORBInitInfo#register_policy_factory
   */
public final class PolicyFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.PolicyFactory value = null;

  public PolicyFactoryHolder ()
  {
  }

  public PolicyFactoryHolder (org.omg.PortableInterceptor.PolicyFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.PolicyFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.PolicyFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.PolicyFactoryHelper.type ();
  }

}