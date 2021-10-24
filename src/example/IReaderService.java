package example;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Bryce_dd
 * @date 2021/10/24
 */
@WebService
public interface IReaderService {
    public Reader getReader(@WebParam(name="name") String name, @WebParam(name="password") String password);
    public List<Reader> getReaders();
    public String getStrDemo();
}
