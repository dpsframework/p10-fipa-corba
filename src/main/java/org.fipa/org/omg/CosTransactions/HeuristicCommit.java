package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/HeuristicCommit.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class HeuristicCommit extends org.omg.CORBA.UserException
{

  public HeuristicCommit ()
  {
    super(HeuristicCommitHelper.id());
  } // ctor


  public HeuristicCommit (String $reason)
  {
    super(HeuristicCommitHelper.id() + "  " + $reason);
  } // ctor

} // class HeuristicCommit
