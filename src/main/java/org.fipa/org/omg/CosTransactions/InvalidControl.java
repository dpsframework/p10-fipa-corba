package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/InvalidControl.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class InvalidControl extends org.omg.CORBA.UserException
{

  public InvalidControl ()
  {
    super(InvalidControlHelper.id());
  } // ctor


  public InvalidControl (String $reason)
  {
    super(InvalidControlHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidControl
