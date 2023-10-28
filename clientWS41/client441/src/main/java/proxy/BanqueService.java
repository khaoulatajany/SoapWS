
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://WS/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://WS/", className = "proxy.ConvertResponse")
    @Action(input = "http://WS/BanqueService/ConvertRequest", output = "http://WS/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listCompte", targetNamespace = "http://WS/", className = "proxy.ListCompte")
    @ResponseWrapper(localName = "listCompteResponse", targetNamespace = "http://WS/", className = "proxy.ListCompteResponse")
    @Action(input = "http://WS/BanqueService/listCompteRequest", output = "http://WS/BanqueService/listCompteResponse")
    public List<Compte> listCompte();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://WS/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://WS/", className = "proxy.GetCompteResponse")
    @Action(input = "http://WS/BanqueService/getCompteRequest", output = "http://WS/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
