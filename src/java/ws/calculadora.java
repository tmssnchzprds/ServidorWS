/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jose
 */
@WebService(serviceName = "calculadora")
public class calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hola(@WebParam(name = "name") String txt) {
        return "hola " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        //TODO write your implementation code here:
        int resultado=n1+n2;
        return resultado;
    }
}
