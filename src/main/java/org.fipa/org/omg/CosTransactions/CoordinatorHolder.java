package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/CoordinatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class CoordinatorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.Coordinator value = null;

  public CoordinatorHolder ()
  {
  }

  public CoordinatorHolder (org.omg.CosTransactions.Coordinator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.CoordinatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.CoordinatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.CoordinatorHelper.type ();
  }

}
