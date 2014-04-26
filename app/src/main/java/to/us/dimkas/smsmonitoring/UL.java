package to.us.dimkas.smsmonitoring;


/**
 * Created by dimkas on 25.04.14.
 */
public class UL {
    String header;
    String time;
    String version;
    String someData1;
    String voltage;
    String temperature;
    String someData2;
    String firstMeeterValue;
    String secondMeeterValue;
    String someData3;
    int paramCount = 10;

    public UL(String ul) {
        header = ul.substring(0, 2);
        time = ul.substring(3, 11);
        version = ul.substring(13, 16);
        someData1 = ul.substring(18, 51);
        voltage = ul.substring(52, 69);
        temperature = ul.substring(70, 71);
        someData2 = ul.substring(72, 78);
        firstMeeterValue = ul.substring(79, 89);
        secondMeeterValue = ul.substring(90, 100);
        someData3 = ul.substring(101);
    }

    public int getParamCount() {
        return paramCount;
    }

    @Override

    public String toString() {
        String tmp = "Version: " + version + "\n Voltage: " + voltage + "\n Temperature: " + temperature;
        return tmp;
    }
}
