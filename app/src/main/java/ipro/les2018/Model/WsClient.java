package ipro.les2018.Model;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class WsClient {
    public boolean validarLogin(String login, String senha) throws IOException, XmlPullParserException {
        SoapObject object = new SoapObject ( "http://banco","validarLogin" );
        object.addProperty ( "login",login );
        object.addProperty ( "senha",senha );

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope ( SoapEnvelope.VER11 );
        envelope.setOutputSoapObject ( object );

        HttpTransportSE http = new HttpTransportSE ( "http://192.168.15.4:8080/Prova/banco?wsdl");
        http.call ( "validaLogin",envelope );

        Object resposta = envelope.getResponse ();
        if(resposta.toString ().equalsIgnoreCase ( "true" ))
            return true;
        else
            return false;
    }
}
