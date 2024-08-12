package structure.proxy.demo01;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ServiceImpl.class);
        enhancer.setCallback(new MethodInterceptorImpl());

        ServiceImpl proxyService = (ServiceImpl) enhancer.create();
        proxyService.perform();
    }
}
