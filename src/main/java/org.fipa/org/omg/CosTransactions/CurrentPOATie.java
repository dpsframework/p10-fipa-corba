package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/CurrentPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// Current transaction
public class CurrentPOATie extends CurrentPOA
{

  // Constructors

  public CurrentPOATie ( org.omg.CosTransactions.CurrentOperations delegate ) {
      this._impl = delegate;
  }
  public CurrentPOATie ( org.omg.CosTransactions.CurrentOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.CosTransactions.CurrentOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.CosTransactions.CurrentOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public void begin () throws org.omg.CosTransactions.SubtransactionsUnavailable
  {
    _impl.begin();
  } // begin

  public void commit (boolean report_heuristics) throws org.omg.CosTransactions.NoTransaction, org.omg.CosTransactions.HeuristicMixed, org.omg.CosTransactions.HeuristicHazard
  {
    _impl.commit(report_heuristics);
  } // commit

  public void rollback () throws org.omg.CosTransactions.NoTransaction
  {
    _impl.rollback();
  } // rollback

  public void rollback_only () throws org.omg.CosTransactions.NoTransaction
  {
    _impl.rollback_only();
  } // rollback_only

  public org.omg.CosTransactions.Status get_status ()
  {
    return _impl.get_status();
  } // get_status

  public String get_transaction_name ()
  {
    return _impl.get_transaction_name();
  } // get_transaction_name

  public void set_timeout (int seconds)
  {
    _impl.set_timeout(seconds);
  } // set_timeout

  public int get_timeout ()
  {
    return _impl.get_timeout();
  } // get_timeout

  public org.omg.CosTransactions.Control get_control ()
  {
    return _impl.get_control();
  } // get_control

  public org.omg.CosTransactions.Control suspend ()
  {
    return _impl.suspend();
  } // suspend

  public void resume (org.omg.CosTransactions.Control which) throws org.omg.CosTransactions.InvalidControl
  {
    _impl.resume(which);
  } // resume

  private org.omg.CosTransactions.CurrentOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class CurrentPOATie
