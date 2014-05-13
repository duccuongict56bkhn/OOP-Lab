
package exceptions;

/**
 *
 * @author admin
 */
public class Exceptions {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exceptions <ExceptionNo>");
            System.out.println("ExceptionNo 1: ArrayIndexOutOfBoundsException");
            System.out.println("ExceptionNo 2: NullPointerException");
            System.out.println("ExceptionNo 3: ArithmeticException");
            System.exit(1);
        }
        
        int exceptionNo = Integer.parseInt(args[0]);
        // Generate exception
        try {
            switch(exceptionNo) {
                case 1:
                    // ArrayIndexOutOfBoundsException
                    int array[] = new int[3];
                    array[3] = 100;
                    break;
                case 2:
                    // NullPointerException
                    String s = null;
                    int l = s.length();
                    break;
                case 3:
                    // ArithmeticException
                    int x = 100;
                    int y = 0;
                    int z = x / y;
                    break;
                default:
                    System.out.println("It doesn't match with ExceptionNo");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        } catch (NullPointerException e) {
            //System.out.println("NullPointerException caught");
             e.printStackTrace();
        } catch (Exception e) {
            //System.out.println("ArithmeticException caught");
            e.printStackTrace();
        }
    }
}
