/**
 * Class that does not do anything, but is here to be a Java class run through
 * groovydoc.
 */
public class DoNothingClass
{
   /**
    * Simple method that returns literal "Hello _addressee_!" string where
    * _addressee_ is the name provided to this method.
    *
    * @param addressee Name for returned salutation to be addressed to.
    * @return "Hello!"
    */
   public String sayHello(final String addressee)
   {
      return "Hello, " + addressee;
   }

   /**
    * Main executable function.
    */
   public static void main(final String[] arguments)
   {
      final DoNothingClass me = new DoNothingClass();
      me.sayHello("Dustin");
   }

   /**
    * Provide String representation of this object.
    *
    * @return String representation of me.
    */
   @Override
   public String toString()
   {
      return "Hello!";
   }
}
