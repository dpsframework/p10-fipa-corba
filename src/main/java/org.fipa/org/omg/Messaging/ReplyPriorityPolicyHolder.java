package org.omg.Messaging;

/**
* org/omg/Messaging/ReplyPriorityPolicyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class ReplyPriorityPolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.Messaging.ReplyPriorityPolicy value = null;

  public ReplyPriorityPolicyHolder ()
  {
  }

  public ReplyPriorityPolicyHolder (org.omg.Messaging.ReplyPriorityPolicy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.Messaging.ReplyPriorityPolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.Messaging.ReplyPriorityPolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.Messaging.ReplyPriorityPolicyHelper.type ();
  }

}
