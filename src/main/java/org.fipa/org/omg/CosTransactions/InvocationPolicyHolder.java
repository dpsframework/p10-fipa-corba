package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/InvocationPolicyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class InvocationPolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.InvocationPolicy value = null;

  public InvocationPolicyHolder ()
  {
  }

  public InvocationPolicyHolder (org.omg.CosTransactions.InvocationPolicy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.InvocationPolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.InvocationPolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.InvocationPolicyHelper.type ();
  }

}
