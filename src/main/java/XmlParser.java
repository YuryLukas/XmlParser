import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ResourceBundle;

public class XmlParser {
    public static void main(String[] args) throws IOException, XmlPullParserException {
        try{
            GetXmlData getXmlData = new GetXmlData("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
            CurrencyDataParser currencyDataParser = new CurrencyDataParser(getXmlData.getData());
            currencyDataParser.parse();
        } catch (Exception e) {
            System.out.println("Error:" + e.getLocalizedMessage() + "\n");
        }
    }
}
