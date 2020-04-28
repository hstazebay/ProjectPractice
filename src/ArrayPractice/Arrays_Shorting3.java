package ArrayPracticeZero;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.rmi.transport.proxy.RMISocketInfo;

import java.util.Arrays;

public class Arrays_Shorting3<names> {
    public static void main(String[] args) {

        String[] names = {"Deniz", "Osmanan", "Rustem", "Anna", "Ali", "Adil"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

}
