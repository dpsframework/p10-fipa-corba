package org.omg.PortableServer.CurrentPackage;

/**
* org/omg/PortableServer/CurrentPackage/NoContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class NoContextHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableServer.CurrentPackage.NoContext value = null;

  public NoContextHolder ()
  {
  }

  public NoContextHolder (org.omg.PortableServer.CurrentPackage.NoContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableServer.CurrentPackage.NoContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableServer.CurrentPackage.NoContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableServer.CurrentPackage.NoContextHelper.type ();
  }

}
