package org.omg.IOP;


/**
* org/omg/IOP/EncodingHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/IOP.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class EncodingHelper
{
  private static String  _id = "IDL:omg.org/IOP/Encoding:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.Encoding that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.Encoding extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.IOP.EncodingFormatHelper.id (), "EncodingFormat", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "format",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _members0[1] = new org.omg.CORBA.StructMember (
            "major_version",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _members0[2] = new org.omg.CORBA.StructMember (
            "minor_version",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.omg.IOP.EncodingHelper.id (), "Encoding", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.Encoding read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.IOP.Encoding value = new org.omg.IOP.Encoding ();
    value.format = istream.read_short ();
    value.major_version = istream.read_octet ();
    value.minor_version = istream.read_octet ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.Encoding value)
  {
    ostream.write_short (value.format);
    ostream.write_octet (value.major_version);
    ostream.write_octet (value.minor_version);
  }

}
