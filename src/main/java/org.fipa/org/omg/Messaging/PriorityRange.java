package org.omg.Messaging;


/**
* org/omg/Messaging/PriorityRange.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class PriorityRange implements org.omg.CORBA.portable.IDLEntity
{
  public short min = (short)0;
  public short max = (short)0;

  public PriorityRange ()
  {
  } // ctor

  public PriorityRange (short _min, short _max)
  {
    min = _min;
    max = _max;
  } // ctor

} // class PriorityRange
