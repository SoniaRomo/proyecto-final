
package service;

import entity.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;



@Service
public  class ClienteServiceImpl   implements ClienteService {

    @Autowired 
    private ClienteRepository  repositorio;
    
    
    @Override
     public List<Cliente> findAll(){
     return (List<Cliente>) repositorio.findAll();  
    }

    @Override
    public List<Cliente> findALLCustom() {
     return repositorio.finDallCustom();   
       
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
      return repositorio.findById(id);   
    }

    @Override
    public Cliente add(Cliente c) {
     return repositorio.save(c);    
    }

    @Override
    public Cliente update(Cliente c) {
     Cliente objcliente = repositorio.getById(c.getPersona());
        BeanUtils.copyProperties(c, objcliente);
        return repositorio.save(objcliente);    
    }

    @Override
    public Cliente delete(Cliente c) {
     Cliente objcliente = repositorio.getById(c.getPersona());
        objcliente.setActivo(false);
        return repositorio.save(objcliente);   
    }
    
    

    

   
    
}

