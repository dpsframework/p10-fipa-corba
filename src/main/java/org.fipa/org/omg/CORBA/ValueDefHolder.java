package org.omg.CORBA;

/**
* org/omg/CORBA/ValueDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class ValueDefHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.ValueDef value = null;

  public ValueDefHolder ()
  {
  }

  public ValueDefHolder (org.omg.CORBA.ValueDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.ValueDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.ValueDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.ValueDefHelper.type ();
  }

}
