/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.interfaces;

import DTOS.DogDTO;
import DTOS.UserDTO;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public interface Idog {
    
    public DogDTO crearPerro(DogDTO perro);
    
    public DogDTO buscarPerro(String id);
    
    public List<DogDTO> darPerros();
    
    public void eliminarPerro(String id);

    public DogDTO modificarPerro(String idPerro, UserDTO p);

    
    
}
