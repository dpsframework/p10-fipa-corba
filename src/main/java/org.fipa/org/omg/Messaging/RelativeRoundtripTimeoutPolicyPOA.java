package org.omg.Messaging;


/**
* org/omg/Messaging/RelativeRoundtripTimeoutPolicyPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public abstract class RelativeRoundtripTimeoutPolicyPOA extends org.omg.PortableServer.Servant
 implements org.omg.Messaging.RelativeRoundtripTimeoutPolicyOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_relative_expiry", new java.lang.Integer (0));
    _methods.put ("_get_policy_type", new java.lang.Integer (1));
    _methods.put ("copy", new java.lang.Integer (2));
    _methods.put ("destroy", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Messaging/RelativeRoundtripTimeoutPolicy/_get_relative_expiry
       {
         long $result = (long)0;
         $result = this.relative_expiry ();
         out = $rh.createReply();
         out.write_ulonglong ($result);
         break;
       }


  /** Return the constant value that corresponds to the 
                  * type of the policy object.  The values of 
                  * the polivy objectys are allocated by the OMG.
                  * New values for PolicyType should be obtained from the OMG by
                  * sending mail to request@omg.org.  In general the constant
                  * values that are allocated are defined in conjunction with
                  * the definition of the corresponding policy object.
                  * @return the constant value that corresponds to the type of
                  * the policy object.
                  */
       case 1:  // org/omg/CORBA/Policy/_get_policy_type
       {
         int $result = (int)0;
         $result = this.policy_type ();
         out = $rh.createReply();
         out.write_ulong ($result);
         break;
       }


  /** Copies the policy object. The copy does not retain any
                  * relationships that the policy had with any domain or object.
                  * @return the copy of the policy object.
                  */
       case 2:  // org/omg/CORBA/Policy/copy
       {
         org.omg.CORBA.Policy $result = null;
         $result = this.copy ();
         out = $rh.createReply();
         org.omg.CORBA.PolicyHelper.write (out, $result);
         break;
       }


  /** Destroys the policy object.  It is the responsibility of
                  * the policy object to determine whether it can be destroyed.
                  */
       case 3:  // org/omg/CORBA/Policy/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/Messaging/RelativeRoundtripTimeoutPolicy:1.0", 
    "IDL:omg.org/CORBA/Policy:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public RelativeRoundtripTimeoutPolicy _this() 
  {
    return RelativeRoundtripTimeoutPolicyHelper.narrow(
    super._this_object());
  }

  public RelativeRoundtripTimeoutPolicy _this(org.omg.CORBA.ORB orb) 
  {
    return RelativeRoundtripTimeoutPolicyHelper.narrow(
    super._this_object(orb));
  }


} // class RelativeRoundtripTimeoutPolicyPOA
