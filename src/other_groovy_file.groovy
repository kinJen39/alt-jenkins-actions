import groovy.util.logging.Commons

/**
 * Sample Groovy class using {@code @Commons} to inject Apache Commons logger
 * into the class.
 */
@Commons
class ApacheCommonsLoggerClass
{
   /**
    * Constructor. 
    */
   public ApacheCommonsLoggerClass()
   {
      println "\nApache Commons Logging (${log.name}: ${log.class}):"
      log.info "${this.printAndReturnValue(1)}"
      log.debug "${this.printAndReturnValue(2)}"
   }

   /**
    * Print provided value and then return it as part of String indicating part
    * of Apache Commons Logging.
    *
    * @param newValue Value to be printed and included in return String.
    * @return String indicating newValue and Apache Commons Logging.
    */
   public String printAndReturnValue(int newValue)
   {
      println "Commons: Print method invoked for ${newValue}"
      return "Commons: ${newValue}"
   }
}
