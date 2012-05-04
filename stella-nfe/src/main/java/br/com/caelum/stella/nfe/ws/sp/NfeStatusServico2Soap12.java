
package br.com.caelum.stella.nfe.ws.sp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NfeStatusServico2Soap12", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NfeStatusServico2Soap12 {


    /**
     * Consulta Status do Servi?o
     * 
     * @param nfeCabecMsg
     * @param nfeDadosMsg
     * @return
     *     returns br.com.caelum.cliente2.NfeStatusServicoNF2Result
     */
    @WebMethod(action = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2/nfeStatusServicoNF2")
    @WebResult(name = "nfeStatusServicoNF2Result", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", partName = "nfeStatusServicoNF2Result")
    public NfeStatusServicoNF2Result nfeStatusServicoNF2(
        @WebParam(name = "nfeDadosMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", partName = "nfeDadosMsg")
        NfeDadosMsg nfeDadosMsg,
        @WebParam(name = "nfeCabecMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", header = true, mode = WebParam.Mode.INOUT, partName = "nfeCabecMsg")
        Holder<NfeCabecMsg> nfeCabecMsg);

}
