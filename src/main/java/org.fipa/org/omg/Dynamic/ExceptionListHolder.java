package org.omg.Dynamic;


/**
* org/omg/Dynamic/ExceptionListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Dynamic.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class ExceptionListHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.TypeCode value[] = null;

  public ExceptionListHolder ()
  {
  }

  public ExceptionListHolder (org.omg.CORBA.TypeCode[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.Dynamic.ExceptionListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.Dynamic.ExceptionListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.Dynamic.ExceptionListHelper.type ();
  }

}
