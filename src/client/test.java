package client;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class test {
    public static void main(String[] args){
        // 1.指定调用WebService的URL,这里是我们发布后点击HelloWorld
        String url = "http://localhost:8080/webService_demo/services/HelloWorld?wsdl";
        try {
            // 2.创建Locator对象,相当于传统服务的类或者是库
            HelloWorldServiceLocator helloWorldServiceLocator = new HelloWorldServiceLocator();
            // 3.获取port,相当于传统类或库的方法接口
            HelloWorld_PortType service = helloWorldServiceLocator.getHelloWorld(new URL(url));
            // 4.通过port调用服务

            String result = service.sayHelloWorldFrom("rearcher");
            System.out.println(result);
        }catch (ServiceException | RemoteException | MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
