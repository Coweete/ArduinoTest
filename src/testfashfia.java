import gnu.io.*; // RXTX
import java.util.Enumeration;

/**
 * Created by jonatan on 2016-04-05.
 */
public class testfashfia {



        public static void main(String[] args) {
            System.out.println("Program started");

            //System.out.println(java.library.path);
            CommPortIdentifier serialPortId;
            //static CommPortIdentifier sSerialPortId;
            Enumeration enumComm;
            //SerialPort serialPort;

            enumComm = CommPortIdentifier.getPortIdentifiers();
            while (enumComm.hasMoreElements()) {
                serialPortId = (CommPortIdentifier) enumComm.nextElement();
                if(serialPortId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                    System.out.println(serialPortId.getName());
                }
            }

            System.out.println("Finished successfully");
        }


}
