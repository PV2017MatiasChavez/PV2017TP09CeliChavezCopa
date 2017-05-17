/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionLibros implements Serializable {
    private ArrayList<Libro> libros;

    public ColeccionLibros() {
    libros = new ArrayList();
    }
    
    public void agregarLibros(Libro unLibro){
        getLibros().add(unLibro);
    }
 
        public ArrayList<Libro> buscarLibro (String buscaTit, String buscaCat, boolean cat){
        ArrayList<Libro> libroEncontrado = new ArrayList<Libro>(){};
        if(cat && !buscaTit.isEmpty()){
            for(Libro l : libros)
            {
                if(l.getTitulo().equals(buscaTit) && l.getCategoria().equals(buscaCat)){
                    libroEncontrado.add(l);
               }
            }
        }
        else if(!cat && !buscaTit.isEmpty()){
            for (Libro l : libros){
                if (l.getTitulo().equals(buscaTit)){
                    libroEncontrado.add(l);
                }
            }
        }
        else if(cat && buscaTit.isEmpty()){
            for (Libro l : libros){
                if (l.getCategoria().equals(buscaCat)){
                    libroEncontrado.add(l);
                }
            }            
        }
        return libroEncontrado;
    }
        
        
        
    /**
     * @return the libros
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
